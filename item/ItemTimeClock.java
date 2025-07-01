/*     */ package net.mcreator.finfin.item;
/*     */ 
/*     */ import net.mcreator.finfin.ElementsFinfinMod;
/*     */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*     */ import net.mcreator.finfin.creativetab.TabAminake;
/*     */ import net.minecraft.block.state.IBlockState;
/*     */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*     */ import net.minecraft.command.ICommandSender;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.potion.Potion;
/*     */ import net.minecraft.potion.PotionEffect;
/*     */ import net.minecraft.util.ActionResult;
/*     */ import net.minecraft.util.EnumActionResult;
/*     */ import net.minecraft.util.EnumHand;
/*     */ import net.minecraft.util.math.AxisAlignedBB;
/*     */ import net.minecraft.util.math.BlockPos;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.client.event.ModelRegistryEvent;
/*     */ import net.minecraftforge.client.model.ModelLoader;
/*     */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*     */ import net.minecraftforge.fml.relauncher.Side;
/*     */ import net.minecraftforge.fml.relauncher.SideOnly;
/*     */ 
/*     */ @Tag
/*     */ public class ItemTimeClock extends ElementsFinfinMod.ModElement {
/*     */   @ObjectHolder("finfin:time_clock")
/*  31 */   public static final Item block = null;
/*     */   private static boolean isTimeStopped = false;
/*     */   
/*     */   public ItemTimeClock(ElementsFinfinMod instance) {
/*  35 */     super(instance, 46);
/*     */   }
/*     */ 
/*     */   
/*     */   public void initElements() {
/*  40 */     this.elements.items.add(() -> new ItemCustom());
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void registerModels(ModelRegistryEvent event) {
/*  46 */     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("finfin:time_clock", "inventory"));
/*     */   }
/*     */   
/*     */   public static class ItemCustom extends Item {
/*     */     public ItemCustom() {
/*  51 */       func_77656_e(0);
/*  52 */       this.field_77777_bU = 1;
/*  53 */       func_77655_b("time_clock");
/*  54 */       setRegistryName("time_clock");
/*  55 */       func_77637_a(TabAminake.tab);
/*     */     }
/*     */ 
/*     */     
/*     */     public int func_77619_b() {
/*  60 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public int func_77626_a(ItemStack itemstack) {
/*  65 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public float func_150893_a(ItemStack par1ItemStack, IBlockState par2Block) {
/*  70 */       return 1.0F;
/*     */     }
/*     */ 
/*     */     
/*     */     public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer player, EnumHand hand) {
/*  75 */       if (!world.field_72995_K) {
/*  76 */         if (ItemTimeClock.isTimeStopped) {
/*  77 */           world.func_73046_m().func_71187_D().func_71556_a((ICommandSender)world.func_73046_m(), "/title @a title {\"text\":\"ZAMAN BASLADI\",\"bold\":true,\"italic\":true,\"strikethrough\":false,\"underlined\":false,\"color\":\"dark_red\"}");
/*  78 */           allowMovementInRadius(world, player.func_180425_c(), 500, true, player);
/*     */         } else {
/*  80 */           world.func_73046_m().func_71187_D().func_71556_a((ICommandSender)world.func_73046_m(), "/title @a title {\"text\":\"ZAMAN DURDU\",\"bold\":true,\"italic\":true,\"strikethrough\":false,\"underlined\":false,\"color\":\"dark_red\"}");
/*  81 */           allowMovementInRadius(world, player.func_180425_c(), 500, false, player);
/*     */         } 
/*  83 */         ItemTimeClock.isTimeStopped = !ItemTimeClock.isTimeStopped;
/*     */       } 
/*  85 */       return new ActionResult(EnumActionResult.SUCCESS, player.func_184586_b(hand));
/*     */     }
/*     */     
/*     */     private void allowMovementInRadius(World world, BlockPos center, int radius, boolean allow, EntityPlayer sourcePlayer) {
/*  89 */       for (Entity entity : world.func_72872_a(Entity.class, (new AxisAlignedBB(center)).func_186662_g(radius))) {
/*  90 */         if (entity instanceof EntityPlayer && entity != sourcePlayer) {
/*  91 */           EntityPlayer targetPlayer = (EntityPlayer)entity;
/*  92 */           if (!allow) {
/*  93 */             targetPlayer.func_70690_d(new PotionEffect(Potion.func_188412_a(2), 999999, 135, false, false));
/*  94 */             targetPlayer.func_70690_d(new PotionEffect(Potion.func_188412_a(1), 999999, 135, false, false));
/*  95 */             targetPlayer.func_70690_d(new PotionEffect(Potion.func_188412_a(18), 999999, 135, false, false));
/*  96 */             targetPlayer.func_70690_d(new PotionEffect(Potion.func_188412_a(9), 999999, 135, false, false)); continue;
/*     */           } 
/*  98 */           targetPlayer.func_184589_d(Potion.func_188412_a(2));
/*  99 */           targetPlayer.func_184589_d(Potion.func_188412_a(1));
/* 100 */           targetPlayer.func_184589_d(Potion.func_188412_a(18));
/* 101 */           targetPlayer.func_184589_d(Potion.func_188412_a(9)); continue;
/*     */         } 
/* 103 */         if (entity instanceof EntityLivingBase && entity != sourcePlayer) {
/* 104 */           EntityLivingBase targetEntity = (EntityLivingBase)entity;
/* 105 */           if (!allow) {
/* 106 */             targetEntity.func_70690_d(new PotionEffect(Potion.func_188412_a(2), 999999, 135, false, false));
/* 107 */             targetEntity.func_70690_d(new PotionEffect(Potion.func_188412_a(1), 999999, 135, false, false)); continue;
/*     */           } 
/* 109 */           targetEntity.func_184589_d(Potion.func_188412_a(2));
/* 110 */           targetEntity.func_184589_d(Potion.func_188412_a(1));
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemTimeClock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */