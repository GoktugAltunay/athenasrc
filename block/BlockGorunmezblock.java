/*     */ package net.mcreator.finfin.block;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.finfin.ElementsFinfinMod;
/*     */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*     */ import net.mcreator.finfin.item.ItemFallenskin;
/*     */ import net.mcreator.finfin.procedure.ProcedureGorunmezblockBlockDestroyedByPlayer;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.SoundType;
/*     */ import net.minecraft.block.material.Material;
/*     */ import net.minecraft.block.state.IBlockState;
/*     */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemBlock;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.BlockRenderLayer;
/*     */ import net.minecraft.util.NonNullList;
/*     */ import net.minecraft.util.math.AxisAlignedBB;
/*     */ import net.minecraft.util.math.BlockPos;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.client.event.ModelRegistryEvent;
/*     */ import net.minecraftforge.client.model.ModelLoader;
/*     */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*     */ import net.minecraftforge.fml.relauncher.Side;
/*     */ import net.minecraftforge.fml.relauncher.SideOnly;
/*     */ 
/*     */ @Tag
/*     */ public class BlockGorunmezblock
/*     */   extends ElementsFinfinMod.ModElement
/*     */ {
/*     */   @ObjectHolder("finfin:gorunmezblock")
/*  37 */   public static final Block block = null;
/*     */   public BlockGorunmezblock(ElementsFinfinMod instance) {
/*  39 */     super(instance, 3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void initElements() {
/*  44 */     this.elements.blocks.add(() -> (Block)(new BlockCustom()).setRegistryName("gorunmezblock"));
/*  45 */     this.elements.items.add(() -> (Item)(new ItemBlock(block)).setRegistryName(block.getRegistryName()));
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void registerModels(ModelRegistryEvent event) {
/*  51 */     ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block), 0, new ModelResourceLocation("finfin:gorunmezblock", "inventory"));
/*     */   }
/*     */   
/*     */   public static class BlockCustom extends Block { public BlockCustom() {
/*  55 */       super(Material.field_151576_e);
/*  56 */       func_149663_c("gorunmezblock");
/*  57 */       func_149672_a(SoundType.field_185851_d);
/*  58 */       func_149711_c(1.0F);
/*  59 */       func_149752_b(1.0F);
/*  60 */       func_149715_a(0.0F);
/*  61 */       func_149713_g(255);
/*  62 */       func_149647_a(CreativeTabs.field_78026_f);
/*     */     }
/*     */ 
/*     */     
/*     */     @SideOnly(Side.CLIENT)
/*     */     public BlockRenderLayer func_180664_k() {
/*  68 */       return BlockRenderLayer.CUTOUT;
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public AxisAlignedBB func_180646_a(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
/*  74 */       return field_185506_k;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean func_176205_b(IBlockAccess worldIn, BlockPos pos) {
/*  79 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean func_149686_d(IBlockState state) {
/*  84 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean func_149662_c(IBlockState state) {
/*  89 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
/*  94 */       drops.add(new ItemStack(ItemFallenskin.block, 1));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer entity, boolean willHarvest) {
/*  99 */       boolean retval = super.removedByPlayer(state, world, pos, entity, willHarvest);
/* 100 */       int x = pos.func_177958_n();
/* 101 */       int y = pos.func_177956_o();
/* 102 */       int z = pos.func_177952_p();
/*     */       
/* 104 */       Map<String, Object> $_dependencies = new HashMap<>();
/* 105 */       ProcedureGorunmezblockBlockDestroyedByPlayer.executeProcedure($_dependencies);
/*     */       
/* 107 */       return retval;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\block\BlockGorunmezblock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */