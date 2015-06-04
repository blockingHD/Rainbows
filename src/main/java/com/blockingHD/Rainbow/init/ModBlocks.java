package com.blockingHD.Rainbow.init;

import com.blockingHD.Rainbow.blocks.RainbowFurnaceBlock;
import net.minecraft.block.Block;

import static cpw.mods.fml.common.registry.GameRegistry.registerBlock;

public class ModBlocks {

	public static final Block RainbowFurnaceBlock = new RainbowFurnaceBlock(false);
    public static final Block RainbowFurnaceBlockActive = new RainbowFurnaceBlock(true);

	public static void init() {
		registerBlock(RainbowFurnaceBlock, "RainbowFurnace");
        registerBlock(RainbowFurnaceBlockActive, "RainbowFurnaceActive");

	}
}
