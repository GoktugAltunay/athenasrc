/*    */ package net.mcreator.finfin.item;
/*    */ 
/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.mcreator.finfin.creativetab.TabAminake;
/*    */ import net.mcreator.finfin.procedure.ProcedureBoraloEnderRightClickedOnBlock;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraft.block.state.IBlockState;
/*    */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.init.Blocks;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.item.ItemTool;
/*    */ import net.minecraft.util.EnumActionResult;
/*    */ import net.minecraft.util.EnumFacing;
/*    */ import net.minecraft.util.EnumHand;
/*    */ import net.minecraft.util.math.BlockPos;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.client.event.ModelRegistryEvent;
/*    */ import net.minecraftforge.client.model.ModelLoader;
/*    */ import net.minecraftforge.common.util.EnumHelper;
/*    */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*    */ import net.minecraftforge.fml.relauncher.Side;
/*    */ import net.minecraftforge.fml.relauncher.SideOnly;
/*    */ 
/*    */ @Tag
/*    */ public class ItemBoraloEnder
/*    */   extends ElementsFinfinMod.ModElement
/*    */ {
/*    */   @ObjectHolder("finfin:boralo_ender")
/* 37 */   public static final Item block = null;
/*    */   public ItemBoraloEnder(ElementsFinfinMod instance) {
/* 39 */     super(instance, 11);
/*    */   }
/*    */ 
/*    */   
/*    */   public void initElements() {
/* 44 */     this.elements.items.add(() -> ((Item)(new ItemToolCustom()
/*    */         {
/*    */           public EnumActionResult func_180614_a(EntityPlayer entity, World world, BlockPos pos, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ)
/*    */           {
/* 48 */             EnumActionResult retval = super.func_180614_a(entity, world, pos, hand, direction, hitX, hitY, hitZ);
/* 49 */             int x = pos.func_177958_n();
/* 50 */             int y = pos.func_177956_o();
/* 51 */             int z = pos.func_177952_p();
/* 52 */             ItemStack itemstack = entity.func_184586_b(hand);
/*    */             
/* 54 */             Map<Object, Object> $_dependencies = new HashMap<>();
/* 55 */             $_dependencies.put("entity", entity);
/* 56 */             ProcedureBoraloEnderRightClickedOnBlock.executeProcedure($_dependencies);
/*    */             
/* 58 */             return retval;
/*    */           }
/*    */         }).func_77655_b("boralo_ender").setRegistryName("boralo_ender")).func_77637_a(TabAminake.tab));
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerModels(ModelRegistryEvent event) {
/* 66 */     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("finfin:boralo_ender", "inventory"));
/*    */   }
/*    */   
/*    */   private static class ItemToolCustom extends ItemTool {
/* 70 */     private static final Set<Block> effective_items_set = Sets.newHashSet((Object[])new Block[] { 
/*    */           Blocks.field_150344_f, Blocks.field_150342_X, Blocks.field_150364_r, Blocks.field_150363_s, (Block)Blocks.field_150486_ae, Blocks.field_150423_aK, Blocks.field_150428_aP, Blocks.field_150440_ba, Blocks.field_150468_ap, Blocks.field_150471_bO, 
/*    */           Blocks.field_150452_aw }); protected ItemToolCustom() {
/* 73 */       super(EnumHelper.addToolMaterial("BORALO_ENDER", 1, 99999, 4.0F, 0.0F, 2), effective_items_set);
/* 74 */       this.field_77865_bY = 0.0F;
/* 75 */       this.field_185065_c = -3.0F;
/*    */     }
/*    */ 
/*    */     
/*    */     public float func_150893_a(ItemStack stack, IBlockState state) {
/* 80 */       Material material = state.func_185904_a();
/* 81 */       return (material != Material.field_151575_d && material != Material.field_151585_k && material != Material.field_151582_l) ? super
/* 82 */         .func_150893_a(stack, state) : this.field_77864_a;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemBoraloEnder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */