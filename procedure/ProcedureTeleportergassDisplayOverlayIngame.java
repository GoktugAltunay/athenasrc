/*    */ package net.mcreator.finfin.procedure;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import java.util.Map;
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.mcreator.finfin.potion.PotionTeleportergaspotion;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.potion.PotionEffect;
/*    */ 
/*    */ @Tag
/*    */ public class ProcedureTeleportergassDisplayOverlayIngame
/*    */   extends ElementsFinfinMod.ModElement {
/*    */   public ProcedureTeleportergassDisplayOverlayIngame(ElementsFinfinMod instance) {
/* 16 */     super(instance, 38);
/*    */   }
/*    */   
/*    */   public static boolean executeProcedure(Map<String, Object> dependencies) {
/* 20 */     if (dependencies.get("entity") == null) {
/* 21 */       System.err.println("Failed to load dependency entity for procedure TeleportergassDisplayOverlayIngame!");
/* 22 */       return false;
/*    */     } 
/* 24 */     final Entity entity = (Entity)dependencies.get("entity");
/* 25 */     return (new Object() {
/*    */         boolean check() {
/* 27 */           if (entity instanceof EntityLivingBase) {
/* 28 */             Collection<PotionEffect> effects = ((EntityLivingBase)entity).func_70651_bq();
/* 29 */             for (PotionEffect effect : effects) {
/* 30 */               if (effect.func_188419_a() == PotionTeleportergaspotion.potion)
/* 31 */                 return true; 
/*    */             } 
/*    */           } 
/* 34 */           return false;
/*    */         }
/* 36 */       }).check();
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\procedure\ProcedureTeleportergassDisplayOverlayIngame.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */