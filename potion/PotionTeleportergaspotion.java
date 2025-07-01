/*    */ package net.mcreator.finfin.potion;
/*    */ 
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.gui.Gui;
/*    */ import net.minecraft.potion.Potion;
/*    */ import net.minecraft.potion.PotionEffect;
/*    */ import net.minecraft.potion.PotionType;
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ import net.minecraftforge.fml.common.event.FMLInitializationEvent;
/*    */ import net.minecraftforge.fml.common.registry.ForgeRegistries;
/*    */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*    */ import net.minecraftforge.fml.relauncher.Side;
/*    */ import net.minecraftforge.fml.relauncher.SideOnly;
/*    */ import net.minecraftforge.registries.IForgeRegistryEntry;
/*    */ 
/*    */ @Tag
/*    */ public class PotionTeleportergaspotion
/*    */   extends ElementsFinfinMod.ModElement {
/*    */   @ObjectHolder("finfin:teleportergaspotion")
/* 22 */   public static final Potion potion = null;
/*    */   @ObjectHolder("finfin:teleportergaspotion")
/* 24 */   public static final PotionType potionType = null;
/*    */   public PotionTeleportergaspotion(ElementsFinfinMod instance) {
/* 26 */     super(instance, 37);
/*    */   }
/*    */ 
/*    */   
/*    */   public void initElements() {
/* 31 */     this.elements.potions.add(() -> new PotionCustom());
/*    */   }
/*    */ 
/*    */   
/*    */   public void init(FMLInitializationEvent event) {
/* 36 */     ForgeRegistries.POTION_TYPES.register((IForgeRegistryEntry)new PotionTypeCustom());
/*    */   }
/*    */   
/*    */   public static class PotionTypeCustom extends PotionType { public PotionTypeCustom() {
/* 40 */       super(new PotionEffect[] { new PotionEffect(PotionTeleportergaspotion.potion, 3600) });
/* 41 */       setRegistryName("teleportergaspotion");
/*    */     } }
/*    */   
/*    */   public static class PotionCustom extends Potion {
/*    */     private final ResourceLocation potionIcon;
/*    */     
/*    */     public PotionCustom() {
/* 48 */       super(false, -1);
/* 49 */       setRegistryName("teleportergaspotion");
/* 50 */       func_76390_b("effect.teleportergaspotion");
/* 51 */       this.potionIcon = new ResourceLocation("finfin:textures/mob_effect/teleportergaspotion.png");
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean func_76403_b() {
/* 56 */       return false;
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean shouldRenderInvText(PotionEffect effect) {
/* 61 */       return true;
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean shouldRenderHUD(PotionEffect effect) {
/* 66 */       return true;
/*    */     }
/*    */ 
/*    */     
/*    */     @SideOnly(Side.CLIENT)
/*    */     public void renderInventoryEffect(int x, int y, PotionEffect effect, Minecraft mc) {
/* 72 */       if (mc.field_71462_r != null) {
/* 73 */         mc.func_110434_K().func_110577_a(this.potionIcon);
/* 74 */         Gui.func_146110_a(x + 6, y + 7, 0.0F, 0.0F, 18, 18, 18.0F, 18.0F);
/*    */       } 
/*    */     }
/*    */ 
/*    */     
/*    */     @SideOnly(Side.CLIENT)
/*    */     public void renderHUDEffect(int x, int y, PotionEffect effect, Minecraft mc, float alpha) {
/* 81 */       mc.func_110434_K().func_110577_a(this.potionIcon);
/* 82 */       Gui.func_146110_a(x + 3, y + 3, 0.0F, 0.0F, 18, 18, 18.0F, 18.0F);
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean func_76397_a(int duration, int amplifier) {
/* 87 */       return true;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\potion\PotionTeleportergaspotion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */