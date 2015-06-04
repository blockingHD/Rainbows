package com.blockingHD.Rainbow.init;

import com.blockingHD.Rainbow.RainbowTileEntity.TileEntityRainbowFurnace;
import com.blockingHD.Rainbow.reference.Reference;

import static cpw.mods.fml.common.registry.GameRegistry.registerTileEntity;

/**
 * Created by blockingHD on 01/06/2015.
 */
public class ModTileEntities {

    public static void init(){
        registerTileEntity(TileEntityRainbowFurnace.class, Reference.MOD_ID + "TileEntityRainbowFurnace");
    }
}
