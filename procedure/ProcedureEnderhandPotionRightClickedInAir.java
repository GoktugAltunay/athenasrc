/*    */ package net.mcreator.finfin.procedure;
/*    */ 
/*    */ import java.util.Map;
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.mcreator.finfin.item.ItemEndersoulHand;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.entity.player.EntityPlayerMP;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.EnumHand;
/*    */ 
/*    */ @Tag
/*    */ public class ProcedureEnderhandPotionRightClickedInAir
/*    */   extends ElementsFinfinMod.ModElement {
/*    */   public ProcedureEnderhandPotionRightClickedInAir(ElementsFinfinMod instance) {
/* 17 */     super(instance, 66);
/*    */   }
/*    */   
/*    */   public static void executeProcedure(Map<String, Object> dependencies) {
/* 21 */     if (dependencies.get("entity") == null) {
/* 22 */       System.err.println("Failed to load dependency entity for procedure EnderhandPotionRightClickedInAir!");
/*    */       return;
/*    */     } 
/* 25 */     Entity entity = (Entity)dependencies.get("entity");
/* 26 */     if (entity instanceof EntityLivingBase) {
/* 27 */       ItemStack _setstack = new ItemStack(ItemEndersoulHand.block, 1);
/* 28 */       _setstack.func_190920_e(1);
/* 29 */       ((EntityLivingBase)entity).func_184611_a(EnumHand.MAIN_HAND, _setstack);
/* 30 */       if (entity instanceof EntityPlayerMP)
/* 31 */         ((EntityPlayerMP)entity).field_71071_by.func_70296_d(); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\procedure\ProcedureEnderhandPotionRightClickedInAir.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */