/*    */ package net.mcreator.finfin.item;
/*    */ 
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.minecraft.block.state.IBlockState;
/*    */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraftforge.client.event.ModelRegistryEvent;
/*    */ import net.minecraftforge.client.model.ModelLoader;
/*    */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*    */ import net.minecraftforge.fml.relauncher.Side;
/*    */ import net.minecraftforge.fml.relauncher.SideOnly;
/*    */ 
/*    */ @Tag
/*    */ public class ItemR301Ammo
/*    */   extends ElementsFinfinMod.ModElement
/*    */ {
/*    */   @ObjectHolder("finfin:r_301_ammo")
/* 20 */   public static final Item block = null;
/*    */   public ItemR301Ammo(ElementsFinfinMod instance) {
/* 22 */     super(instance, 79);
/*    */   }
/*    */ 
/*    */   
/*    */   public void initElements() {
/* 27 */     this.elements.items.add(() -> new ItemCustom());
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerModels(ModelRegistryEvent event) {
/* 33 */     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("finfin:r_301_ammo", "inventory"));
/*    */   }
/*    */   
/*    */   public static class ItemCustom extends Item { public ItemCustom() {
/* 37 */       func_77656_e(0);
/* 38 */       this.field_77777_bU = 64;
/* 39 */       func_77655_b("r_301_ammo");
/* 40 */       setRegistryName("r_301_ammo");
/* 41 */       func_77637_a(null);
/*    */     }
/*    */ 
/*    */     
/*    */     public int func_77619_b() {
/* 46 */       return 0;
/*    */     }
/*    */ 
/*    */     
/*    */     public int func_77626_a(ItemStack itemstack) {
/* 51 */       return 0;
/*    */     }
/*    */ 
/*    */     
/*    */     public float func_150893_a(ItemStack par1ItemStack, IBlockState par2Block) {
/* 56 */       return 1.0F;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemR301Ammo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */