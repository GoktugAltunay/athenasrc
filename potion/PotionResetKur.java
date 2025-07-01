/*     */ package net.mcreator.finfin.potion;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import net.mcreator.finfin.ElementsFinfinMod;
/*     */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*     */ import net.mcreator.finfin.procedure.ProcedureResetKurOnPotionActiveTick;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.gui.Gui;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.potion.Potion;
/*     */ import net.minecraft.potion.PotionEffect;
/*     */ import net.minecraft.potion.PotionType;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.fml.common.event.FMLInitializationEvent;
/*     */ import net.minecraftforge.fml.common.registry.ForgeRegistries;
/*     */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*     */ import net.minecraftforge.fml.relauncher.Side;
/*     */ import net.minecraftforge.fml.relauncher.SideOnly;
/*     */ import net.minecraftforge.registries.IForgeRegistryEntry;
/*     */ 
/*     */ @Tag
/*     */ public class PotionResetKur
/*     */   extends ElementsFinfinMod.ModElement
/*     */ {
/*     */   @ObjectHolder("finfin:reset_kur")
/*  28 */   public static final Potion potion = null;
/*     */   @ObjectHolder("finfin:reset_kur")
/*  30 */   public static final PotionType potionType = null;
/*     */   public PotionResetKur(ElementsFinfinMod instance) {
/*  32 */     super(instance, 62);
/*     */   }
/*     */ 
/*     */   
/*     */   public void initElements() {
/*  37 */     this.elements.potions.add(() -> new PotionCustom());
/*     */   }
/*     */ 
/*     */   
/*     */   public void init(FMLInitializationEvent event) {
/*  42 */     ForgeRegistries.POTION_TYPES.register((IForgeRegistryEntry)new PotionTypeCustom());
/*     */   }
/*     */   
/*     */   public static class PotionTypeCustom extends PotionType { public PotionTypeCustom() {
/*  46 */       super(new PotionEffect[] { new PotionEffect(PotionResetKur.potion, 3600) });
/*  47 */       setRegistryName("reset_kur");
/*     */     } }
/*     */   
/*     */   public static class PotionCustom extends Potion {
/*     */     private final ResourceLocation potionIcon;
/*     */     
/*     */     public PotionCustom() {
/*  54 */       super(false, -1);
/*  55 */       setRegistryName("reset_kur");
/*  56 */       func_76390_b("effect.reset_kur");
/*  57 */       this.potionIcon = new ResourceLocation("finfin:textures/mob_effect/reset_kur.png");
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean func_76403_b() {
/*  62 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean shouldRenderInvText(PotionEffect effect) {
/*  67 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean shouldRenderHUD(PotionEffect effect) {
/*  72 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void func_76394_a(EntityLivingBase entity, int amplifier) {
/*  77 */       World world = entity.field_70170_p;
/*  78 */       int x = (int)entity.field_70165_t;
/*  79 */       int y = (int)entity.field_70163_u;
/*  80 */       int z = (int)entity.field_70161_v;
/*     */       
/*  82 */       Map<String, Object> $_dependencies = new HashMap<>();
/*  83 */       $_dependencies.put("entity", entity);
/*  84 */       ProcedureResetKurOnPotionActiveTick.executeProcedure($_dependencies);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     @SideOnly(Side.CLIENT)
/*     */     public void renderInventoryEffect(int x, int y, PotionEffect effect, Minecraft mc) {
/*  91 */       if (mc.field_71462_r != null) {
/*  92 */         mc.func_110434_K().func_110577_a(this.potionIcon);
/*  93 */         Gui.func_146110_a(x + 6, y + 7, 0.0F, 0.0F, 18, 18, 18.0F, 18.0F);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     @SideOnly(Side.CLIENT)
/*     */     public void renderHUDEffect(int x, int y, PotionEffect effect, Minecraft mc, float alpha) {
/* 100 */       mc.func_110434_K().func_110577_a(this.potionIcon);
/* 101 */       Gui.func_146110_a(x + 3, y + 3, 0.0F, 0.0F, 18, 18, 18.0F, 18.0F);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean func_76397_a(int duration, int amplifier) {
/* 106 */       return true;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\potion\PotionResetKur.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */