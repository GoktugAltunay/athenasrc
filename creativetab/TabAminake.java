/*    */ package net.mcreator.finfin.creativetab;
/*    */ 
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.mcreator.finfin.item.ItemVoidMultitool;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraftforge.fml.relauncher.Side;
/*    */ import net.minecraftforge.fml.relauncher.SideOnly;
/*    */ 
/*    */ @Tag
/*    */ public class TabAminake extends ElementsFinfinMod.ModElement {
/*    */   public static CreativeTabs tab;
/*    */   
/*    */   public TabAminake(ElementsFinfinMod instance) {
/* 16 */     super(instance, 12);
/*    */   }
/*    */ 
/*    */   
/*    */   public void initElements() {
/* 21 */     tab = new CreativeTabs("tabaminake")
/*    */       {
/*    */         @SideOnly(Side.CLIENT)
/*    */         public ItemStack func_78016_d() {
/* 25 */           return new ItemStack(ItemVoidMultitool.block, 1);
/*    */         }
/*    */         
/*    */         @SideOnly(Side.CLIENT)
/*    */         public boolean hasSearchBar() {
/* 30 */           return false;
/*    */         }
/*    */       };
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\creativetab\TabAminake.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */