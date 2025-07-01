/*    */ package net.mcreator.finfin.item;
/*    */ 
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.mcreator.finfin.creativetab.TabAminake;
/*    */ import net.minecraft.block.state.IBlockState;
/*    */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.ActionResult;
/*    */ import net.minecraft.util.EnumActionResult;
/*    */ import net.minecraft.util.EnumHand;
/*    */ import net.minecraft.util.math.Vec3d;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.client.event.ModelRegistryEvent;
/*    */ import net.minecraftforge.client.model.ModelLoader;
/*    */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*    */ import net.minecraftforge.fml.relauncher.Side;
/*    */ import net.minecraftforge.fml.relauncher.SideOnly;
/*    */ 
/*    */ @Tag
/*    */ public class ItemEndersoulHand extends ElementsFinfinMod.ModElement {
/*    */   @ObjectHolder("finfin:endersoul_hand")
/* 25 */   public static final Item block = null;
/*    */   
/*    */   public ItemEndersoulHand(ElementsFinfinMod instance) {
/* 28 */     super(instance, 65);
/*    */   }
/*    */ 
/*    */   
/*    */   public void initElements() {
/* 33 */     this.elements.items.add(() -> new ItemCustom());
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerModels(ModelRegistryEvent event) {
/* 39 */     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("finfin:endersoul_hand", "inventory"));
/*    */   }
/*    */   
/*    */   public static class ItemCustom extends Item {
/*    */     public ItemCustom() {
/* 44 */       func_77656_e(0);
/* 45 */       this.field_77777_bU = 1;
/* 46 */       func_77655_b("endersoul_hand");
/* 47 */       setRegistryName("endersoul_hand");
/* 48 */       func_77637_a(TabAminake.tab);
/*    */     }
/*    */ 
/*    */     
/*    */     public int func_77619_b() {
/* 53 */       return 0;
/*    */     }
/*    */ 
/*    */     
/*    */     public int func_77626_a(ItemStack itemstack) {
/* 58 */       return 0;
/*    */     }
/*    */ 
/*    */     
/*    */     public float func_150893_a(ItemStack par1ItemStack, IBlockState par2Block) {
/* 63 */       return 1.0F;
/*    */     }
/*    */ 
/*    */     
/*    */     public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer player, EnumHand hand) {
/* 68 */       if (!world.field_72995_K) {
/* 69 */         teleportPlayerInDirection(player);
/*    */       }
/* 71 */       return new ActionResult(EnumActionResult.SUCCESS, player.func_184586_b(hand));
/*    */     }
/*    */     
/*    */     private void teleportPlayerInDirection(EntityPlayer player) {
/* 75 */       double teleportDistance = 10.0D;
/* 76 */       Vec3d lookVec = player.func_70040_Z();
/* 77 */       double targetX = player.field_70165_t + lookVec.field_72450_a * teleportDistance;
/* 78 */       double targetY = player.field_70163_u;
/* 79 */       double targetZ = player.field_70161_v + lookVec.field_72449_c * teleportDistance;
/* 80 */       player.func_70634_a(targetX, targetY, targetZ);
/* 81 */       player.field_70143_R = 0.0F;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemEndersoulHand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */