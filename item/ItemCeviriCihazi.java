/*    */ package net.mcreator.finfin.item;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.mcreator.finfin.creativetab.TabAminake;
/*    */ import net.mcreator.finfin.procedure.ProcedureCeviriCihaziRightClickedInAir;
/*    */ import net.minecraft.block.state.IBlockState;
/*    */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.ActionResult;
/*    */ import net.minecraft.util.EnumHand;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.client.event.ModelRegistryEvent;
/*    */ import net.minecraftforge.client.model.ModelLoader;
/*    */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*    */ import net.minecraftforge.fml.relauncher.Side;
/*    */ import net.minecraftforge.fml.relauncher.SideOnly;
/*    */ 
/*    */ 
/*    */ @Tag
/*    */ public class ItemCeviriCihazi
/*    */   extends ElementsFinfinMod.ModElement
/*    */ {
/*    */   @ObjectHolder("finfin:ceviri_cihazi")
/* 29 */   public static final Item block = null;
/*    */   public ItemCeviriCihazi(ElementsFinfinMod instance) {
/* 31 */     super(instance, 53);
/*    */   }
/*    */ 
/*    */   
/*    */   public void initElements() {
/* 36 */     this.elements.items.add(() -> new ItemCustom());
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerModels(ModelRegistryEvent event) {
/* 42 */     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("finfin:ceviri_cihazi", "inventory"));
/*    */   }
/*    */   
/*    */   public static class ItemCustom extends Item { public ItemCustom() {
/* 46 */       func_77656_e(0);
/* 47 */       this.field_77777_bU = 1;
/* 48 */       func_77655_b("ceviri_cihazi");
/* 49 */       setRegistryName("ceviri_cihazi");
/* 50 */       func_77637_a(TabAminake.tab);
/*    */     }
/*    */ 
/*    */     
/*    */     public int func_77619_b() {
/* 55 */       return 0;
/*    */     }
/*    */ 
/*    */     
/*    */     public int func_77626_a(ItemStack itemstack) {
/* 60 */       return 0;
/*    */     }
/*    */ 
/*    */     
/*    */     public float func_150893_a(ItemStack par1ItemStack, IBlockState par2Block) {
/* 65 */       return 1.0F;
/*    */     }
/*    */ 
/*    */     
/*    */     public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entity, EnumHand hand) {
/* 70 */       ActionResult<ItemStack> ar = super.func_77659_a(world, entity, hand);
/* 71 */       ItemStack itemstack = (ItemStack)ar.func_188398_b();
/* 72 */       int x = (int)entity.field_70165_t;
/* 73 */       int y = (int)entity.field_70163_u;
/* 74 */       int z = (int)entity.field_70161_v;
/*    */       
/* 76 */       Map<String, Object> $_dependencies = new HashMap<>();
/* 77 */       $_dependencies.put("entity", entity);
/* 78 */       ProcedureCeviriCihaziRightClickedInAir.executeProcedure($_dependencies);
/*    */       
/* 80 */       return ar;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemCeviriCihazi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */