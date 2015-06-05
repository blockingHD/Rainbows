package com.blockingHD.Rainbow.blocks;

import com.blockingHD.Rainbow.Rainbow;
import com.blockingHD.Rainbow.RainbowTileEntity.TileEntityRainbowFurnace;
import com.blockingHD.Rainbow.creativetab.CreativeTabRainbow;
import com.blockingHD.Rainbow.init.ModBlocks;
import com.blockingHD.Rainbow.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

public class RainbowFurnaceBlock extends BlockContainer {

    @SideOnly(Side.CLIENT)
    private IIcon front;

    private static boolean isBurning;
    private final boolean isBurning2;
    private final Random random = new Random();

    public RainbowFurnaceBlock(boolean isActive){
        super(Material.rock);
        this.setCreativeTab(CreativeTabRainbow.Rainbow_TAB);
        this.setBlockName("RainbowFurnace");
        isBurning2 = isActive;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":RainbowFurnaceSide");
        this.front = iconRegister.registerIcon(Reference.MOD_ID + ":RainbowFurnaceFront");
    }

    public IIcon getIcon(int side, int meta){{
        if (side == 0 || side == 1){
            return this.blockIcon;
        }
            return this.front;
        }
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par8, float par9, float par10){
        player.openGui(Rainbow.instance, 0, world, x, y, z);
        return true;
    }

    public Item getItemDropped(int par1, Random random, int par3){ return Item.getItemFromBlock(ModBlocks.RainbowFurnaceBlock ); }

    public Item getItem(World world, int par2, int par3, int par4){ return Item.getItemFromBlock(ModBlocks.RainbowFurnaceBlock); }

    @SideOnly(Side.CLIENT)
    public void onBlockAdded(World world, int x, int y, int z){
        super.onBlockAdded(world, x, y, z);
        this.direction(world, x, y, z);
    }

    private void direction(World world, int x, int y, int z) {
        if (!world.isRemote){
            Block direction = world.getBlock(x ,y ,z -1 );
            Block direction1 = world.getBlock(x ,y ,z +1 );
            Block direction2 = world.getBlock(x -1 ,y ,z);
            Block direction3 = world.getBlock(x +1 ,y ,z );
            byte byte0 = 3;

            if (direction.func_149730_j() && direction.func_149730_j()){
                byte0 = 3;
            }

            if (direction1.func_149730_j() && direction1.func_149730_j()){
                byte0 = 2;
            }

            if (direction2.func_149730_j() && direction2.func_149730_j()){
                byte0 = 5;
            }

            if (direction3.func_149730_j() && direction3.func_149730_j()){
                byte0 = 4;
            }

            world.setBlockMetadataWithNotify(x, y, z, byte0, 2);
        }

    }

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemstack) {
        int direction = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (direction == 0){
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }
        if (direction == 1){
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        }
        if (direction == 2){
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }
        if (direction == 3){
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }

        if (itemstack.hasDisplayName()){
            ((TileEntityRainbowFurnace) world.getTileEntity(x, y, z)).furnaceName(itemstack.getDisplayName());
        }

    }

    public static void updateBlockState(boolean burning, World world, int x, int y, int z){
        int direction = world.getBlockMetadata(x, y, z);
        TileEntity tileentity = world.getTileEntity(x, y, z);
        isBurning = true;

        if (burning){
            world.setBlock(x, y, z, ModBlocks.RainbowFurnaceBlockActive);
        }else{
            world.setBlock(x, y, z, ModBlocks.RainbowFurnaceBlock);
        }

        isBurning = false;
        world.setBlockMetadataWithNotify(x, y, z, direction, 2);

        if (tileentity != null){
            tileentity.validate();
            world.setTileEntity(x, y, z, tileentity);
        }
    }

    public void brakeBlock(World world, int x, int y, int z, Block block, int meta){
        if(!isBurning){
            TileEntityRainbowFurnace tileentityrainbowfunace = (TileEntityRainbowFurnace) world.getTileEntity(x, y, z);


            if(tileentityrainbowfunace != null){
                for (int i = 0; i < tileentityrainbowfunace.getSizeInventory(); ++i){
                    ItemStack itemstack = tileentityrainbowfunace.getStackInSlot(i);

                    if (itemstack != null){
                        float f = this.random.nextFloat() * 0.6f + 0.1f;
                        float f1 = this.random.nextFloat() * 0.6f + 0.1f;
                        float f2 = this.random.nextFloat() * 0.6f + 0.1f;

                        while (itemstack.stackSize > 0){
                            int j = this.random.nextInt(21) + 10;

                            if(j > itemstack.stackSize){
                                j = itemstack.stackSize;
                            }

                            itemstack.stackSize -= j;
                            EntityItem entityitem = new EntityItem(world, (double) ((float) x + f), (double) ((float) y + f1), (double) ((float) x + f2), new ItemStack(itemstack.getItem(), j, itemstack.getItemDamage()));

                            if (itemstack.hasTagCompound()){
                                entityitem.getEntityItem().setTagCompound(((NBTTagCompound) itemstack.getTagCompound().copy()));
                            }

                            float f3 = 0.025f;
                            entityitem.motionX = (double) ((float) this.random.nextGaussian() * f3);
                            entityitem.motionY = (double) ((float) this.random.nextGaussian() * f3 + 0.1F);
                            entityitem.motionZ = (double) ((float) this.random.nextGaussian() * f3);

                            world.spawnEntityInWorld(entityitem);

                        }

                    }
                }
                world.func_147453_f(x, y, z, block);
            }
        }
        super.breakBlock(world, x, y, z, block, meta);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEntityRainbowFurnace();
    }
}
