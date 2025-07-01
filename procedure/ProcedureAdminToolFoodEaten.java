/*    */ package net.mcreator.finfin.procedure;
/*    */ 
/*    */ import java.util.Map;
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.util.text.ITextComponent;
/*    */ import net.minecraft.util.text.TextComponentString;
/*    */ 
/*    */ @Tag
/*    */ public class ProcedureAdminToolFoodEaten extends ElementsFinfinMod.ModElement {
/*    */   public ProcedureAdminToolFoodEaten(ElementsFinfinMod instance) {
/* 14 */     super(instance, 70);
/*    */   }
/*    */   
/*    */   public static void executeProcedure(Map<String, Object> dependencies) {
/* 18 */     if (dependencies.get("entity") == null) {
/* 19 */       System.err.println("Failed to load dependency entity for procedure AdminToolFoodEaten!");
/*    */       return;
/*    */     } 
/* 22 */     Entity entity = (Entity)dependencies.get("entity");
/* 23 */     if (entity instanceof EntityPlayer && !entity.field_70170_p.field_72995_K)
/* 24 */       ((EntityPlayer)entity).func_146105_b((ITextComponent)new TextComponentString("§aADMIN MODE: §fEnabled"), false); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\procedure\ProcedureAdminToolFoodEaten.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */