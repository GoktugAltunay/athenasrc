/*     */ package net.mcreator.finfin;
/*     */ 
/*     */ import java.util.function.Supplier;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.potion.Potion;
/*     */ import net.minecraft.util.SoundEvent;
/*     */ import net.minecraft.world.biome.Biome;
/*     */ import net.minecraftforge.client.event.ModelRegistryEvent;
/*     */ import net.minecraftforge.common.MinecraftForge;
/*     */ import net.minecraftforge.event.RegistryEvent;
/*     */ import net.minecraftforge.fluids.FluidRegistry;
/*     */ import net.minecraftforge.fml.common.Mod;
/*     */ import net.minecraftforge.fml.common.Mod.EventHandler;
/*     */ import net.minecraftforge.fml.common.Mod.Instance;
/*     */ import net.minecraftforge.fml.common.SidedProxy;
/*     */ import net.minecraftforge.fml.common.event.FMLInitializationEvent;
/*     */ import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
/*     */ import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
/*     */ import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
/*     */ import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.network.NetworkRegistry;
/*     */ import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
/*     */ import net.minecraftforge.fml.common.registry.EntityEntry;
/*     */ import net.minecraftforge.fml.common.registry.GameRegistry;
/*     */ import net.minecraftforge.fml.relauncher.Side;
/*     */ import net.minecraftforge.fml.relauncher.SideOnly;
/*     */ import net.minecraftforge.registries.IForgeRegistryEntry;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Mod(modid = "finfin", version = "1.0.0")
/*     */ public class FinfinMod
/*     */ {
/*     */   public static final String MODID = "finfin";
/*     */   public static final String VERSION = "1.0.0";
/*  49 */   public static final SimpleNetworkWrapper PACKET_HANDLER = NetworkRegistry.INSTANCE.newSimpleChannel("finfin:a");
/*     */   @SidedProxy(clientSide = "net.mcreator.finfin.ClientProxyFinfinMod", serverSide = "net.mcreator.finfin.ServerProxyFinfinMod")
/*     */   public static IProxyFinfinMod proxy;
/*     */   @Instance("finfin")
/*     */   public static FinfinMod instance;
/*  54 */   public ElementsFinfinMod elements = new ElementsFinfinMod();
/*     */   @EventHandler
/*     */   public void preInit(FMLPreInitializationEvent event) {
/*  57 */     MinecraftForge.EVENT_BUS.register(this);
/*  58 */     GameRegistry.registerWorldGenerator(this.elements, 5);
/*  59 */     GameRegistry.registerFuelHandler(this.elements);
/*  60 */     NetworkRegistry.INSTANCE.registerGuiHandler(this, new ElementsFinfinMod.GuiHandler());
/*  61 */     this.elements.preInit(event);
/*  62 */     MinecraftForge.EVENT_BUS.register(this.elements);
/*  63 */     this.elements.getElements().forEach(element -> element.preInit(event));
/*  64 */     proxy.preInit(event);
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void init(FMLInitializationEvent event) {
/*  69 */     this.elements.getElements().forEach(element -> element.init(event));
/*  70 */     proxy.init(event);
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void postInit(FMLPostInitializationEvent event) {
/*  75 */     proxy.postInit(event);
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void serverLoad(FMLServerStartingEvent event) {
/*  80 */     this.elements.getElements().forEach(element -> element.serverLoad(event));
/*  81 */     proxy.serverLoad(event);
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void registerBlocks(RegistryEvent.Register<Block> event) {
/*  86 */     event.getRegistry().registerAll((IForgeRegistryEntry[])this.elements.getBlocks().stream().map(Supplier::get).toArray(x$0 -> new Block[x$0]));
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void registerItems(RegistryEvent.Register<Item> event) {
/*  91 */     event.getRegistry().registerAll((IForgeRegistryEntry[])this.elements.getItems().stream().map(Supplier::get).toArray(x$0 -> new Item[x$0]));
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void registerBiomes(RegistryEvent.Register<Biome> event) {
/*  96 */     event.getRegistry().registerAll((IForgeRegistryEntry[])this.elements.getBiomes().stream().map(Supplier::get).toArray(x$0 -> new Biome[x$0]));
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void registerEntities(RegistryEvent.Register<EntityEntry> event) {
/* 101 */     event.getRegistry().registerAll((IForgeRegistryEntry[])this.elements.getEntities().stream().map(Supplier::get).toArray(x$0 -> new EntityEntry[x$0]));
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void registerPotions(RegistryEvent.Register<Potion> event) {
/* 106 */     event.getRegistry().registerAll((IForgeRegistryEntry[])this.elements.getPotions().stream().map(Supplier::get).toArray(x$0 -> new Potion[x$0]));
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void registerSounds(RegistryEvent.Register<SoundEvent> event) {
/* 111 */     this.elements.registerSounds(event);
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void registerModels(ModelRegistryEvent event) {
/* 117 */     this.elements.getElements().forEach(element -> element.registerModels(event));
/*     */   }
/*     */   static {
/* 120 */     FluidRegistry.enableUniversalBucket();
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\FinfinMod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */