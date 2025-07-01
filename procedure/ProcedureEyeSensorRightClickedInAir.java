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
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ @Tag
/*     */ public class ProcedureEyeSensorRightClickedInAir
/*     */   extends ElementsFinfinMod.ModElement {
/*     */   public ProcedureEyeSensorRightClickedInAir(ElementsFinfinMod instance) {
/*  17 */     super(instance, 74);
/*     */   }
/*     */   
/*     */   public static void executeProcedure(Map<String, Object> dependencies) {
/*  21 */     if (dependencies.get("entity") == null) {
/*  22 */       System.err.println("Failed to load dependency entity for procedure EyeSensorRightClickedInAir!");
/*     */       return;
/*     */     } 
/*  25 */     Entity entity = (Entity)dependencies.get("entity");
/*     */     
/*  27 */     final Entity _ent = entity;
/*  28 */     if (!_ent.field_70170_p.field_72995_K && _ent.field_70170_p.func_73046_m() != null) {
/*  29 */       _ent.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender()
/*     */           {
/*     */             public String func_70005_c_() {
/*  32 */               return "";
/*     */             }
/*     */ 
/*     */             
/*     */             public boolean func_70003_b(int permission, String command) {
/*  37 */               return true;
/*     */             }
/*     */ 
/*     */             
/*     */             public World func_130014_f_() {
/*  42 */               return _ent.field_70170_p;
/*     */             }
/*     */ 
/*     */             
/*     */             public MinecraftServer func_184102_h() {
/*  47 */               return _ent.field_70170_p.func_73046_m();
/*     */             }
/*     */ 
/*     */             
/*     */             public boolean func_174792_t_() {
/*  52 */               return false;
/*     */             }
/*     */ 
/*     */             
/*     */             public BlockPos func_180425_c() {
/*  57 */               return _ent.func_180425_c();
/*     */             }
/*     */ 
/*     */             
/*     */             public Vec3d func_174791_d() {
/*  62 */               return new Vec3d(_ent.field_70165_t, _ent.field_70163_u, _ent.field_70161_v);
/*     */             }
/*     */ 
/*     */             
/*     */             public Entity func_174793_f() {
/*  67 */               return _ent;
/*     */             }
/*     */           }"cast ebwizardry:blinding_flash @p");
/*     */     }
/*     */ 
/*     */     
/*  73 */     _ent = entity;
/*  74 */     if (!_ent.field_70170_p.field_72995_K && _ent.field_70170_p.func_73046_m() != null) {
/*  75 */       _ent.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender()
/*     */           {
/*     */             public String func_70005_c_() {
/*  78 */               return "";
/*     */             }
/*     */ 
/*     */             
/*     */             public boolean func_70003_b(int permission, String command) {
/*  83 */               return true;
/*     */             }
/*     */ 
/*     */             
/*     */             public World func_130014_f_() {
/*  88 */               return _ent.field_70170_p;
/*     */             }
/*     */ 
/*     */             
/*     */             public MinecraftServer func_184102_h() {
/*  93 */               return _ent.field_70170_p.func_73046_m();
/*     */             }
/*     */ 
/*     */             
/*     */             public boolean func_174792_t_() {
/*  98 */               return false;
/*     */             }
/*     */ 
/*     */             
/*     */             public BlockPos func_180425_c() {
/* 103 */               return _ent.func_180425_c();
/*     */             }
/*     */ 
/*     */             
/*     */             public Vec3d func_174791_d() {
/* 108 */               return new Vec3d(_ent.field_70165_t, _ent.field_70163_u, _ent.field_70161_v);
/*     */             }
/*     */ 
/*     */             
/*     */             public Entity func_174793_f() {
/* 113 */               return _ent;
/*     */             }
/*     */           }"effect @e[r=10,name=!@s] minecraft:blindness 20 10 true");
/*     */     }
/*     */ 
/*     */     
/* 119 */     _ent = entity;
/* 120 */     if (!_ent.field_70170_p.field_72995_K && _ent.field_70170_p.func_73046_m() != null)
/* 121 */       _ent.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender()
/*     */           {
/*     */             public String func_70005_c_() {
/* 124 */               return "";
/*     */             }
/*     */ 
/*     */             
/*     */             public boolean func_70003_b(int permission, String command) {
/* 129 */               return true;
/*     */             }
/*     */ 
/*     */             
/*     */             public World func_130014_f_() {
/* 134 */               return _ent.field_70170_p;
/*     */             }
/*     */ 
/*     */             
/*     */             public MinecraftServer func_184102_h() {
/* 139 */               return _ent.field_70170_p.func_73046_m();
/*     */             }
/*     */ 
/*     */             
/*     */             public boolean func_174792_t_() {
/* 144 */               return false;
/*     */             }
/*     */ 
/*     */             
/*     */             public BlockPos func_180425_c() {
/* 149 */               return _ent.func_180425_c();
/*     */             }
/*     */ 
/*     */             
/*     */             public Vec3d func_174791_d() {
/* 154 */               return new Vec3d(_ent.field_70165_t, _ent.field_70163_u, _ent.field_70161_v);
/*     */             }
/*     */ 
/*     */             
/*     */             public Entity func_174793_f() {
/* 159 */               return _ent;
/*     */             }
/*     */           }"effect @p clear"); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\procedure\ProcedureEyeSensorRightClickedInAir.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */