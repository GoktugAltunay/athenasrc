/*    */ package net.mcreator.finfin.item;
/*    */ 
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.mcreator.finfin.creativetab.TabAminake;
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
/*    */ public class ItemR99Mermi
/*    */   extends ElementsFinfinMod.ModElement
/*    */ {
/*    */   @ObjectHolder("finfin:r_99_mermi")
/* 21 */   public static final Item block = null;
/*    */   public ItemR99Mermi(ElementsFinfinMod instance) {
/* 23 */     super(instance, 83);
/*    */   }
/*    */ 
/*    */   
/*    */   public void initElements() {
/* 28 */     this.elements.items.add(() -> new ItemCustom());
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerModels(ModelRegistryEvent event) {
/* 34 */     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("finfin:r_99_mermi", "inventory"));
/*    */   }
/*    */   
/*    */   public static class ItemCustom extends Item { public ItemCustom() {
/* 38 */       func_77656_e(0);
/* 39 */       this.field_77777_bU = 1;
/* 40 */       func_77655_b("r_99_mermi");
/* 41 */       setRegistryName("r_99_mermi");
/* 42 */       func_77637_a(TabAminake.tab);
/*    */     }
/*    */ 
/*    */     
/*    */     public int func_77619_b() {
/* 47 */       return 0;
/*    */     }
/*    */ 
/*    */     
/*    */     public int func_77626_a(ItemStack itemstack) {
/* 52 */       return 0;
/*    */     }
/*    */ 
/*    */     
/*    */     public float func_150893_a(ItemStack par1ItemStack, IBlockState par2Block) {
/* 57 */       return 1.0F;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemR99Mermi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */