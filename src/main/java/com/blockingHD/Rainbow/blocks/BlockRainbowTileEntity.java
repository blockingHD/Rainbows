package com.blockingHD.Rainbow.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

public abstract class BlockRainbowTileEntity extends BlockContainer{

    public BlockRainbowTileEntity(Material material){
        super (material);
    }

    public BlockRainbowTileEntity(){
        this(Material.rock);
    }
}
