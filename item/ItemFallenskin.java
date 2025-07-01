/*    */ package net.mcreator.finfin.item;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.mcreator.finfin.procedure.ProcedureFallenskinRightClickedOnBlock;
/*    */ import net.minecraft.block.state.IBlockState;
/*    */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.EnumActionResult;
/*    */ import net.minecraft.util.EnumFacing;
/*    */ import net.minecraft.util.EnumHand;
/*    */ import net.minecraft.util.math.BlockPos;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.client.event.ModelRegistryEvent;
/*    */ import net.minecraftforge.client.model.ModelLoader;
/*    */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*    */ import net.minecraftforge.fml.relauncher.Side;
/*    */ import net.minecraftforge.fml.relauncher.SideOnly;
/*    */ 
/*    */ 
/*    */ @Tag
/*    */ public class ItemFallenskin
/*    */   extends ElementsFinfinMod.ModElement
/*    */ {
/*    */   @ObjectHolder("finfin:fallenskin")
/* 31 */   public static final Item block = null;
/*    */   public ItemFallenskin(ElementsFinfinMod instance) {
/* 33 */     super(instance, 2);
/*    */   }
/*    */ 
/*    */   
/*    */   public void initElements() {
/* 38 */     this.elements.items.add(() -> new ItemCustom());
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerModels(ModelRegistryEvent event) {
/* 44 */     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("finfin:fallenskin", "inventory"));
/*    */   }
/*    */   
/*    */   public static class ItemCustom extends Item { public ItemCustom() {
/* 48 */       func_77656_e(0);
/* 49 */       this.field_77777_bU = 1;
/* 50 */       func_77655_b("fallenskin");
/* 51 */       setRegistryName("fallenskin");
/* 52 */       func_77637_a(CreativeTabs.field_78026_f);
/*    */     }
/*    */ 
/*    */     
/*    */     public int func_77619_b() {
/* 57 */       return 0;
/*    */     }
/*    */ 
/*    */     
/*    */     public int func_77626_a(ItemStack itemstack) {
/* 62 */       return 0;
/*    */     }
/*    */ 
/*    */     
/*    */     public float func_150893_a(ItemStack par1ItemStack, IBlockState par2Block) {
/* 67 */       return 1.0F;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     public EnumActionResult onItemUseFirst(EntityPlayer entity, World world, BlockPos pos, EnumFacing direction, float hitX, float hitY, float hitZ, EnumHand hand) {
/* 73 */       EnumActionResult retval = super.onItemUseFirst(entity, world, pos, direction, hitX, hitY, hitZ, hand);
/* 74 */       ItemStack itemstack = entity.func_184586_b(hand);
/* 75 */       int x = pos.func_177958_n();
/* 76 */       int y = pos.func_177956_o();
/* 77 */       int z = pos.func_177952_p();
/*    */       
/* 79 */       Map<String, Object> $_dependencies = new HashMap<>();
/* 80 */       $_dependencies.put("entity", entity);
/* 81 */       $_dependencies.put("x", Integer.valueOf(x));
/* 82 */       $_dependencies.put("y", Integer.valueOf(y));
/* 83 */       $_dependencies.put("z", Integer.valueOf(z));
/* 84 */       $_dependencies.put("world", world);
/* 85 */       ProcedureFallenskinRightClickedOnBlock.executeProcedure($_dependencies);
/*    */       
/* 87 */       return retval;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemFallenskin.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */