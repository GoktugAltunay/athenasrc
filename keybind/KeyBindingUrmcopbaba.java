/*    */ package net.mcreator.finfin.keybind;
/*    */ 
/*    */ import io.netty.buffer.ByteBuf;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.mcreator.finfin.FinfinMod;
/*    */ import net.mcreator.finfin.procedure.ProcedureUrmcopbabaOnKeyPressed;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.settings.KeyBinding;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.entity.player.EntityPlayerMP;
/*    */ import net.minecraft.util.math.BlockPos;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import net.minecraftforge.fml.client.registry.ClientRegistry;
/*    */ import net.minecraftforge.fml.common.event.FMLInitializationEvent;
/*    */ import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
/*    */ import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.gameevent.InputEvent;
/*    */ import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
/*    */ import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
/*    */ import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
/*    */ import net.minecraftforge.fml.relauncher.Side;
/*    */ import net.minecraftforge.fml.relauncher.SideOnly;
/*    */ import org.lwjgl.input.Keyboard;
/*    */ 
/*    */ @Tag
/*    */ public class KeyBindingUrmcopbaba
/*    */   extends ElementsFinfinMod.ModElement
/*    */ {
/*    */   private KeyBinding keys;
/*    */   
/*    */   public KeyBindingUrmcopbaba(ElementsFinfinMod instance) {
/* 36 */     super(instance, 27);
/*    */   }
/*    */ 
/*    */   
/*    */   public void preInit(FMLPreInitializationEvent event) {
/* 41 */     this.elements.addNetworkMessage(KeyBindingPressedMessageHandler.class, KeyBindingPressedMessage.class, new Side[] { Side.SERVER });
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void init(FMLInitializationEvent event) {
/* 47 */     this.keys = new KeyBinding("key.mcreator.urmcopbaba", 199, "key.categories.misc");
/* 48 */     ClientRegistry.registerKeyBinding(this.keys);
/* 49 */     MinecraftForge.EVENT_BUS.register(this);
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void onKeyInput(InputEvent.KeyInputEvent event) {
/* 55 */     if ((Minecraft.func_71410_x()).field_71462_r == null && 
/* 56 */       Keyboard.isKeyDown(this.keys.func_151463_i())) {
/* 57 */       FinfinMod.PACKET_HANDLER.sendToServer(new KeyBindingPressedMessage());
/* 58 */       pressAction((EntityPlayer)(Minecraft.func_71410_x()).field_71439_g);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static class KeyBindingPressedMessageHandler
/*    */     implements IMessageHandler<KeyBindingPressedMessage, IMessage> {
/*    */     public IMessage onMessage(KeyBindingUrmcopbaba.KeyBindingPressedMessage message, MessageContext context) {
/* 65 */       EntityPlayerMP entity = (context.getServerHandler()).field_147369_b;
/* 66 */       entity.func_71121_q().func_152344_a(() -> KeyBindingUrmcopbaba.pressAction((EntityPlayer)entity));
/*    */ 
/*    */       
/* 69 */       return null;
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public static class KeyBindingPressedMessage
/*    */     implements IMessage
/*    */   {
/*    */     public void toBytes(ByteBuf buf) {}
/*    */     
/*    */     public void fromBytes(ByteBuf buf) {}
/*    */   }
/*    */   
/*    */   private static void pressAction(EntityPlayer entity) {
/* 83 */     World world = entity.field_70170_p;
/* 84 */     int x = (int)entity.field_70165_t;
/* 85 */     int y = (int)entity.field_70163_u;
/* 86 */     int z = (int)entity.field_70161_v;
/*    */     
/* 88 */     if (!world.func_175667_e(new BlockPos(x, y, z))) {
/*    */       return;
/*    */     }
/* 91 */     Map<String, Object> $_dependencies = new HashMap<>();
/* 92 */     $_dependencies.put("entity", entity);
/* 93 */     ProcedureUrmcopbabaOnKeyPressed.executeProcedure($_dependencies);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\keybind\KeyBindingUrmcopbaba.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */