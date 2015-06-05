package com.blockingHD.Rainbow;

import com.blockingHD.Rainbow.client.handler.KeyInputEventHandler;
import com.blockingHD.Rainbow.handler.ConfigHandler;
import com.blockingHD.Rainbow.handler.GuiHandler;
import com.blockingHD.Rainbow.init.ModBlocks;
import com.blockingHD.Rainbow.init.ModItems;
import com.blockingHD.Rainbow.init.ModTileEntities;
import com.blockingHD.Rainbow.init.Recipes;
import com.blockingHD.Rainbow.network.NetworkHandler;
import com.blockingHD.Rainbow.proxy.IProxy;
import com.blockingHD.Rainbow.reference.Reference;
import com.blockingHD.Rainbow.utility.logHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Rainbow {

	@Mod.Instance(Reference.MOD_ID)
	public static Rainbow instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		ConfigHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigHandler());
        NetworkRegistry.INSTANCE.registerGuiHandler(instance,new GuiHandler());

        ModItems.init();
        ModBlocks.init();
        ModTileEntities.init();
        Recipes.init();

		proxy.registerKeyBindings();

		// world generators registration
		NetworkHandler.init();
		logHelper.info("PreInit Complete!");

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

		FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());

		logHelper.info("Init Complete!");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

		logHelper.info("PostInit Complete!");
	}
}
