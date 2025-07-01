/*    */ package net.mcreator.finfin.procedure;
/*    */ 
/*    */ import java.util.Map;
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.mcreator.finfin.potion.PotionTeleportergaspotion;
/*    */ import net.minecraft.command.ICommandSender;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.potion.PotionEffect;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import net.minecraft.util.math.BlockPos;
/*    */ import net.minecraft.util.math.Vec3d;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ @Tag
/*    */ public class ProcedureTeleporterGasBulletHitsLivingEntity
/*    */   extends ElementsFinfinMod.ModElement
/*    */ {
/*    */   public ProcedureTeleporterGasBulletHitsLivingEntity(ElementsFinfinMod instance) {
/* 21 */     super(instance, 37);
/*    */   }
/*    */   
/*    */   public static void executeProcedure(Map<String, Object> dependencies) {
/* 25 */     if (dependencies.get("entity") == null) {
/* 26 */       System.err.println("Failed to load dependency entity for procedure TeleporterGasBulletHitsLivingEntity!");
/*    */       return;
/*    */     } 
/* 29 */     Entity entity = (Entity)dependencies.get("entity");
/* 30 */     if (entity instanceof net.minecraft.entity.player.EntityPlayer) {
/* 31 */       if (entity instanceof EntityLivingBase) {
/* 32 */         ((EntityLivingBase)entity).func_70690_d(new PotionEffect(PotionTeleportergaspotion.potion, 60, 1, false, false));
/*    */       }
/* 34 */       final Entity _ent = entity;
/* 35 */       if (!_ent.field_70170_p.field_72995_K && _ent.field_70170_p.func_73046_m() != null)
/* 36 */         _ent.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender()
/*    */             {
/*    */               public String func_70005_c_() {
/* 39 */                 return "";
/*    */               }
/*    */ 
/*    */               
/*    */               public boolean func_70003_b(int permission, String command) {
/* 44 */                 return true;
/*    */               }
/*    */ 
/*    */               
/*    */               public World func_130014_f_() {
/* 49 */                 return _ent.field_70170_p;
/*    */               }
/*    */ 
/*    */               
/*    */               public MinecraftServer func_184102_h() {
/* 54 */                 return _ent.field_70170_p.func_73046_m();
/*    */               }
/*    */ 
/*    */               
/*    */               public boolean func_174792_t_() {
/* 59 */                 return false;
/*    */               }
/*    */ 
/*    */               
/*    */               public BlockPos func_180425_c() {
/* 64 */                 return _ent.func_180425_c();
/*    */               }
/*    */ 
/*    */               
/*    */               public Vec3d func_174791_d() {
/* 69 */                 return new Vec3d(_ent.field_70165_t, _ent.field_70163_u, _ent.field_70161_v);
/*    */               }
/*    */ 
/*    */               
/*    */               public Entity func_174793_f() {
/* 74 */                 return _ent;
/*    */               }
/*    */             }"/tp @s ~250 ~ ~250"); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\procedure\ProcedureTeleporterGasBulletHitsLivingEntity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */