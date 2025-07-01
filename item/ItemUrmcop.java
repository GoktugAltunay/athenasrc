/*    */ package net.mcreator.finfin.item;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.mcreator.finfin.procedure.ProcedureUrmcopRightClickedInAir;
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
/*    */ public class ItemUrmcop
/*    */   extends ElementsFinfinMod.ModElement
/*    */ {
/*    */   @ObjectHolder("finfin:urmcop")
/* 28 */   public static final Item block = null;
/*    */   public ItemUrmcop(ElementsFinfinMod instance) {
/* 30 */     super(instance, 26);
/*    */   }
/*    */ 
/*    */   
/*    */   public void initElements() {
/* 35 */     this.elements.items.add(() -> new ItemCustom());
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerModels(ModelRegistryEvent event) {
/* 41 */     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("finfin:urmcop", "inventory"));
/*    */   }
/*    */   
/*    */   public static class ItemCustom extends Item { public ItemCustom() {
/* 45 */       func_77656_e(0);
/* 46 */       this.field_77777_bU = 1;
/* 47 */       func_77655_b("urmcop");
/* 48 */       setRegistryName("urmcop");
/* 49 */       func_77637_a(null);
/*    */     }
/*    */ 
/*    */     
/*    */     public int func_77619_b() {
/* 54 */       return 0;
/*    */     }
/*    */ 
/*    */     
/*    */     public int func_77626_a(ItemStack itemstack) {
/* 59 */       return 0;
/*    */     }
/*    */ 
/*    */     
/*    */     public float func_150893_a(ItemStack par1ItemStack, IBlockState par2Block) {
/* 64 */       return 1.0F;
/*    */     }
/*    */ 
/*    */     
/*    */     public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entity, EnumHand hand) {
/* 69 */       ActionResult<ItemStack> ar = super.func_77659_a(world, entity, hand);
/* 70 */       ItemStack itemstack = (ItemStack)ar.func_188398_b();
/* 71 */       int x = (int)entity.field_70165_t;
/* 72 */       int y = (int)entity.field_70163_u;
/* 73 */       int z = (int)entity.field_70161_v;
/*    */       
/* 75 */       Map<String, Object> $_dependencies = new HashMap<>();
/* 76 */       $_dependencies.put("entity", entity);
/* 77 */       $_dependencies.put("world", world);
/* 78 */       ProcedureUrmcopRightClickedInAir.executeProcedure($_dependencies);
/*    */       
/* 80 */       return ar;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemUrmcop.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */