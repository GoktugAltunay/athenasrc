/*     */ package net.mcreator.finfin.item;
/*     */ import net.mcreator.finfin.ElementsFinfinMod;
/*     */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*     */ import net.mcreator.finfin.creativetab.TabAminake;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*     */ import net.minecraft.client.renderer.entity.Render;
/*     */ import net.minecraft.client.renderer.entity.RenderManager;
/*     */ import net.minecraft.client.renderer.entity.RenderSnowball;
/*     */ import net.minecraft.enchantment.EnchantmentHelper;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.player.EntityPlayerMP;
/*     */ import net.minecraft.entity.projectile.EntityArrow;
/*     */ import net.minecraft.entity.projectile.EntityTippedArrow;
/*     */ import net.minecraft.init.Enchantments;
/*     */ import net.minecraft.item.EnumAction;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.ActionResult;
/*     */ import net.minecraft.util.EnumActionResult;
/*     */ import net.minecraft.util.EnumHand;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import net.minecraft.util.SoundCategory;
/*     */ import net.minecraft.util.SoundEvent;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.client.model.ModelLoader;
/*     */ import net.minecraftforge.fml.client.registry.RenderingRegistry;
/*     */ import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
/*     */ import net.minecraftforge.fml.common.registry.EntityEntry;
/*     */ import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
/*     */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*     */ import net.minecraftforge.fml.relauncher.Side;
/*     */ import net.minecraftforge.fml.relauncher.SideOnly;
/*     */ 
/*     */ @Tag
/*     */ public class ItemGoldenRevolver extends ElementsFinfinMod.ModElement {
/*     */   @ObjectHolder("finfin:golden_revolver")
/*  40 */   public static final Item block = null; public static final int ENTITYID = 2;
/*     */   
/*     */   public ItemGoldenRevolver(ElementsFinfinMod instance) {
/*  43 */     super(instance, 48);
/*     */   }
/*     */ 
/*     */   
/*     */   public void initElements() {
/*  48 */     this.elements.items.add(() -> new RangedItem());
/*  49 */     this.elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityArrowCustom.class).id(new ResourceLocation("finfin", "entitybulletgolden_revolver"), 2).name("entitybulletgolden_revolver").tracker(64, 1, true).build());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void registerModels(ModelRegistryEvent event) {
/*  57 */     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("finfin:golden_revolver", "inventory"));
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void preInit(FMLPreInitializationEvent event) {
/*  63 */     RenderingRegistry.registerEntityRenderingHandler(EntityArrowCustom.class, renderManager -> new RenderSnowball(renderManager, (new ItemStack(ItemGoldenmermii.block, 1)).func_77973_b(), Minecraft.func_71410_x().func_175599_af()));
/*     */   }
/*     */ 
/*     */   
/*     */   public static class RangedItem
/*     */     extends Item
/*     */   {
/*     */     public RangedItem() {
/*  71 */       func_77656_e(99999);
/*  72 */       func_77664_n();
/*  73 */       func_77655_b("golden_revolver");
/*  74 */       setRegistryName("golden_revolver");
/*  75 */       this.field_77777_bU = 1;
/*  76 */       func_77637_a(TabAminake.tab);
/*     */     }
/*     */ 
/*     */     
/*     */     public void func_77615_a(ItemStack itemstack, World world, EntityLivingBase entityLivingBase, int timeLeft) {
/*  81 */       if (!world.field_72995_K && entityLivingBase instanceof EntityPlayerMP) {
/*  82 */         EntityPlayerMP entity = (EntityPlayerMP)entityLivingBase;
/*  83 */         int slotID = -1;
/*  84 */         for (int i = 0; i < entity.field_71071_by.field_70462_a.size(); i++) {
/*  85 */           ItemStack stack = (ItemStack)entity.field_71071_by.field_70462_a.get(i);
/*  86 */           if (stack != null && stack.func_77973_b() == (new ItemStack(ItemGoldenMermi.block, 1)).func_77973_b() && stack
/*  87 */             .func_77960_j() == (new ItemStack(ItemGoldenMermi.block, 1)).func_77960_j()) {
/*  88 */             slotID = i;
/*     */             break;
/*     */           } 
/*     */         } 
/*  92 */         if (entity.field_71075_bZ.field_75098_d || EnchantmentHelper.func_77506_a(Enchantments.field_185312_x, itemstack) > 0 || slotID != -1) {
/*     */           
/*  94 */           float power = 1.0F;
/*  95 */           ItemGoldenRevolver.EntityArrowCustom entityarrow = new ItemGoldenRevolver.EntityArrowCustom(world, (EntityLivingBase)entity);
/*  96 */           entityarrow.func_70186_c((entity.func_70040_Z()).field_72450_a, (entity.func_70040_Z()).field_72448_b, (entity.func_70040_Z()).field_72449_c, power * 2.0F, 0.0F);
/*  97 */           entityarrow.func_174810_b(true);
/*  98 */           entityarrow.func_70243_d(false);
/*  99 */           entityarrow.func_70239_b(2.0D);
/* 100 */           entityarrow.func_70240_a(1);
/* 101 */           itemstack.func_77972_a(1, (EntityLivingBase)entity);
/* 102 */           int x = (int)entity.field_70165_t;
/* 103 */           int y = (int)entity.field_70163_u;
/* 104 */           int z = (int)entity.field_70161_v;
/* 105 */           world.func_184148_a((EntityPlayer)null, x, y, z, (SoundEvent)SoundEvent.field_187505_a
/*     */               
/* 107 */               .func_82594_a(new ResourceLocation("finfin:revolvershot")), SoundCategory.NEUTRAL, 1.0F, 1.0F / (field_77697_d
/* 108 */               .nextFloat() * 0.5F + 1.0F) + power / 2.0F);
/* 109 */           if (entity.field_71075_bZ.field_75098_d) {
/* 110 */             entityarrow.field_70251_a = EntityArrow.PickupStatus.CREATIVE_ONLY;
/*     */           }
/* 112 */           else if ((new ItemStack(ItemGoldenMermi.block, 1)).func_77984_f()) {
/* 113 */             ItemStack stack = entity.field_71071_by.func_70301_a(slotID);
/* 114 */             if (stack.func_96631_a(1, field_77697_d, entity)) {
/* 115 */               stack.func_190918_g(1);
/* 116 */               stack.func_77964_b(0);
/*     */             } 
/*     */           } else {
/* 119 */             entity.field_71071_by.func_174925_a((new ItemStack(ItemGoldenMermi.block, 1)).func_77973_b(), -1, 1, null);
/*     */           } 
/*     */           
/* 122 */           if (!world.field_72995_K) {
/* 123 */             world.func_72838_d((Entity)entityarrow);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entity, EnumHand hand) {
/* 130 */       entity.func_184598_c(hand);
/* 131 */       return new ActionResult(EnumActionResult.SUCCESS, entity.func_184586_b(hand));
/*     */     }
/*     */ 
/*     */     
/*     */     public EnumAction func_77661_b(ItemStack itemstack) {
/* 136 */       return EnumAction.BOW;
/*     */     }
/*     */ 
/*     */     
/*     */     public int func_77626_a(ItemStack itemstack) {
/* 141 */       return 72000;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class EntityArrowCustom extends EntityTippedArrow {
/*     */     public EntityArrowCustom(World a) {
/* 147 */       super(a);
/*     */     }
/*     */     
/*     */     public EntityArrowCustom(World worldIn, double x, double y, double z) {
/* 151 */       super(worldIn, x, y, z);
/*     */     }
/*     */     
/*     */     public EntityArrowCustom(World worldIn, EntityLivingBase shooter) {
/* 155 */       super(worldIn, shooter);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void func_184548_a(EntityLivingBase entity) {
/* 160 */       super.func_184548_a(entity);
/* 161 */       entity.func_85034_r(entity.func_85035_bI() - 1);
/*     */     }
/*     */ 
/*     */     
/*     */     public void func_70071_h_() {
/* 166 */       super.func_70071_h_();
/* 167 */       int x = (int)this.field_70165_t;
/* 168 */       int y = (int)this.field_70163_u;
/* 169 */       int z = (int)this.field_70161_v;
/* 170 */       World world = this.field_70170_p;
/* 171 */       Entity entity = this.field_70250_c;
/* 172 */       if (this.field_70254_i)
/* 173 */         this.field_70170_p.func_72900_e((Entity)this); 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemGoldenRevolver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */