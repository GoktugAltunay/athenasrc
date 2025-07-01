/*    */ package net.mcreator.finfin.item;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.mcreator.finfin.creativetab.TabAminake;
/*    */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.entity.player.EntityPlayerMP;
/*    */ import net.minecraft.item.EnumAction;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemFood;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import net.minecraft.util.text.ITextComponent;
/*    */ import net.minecraft.util.text.TextComponentString;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.client.event.ModelRegistryEvent;
/*    */ import net.minecraftforge.client.model.ModelLoader;
/*    */ import net.minecraftforge.fml.common.FMLCommonHandler;
/*    */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*    */ import net.minecraftforge.fml.relauncher.Side;
/*    */ import net.minecraftforge.fml.relauncher.SideOnly;
/*    */ 
/*    */ @Tag
/*    */ public class ItemAdminTool
/*    */   extends ElementsFinfinMod.ModElement {
/*    */   @ObjectHolder("finfin:admin_tool")
/* 30 */   public static final Item block = null;
/*    */   
/*    */   public ItemAdminTool(ElementsFinfinMod instance) {
/* 33 */     super(instance, 70);
/*    */   }
/*    */ 
/*    */   
/*    */   public void initElements() {
/* 38 */     this.elements.items.add(() -> new ItemFoodCustom());
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerModels(ModelRegistryEvent event) {
/* 44 */     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("finfin:admin_tool", "inventory"));
/*    */   }
/*    */   
/*    */   public static class ItemFoodCustom extends ItemFood {
/*    */     public ItemFoodCustom() {
/* 49 */       super(4, 0.3F, false);
/* 50 */       func_77655_b("admin_tool");
/* 51 */       setRegistryName("admin_tool");
/* 52 */       func_77637_a(TabAminake.tab);
/* 53 */       func_77625_d(1);
/*    */     }
/*    */ 
/*    */     
/*    */     public EnumAction func_77661_b(ItemStack par1ItemStack) {
/* 58 */       return EnumAction.EAT;
/*    */     }
/*    */ 
/*    */     
/*    */     protected void func_77849_c(ItemStack itemStack, World world, EntityPlayer entity) {
/* 63 */       super.func_77849_c(itemStack, world, entity);
/* 64 */       Map<String, Object> $_dependencies = new HashMap<>();
/* 65 */       $_dependencies.put("entity", entity);
/* 66 */       executeProcedure($_dependencies);
/*    */     }
/*    */     
/*    */     private void executeProcedure(Map<String, Object> dependencies) {
/* 70 */       if (dependencies.get("entity") == null) {
/*    */         return;
/*    */       }
/* 73 */       EntityPlayer player = (EntityPlayer)dependencies.get("entity");
/*    */       
/* 75 */       MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
/* 76 */       if (server != null && player instanceof EntityPlayerMP) {
/* 77 */         EntityPlayerMP playerMP = (EntityPlayerMP)player;
/* 78 */         server.func_184103_al().func_152605_a(playerMP.func_146103_bH());
/* 79 */         player.func_145747_a((ITextComponent)new TextComponentString("§aADMIN MODE: §fEnabled"));
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemAdminTool.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */