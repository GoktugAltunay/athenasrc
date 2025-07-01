/*    */ package net.mcreator.finfin.procedure;
/*    */ 
/*    */ import java.util.Map;
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.minecraft.command.ICommandSender;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.entity.player.EntityPlayerMP;
/*    */ import net.minecraft.init.Blocks;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import net.minecraft.util.EnumHand;
/*    */ import net.minecraft.util.math.BlockPos;
/*    */ import net.minecraft.util.math.Vec3d;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ @Tag
/*    */ public class ProcedureDistortedBoraloKafaRightClickedInAir
/*    */   extends ElementsFinfinMod.ModElement {
/*    */   public ProcedureDistortedBoraloKafaRightClickedInAir(ElementsFinfinMod instance) {
/* 22 */     super(instance, 59);
/*    */   }
/*    */   
/*    */   public static void executeProcedure(Map<String, Object> dependencies) {
/* 26 */     if (dependencies.get("entity") == null) {
/* 27 */       System.err.println("Failed to load dependency entity for procedure DistortedBoraloKafaRightClickedInAir!");
/*    */       return;
/*    */     } 
/* 30 */     Entity entity = (Entity)dependencies.get("entity");
/*    */     
/* 32 */     final Entity _ent = entity;
/* 33 */     if (!_ent.field_70170_p.field_72995_K && _ent.field_70170_p.func_73046_m() != null) {
/* 34 */       _ent.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender()
/*    */           {
/*    */             public String func_70005_c_() {
/* 37 */               return "";
/*    */             }
/*    */ 
/*    */             
/*    */             public boolean func_70003_b(int permission, String command) {
/* 42 */               return true;
/*    */             }
/*    */ 
/*    */             
/*    */             public World func_130014_f_() {
/* 47 */               return _ent.field_70170_p;
/*    */             }
/*    */ 
/*    */             
/*    */             public MinecraftServer func_184102_h() {
/* 52 */               return _ent.field_70170_p.func_73046_m();
/*    */             }
/*    */ 
/*    */             
/*    */             public boolean func_174792_t_() {
/* 57 */               return false;
/*    */             }
/*    */ 
/*    */             
/*    */             public BlockPos func_180425_c() {
/* 62 */               return _ent.func_180425_c();
/*    */             }
/*    */ 
/*    */             
/*    */             public Vec3d func_174791_d() {
/* 67 */               return new Vec3d(_ent.field_70165_t, _ent.field_70163_u, _ent.field_70161_v);
/*    */             }
/*    */ 
/*    */             
/*    */             public Entity func_174793_f() {
/* 72 */               return _ent;
/*    */             }
/*    */           }"replaceitem entity @s slot.armor.head finfin:distorted_boralo_kafa");
/*    */     }
/*    */     
/* 77 */     if (entity instanceof EntityLivingBase) {
/* 78 */       ItemStack _setstack = new ItemStack(Blocks.field_150350_a, 1);
/* 79 */       _setstack.func_190920_e(1);
/* 80 */       ((EntityLivingBase)entity).func_184611_a(EnumHand.MAIN_HAND, _setstack);
/* 81 */       if (entity instanceof EntityPlayerMP)
/* 82 */         ((EntityPlayerMP)entity).field_71071_by.func_70296_d(); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\procedure\ProcedureDistortedBoraloKafaRightClickedInAir.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */