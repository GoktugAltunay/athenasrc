/*    */ package net.mcreator.finfin.procedure;
/*    */ 
/*    */ import java.util.Map;
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.mcreator.finfin.item.ItemEmptyGlass;
/*    */ import net.minecraft.command.ICommandSender;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.entity.player.EntityPlayerMP;
/*    */ import net.minecraft.init.MobEffects;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.potion.PotionEffect;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import net.minecraft.util.EnumHand;
/*    */ import net.minecraft.util.math.BlockPos;
/*    */ import net.minecraft.util.math.Vec3d;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ @Tag
/*    */ public class ProcedureHiperoxinRightClickedInAir
/*    */   extends ElementsFinfinMod.ModElement {
/*    */   public ProcedureHiperoxinRightClickedInAir(ElementsFinfinMod instance) {
/* 24 */     super(instance, 24);
/*    */   }
/*    */   
/*    */   public static void executeProcedure(Map<String, Object> dependencies) {
/* 28 */     if (dependencies.get("entity") == null) {
/* 29 */       System.err.println("Failed to load dependency entity for procedure HiperoxinRightClickedInAir!");
/*    */       return;
/*    */     } 
/* 32 */     Entity entity = (Entity)dependencies.get("entity");
/* 33 */     if (entity instanceof EntityLivingBase)
/* 34 */       ((EntityLivingBase)entity).func_70690_d(new PotionEffect(MobEffects.field_76424_c, 6000, 6)); 
/* 35 */     if (entity instanceof EntityLivingBase)
/* 36 */       ((EntityLivingBase)entity).func_70690_d(new PotionEffect(MobEffects.field_76420_g, 6000, 6)); 
/* 37 */     if (entity instanceof EntityLivingBase)
/* 38 */       ((EntityLivingBase)entity).func_70690_d(new PotionEffect(MobEffects.field_76428_l, 6000, 6)); 
/* 39 */     if (entity instanceof EntityLivingBase) {
/* 40 */       ((EntityLivingBase)entity).func_70690_d(new PotionEffect(MobEffects.field_76429_m, 6000, 6));
/*    */     }
/* 42 */     final Entity _ent = entity;
/* 43 */     if (!_ent.field_70170_p.field_72995_K && _ent.field_70170_p.func_73046_m() != null) {
/* 44 */       _ent.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender()
/*    */           {
/*    */             public String func_70005_c_() {
/* 47 */               return "";
/*    */             }
/*    */ 
/*    */             
/*    */             public boolean func_70003_b(int permission, String command) {
/* 52 */               return true;
/*    */             }
/*    */ 
/*    */             
/*    */             public World func_130014_f_() {
/* 57 */               return _ent.field_70170_p;
/*    */             }
/*    */ 
/*    */             
/*    */             public MinecraftServer func_184102_h() {
/* 62 */               return _ent.field_70170_p.func_73046_m();
/*    */             }
/*    */ 
/*    */             
/*    */             public boolean func_174792_t_() {
/* 67 */               return false;
/*    */             }
/*    */ 
/*    */             
/*    */             public BlockPos func_180425_c() {
/* 72 */               return _ent.func_180425_c();
/*    */             }
/*    */ 
/*    */             
/*    */             public Vec3d func_174791_d() {
/* 77 */               return new Vec3d(_ent.field_70165_t, _ent.field_70163_u, _ent.field_70161_v);
/*    */             }
/*    */ 
/*    */             
/*    */             public Entity func_174793_f() {
/* 82 */               return _ent;
/*    */             }
/*    */           }"summon minecraft:lightning_bolt");
/*    */     }
/*    */     
/* 87 */     if (entity instanceof EntityLivingBase) {
/* 88 */       ItemStack _setstack = new ItemStack(ItemEmptyGlass.block, 1);
/* 89 */       _setstack.func_190920_e(1);
/* 90 */       ((EntityLivingBase)entity).func_184611_a(EnumHand.MAIN_HAND, _setstack);
/* 91 */       if (entity instanceof EntityPlayerMP)
/* 92 */         ((EntityPlayerMP)entity).field_71071_by.func_70296_d(); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\procedure\ProcedureHiperoxinRightClickedInAir.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */