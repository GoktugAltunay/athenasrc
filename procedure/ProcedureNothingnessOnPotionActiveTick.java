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
/*    */ public class ProcedureNothingnessOnPotionActiveTick
/*    */   extends ElementsFinfinMod.ModElement {
/*    */   public ProcedureNothingnessOnPotionActiveTick(ElementsFinfinMod instance) {
/* 20 */     super(instance, 41);
/*    */   }
/*    */   
/*    */   public static void executeProcedure(Map<String, Object> dependencies) {
/* 24 */     if (dependencies.get("entity") == null) {
/* 25 */       System.err.println("Failed to load dependency entity for procedure NothingnessOnPotionActiveTick!");
/*    */       return;
/*    */     } 
/* 28 */     Entity entity = (Entity)dependencies.get("entity");
/* 29 */     if (entity instanceof EntityLivingBase)
/* 30 */       ((EntityLivingBase)entity).func_70690_d(new PotionEffect(MobEffects.field_76419_f, 999999, 135, false, false)); 
/* 31 */     if (entity instanceof EntityLivingBase)
/* 32 */       ((EntityLivingBase)entity).func_70690_d(new PotionEffect(MobEffects.field_76421_d, 999999, 135, false, false)); 
/* 33 */     if (entity instanceof EntityLivingBase)
/* 34 */       ((EntityLivingBase)entity).func_70690_d(new PotionEffect(MobEffects.field_76430_j, 999999, 135, false, false)); 
/* 35 */     if (entity instanceof EntityLivingBase)
/* 36 */       ((EntityLivingBase)entity).func_70690_d(new PotionEffect(MobEffects.field_76437_t, 999999, 135, false, false)); 
/* 37 */     if (entity instanceof EntityLivingBase) {
/* 38 */       ((EntityLivingBase)entity).func_70690_d(new PotionEffect(MobEffects.field_76440_q, 999999, 135, false, false));
/*    */     }
/* 40 */     final Entity _ent = entity;
/* 41 */     if (!_ent.field_70170_p.field_72995_K && _ent.field_70170_p.func_73046_m() != null)
/* 42 */       _ent.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender()
/*    */           {
/*    */             public String func_70005_c_() {
/* 45 */               return "";
/*    */             }
/*    */ 
/*    */             
/*    */             public boolean func_70003_b(int permission, String command) {
/* 50 */               return true;
/*    */             }
/*    */ 
/*    */             
/*    */             public World func_130014_f_() {
/* 55 */               return _ent.field_70170_p;
/*    */             }
/*    */ 
/*    */             
/*    */             public MinecraftServer func_184102_h() {
/* 60 */               return _ent.field_70170_p.func_73046_m();
/*    */             }
/*    */ 
/*    */             
/*    */             public boolean func_174792_t_() {
/* 65 */               return false;
/*    */             }
/*    */ 
/*    */             
/*    */             public BlockPos func_180425_c() {
/* 70 */               return _ent.func_180425_c();
/*    */             }
/*    */ 
/*    */             
/*    */             public Vec3d func_174791_d() {
/* 75 */               return new Vec3d(_ent.field_70165_t, _ent.field_70163_u, _ent.field_70161_v);
/*    */             }
/*    */ 
/*    */             
/*    */             public Entity func_174793_f() {
/* 80 */               return _ent;
/*    */             }
/*    */           }"effect @p ebwizardry:paralysis 99999 255 true"); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\procedure\ProcedureNothingnessOnPotionActiveTick.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */