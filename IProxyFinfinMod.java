package net.mcreator.finfin;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public interface IProxyFinfinMod {
  void preInit(FMLPreInitializationEvent paramFMLPreInitializationEvent);
  
  void init(FMLInitializationEvent paramFMLInitializationEvent);
  
  void postInit(FMLPostInitializationEvent paramFMLPostInitializationEvent);
  
  void serverLoad(FMLServerStartingEvent paramFMLServerStartingEvent);
}


/* Location:              C:\Users\Administrator\Download\\urmcbetamod.jar!\net\mcreator\finfin\IProxyFinfinMod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */