package com.LogiCraft.logicraftmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import com.LogiCraft.logicraftmod.common.CommonProxy;

@Mod(modid="LogiCraftID", name="LogiCraft", version="0.0.0")
public class main {
    // The instance of your mod that Forge uses.
    @Instance(value = "LogiCraftID")
    public static main instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="com.LogiCraft.logicraftmod.client.ClientProxy", serverSide="com.LogiCraft.logicraftmod.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void load(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}