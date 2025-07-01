/*     */ package net.mcreator.finfin.item;
/*     */ 
/*     */ import com.google.common.base.Predicate;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import net.mcreator.finfin.ElementsFinfinMod;
/*     */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*     */ import net.mcreator.finfin.creativetab.TabAminake;
/*     */ import net.mcreator.finfin.procedure.ProcedureTaserRightClickedInAir;
/*     */ import net.minecraft.block.state.IBlockState;
/*     */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.potion.Potion;
/*     */ import net.minecraft.potion.PotionEffect;
/*     */ import net.minecraft.util.ActionResult;
/*     */ import net.minecraft.util.EnumActionResult;
/*     */ import net.minecraft.util.EnumHand;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import net.minecraft.util.SoundCategory;
/*     */ import net.minecraft.util.SoundEvent;
/*     */ import net.minecraft.util.math.AxisAlignedBB;
/*     */ import net.minecraft.util.math.RayTraceResult;
/*     */ import net.minecraft.util.math.Vec3d;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.client.event.ModelRegistryEvent;
/*     */ import net.minecraftforge.client.model.ModelLoader;
/*     */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*     */ import net.minecraftforge.fml.relauncher.Side;
/*     */ import net.minecraftforge.fml.relauncher.SideOnly;
/*     */ 
/*     */ @Tag
/*     */ public class ItemTaser
/*     */   extends ElementsFinfinMod.ModElement
/*     */ {
/*     */   @ObjectHolder("finfin:taser")
/*  40 */   public static final Item block = null;
/*     */   
/*     */   public ItemTaser(ElementsFinfinMod instance) {
/*  43 */     super(instance, 42);
/*     */   }
/*     */ 
/*     */   
/*     */   public void initElements() {
/*  48 */     this.elements.items.add(() -> new ItemCustom());
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void registerModels(ModelRegistryEvent event) {
/*  54 */     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("finfin:taser", "inventory"));
/*     */   }
/*     */   
/*     */   public static class ItemCustom extends Item {
/*     */     private static final int EFFECT_DURATION = 100;
/*     */     private static final int EFFECT_AMPLIFIER = 128;
/*     */     private static final double TASER_RANGE = 20.0D;
/*     */     
/*     */     public ItemCustom() {
/*  63 */       func_77656_e(0);
/*  64 */       this.field_77777_bU = 1;
/*  65 */       func_77655_b("taser");
/*  66 */       setRegistryName("taser");
/*  67 */       func_77637_a(TabAminake.tab);
/*     */     }
/*     */ 
/*     */     
/*     */     public int func_77619_b() {
/*  72 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public int func_77626_a(ItemStack itemstack) {
/*  77 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public float func_150893_a(ItemStack par1ItemStack, IBlockState par2Block) {
/*  82 */       return 1.0F;
/*     */     }
/*     */ 
/*     */     
/*     */     public ActionResult<ItemStack> func_77659_a(World world, final EntityPlayer entity, EnumHand hand) {
/*  87 */       ItemStack itemstack = entity.func_184586_b(hand);
/*  88 */       Vec3d lookVec = entity.func_70040_Z();
/*  89 */       Vec3d startPos = new Vec3d(entity.field_70165_t, entity.field_70163_u + entity.func_70047_e(), entity.field_70161_v);
/*  90 */       Vec3d endPos = startPos.func_178787_e(lookVec.func_186678_a(20.0D));
/*     */       
/*  92 */       AxisAlignedBB boundingBox = new AxisAlignedBB(startPos.field_72450_a, startPos.field_72448_b, startPos.field_72449_c, endPos.field_72450_a, endPos.field_72448_b, endPos.field_72449_c);
/*  93 */       List<Entity> entities = world.func_175647_a(Entity.class, boundingBox, new Predicate<Entity>()
/*     */           {
/*     */             public boolean apply(Entity entity1) {
/*  96 */               return (entity1 != entity && entity1 instanceof EntityPlayer);
/*     */             }
/*     */           });
/*     */       
/* 100 */       if (!entities.isEmpty()) {
/* 101 */         RayTraceResult trace = new RayTraceResult(entities.get(0));
/* 102 */         if (trace.field_72313_a == RayTraceResult.Type.ENTITY && trace.field_72308_g instanceof EntityPlayer) {
/* 103 */           EntityPlayer targetPlayer = (EntityPlayer)trace.field_72308_g;
/* 104 */           applyTaserEffects(targetPlayer);
/* 105 */           playSoundEffect(world, targetPlayer.field_70165_t, targetPlayer.field_70163_u, targetPlayer.field_70161_v);
/*     */         } 
/*     */       } 
/*     */       
/* 109 */       triggerAirClickProcedure(entity);
/* 110 */       return new ActionResult(EnumActionResult.SUCCESS, itemstack);
/*     */     }
/*     */     
/*     */     private void applyTaserEffects(EntityPlayer target) {
/* 114 */       target.func_70690_d(new PotionEffect(Potion.func_188412_a(2), 999999, 135, false, false));
/* 115 */       target.func_70690_d(new PotionEffect(Potion.func_188412_a(18), 999999, 135, false, false));
/* 116 */       target.func_70690_d(new PotionEffect(Potion.func_188412_a(4), 999999, 135, false, false));
/* 117 */       target.func_70690_d(new PotionEffect(Potion.func_188412_a(9), 999999, 135, false, false));
/*     */     }
/*     */     
/*     */     private void playSoundEffect(World world, double x, double y, double z) {
/* 121 */       world.func_184148_a(null, x, y, z, (SoundEvent)SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("finfin:taserses")), SoundCategory.PLAYERS, 1.0F, 1.0F);
/*     */     }
/*     */     
/*     */     private void triggerAirClickProcedure(EntityPlayer entity) {
/* 125 */       Map<String, Object> dependencies = new HashMap<>();
/* 126 */       dependencies.put("entity", entity);
/* 127 */       ProcedureTaserRightClickedInAir.executeProcedure(dependencies);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemTaser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */