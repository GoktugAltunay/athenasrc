/*    */ package net.mcreator.finfin.procedure;
/*    */ 
/*    */ import java.util.Map;
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.minecraft.command.ICommandSender;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.init.MobEffects;
/*    */ import net.minecraft.potion.PotionEffect;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import net.minecraft.util.math.BlockPos;
/*    */ import net.minecraft.util.math.Vec3d;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ @Tag
/*    */ public class ProcedureAirStaffRightClickedInAir
/*    */   extends ElementsFinfinMod.ModElement {
/*    */   public ProcedureAirStaffRightClickedInAir(ElementsFinfinMod instance) {
/* 20 */     super(instance, 34);
/*    */   }
/*    */   
/*    */   public static void executeProcedure(Map<String, Object> dependencies) {
/* 24 */     if (dependencies.get("entity") == null) {
/* 25 */       System.err.println("Failed to load dependency entity for procedure AirStaffRightClickedInAir!");
/*    */       return;
/*    */     } 
/* 28 */     if (dependencies.get("x") == null) {
/* 29 */       System.err.println("Failed to load dependency x for procedure AirStaffRightClickedInAir!");
/*    */       return;
/*    */     } 
/* 32 */     if (dependencies.get("y") == null) {
/* 33 */       System.err.println("Failed to load dependency y for procedure AirStaffRightClickedInAir!");
/*    */       return;
/*    */     } 
/* 36 */     if (dependencies.get("z") == null) {
/* 37 */       System.err.println("Failed to load dependency z for procedure AirStaffRightClickedInAir!");
/*    */       return;
/*    */     } 
/* 40 */     if (dependencies.get("world") == null) {
/* 41 */       System.err.println("Failed to load dependency world for procedure AirStaffRightClickedInAir!");
/*    */       return;
/*    */     } 
/* 44 */     Entity entity = (Entity)dependencies.get("entity");
/* 45 */     final int x = ((Integer)dependencies.get("x")).intValue();
/* 46 */     final int y = ((Integer)dependencies.get("y")).intValue();
/* 47 */     final int z = ((Integer)dependencies.get("z")).intValue();
/* 48 */     final World world = (World)dependencies.get("world");
/* 49 */     if (!world.field_72995_K && world.func_73046_m() != null) {
/* 50 */       world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender()
/*    */           {
/*    */             public String func_70005_c_() {
/* 53 */               return "";
/*    */             }
/*    */ 
/*    */             
/*    */             public boolean func_70003_b(int permission, String command) {
/* 58 */               return true;
/*    */             }
/*    */ 
/*    */             
/*    */             public World func_130014_f_() {
/* 63 */               return world;
/*    */             }
/*    */ 
/*    */             
/*    */             public MinecraftServer func_184102_h() {
/* 68 */               return world.func_73046_m();
/*    */             }
/*    */ 
/*    */             
/*    */             public boolean func_174792_t_() {
/* 73 */               return false;
/*    */             }
/*    */ 
/*    */             
/*    */             public BlockPos func_180425_c() {
/* 78 */               return new BlockPos(x, y, z);
/*    */             }
/*    */ 
/*    */             
/*    */             public Vec3d func_174791_d() {
/* 83 */               return new Vec3d(x, y, z);
/*    */             }
/*    */           }"/cast ebwizardry:charge @p");
/*    */     }
/* 87 */     if (entity instanceof EntityLivingBase)
/* 88 */       ((EntityLivingBase)entity).func_70690_d(new PotionEffect(MobEffects.field_188424_y, 5, 1, false, false)); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\procedure\ProcedureAirStaffRightClickedInAir.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */