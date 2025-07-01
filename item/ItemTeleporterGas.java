/*     */ package net.mcreator.finfin.item;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import net.mcreator.finfin.ElementsFinfinMod;
/*     */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*     */ import net.mcreator.finfin.creativetab.TabAminake;
/*     */ import net.mcreator.finfin.procedure.ProcedureTeleporterGasBulletHitsLivingEntity;
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
/*     */ import net.minecraftforge.client.event.ModelRegistryEvent;
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
/*     */ public class ItemTeleporterGas extends ElementsFinfinMod.ModElement {
/*     */   @ObjectHolder("finfin:teleporter_gas")
/*  44 */   public static final Item block = null; public static final int ENTITYID = 1;
/*     */   
/*     */   public ItemTeleporterGas(ElementsFinfinMod instance) {
/*  47 */     super(instance, 37);
/*     */   }
/*     */ 
/*     */   
/*     */   public void initElements() {
/*  52 */     this.elements.items.add(() -> new RangedItem());
/*  53 */     this.elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityArrowCustom.class).id(new ResourceLocation("finfin", "entitybulletteleporter_gas"), 1).name("entitybulletteleporter_gas").tracker(64, 1, true).build());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void registerModels(ModelRegistryEvent event) {
/*  61 */     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("finfin:teleporter_gas", "inventory"));
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void preInit(FMLPreInitializationEvent event) {
/*  67 */     RenderingRegistry.registerEntityRenderingHandler(EntityArrowCustom.class, renderManager -> new RenderSnowball(renderManager, (new ItemStack(block, 1)).func_77973_b(), Minecraft.func_71410_x().func_175599_af()));
/*     */   }
/*     */ 
/*     */   
/*     */   public static class RangedItem
/*     */     extends Item
/*     */   {
/*     */     public RangedItem() {
/*  75 */       func_77656_e(99999);
/*  76 */       func_77664_n();
/*  77 */       func_77655_b("teleporter_gas");
/*  78 */       setRegistryName("teleporter_gas");
/*  79 */       this.field_77777_bU = 64;
/*  80 */       func_77637_a(TabAminake.tab);
/*     */     }
/*     */ 
/*     */     
/*     */     public void func_77615_a(ItemStack itemstack, World world, EntityLivingBase entityLivingBase, int timeLeft) {
/*  85 */       if (!world.field_72995_K && entityLivingBase instanceof EntityPlayerMP) {
/*  86 */         EntityPlayerMP entity = (EntityPlayerMP)entityLivingBase;
/*  87 */         int slotID = -1;
/*  88 */         for (int i = 0; i < entity.field_71071_by.field_70462_a.size(); i++) {
/*  89 */           ItemStack stack = (ItemStack)entity.field_71071_by.field_70462_a.get(i);
/*  90 */           if (stack != null && stack.func_77973_b() == (new ItemStack(ItemTeleporterGas.block, 1)).func_77973_b() && stack
/*  91 */             .func_77960_j() == (new ItemStack(ItemTeleporterGas.block, 1)).func_77960_j()) {
/*  92 */             slotID = i;
/*     */             break;
/*     */           } 
/*     */         } 
/*  96 */         if (entity.field_71075_bZ.field_75098_d || EnchantmentHelper.func_77506_a(Enchantments.field_185312_x, itemstack) > 0 || slotID != -1) {
/*     */           
/*  98 */           float power = 1.0F;
/*  99 */           ItemTeleporterGas.EntityArrowCustom entityarrow = new ItemTeleporterGas.EntityArrowCustom(world, (EntityLivingBase)entity);
/* 100 */           entityarrow.func_70186_c((entity.func_70040_Z()).field_72450_a, (entity.func_70040_Z()).field_72448_b, (entity.func_70040_Z()).field_72449_c, power * 2.0F, 0.0F);
/* 101 */           entityarrow.func_174810_b(true);
/* 102 */           entityarrow.func_70243_d(false);
/* 103 */           entityarrow.func_70239_b(2.0D);
/* 104 */           entityarrow.func_70240_a(1);
/* 105 */           itemstack.func_77972_a(1, (EntityLivingBase)entity);
/* 106 */           int x = (int)entity.field_70165_t;
/* 107 */           int y = (int)entity.field_70163_u;
/* 108 */           int z = (int)entity.field_70161_v;
/* 109 */           world.func_184148_a((EntityPlayer)null, x, y, z, (SoundEvent)SoundEvent.field_187505_a
/* 110 */               .func_82594_a(new ResourceLocation("")), SoundCategory.NEUTRAL, 1.0F, 1.0F / (field_77697_d
/* 111 */               .nextFloat() * 0.5F + 1.0F) + power / 2.0F);
/* 112 */           if (entity.field_71075_bZ.field_75098_d) {
/* 113 */             entityarrow.field_70251_a = EntityArrow.PickupStatus.CREATIVE_ONLY;
/*     */           }
/* 115 */           else if ((new ItemStack(ItemTeleporterGas.block, 1)).func_77984_f()) {
/* 116 */             ItemStack stack = entity.field_71071_by.func_70301_a(slotID);
/* 117 */             if (stack.func_96631_a(1, field_77697_d, entity)) {
/* 118 */               stack.func_190918_g(1);
/* 119 */               stack.func_77964_b(0);
/*     */             } 
/*     */           } else {
/* 122 */             entity.field_71071_by.func_174925_a((new ItemStack(ItemTeleporterGas.block, 1)).func_77973_b(), -1, 1, null);
/*     */           } 
/*     */           
/* 125 */           if (!world.field_72995_K) {
/* 126 */             world.func_72838_d((Entity)entityarrow);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entity, EnumHand hand) {
/* 133 */       entity.func_184598_c(hand);
/* 134 */       return new ActionResult(EnumActionResult.SUCCESS, entity.func_184586_b(hand));
/*     */     }
/*     */ 
/*     */     
/*     */     public EnumAction func_77661_b(ItemStack itemstack) {
/* 139 */       return EnumAction.BOW;
/*     */     }
/*     */ 
/*     */     
/*     */     public int func_77626_a(ItemStack itemstack) {
/* 144 */       return 72000;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class EntityArrowCustom extends EntityTippedArrow {
/*     */     public EntityArrowCustom(World a) {
/* 150 */       super(a);
/*     */     }
/*     */     
/*     */     public EntityArrowCustom(World worldIn, double x, double y, double z) {
/* 154 */       super(worldIn, x, y, z);
/*     */     }
/*     */     
/*     */     public EntityArrowCustom(World worldIn, EntityLivingBase shooter) {
/* 158 */       super(worldIn, shooter);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void func_184548_a(EntityLivingBase entity) {
/* 163 */       super.func_184548_a(entity);
/* 164 */       entity.func_85034_r(entity.func_85035_bI() - 1);
/* 165 */       int x = (int)this.field_70165_t;
/* 166 */       int y = (int)this.field_70163_u;
/* 167 */       int z = (int)this.field_70161_v;
/* 168 */       World world = this.field_70170_p;
/*     */       
/* 170 */       Map<String, Object> $_dependencies = new HashMap<>();
/* 171 */       $_dependencies.put("entity", entity);
/* 172 */       ProcedureTeleporterGasBulletHitsLivingEntity.executeProcedure($_dependencies);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void func_70071_h_() {
/* 178 */       super.func_70071_h_();
/* 179 */       int x = (int)this.field_70165_t;
/* 180 */       int y = (int)this.field_70163_u;
/* 181 */       int z = (int)this.field_70161_v;
/* 182 */       World world = this.field_70170_p;
/* 183 */       Entity entity = this.field_70250_c;
/* 184 */       if (this.field_70254_i)
/* 185 */         this.field_70170_p.func_72900_e((Entity)this); 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemTeleporterGas.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */