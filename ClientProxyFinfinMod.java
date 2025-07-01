/*    */ package net.mcreator.finfin;
/*    */ 
/*    */ import net.minecraftforge.client.model.obj.OBJLoader;
/*    */ import net.minecraftforge.fml.common.event.FMLInitializationEvent;
/*    */ import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
/*    */ import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
/*    */ import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
/*    */ 
/*    */ 
/*    */ public class ClientProxyFinfinMod
/*    */   implements IProxyFinfinMod
/*    */ {
/*    */   public void init(FMLInitializationEvent event) {}
/*    */   
/*    */   public void preInit(FMLPreInitializationEvent event) {
/* 16 */     OBJLoader.INSTANCE.addDomain("finfin");
/*    */   }
/*    */   
/*    */   public void postInit(FMLPostInitializationEvent event) {}
/*    */   
/*    */   public void serverLoad(FMLServerStartingEvent event) {}
/*    */ }


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\ClientProxyFinfinMod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */