/*    */ package net.mcreator.finfin.procedure;
/*    */ 
/*    */ import java.util.Map;
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.mcreator.finfin.item.ItemUrmcop;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.entity.player.EntityPlayerMP;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.EnumHand;
/*    */ 
/*    */ @Tag
/*    */ public class ProcedureUrmcopbabaOnKeyPressed
/*    */   extends ElementsFinfinMod.ModElement {
/*    */   public ProcedureUrmcopbabaOnKeyPressed(ElementsFinfinMod instance) {
/* 17 */     super(instance, 27);
/*    */   }
/*    */   
/*    */   public static void executeProcedure(Map<String, Object> dependencies) {
/* 21 */     if (dependencies.get("entity") == null) {
/* 22 */       System.err.println("Failed to load dependency entity for procedure UrmcopbabaOnKeyPressed!");
/*    */       return;
/*    */     } 
/* 25 */     Entity entity = (Entity)dependencies.get("entity");
/* 26 */     if (entity instanceof EntityLivingBase) {
/* 27 */       ItemStack _setstack = new ItemStack(ItemUrmcop.block, 1);
/* 28 */       _setstack.func_190920_e(1);
/* 29 */       ((EntityLivingBase)entity).func_184611_a(EnumHand.MAIN_HAND, _setstack);
/* 30 */       if (entity instanceof EntityPlayerMP)
/* 31 */         ((EntityPlayerMP)entity).field_71071_by.func_70296_d(); 
/*    */     } 
/* 33 */     if (entity instanceof EntityLivingBase) {
/* 34 */       ItemStack _setstack = new ItemStack(ItemUrmcop.block, 1);
/* 35 */       _setstack.func_190920_e(1);
/* 36 */       ((EntityLivingBase)entity).func_184611_a(EnumHand.OFF_HAND, _setstack);
/* 37 */       if (entity instanceof EntityPlayerMP)
/* 38 */         ((EntityPlayerMP)entity).field_71071_by.func_70296_d(); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\procedure\ProcedureUrmcopbabaOnKeyPressed.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */