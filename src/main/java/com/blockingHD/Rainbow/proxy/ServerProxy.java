package com.blockingHD.Rainbow.proxy;

import com.blockingHD.Rainbow.RainbowTileEntity.TileEntityRainbowFurnace;
import com.blockingHD.Rainbow.reference.Reference;

import static cpw.mods.fml.common.registry.GameRegistry.registerTileEntity;

public class ServerProxy extends CommonProxy {

	@Override
	public void registerKeyBindings() {

		// NOOP
	}

	public void registerTileEntities(){
		registerTileEntity(TileEntityRainbowFurnace.class, Reference.MOD_ID + "TileEntityRainbowFurnace");
	}

}
