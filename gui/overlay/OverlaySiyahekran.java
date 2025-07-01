/*    */ package net.mcreator.finfin.gui.overlay;
/*    */ 
/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ import net.mcreator.finfin.ElementsFinfinMod;
/*    */ import net.mcreator.finfin.ElementsFinfinMod.ModElement.Tag;
/*    */ import net.mcreator.finfin.procedure.ProcedureSiyahekranDisplayOverlayIngame;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.entity.EntityPlayerSP;
/*    */ import net.minecraft.client.gui.GuiIngame;
/*    */ import net.minecraft.client.renderer.GlStateManager;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.client.event.RenderGameOverlayEvent;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import net.minecraftforge.fml.common.event.FMLInitializationEvent;
/*    */ import net.minecraftforge.fml.common.eventhandler.EventPriority;
/*    */ import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
/*    */ import net.minecraftforge.fml.relauncher.Side;
/*    */ import net.minecraftforge.fml.relauncher.SideOnly;
/*    */ 
/*    */ @Tag
/*    */ public class OverlaySiyahekran extends ElementsFinfinMod.ModElement {
/*    */   public OverlaySiyahekran(ElementsFinfinMod instance) {
/* 26 */     super(instance, 30);
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void init(FMLInitializationEvent event) {
/* 32 */     MinecraftForge.EVENT_BUS.register(new GUIRenderEventClass());
/*    */   }
/*    */   
/*    */   public static class GUIRenderEventClass { @SubscribeEvent(priority = EventPriority.NORMAL)
/*    */     @SideOnly(Side.CLIENT)
/*    */     public void eventHandler(RenderGameOverlayEvent event) {
/* 38 */       if (!event.isCancelable() && event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
/* 39 */         int posX = event.getResolution().func_78326_a() / 2;
/* 40 */         int posY = event.getResolution().func_78328_b() / 2;
/* 41 */         EntityPlayerSP entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
/* 42 */         World world = ((EntityPlayer)entityPlayerSP).field_70170_p;
/* 43 */         int x = (int)((EntityPlayer)entityPlayerSP).field_70165_t;
/* 44 */         int y = (int)((EntityPlayer)entityPlayerSP).field_70163_u;
/* 45 */         int z = (int)((EntityPlayer)entityPlayerSP).field_70161_v;
/* 46 */         if (ProcedureSiyahekranDisplayOverlayIngame.executeProcedure((Map)ImmutableMap.of("entity", entityPlayerSP))) {
/* 47 */           GlStateManager.func_179097_i();
/* 48 */           GlStateManager.func_179132_a(false);
/* 49 */           GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
/*    */           
/* 51 */           GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
/* 52 */           GlStateManager.func_179118_c();
/* 53 */           (Minecraft.func_71410_x()).field_71446_o.func_110577_a(new ResourceLocation("finfin:textures/indir_1.png"));
/* 54 */           GuiIngame.func_146110_a(0, 0, 0.0F, 0.0F, event.getResolution().func_78326_a(), event
/* 55 */               .getResolution().func_78328_b(), event.getResolution().func_78326_a(), event.getResolution().func_78328_b());
/* 56 */           GlStateManager.func_179132_a(true);
/* 57 */           GlStateManager.func_179126_j();
/* 58 */           GlStateManager.func_179141_d();
/* 59 */           GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
/*    */         } 
/*    */       } 
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\gui\overlay\OverlaySiyahekran.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */