/*    */ package net.mcreator.finfin.block;
/*    */ 
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.SoundType;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraft.block.state.IBlockState;
/*    */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemBlock;
/*    */ import net.minecraftforge.client.event.ModelRegistryEvent;
/*    */ import net.minecraftforge.client.model.ModelLoader;
/*    */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*    */ import net.minecraftforge.fml.relauncher.Side;
/*    */ import net.minecraftforge.fml.relauncher.SideOnly;
/*    */ 
/*    */ @Tag
/*    */ public class BlockFallenblock
/*    */   extends ElementsFinfinMod.ModElement
/*    */ {
/*    */   @ObjectHolder("finfin:fallenblock")
/* 24 */   public static final Block block = null;
/*    */   public BlockFallenblock(ElementsFinfinMod instance) {
/* 26 */     super(instance, 7);
/*    */   }
/*    */ 
/*    */   
/*    */   public void initElements() {
/* 31 */     this.elements.blocks.add(() -> (Block)(new BlockCustom()).setRegistryName("fallenblock"));
/* 32 */     this.elements.items.add(() -> (Item)(new ItemBlock(block)).setRegistryName(block.getRegistryName()));
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerModels(ModelRegistryEvent event) {
/* 38 */     ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block), 0, new ModelResourceLocation("finfin:fallenblock", "inventory"));
/*    */   }
/*    */   
/*    */   public static class BlockCustom extends Block { public BlockCustom() {
/* 42 */       super(Material.field_151576_e);
/* 43 */       func_149663_c("fallenblock");
/* 44 */       func_149672_a(SoundType.field_185851_d);
/* 45 */       func_149711_c(1.0F);
/* 46 */       func_149752_b(10.0F);
/* 47 */       func_149715_a(0.0F);
/* 48 */       func_149713_g(0);
/* 49 */       func_149647_a(CreativeTabs.field_78026_f);
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean func_149662_c(IBlockState state) {
/* 54 */       return false;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\block\BlockFallenblock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */