/*     */ package net.mcreator.finfin;
/*     */ 
/*     */ import java.lang.annotation.Retention;
/*     */ import java.lang.annotation.RetentionPolicy;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.function.Supplier;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.player.EntityPlayerMP;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.potion.Potion;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import net.minecraft.util.SoundEvent;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraft.world.biome.Biome;
/*     */ import net.minecraft.world.chunk.IChunkProvider;
/*     */ import net.minecraft.world.gen.IChunkGenerator;
/*     */ import net.minecraft.world.storage.WorldSavedData;
/*     */ import net.minecraftforge.client.event.ModelRegistryEvent;
/*     */ import net.minecraftforge.event.RegistryEvent;
/*     */ import net.minecraftforge.fml.common.IFuelHandler;
/*     */ import net.minecraftforge.fml.common.IWorldGenerator;
/*     */ import net.minecraftforge.fml.common.discovery.ASMDataTable;
/*     */ import net.minecraftforge.fml.common.event.FMLInitializationEvent;
/*     */ import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
/*     */ import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
/*     */ import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.gameevent.PlayerEvent;
/*     */ import net.minecraftforge.fml.common.network.IGuiHandler;
/*     */ import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
/*     */ import net.minecraftforge.fml.common.registry.EntityEntry;
/*     */ import net.minecraftforge.fml.relauncher.Side;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ElementsFinfinMod
/*     */   implements IFuelHandler, IWorldGenerator
/*     */ {
/*  49 */   public final List<ModElement> elements = new ArrayList<>();
/*  50 */   public final List<Supplier<Block>> blocks = new ArrayList<>();
/*  51 */   public final List<Supplier<Item>> items = new ArrayList<>();
/*  52 */   public final List<Supplier<Biome>> biomes = new ArrayList<>();
/*  53 */   public final List<Supplier<EntityEntry>> entities = new ArrayList<>();
/*  54 */   public final List<Supplier<Potion>> potions = new ArrayList<>();
/*  55 */   public static Map<ResourceLocation, SoundEvent> sounds = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int messageID;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void preInit(FMLPreInitializationEvent event) {
/*     */     try {
/*  69 */       for (ASMDataTable.ASMData asmData : event.getAsmData().getAll(ModElement.Tag.class.getName())) {
/*  70 */         Class<?> clazz = Class.forName(asmData.getClassName());
/*  71 */         if (clazz.getSuperclass() == ModElement.class)
/*  72 */           this.elements.add(clazz.getConstructor(new Class[] { getClass() }).newInstance(new Object[] { this })); 
/*     */       } 
/*  74 */     } catch (Exception e) {
/*  75 */       e.printStackTrace();
/*     */     } 
/*  77 */     Collections.sort(this.elements);
/*  78 */     this.elements.forEach(ModElement::initElements);
/*  79 */     addNetworkMessage((Class)FinfinModVariables.WorldSavedDataSyncMessageHandler.class, FinfinModVariables.WorldSavedDataSyncMessage.class, new Side[] { Side.SERVER, Side.CLIENT });
/*     */   }
/*     */ 
/*     */   
/*     */   public void registerSounds(RegistryEvent.Register<SoundEvent> event) {
/*  84 */     for (Map.Entry<ResourceLocation, SoundEvent> sound : sounds.entrySet()) {
/*  85 */       event.getRegistry().register(((SoundEvent)sound.getValue()).setRegistryName(sound.getKey()));
/*     */     }
/*     */   }
/*     */   
/*     */   public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator cg, IChunkProvider cp) {
/*  90 */     this.elements.forEach(element -> element.generateWorld(random, chunkX * 16, chunkZ * 16, world, world.field_73011_w.getDimension(), cg, cp));
/*     */   }
/*     */ 
/*     */   
/*     */   public int getBurnTime(ItemStack fuel) {
/*  95 */     for (ModElement element : this.elements) {
/*  96 */       int ret = element.addFuel(fuel);
/*  97 */       if (ret != 0)
/*  98 */         return ret; 
/*     */     } 
/* 100 */     return 0;
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
/* 105 */     if (!event.player.field_70170_p.field_72995_K) {
/* 106 */       WorldSavedData mapdata = FinfinModVariables.MapVariables.get(event.player.field_70170_p);
/* 107 */       WorldSavedData worlddata = FinfinModVariables.WorldVariables.get(event.player.field_70170_p);
/* 108 */       if (mapdata != null)
/* 109 */         FinfinMod.PACKET_HANDLER.sendTo(new FinfinModVariables.WorldSavedDataSyncMessage(0, mapdata), (EntityPlayerMP)event.player); 
/* 110 */       if (worlddata != null)
/* 111 */         FinfinMod.PACKET_HANDLER.sendTo(new FinfinModVariables.WorldSavedDataSyncMessage(1, worlddata), (EntityPlayerMP)event.player); 
/*     */     } 
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
/* 117 */     if (!event.player.field_70170_p.field_72995_K) {
/* 118 */       WorldSavedData worlddata = FinfinModVariables.WorldVariables.get(event.player.field_70170_p);
/* 119 */       if (worlddata != null)
/* 120 */         FinfinMod.PACKET_HANDLER.sendTo(new FinfinModVariables.WorldSavedDataSyncMessage(1, worlddata), (EntityPlayerMP)event.player); 
/*     */     } 
/*     */   }
/* 123 */   public ElementsFinfinMod() { this.messageID = 0; sounds.put(new ResourceLocation("finfin", "revolverreload"), new SoundEvent(new ResourceLocation("finfin", "revolverreload"))); sounds.put(new ResourceLocation("finfin", "revolvershot"), new SoundEvent(new ResourceLocation("finfin", "revolvershot"))); sounds.put(new ResourceLocation("finfin", "r301fire"), new SoundEvent(new ResourceLocation("finfin", "r301fire"))); sounds.put(new ResourceLocation("finfin", "r301reload"), new SoundEvent(new ResourceLocation("finfin", "r301reload")));
/*     */     sounds.put(new ResourceLocation("finfin", "r99fire"), new SoundEvent(new ResourceLocation("finfin", "r99fire")));
/*     */     sounds.put(new ResourceLocation("finfin", "r99reload"), new SoundEvent(new ResourceLocation("finfin", "r99reload")));
/* 126 */     sounds.put(new ResourceLocation("finfin", "taserses"), new SoundEvent(new ResourceLocation("finfin", "taserses"))); } public <T extends net.minecraftforge.fml.common.network.simpleimpl.IMessage, V extends net.minecraftforge.fml.common.network.simpleimpl.IMessage> void addNetworkMessage(Class<? extends IMessageHandler<T, V>> handler, Class<T> messageClass, Side... sides) { for (Side side : sides)
/* 127 */       FinfinMod.PACKET_HANDLER.registerMessage(handler, messageClass, this.messageID, side); 
/* 128 */     this.messageID++; }
/*     */   
/*     */   @Retention(RetentionPolicy.RUNTIME)
/*     */   public static @interface Tag {}
/*     */   public static class GuiHandler implements IGuiHandler { public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
/* 133 */       return null;
/*     */     }
/*     */ 
/*     */     
/*     */     public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
/* 138 */       return null;
/*     */     } }
/*     */   
/*     */   public List<ModElement> getElements() {
/* 142 */     return this.elements;
/*     */   }
/*     */   
/*     */   public List<Supplier<Block>> getBlocks() {
/* 146 */     return this.blocks;
/*     */   }
/*     */   
/*     */   public List<Supplier<Item>> getItems() {
/* 150 */     return this.items;
/*     */   }
/*     */   
/*     */   public List<Supplier<Biome>> getBiomes() {
/* 154 */     return this.biomes;
/*     */   }
/*     */   
/*     */   public List<Supplier<EntityEntry>> getEntities() {
/* 158 */     return this.entities;
/*     */   }
/*     */   
/*     */   public List<Supplier<Potion>> getPotions() {
/* 162 */     return this.potions;
/*     */   }
/*     */   
/*     */   public static class ModElement
/*     */     implements Comparable<ModElement> {
/*     */     protected final ElementsFinfinMod elements;
/*     */     protected final int sortid;
/*     */     
/*     */     public ModElement(ElementsFinfinMod elements, int sortid) {
/* 171 */       this.elements = elements;
/* 172 */       this.sortid = sortid;
/*     */     }
/*     */ 
/*     */     
/*     */     public void initElements() {}
/*     */ 
/*     */     
/*     */     public void init(FMLInitializationEvent event) {}
/*     */ 
/*     */     
/*     */     public void preInit(FMLPreInitializationEvent event) {}
/*     */ 
/*     */     
/*     */     public void generateWorld(Random random, int posX, int posZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {}
/*     */ 
/*     */     
/*     */     public void serverLoad(FMLServerStartingEvent event) {}
/*     */ 
/*     */     
/*     */     public void registerModels(ModelRegistryEvent event) {}
/*     */     
/*     */     public int addFuel(ItemStack fuel) {
/* 194 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public int compareTo(ModElement other) {
/* 199 */       return this.sortid - other.sortid;
/*     */     }
/*     */     
/*     */     @Retention(RetentionPolicy.RUNTIME)
/*     */     public static @interface Tag {}
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\ElementsFinfinMod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */