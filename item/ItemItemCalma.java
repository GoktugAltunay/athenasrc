/*     */ package net.mcreator.finfin.item;
/*     */ 
/*     */ import java.util.List;
/*     */ import net.mcreator.finfin.ElementsFinfinMod;
/*     */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*     */ import net.mcreator.finfin.creativetab.TabAminake;
/*     */ import net.minecraft.block.state.IBlockState;
/*     */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.SoundEvents;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.ActionResult;
/*     */ import net.minecraft.util.EnumActionResult;
/*     */ import net.minecraft.util.EnumHand;
/*     */ import net.minecraft.util.SoundCategory;
/*     */ import net.minecraft.util.math.AxisAlignedBB;
/*     */ import net.minecraft.util.text.ITextComponent;
/*     */ import net.minecraft.util.text.TextComponentString;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.client.event.ModelRegistryEvent;
/*     */ import net.minecraftforge.client.model.ModelLoader;
/*     */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*     */ import net.minecraftforge.fml.relauncher.Side;
/*     */ import net.minecraftforge.fml.relauncher.SideOnly;
/*     */ 
/*     */ @Tag
/*     */ public class ItemItemCalma
/*     */   extends ElementsFinfinMod.ModElement
/*     */ {
/*     */   @ObjectHolder("finfin:item_calma")
/*  33 */   public static final Item block = null;
/*     */   
/*     */   public ItemItemCalma(ElementsFinfinMod instance) {
/*  36 */     super(instance, 133);
/*     */   }
/*     */ 
/*     */   
/*     */   public void initElements() {
/*  41 */     this.elements.items.add(() -> new ItemCustom());
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void registerModels(ModelRegistryEvent event) {
/*  47 */     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("finfin:item_calma", "inventory"));
/*     */   }
/*     */   
/*     */   public static class ItemCustom extends Item {
/*     */     public ItemCustom() {
/*  52 */       func_77656_e(0);
/*  53 */       this.field_77777_bU = 1;
/*  54 */       func_77655_b("item_calma");
/*  55 */       setRegistryName("item_calma");
/*  56 */       func_77637_a(TabAminake.tab);
/*     */     }
/*     */ 
/*     */     
/*     */     public int func_77619_b() {
/*  61 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public int func_77626_a(ItemStack itemstack) {
/*  66 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public float func_150893_a(ItemStack par1ItemStack, IBlockState par2Block) {
/*  71 */       return 1.0F;
/*     */     }
/*     */ 
/*     */     
/*     */     public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer player, EnumHand hand) {
/*  76 */       if (!world.field_72995_K) {
/*  77 */         List<EntityLivingBase> nearbyEntities = world.func_72872_a(EntityLivingBase.class, new AxisAlignedBB(player
/*  78 */               .func_180425_c().func_177982_a(-3, -3, -3), player.func_180425_c().func_177982_a(3, 3, 3)));
/*     */         
/*  80 */         boolean foundEntity = false;
/*     */         
/*  82 */         for (EntityLivingBase entity : nearbyEntities) {
/*  83 */           if (entity == player) {
/*     */             continue;
/*     */           }
/*     */           
/*  87 */           if (world.func_72933_a(player.func_174791_d(), entity.func_174791_d()) == null) {
/*  88 */             ItemStack itemInHand = entity.func_184614_ca();
/*  89 */             if (!itemInHand.func_190926_b()) {
/*  90 */               foundEntity = true;
/*     */ 
/*     */               
/*  93 */               entity.func_184611_a(EnumHand.MAIN_HAND, ItemStack.field_190927_a);
/*     */ 
/*     */               
/*  96 */               player.field_71071_by.func_70441_a(itemInHand);
/*     */ 
/*     */               
/*  99 */               world.func_184148_a(null, player.field_70165_t, player.field_70163_u, player.field_70161_v, SoundEvents.field_187638_cR, SoundCategory.PLAYERS, 1.0F, 1.0F);
/*     */ 
/*     */               
/* 102 */               String entityName = entity.func_70005_c_();
/* 103 */               TextComponentString textComponentString = new TextComponentString(entityName + " itemini düsürdü!");
/* 104 */               player.func_145747_a((ITextComponent)textComponentString);
/*     */               
/*     */               break;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 111 */         if (!foundEntity)
/*     */         {
/* 113 */           player.func_145747_a((ITextComponent)new TextComponentString("Yakınındaki oyuncuda esya bulunamadi."));
/*     */         }
/*     */       } 
/* 116 */       return new ActionResult(EnumActionResult.SUCCESS, player.func_184586_b(hand));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemItemCalma.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */