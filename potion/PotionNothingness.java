/*     */ package net.mcreator.finfin.potion;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import net.mcreator.finfin.ElementsFinfinMod;
/*     */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*     */ import net.mcreator.finfin.procedure.ProcedureNothingnessOnPotionActiveTick;
/*     */ import net.mcreator.finfin.procedure.ProcedureNothingnessPotionStartedapplied;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.gui.Gui;
/*     */ import net.minecraft.entity.Entity;
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
/*     */ public class PotionNothingness
/*     */   extends ElementsFinfinMod.ModElement
/*     */ {
/*     */   @ObjectHolder("finfin:nothingness")
/*  30 */   public static final Potion potion = null;
/*     */   @ObjectHolder("finfin:nothingness")
/*  32 */   public static final PotionType potionType = null;
/*     */   public PotionNothingness(ElementsFinfinMod instance) {
/*  34 */     super(instance, 40);
/*     */   }
/*     */ 
/*     */   
/*     */   public void initElements() {
/*  39 */     this.elements.potions.add(() -> new PotionCustom());
/*     */   }
/*     */ 
/*     */   
/*     */   public void init(FMLInitializationEvent event) {
/*  44 */     ForgeRegistries.POTION_TYPES.register((IForgeRegistryEntry)new PotionTypeCustom());
/*     */   }
/*     */   
/*     */   public static class PotionTypeCustom extends PotionType { public PotionTypeCustom() {
/*  48 */       super(new PotionEffect[] { new PotionEffect(PotionNothingness.potion, 3600) });
/*  49 */       setRegistryName("nothingness");
/*     */     } }
/*     */   
/*     */   public static class PotionCustom extends Potion {
/*     */     private final ResourceLocation potionIcon;
/*     */     
/*     */     public PotionCustom() {
/*  56 */       super(true, -1);
/*  57 */       setRegistryName("nothingness");
/*  58 */       func_76390_b("effect.nothingness");
/*  59 */       this.potionIcon = new ResourceLocation("finfin:textures/mob_effect/nothingness.png");
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean func_76403_b() {
/*  64 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean shouldRenderInvText(PotionEffect effect) {
/*  69 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean shouldRenderHUD(PotionEffect effect) {
/*  74 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void func_180793_a(Entity source, Entity indirectSource, EntityLivingBase entity, int amplifier, double health) {
/*  79 */       World world = entity.field_70170_p;
/*  80 */       int x = (int)entity.field_70165_t;
/*  81 */       int y = (int)entity.field_70163_u;
/*  82 */       int z = (int)entity.field_70161_v;
/*     */       
/*  84 */       Map<String, Object> $_dependencies = new HashMap<>();
/*  85 */       $_dependencies.put("entity", entity);
/*  86 */       ProcedureNothingnessPotionStartedapplied.executeProcedure($_dependencies);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void func_76394_a(EntityLivingBase entity, int amplifier) {
/*  92 */       World world = entity.field_70170_p;
/*  93 */       int x = (int)entity.field_70165_t;
/*  94 */       int y = (int)entity.field_70163_u;
/*  95 */       int z = (int)entity.field_70161_v;
/*     */       
/*  97 */       Map<String, Object> $_dependencies = new HashMap<>();
/*  98 */       $_dependencies.put("entity", entity);
/*  99 */       ProcedureNothingnessOnPotionActiveTick.executeProcedure($_dependencies);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     @SideOnly(Side.CLIENT)
/*     */     public void renderInventoryEffect(int x, int y, PotionEffect effect, Minecraft mc) {
/* 106 */       if (mc.field_71462_r != null) {
/* 107 */         mc.func_110434_K().func_110577_a(this.potionIcon);
/* 108 */         Gui.func_146110_a(x + 6, y + 7, 0.0F, 0.0F, 18, 18, 18.0F, 18.0F);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     @SideOnly(Side.CLIENT)
/*     */     public void renderHUDEffect(int x, int y, PotionEffect effect, Minecraft mc, float alpha) {
/* 115 */       mc.func_110434_K().func_110577_a(this.potionIcon);
/* 116 */       Gui.func_146110_a(x + 3, y + 3, 0.0F, 0.0F, 18, 18, 18.0F, 18.0F);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean func_76397_a(int duration, int amplifier) {
/* 121 */       return true;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\potion\PotionNothingness.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */