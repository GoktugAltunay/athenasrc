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
/*     */ public class ItemR99Smg extends ElementsFinfinMod.ModElement {
/*     */   @ObjectHolder("finfin:r_99_smg")
/*  40 */   public static final Item block = null; public static final int ENTITYID = 5;
/*     */   
/*     */   public ItemR99Smg(ElementsFinfinMod instance) {
/*  43 */     super(instance, 84);
/*     */   }
/*     */ 
/*     */   
/*     */   public void initElements() {
/*  48 */     this.elements.items.add(() -> new RangedItem());
/*  49 */     this.elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityArrowCustom.class).id(new ResourceLocation("finfin", "entitybulletr_99_smg"), 5).name("entitybulletr_99_smg").tracker(64, 1, true).build());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void registerModels(ModelRegistryEvent event) {
/*  56 */     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("finfin:r_99_smg", "inventory"));
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void preInit(FMLPreInitializationEvent event) {
/*  62 */     RenderingRegistry.registerEntityRenderingHandler(EntityArrowCustom.class, renderManager -> new RenderSnowball(renderManager, (new ItemStack(ItemR301Ammo.block, 1)).func_77973_b(), Minecraft.func_71410_x().func_175599_af()));
/*     */   }
/*     */ 
/*     */   
/*     */   public static class RangedItem
/*     */     extends Item
/*     */   {
/*     */     public RangedItem() {
/*  70 */       func_77656_e(100);
/*  71 */       func_77664_n();
/*  72 */       func_77655_b("r_99_smg");
/*  73 */       setRegistryName("r_99_smg");
/*  74 */       this.field_77777_bU = 1;
/*  75 */       func_77637_a(TabAminake.tab);
/*     */     }
/*     */ 
/*     */     
/*     */     public void func_77615_a(ItemStack itemstack, World world, EntityLivingBase entityLivingBase, int timeLeft) {
/*  80 */       if (!world.field_72995_K && entityLivingBase instanceof EntityPlayerMP) {
/*  81 */         EntityPlayerMP entity = (EntityPlayerMP)entityLivingBase;
/*  82 */         int slotID = -1;
/*  83 */         for (int i = 0; i < entity.field_71071_by.field_70462_a.size(); i++) {
/*  84 */           ItemStack stack = (ItemStack)entity.field_71071_by.field_70462_a.get(i);
/*  85 */           if (stack != null && stack.func_77973_b() == (new ItemStack(ItemR99Mermi.block, 1)).func_77973_b() && stack
/*  86 */             .func_77960_j() == (new ItemStack(ItemR99Mermi.block, 1)).func_77960_j()) {
/*  87 */             slotID = i;
/*     */             break;
/*     */           } 
/*     */         } 
/*  91 */         if (entity.field_71075_bZ.field_75098_d || EnchantmentHelper.func_77506_a(Enchantments.field_185312_x, itemstack) > 0 || slotID != -1) {
/*     */           
/*  93 */           float power = 1.0F;
/*  94 */           ItemR99Smg.EntityArrowCustom entityarrow = new ItemR99Smg.EntityArrowCustom(world, (EntityLivingBase)entity);
/*  95 */           entityarrow.func_70186_c((entity.func_70040_Z()).field_72450_a, (entity.func_70040_Z()).field_72448_b, (entity.func_70040_Z()).field_72449_c, power * 2.0F, 0.0F);
/*  96 */           entityarrow.func_174810_b(true);
/*  97 */           entityarrow.func_70243_d(false);
/*  98 */           entityarrow.func_70239_b(5.0D);
/*  99 */           entityarrow.func_70240_a(1);
/* 100 */           itemstack.func_77972_a(1, (EntityLivingBase)entity);
/* 101 */           int x = (int)entity.field_70165_t;
/* 102 */           int y = (int)entity.field_70163_u;
/* 103 */           int z = (int)entity.field_70161_v;
/* 104 */           world.func_184148_a((EntityPlayer)null, x, y, z, (SoundEvent)SoundEvent.field_187505_a
/*     */               
/* 106 */               .func_82594_a(new ResourceLocation("finfin:r99fire")), SoundCategory.NEUTRAL, 1.0F, 1.0F / (field_77697_d
/* 107 */               .nextFloat() * 0.5F + 1.0F) + power / 2.0F);
/* 108 */           if (entity.field_71075_bZ.field_75098_d) {
/* 109 */             entityarrow.field_70251_a = EntityArrow.PickupStatus.CREATIVE_ONLY;
/*     */           }
/* 111 */           else if ((new ItemStack(ItemR99Mermi.block, 1)).func_77984_f()) {
/* 112 */             ItemStack stack = entity.field_71071_by.func_70301_a(slotID);
/* 113 */             if (stack.func_96631_a(1, field_77697_d, entity)) {
/* 114 */               stack.func_190918_g(1);
/* 115 */               stack.func_77964_b(0);
/*     */             } 
/*     */           } else {
/* 118 */             entity.field_71071_by.func_174925_a((new ItemStack(ItemR99Mermi.block, 1)).func_77973_b(), -1, 1, null);
/*     */           } 
/*     */           
/* 121 */           if (!world.field_72995_K) {
/* 122 */             world.func_72838_d((Entity)entityarrow);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entity, EnumHand hand) {
/* 129 */       entity.func_184598_c(hand);
/* 130 */       return new ActionResult(EnumActionResult.SUCCESS, entity.func_184586_b(hand));
/*     */     }
/*     */ 
/*     */     
/*     */     public EnumAction func_77661_b(ItemStack itemstack) {
/* 135 */       return EnumAction.BOW;
/*     */     }
/*     */ 
/*     */     
/*     */     public int func_77626_a(ItemStack itemstack) {
/* 140 */       return 72000;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class EntityArrowCustom extends EntityTippedArrow {
/*     */     public EntityArrowCustom(World a) {
/* 146 */       super(a);
/*     */     }
/*     */     
/*     */     public EntityArrowCustom(World worldIn, double x, double y, double z) {
/* 150 */       super(worldIn, x, y, z);
/*     */     }
/*     */     
/*     */     public EntityArrowCustom(World worldIn, EntityLivingBase shooter) {
/* 154 */       super(worldIn, shooter);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void func_184548_a(EntityLivingBase entity) {
/* 159 */       super.func_184548_a(entity);
/* 160 */       entity.func_85034_r(entity.func_85035_bI() - 1);
/*     */     }
/*     */ 
/*     */     
/*     */     public void func_70071_h_() {
/* 165 */       super.func_70071_h_();
/* 166 */       int x = (int)this.field_70165_t;
/* 167 */       int y = (int)this.field_70163_u;
/* 168 */       int z = (int)this.field_70161_v;
/* 169 */       World world = this.field_70170_p;
/* 170 */       Entity entity = this.field_70250_c;
/* 171 */       if (this.field_70254_i)
/* 172 */         this.field_70170_p.func_72900_e((Entity)this); 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemR99Smg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */