/*    */ package net.mcreator.finfin.procedure;
/*    */ 
/*    */ import java.util.Map;
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.minecraft.entity.Entity;
/*    */ 
/*    */ @Tag
/*    */ public class ProcedureVoidMultitoolBlockDestroyedWithTool
/*    */   extends ElementsFinfinMod.ModElement
/*    */ {
/*    */   public ProcedureVoidMultitoolBlockDestroyedWithTool(ElementsFinfinMod instance) {
/* 13 */     super(instance, 8);
/*    */   }
/*    */   
/*    */   public static void executeProcedure(Map<String, Object> dependencies) {
/* 17 */     if (dependencies.get("entity") == null) {
/* 18 */       System.err.println("Failed to load dependency entity for procedure VoidMultitoolBlockDestroyedWithTool!");
/*    */       return;
/*    */     } 
/* 21 */     Entity entity = (Entity)dependencies.get("entity");
/* 22 */     if (entity instanceof net.minecraft.entity.player.EntityPlayer);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\procedure\ProcedureVoidMultitoolBlockDestroyedWithTool.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */