/*    */ package net.mcreator.finfin.item;
/*    */ 
/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.mcreator.finfin.creativetab.TabAminake;
/*    */ import net.mcreator.finfin.procedure.ProcedureAirStaffRightClickedInAir;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraft.block.state.IBlockState;
/*    */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.init.Blocks;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.item.ItemTool;
/*    */ import net.minecraft.util.ActionResult;
/*    */ import net.minecraft.util.EnumHand;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.client.event.ModelRegistryEvent;
/*    */ import net.minecraftforge.client.model.ModelLoader;
/*    */ import net.minecraftforge.common.util.EnumHelper;
/*    */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*    */ import net.minecraftforge.fml.relauncher.Side;
/*    */ import net.minecraftforge.fml.relauncher.SideOnly;
/*    */ 
/*    */ @Tag
/*    */ public class ItemAirStaff
/*    */   extends ElementsFinfinMod.ModElement
/*    */ {
/*    */   @ObjectHolder("finfin:air_staff")
/* 35 */   public static final Item block = null;
/*    */   public ItemAirStaff(ElementsFinfinMod instance) {
/* 37 */     super(instance, 34);
/*    */   }
/*    */ 
/*    */   
/*    */   public void initElements() {
/* 42 */     this.elements.items.add(() -> ((Item)(new ItemToolCustom()
/*    */         {
/*    */           public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entity, EnumHand hand) {
/* 45 */             ActionResult<ItemStack> retval = super.func_77659_a(world, entity, hand);
/* 46 */             ItemStack itemstack = (ItemStack)retval.func_188398_b();
/* 47 */             int x = (int)entity.field_70165_t;
/* 48 */             int y = (int)entity.field_70163_u;
/* 49 */             int z = (int)entity.field_70161_v;
/*    */             
/* 51 */             Map<Object, Object> $_dependencies = new HashMap<>();
/* 52 */             $_dependencies.put("entity", entity);
/* 53 */             $_dependencies.put("x", Integer.valueOf(x));
/* 54 */             $_dependencies.put("y", Integer.valueOf(y));
/* 55 */             $_dependencies.put("z", Integer.valueOf(z));
/* 56 */             $_dependencies.put("world", world);
/* 57 */             ProcedureAirStaffRightClickedInAir.executeProcedure($_dependencies);
/*    */             
/* 59 */             return retval;
/*    */           }
/*    */         }).func_77655_b("air_staff").setRegistryName("air_staff")).func_77637_a(TabAminake.tab));
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerModels(ModelRegistryEvent event) {
/* 67 */     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("finfin:air_staff", "inventory"));
/*    */   }
/*    */   
/*    */   private static class ItemToolCustom extends ItemTool {
/* 71 */     private static final Set<Block> effective_items_set = Sets.newHashSet((Object[])new Block[] { 
/*    */           Blocks.field_150344_f, Blocks.field_150342_X, Blocks.field_150364_r, Blocks.field_150363_s, (Block)Blocks.field_150486_ae, Blocks.field_150423_aK, Blocks.field_150428_aP, Blocks.field_150440_ba, Blocks.field_150468_ap, Blocks.field_150471_bO, 
/*    */           Blocks.field_150452_aw }); protected ItemToolCustom() {
/* 74 */       super(EnumHelper.addToolMaterial("AIR_STAFF", 1, 99999, 4.0F, 6.0F, 2), effective_items_set);
/* 75 */       this.field_77865_bY = 6.0F;
/* 76 */       this.field_185065_c = -3.0F;
/*    */     }
/*    */ 
/*    */     
/*    */     public float func_150893_a(ItemStack stack, IBlockState state) {
/* 81 */       Material material = state.func_185904_a();
/* 82 */       return (material != Material.field_151575_d && material != Material.field_151585_k && material != Material.field_151582_l) ? super
/* 83 */         .func_150893_a(stack, state) : this.field_77864_a;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemAirStaff.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */