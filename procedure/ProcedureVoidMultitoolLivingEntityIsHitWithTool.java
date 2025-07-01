/*     */ package net.mcreator.finfin.procedure;
/*     */ 
/*     */ import java.util.Map;
/*     */ import net.mcreator.finfin.ElementsFinfinMod;
/*     */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*     */ import net.mcreator.finfin.FinfinModVariables;
/*     */ import net.mcreator.finfin.block.BlockGorunmezblock;
/*     */ import net.minecraft.command.ICommandSender;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import net.minecraft.util.math.BlockPos;
/*     */ import net.minecraft.util.math.Vec3d;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ @Tag
/*     */ public class ProcedureVoidMultitoolLivingEntityIsHitWithTool
/*     */   extends ElementsFinfinMod.ModElement
/*     */ {
/*     */   public ProcedureVoidMultitoolLivingEntityIsHitWithTool(ElementsFinfinMod instance) {
/*  20 */     super(instance, 5);
/*     */   }
/*     */   
/*     */   public static void executeProcedure(Map<String, Object> dependencies) {
/*  24 */     if (dependencies.get("entity") == null) {
/*  25 */       System.err.println("Failed to load dependency entity for procedure VoidMultitoolLivingEntityIsHitWithTool!");
/*     */       return;
/*     */     } 
/*  28 */     if (dependencies.get("x") == null) {
/*  29 */       System.err.println("Failed to load dependency x for procedure VoidMultitoolLivingEntityIsHitWithTool!");
/*     */       return;
/*     */     } 
/*  32 */     if (dependencies.get("y") == null) {
/*  33 */       System.err.println("Failed to load dependency y for procedure VoidMultitoolLivingEntityIsHitWithTool!");
/*     */       return;
/*     */     } 
/*  36 */     if (dependencies.get("z") == null) {
/*  37 */       System.err.println("Failed to load dependency z for procedure VoidMultitoolLivingEntityIsHitWithTool!");
/*     */       return;
/*     */     } 
/*  40 */     if (dependencies.get("world") == null) {
/*  41 */       System.err.println("Failed to load dependency world for procedure VoidMultitoolLivingEntityIsHitWithTool!");
/*     */       return;
/*     */     } 
/*  44 */     Entity entity = (Entity)dependencies.get("entity");
/*  45 */     final int x = ((Integer)dependencies.get("x")).intValue();
/*  46 */     final int y = ((Integer)dependencies.get("y")).intValue();
/*  47 */     final int z = ((Integer)dependencies.get("z")).intValue();
/*  48 */     final World world = (World)dependencies.get("world");
/*  49 */     if (entity instanceof net.minecraft.entity.player.EntityPlayer) {
/*     */       
/*  51 */       final Entity _ent = entity;
/*  52 */       if (!_ent.field_70170_p.field_72995_K && _ent.field_70170_p.func_73046_m() != null) {
/*  53 */         _ent.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender()
/*     */             {
/*     */               public String func_70005_c_() {
/*  56 */                 return "";
/*     */               }
/*     */ 
/*     */               
/*     */               public boolean func_70003_b(int permission, String command) {
/*  61 */                 return true;
/*     */               }
/*     */ 
/*     */               
/*     */               public World func_130014_f_() {
/*  66 */                 return _ent.field_70170_p;
/*     */               }
/*     */ 
/*     */               
/*     */               public MinecraftServer func_184102_h() {
/*  71 */                 return _ent.field_70170_p.func_73046_m();
/*     */               }
/*     */ 
/*     */               
/*     */               public boolean func_174792_t_() {
/*  76 */                 return false;
/*     */               }
/*     */ 
/*     */               
/*     */               public BlockPos func_180425_c() {
/*  81 */                 return _ent.func_180425_c();
/*     */               }
/*     */ 
/*     */               
/*     */               public Vec3d func_174791_d() {
/*  86 */                 return new Vec3d(_ent.field_70165_t, _ent.field_70163_u, _ent.field_70161_v);
/*     */               }
/*     */ 
/*     */               
/*     */               public Entity func_174793_f() {
/*  91 */                 return _ent;
/*     */               }
/*     */             }"mpm url @p https://cdn.discordapp.com/attachments/1330607480853495808/1332482561829507135/Fallen_PearlStudios.png?ex=67956a97&is=67941917&hm=75de9f69d97f9a2c5eaf6bb95fb99bbbce5f00c525b1f71f1a539ce651409f1f& ");
/*     */       }
/*     */       
/*  96 */       if (!world.field_72995_K && world.func_73046_m() != null) {
/*  97 */         world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender()
/*     */             {
/*     */               public String func_70005_c_() {
/* 100 */                 return "";
/*     */               }
/*     */ 
/*     */               
/*     */               public boolean func_70003_b(int permission, String command) {
/* 105 */                 return true;
/*     */               }
/*     */ 
/*     */               
/*     */               public World func_130014_f_() {
/* 110 */                 return world;
/*     */               }
/*     */ 
/*     */               
/*     */               public MinecraftServer func_184102_h() {
/* 115 */                 return world.func_73046_m();
/*     */               }
/*     */ 
/*     */               
/*     */               public boolean func_174792_t_() {
/* 120 */                 return false;
/*     */               }
/*     */ 
/*     */               
/*     */               public BlockPos func_180425_c() {
/* 125 */                 return new BlockPos(x, y, z);
/*     */               }
/*     */ 
/*     */               
/*     */               public Vec3d func_174791_d() {
/* 130 */                 return new Vec3d(x, y, z);
/*     */               }
/*     */             }"effect @p ebwizardry:paralysis 99999 255 true");
/*     */       }
/* 134 */       world.func_180501_a(new BlockPos(x + 1, y, z), BlockGorunmezblock.block.func_176223_P(), 3);
/* 135 */       (FinfinModVariables.MapVariables.get(world)).Fallen = "true";
/* 136 */       FinfinModVariables.MapVariables.get(world).syncData(world);
/* 137 */       if (!world.field_72995_K && world.func_73046_m() != null) {
/* 138 */         world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender()
/*     */             {
/*     */               public String func_70005_c_() {
/* 141 */                 return "";
/*     */               }
/*     */ 
/*     */               
/*     */               public boolean func_70003_b(int permission, String command) {
/* 146 */                 return true;
/*     */               }
/*     */ 
/*     */               
/*     */               public World func_130014_f_() {
/* 151 */                 return world;
/*     */               }
/*     */ 
/*     */               
/*     */               public MinecraftServer func_184102_h() {
/* 156 */                 return world.func_73046_m();
/*     */               }
/*     */ 
/*     */               
/*     */               public boolean func_174792_t_() {
/* 161 */                 return false;
/*     */               }
/*     */ 
/*     */               
/*     */               public BlockPos func_180425_c() {
/* 166 */                 return new BlockPos(x, y, z);
/*     */               }
/*     */ 
/*     */               
/*     */               public Vec3d func_174791_d() {
/* 171 */                 return new Vec3d(x, y, z);
/*     */               }
/*     */             }"tp @p @p");
/*     */       }
/* 175 */       entity.getEntityData().func_74780_a("isPlayer", 1.0D);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\procedure\ProcedureVoidMultitoolLivingEntityIsHitWithTool.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */