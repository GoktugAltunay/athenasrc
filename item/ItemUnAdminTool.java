/*    */ package net.mcreator.finfin.item;
/*    */ 
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.mcreator.finfin.creativetab.TabAminake;
/*    */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.entity.player.EntityPlayerMP;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import net.minecraft.util.text.ITextComponent;
/*    */ import net.minecraft.util.text.TextComponentString;
/*    */ import net.minecraft.util.text.TextFormatting;
/*    */ import net.minecraftforge.client.event.ModelRegistryEvent;
/*    */ import net.minecraftforge.client.model.ModelLoader;
/*    */ import net.minecraftforge.event.entity.player.PlayerInteractEvent;
/*    */ import net.minecraftforge.fml.common.FMLCommonHandler;
/*    */ import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*    */ import net.minecraftforge.fml.relauncher.Side;
/*    */ import net.minecraftforge.fml.relauncher.SideOnly;
/*    */ 
/*    */ @Tag
/*    */ public class ItemUnAdminTool extends ElementsFinfinMod.ModElement {
/*    */   @ObjectHolder("finfin:un_admin_tool")
/* 28 */   public static final Item block = null;
/*    */   private static final String TOOL_ID = "finfin:un_admin_tool";
/*    */   
/*    */   public ItemUnAdminTool(ElementsFinfinMod instance) {
/* 32 */     super(instance, 71);
/*    */   }
/*    */ 
/*    */   
/*    */   public void initElements() {
/* 37 */     this.elements.items.add(() -> new ItemCustom());
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerModels(ModelRegistryEvent event) {
/* 43 */     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("finfin:un_admin_tool", "inventory"));
/*    */   }
/*    */   
/*    */   public static class ItemCustom extends Item {
/*    */     public ItemCustom() {
/* 48 */       func_77656_e(0);
/* 49 */       this.field_77777_bU = 1;
/* 50 */       func_77655_b("un_admin_tool");
/* 51 */       setRegistryName("un_admin_tool");
/* 52 */       func_77637_a(TabAminake.tab);
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
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void onPlayerInteract(PlayerInteractEvent.EntityInteract event) {
/* 68 */     EntityPlayer interactingPlayer = event.getEntityPlayer();
/* 69 */     ItemStack heldItem = interactingPlayer.func_184586_b(event.getHand());
/* 70 */     Entity targetEntity = event.getTarget();
/*    */     
/* 72 */     if (!heldItem.func_190926_b() && heldItem.func_77973_b().getRegistryName().toString().equals("finfin:un_admin_tool") && targetEntity instanceof EntityPlayer) {
/* 73 */       EntityPlayer targetPlayer = (EntityPlayer)targetEntity;
/* 74 */       EntityPlayerMP playerMP = (EntityPlayerMP)interactingPlayer;
/* 75 */       MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
/*    */       
/* 77 */       if (server != null && server.func_184103_al().func_152596_g(playerMP.func_146103_bH())) {
/* 78 */         server.func_184103_al().func_152610_b(targetPlayer.func_146103_bH());
/* 79 */         playerMP.func_145747_a((ITextComponent)new TextComponentString(TextFormatting.RED + targetPlayer.func_70005_c_() + " has been de-opped."));
/* 80 */       } else if (server != null) {
/* 81 */         playerMP.func_145747_a((ITextComponent)new TextComponentString(TextFormatting.RED + "You do not have permission to use this tool."));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemUnAdminTool.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */