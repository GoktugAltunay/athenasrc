/*     */ package net.mcreator.finfin;
/*     */ 
/*     */ import io.netty.buffer.ByteBuf;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraft.world.storage.WorldSavedData;
/*     */ import net.minecraftforge.fml.common.network.ByteBufUtils;
/*     */ import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
/*     */ import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
/*     */ import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
/*     */ import net.minecraftforge.fml.relauncher.Side;
/*     */ 
/*     */ public class FinfinModVariables {
/*     */   public static class MapVariables extends WorldSavedData {
/*     */     public static final String DATA_NAME = "finfin_mapvars";
/*  17 */     public String Fallen = "";
/*     */     public MapVariables() {
/*  19 */       super("finfin_mapvars");
/*     */     }
/*     */     
/*     */     public MapVariables(String s) {
/*  23 */       super(s);
/*     */     }
/*     */ 
/*     */     
/*     */     public void func_76184_a(NBTTagCompound nbt) {
/*  28 */       this.Fallen = nbt.func_74779_i("Fallen");
/*     */     }
/*     */ 
/*     */     
/*     */     public NBTTagCompound func_189551_b(NBTTagCompound nbt) {
/*  33 */       nbt.func_74778_a("Fallen", this.Fallen);
/*  34 */       return nbt;
/*     */     }
/*     */     
/*     */     public void syncData(World world) {
/*  38 */       func_76185_a();
/*  39 */       if (world.field_72995_K) {
/*  40 */         FinfinMod.PACKET_HANDLER.sendToServer(new FinfinModVariables.WorldSavedDataSyncMessage(0, this));
/*     */       } else {
/*  42 */         FinfinMod.PACKET_HANDLER.sendToAll(new FinfinModVariables.WorldSavedDataSyncMessage(0, this));
/*     */       } 
/*     */     }
/*     */     
/*     */     public static MapVariables get(World world) {
/*  47 */       MapVariables instance = (MapVariables)world.func_175693_T().func_75742_a(MapVariables.class, "finfin_mapvars");
/*  48 */       if (instance == null) {
/*  49 */         instance = new MapVariables();
/*  50 */         world.func_175693_T().func_75745_a("finfin_mapvars", instance);
/*     */       } 
/*  52 */       return instance;
/*     */     } }
/*     */   
/*     */   public static class WorldVariables extends WorldSavedData {
/*     */     public static final String DATA_NAME = "finfin_worldvars";
/*     */     
/*     */     public WorldVariables() {
/*  59 */       super("finfin_worldvars");
/*     */     }
/*     */     
/*     */     public WorldVariables(String s) {
/*  63 */       super(s);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void func_76184_a(NBTTagCompound nbt) {}
/*     */ 
/*     */     
/*     */     public NBTTagCompound func_189551_b(NBTTagCompound nbt) {
/*  72 */       return nbt;
/*     */     }
/*     */     
/*     */     public void syncData(World world) {
/*  76 */       func_76185_a();
/*  77 */       if (world.field_72995_K) {
/*  78 */         FinfinMod.PACKET_HANDLER.sendToServer(new FinfinModVariables.WorldSavedDataSyncMessage(1, this));
/*     */       } else {
/*  80 */         FinfinMod.PACKET_HANDLER.sendToDimension(new FinfinModVariables.WorldSavedDataSyncMessage(1, this), world.field_73011_w.getDimension());
/*     */       } 
/*     */     }
/*     */     
/*     */     public static WorldVariables get(World world) {
/*  85 */       WorldVariables instance = (WorldVariables)world.getPerWorldStorage().func_75742_a(WorldVariables.class, "finfin_worldvars");
/*  86 */       if (instance == null) {
/*  87 */         instance = new WorldVariables();
/*  88 */         world.getPerWorldStorage().func_75745_a("finfin_worldvars", instance);
/*     */       } 
/*  90 */       return instance;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class WorldSavedDataSyncMessageHandler
/*     */     implements IMessageHandler<WorldSavedDataSyncMessage, IMessage> {
/*     */     public IMessage onMessage(FinfinModVariables.WorldSavedDataSyncMessage message, MessageContext context) {
/*  97 */       if (context.side == Side.SERVER) {
/*  98 */         (context.getServerHandler()).field_147369_b.func_71121_q()
/*  99 */           .func_152344_a(() -> syncData(message, context, (context.getServerHandler()).field_147369_b.field_70170_p));
/*     */       } else {
/* 101 */         Minecraft.func_71410_x().func_152344_a(() -> syncData(message, context, (Minecraft.func_71410_x()).field_71439_g.field_70170_p));
/* 102 */       }  return null;
/*     */     }
/*     */     
/*     */     private void syncData(FinfinModVariables.WorldSavedDataSyncMessage message, MessageContext context, World world) {
/* 106 */       if (context.side == Side.SERVER) {
/* 107 */         message.data.func_76185_a();
/* 108 */         if (message.type == 0) {
/* 109 */           FinfinMod.PACKET_HANDLER.sendToAll(message);
/*     */         } else {
/* 111 */           FinfinMod.PACKET_HANDLER.sendToDimension(message, world.field_73011_w.getDimension());
/*     */         } 
/* 113 */       }  if (message.type == 0) {
/* 114 */         world.func_175693_T().func_75745_a("finfin_mapvars", message.data);
/*     */       } else {
/* 116 */         world.getPerWorldStorage().func_75745_a("finfin_worldvars", message.data);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public static class WorldSavedDataSyncMessage implements IMessage {
/*     */     public int type;
/*     */     public WorldSavedData data;
/*     */     
/*     */     public WorldSavedDataSyncMessage() {}
/*     */     
/*     */     public WorldSavedDataSyncMessage(int type, WorldSavedData data) {
/* 128 */       this.type = type;
/* 129 */       this.data = data;
/*     */     }
/*     */ 
/*     */     
/*     */     public void toBytes(ByteBuf buf) {
/* 134 */       buf.writeInt(this.type);
/* 135 */       ByteBufUtils.writeTag(buf, this.data.func_189551_b(new NBTTagCompound()));
/*     */     }
/*     */ 
/*     */     
/*     */     public void fromBytes(ByteBuf buf) {
/* 140 */       this.type = buf.readInt();
/* 141 */       if (this.type == 0) {
/* 142 */         this.data = new FinfinModVariables.MapVariables();
/*     */       } else {
/* 144 */         this.data = new FinfinModVariables.WorldVariables();
/* 145 */       }  this.data.func_76184_a(ByteBufUtils.readTag(buf));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\FinfinModVariables.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */