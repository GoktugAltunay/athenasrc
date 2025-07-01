/*    */ package net.mcreator.finfin.item;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.mcreator.finfin.procedure.ProcedureVoidMultitoolBlockDestroyedWithTool;
/*    */ import net.mcreator.finfin.procedure.ProcedureVoidMultitoolLivingEntityIsHitWithTool;
/*    */ import net.minecraft.block.state.IBlockState;
/*    */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemPickaxe;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.math.BlockPos;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.client.event.ModelRegistryEvent;
/*    */ import net.minecraftforge.client.model.ModelLoader;
/*    */ import net.minecraftforge.common.util.EnumHelper;
/*    */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*    */ import net.minecraftforge.fml.relauncher.Side;
/*    */ import net.minecraftforge.fml.relauncher.SideOnly;
/*    */ 
/*    */ 
/*    */ @Tag
/*    */ public class ItemVoidMultitool
/*    */   extends ElementsFinfinMod.ModElement
/*    */ {
/*    */   @ObjectHolder("finfin:void_multitool")
/* 32 */   public static final Item block = null;
/*    */   public ItemVoidMultitool(ElementsFinfinMod instance) {
/* 34 */     super(instance, 1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void initElements() {
/* 39 */     this.elements.items.add(() -> ((Item)(new ItemPickaxe(EnumHelper.addToolMaterial("VOID_MULTITOOL", 1, 99999, 99999.0F, 0.0F, 2))
/*    */         {
/*    */           
/*    */           public Set<String> getToolClasses(ItemStack stack)
/*    */           {
/* 44 */             HashMap<Object, Object> ret = new HashMap<>();
/* 45 */             ret.put("pickaxe", Integer.valueOf(1));
/* 46 */             return ret.keySet();
/*    */           }
/*    */ 
/*    */           
/*    */           public boolean func_179218_a(ItemStack itemstack, World world, IBlockState bl, BlockPos pos, EntityLivingBase entity) {
/* 51 */             boolean retval = super.func_179218_a(itemstack, world, bl, pos, entity);
/* 52 */             int x = pos.func_177958_n();
/* 53 */             int y = pos.func_177956_o();
/* 54 */             int z = pos.func_177952_p();
/*    */             
/* 56 */             Map<Object, Object> $_dependencies = new HashMap<>();
/* 57 */             $_dependencies.put("entity", entity);
/* 58 */             ProcedureVoidMultitoolBlockDestroyedWithTool.executeProcedure($_dependencies);
/*    */             
/* 60 */             return retval;
/*    */           }
/*    */ 
/*    */           
/*    */           public boolean func_77644_a(ItemStack itemstack, EntityLivingBase entity, EntityLivingBase entity2) {
/* 65 */             super.func_77644_a(itemstack, entity, entity2);
/* 66 */             int x = (int)entity.field_70165_t;
/* 67 */             int y = (int)entity.field_70163_u;
/* 68 */             int z = (int)entity.field_70161_v;
/* 69 */             World world = entity.field_70170_p;
/*    */             
/* 71 */             Map<Object, Object> $_dependencies = new HashMap<>();
/* 72 */             $_dependencies.put("entity", entity);
/* 73 */             $_dependencies.put("x", Integer.valueOf(x));
/* 74 */             $_dependencies.put("y", Integer.valueOf(y));
/* 75 */             $_dependencies.put("z", Integer.valueOf(z));
/* 76 */             $_dependencies.put("world", world);
/* 77 */             ProcedureVoidMultitoolLivingEntityIsHitWithTool.executeProcedure($_dependencies);
/*    */             
/* 79 */             return true;
/*    */           }
/*    */         }).func_77655_b("void_multitool").setRegistryName("void_multitool")).func_77637_a(CreativeTabs.field_78040_i));
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerModels(ModelRegistryEvent event) {
/* 87 */     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("finfin:void_multitool", "inventory"));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemVoidMultitool.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */