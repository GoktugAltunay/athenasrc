/*    */ package net.mcreator.finfin.item;
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.mcreator.finfin.creativetab.TabAminake;
/*    */ import net.minecraft.block.state.IBlockState;
/*    */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*    */ import net.minecraft.command.ICommandSender;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import net.minecraft.util.ActionResult;
/*    */ import net.minecraft.util.EnumActionResult;
/*    */ import net.minecraft.util.EnumHand;
/*    */ import net.minecraft.util.text.ITextComponent;
/*    */ import net.minecraft.util.text.TextComponentString;
/*    */ import net.minecraft.util.text.TextFormatting;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.client.event.ModelRegistryEvent;
/*    */ import net.minecraftforge.client.model.ModelLoader;
/*    */ import net.minecraftforge.fml.common.FMLCommonHandler;
/*    */ import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
/*    */ import net.minecraftforge.fml.relauncher.Side;
/*    */ import net.minecraftforge.fml.relauncher.SideOnly;
/*    */ 
/*    */ @Tag
/*    */ public class ItemShadowArrival extends ElementsFinfinMod.ModElement {
/*    */   @ObjectHolder("finfin:shadow_arrival")
/* 29 */   public static final Item block = null;
/*    */   private static final String ITEM_ID = "finfin:shadow_arrival";
/* 31 */   private static final String UNBAN_REQUEST_MESSAGE = TextFormatting.YELLOW + "Banını kaldırmak istediğiniz oyuncunun adını giriniz.:";
/* 32 */   private static final String UNBAN_SUCCESS_MESSAGE = TextFormatting.GREEN + "%s adlı oyuncunun banı kaldırıldı.";
/* 33 */   private static final String SERVER_NOT_FOUND_MESSAGE = TextFormatting.RED + "Sunucu bulunamadı, ban kaldırma işlemi gerçekleştirilemedi.";
/*    */   private static final String UNBAN_COMMAND = "unban ";
/*    */   
/*    */   public ItemShadowArrival(ElementsFinfinMod instance) {
/* 37 */     super(instance, 43);
/*    */   }
/*    */ 
/*    */   
/*    */   public void initElements() {
/* 42 */     this.elements.items.add(() -> new ItemCustom());
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerModels(ModelRegistryEvent event) {
/* 48 */     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("finfin:shadow_arrival", "inventory"));
/*    */   }
/*    */   
/*    */   public static class ItemCustom extends Item {
/*    */     public ItemCustom() {
/* 53 */       func_77656_e(0);
/* 54 */       this.field_77777_bU = 1;
/* 55 */       func_77655_b("shadow_arrival");
/* 56 */       setRegistryName("shadow_arrival");
/* 57 */       func_77637_a(TabAminake.tab);
/*    */     }
/*    */ 
/*    */     
/*    */     public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer player, EnumHand hand) {
/* 62 */       if (!world.field_72995_K) {
/* 63 */         player.func_145747_a((ITextComponent)new TextComponentString(ItemShadowArrival.UNBAN_REQUEST_MESSAGE));
/*    */       }
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 69 */       return new ActionResult(EnumActionResult.SUCCESS, player.func_184586_b(hand));
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public void unbanPlayer(EntityPlayer player, String playerName) {
/* 76 */       MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
/* 77 */       if (server != null) {
/* 78 */         server.func_71187_D().func_71556_a((ICommandSender)player.func_174793_f(), "unban " + playerName);
/* 79 */         player.func_145747_a((ITextComponent)new TextComponentString(String.format(ItemShadowArrival.UNBAN_SUCCESS_MESSAGE, new Object[] { playerName })));
/*    */       } else {
/* 81 */         player.func_145747_a((ITextComponent)new TextComponentString(ItemShadowArrival.SERVER_NOT_FOUND_MESSAGE));
/*    */       } 
/*    */     }
/*    */ 
/*    */     
/*    */     public int func_77619_b() {
/* 87 */       return 0;
/*    */     }
/*    */ 
/*    */     
/*    */     public int func_77626_a(ItemStack itemstack) {
/* 92 */       return 0;
/*    */     }
/*    */ 
/*    */     
/*    */     public float func_150893_a(ItemStack par1ItemStack, IBlockState par2Block) {
/* 97 */       return 1.0F;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\item\ItemShadowArrival.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */