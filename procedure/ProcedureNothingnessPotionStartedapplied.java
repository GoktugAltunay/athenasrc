/*    */ package net.mcreator.finfin.procedure;
/*    */ 
/*    */ import java.util.Map;
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.minecraft.command.ICommandSender;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.init.MobEffects;
/*    */ import net.minecraft.potion.PotionEffect;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import net.minecraft.util.math.BlockPos;
/*    */ import net.minecraft.util.math.Vec3d;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ @Tag
/*    */ public class ProcedureNothingnessPotionStartedapplied
/*    */   extends ElementsFinfinMod.ModElement {
/*    */   public ProcedureNothingnessPotionStartedapplied(ElementsFinfinMod instance) {
/* 21 */     super(instance, 40);
/*    */   }
/*    */   
/*    */   public static void executeProcedure(Map<String, Object> dependencies) {
/* 25 */     if (dependencies.get("entity") == null) {
/* 26 */       System.err.println("Failed to load dependency entity for procedure NothingnessPotionStartedapplied!");
/*    */       return;
/*    */     } 
/* 29 */     Entity entity = (Entity)dependencies.get("entity");
/* 30 */     entity.func_70110_aj();
/* 31 */     entity.func_70110_aj();
/* 32 */     entity.func_70110_aj();
/* 33 */     entity.func_70110_aj();
/* 34 */     if (entity instanceof EntityPlayer)
/* 35 */       ((EntityPlayer)entity).func_71053_j(); 
/* 36 */     if (entity instanceof EntityPlayer)
/* 37 */       ((EntityPlayer)entity).func_71053_j(); 
/* 38 */     if (entity instanceof EntityPlayer)
/* 39 */       ((EntityPlayer)entity).func_71053_j(); 
/* 40 */     if (entity instanceof EntityPlayer)
/* 41 */       ((EntityPlayer)entity).func_71053_j(); 
/* 42 */     if (entity instanceof EntityLivingBase)
/* 43 */       ((EntityLivingBase)entity).func_70690_d(new PotionEffect(MobEffects.field_76421_d, 999999, 135, false, false)); 
/* 44 */     if (entity instanceof EntityLivingBase)
/* 45 */       ((EntityLivingBase)entity).func_70690_d(new PotionEffect(MobEffects.field_76419_f, 999999, 135, false, false)); 
/* 46 */     if (entity instanceof EntityLivingBase)
/* 47 */       ((EntityLivingBase)entity).func_70690_d(new PotionEffect(MobEffects.field_76430_j, 999999, 135, false, false)); 
/* 48 */     if (entity instanceof EntityLivingBase)
/* 49 */       ((EntityLivingBase)entity).func_70690_d(new PotionEffect(MobEffects.field_76440_q, 999999, 135, false, false)); 
/* 50 */     if (entity instanceof EntityLivingBase) {
/* 51 */       ((EntityLivingBase)entity).func_70690_d(new PotionEffect(MobEffects.field_76437_t, 999999, 135, false, false));
/*    */     }
/* 53 */     final Entity _ent = entity;
/* 54 */     if (!_ent.field_70170_p.field_72995_K && _ent.field_70170_p.func_73046_m() != null)
/* 55 */       _ent.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender()
/*    */           {
/*    */             public String func_70005_c_() {
/* 58 */               return "";
/*    */             }
/*    */ 
/*    */             
/*    */             public boolean func_70003_b(int permission, String command) {
/* 63 */               return true;
/*    */             }
/*    */ 
/*    */             
/*    */             public World func_130014_f_() {
/* 68 */               return _ent.field_70170_p;
/*    */             }
/*    */ 
/*    */             
/*    */             public MinecraftServer func_184102_h() {
/* 73 */               return _ent.field_70170_p.func_73046_m();
/*    */             }
/*    */ 
/*    */             
/*    */             public boolean func_174792_t_() {
/* 78 */               return false;
/*    */             }
/*    */ 
/*    */             
/*    */             public BlockPos func_180425_c() {
/* 83 */               return _ent.func_180425_c();
/*    */             }
/*    */ 
/*    */             
/*    */             public Vec3d func_174791_d() {
/* 88 */               return new Vec3d(_ent.field_70165_t, _ent.field_70163_u, _ent.field_70161_v);
/*    */             }
/*    */ 
/*    */             
/*    */             public Entity func_174793_f() {
/* 93 */               return _ent;
/*    */             }
/*    */           }"effect @p ebwizardry:paralysis 99999 255 true"); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\procedure\ProcedureNothingnessPotionStartedapplied.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */