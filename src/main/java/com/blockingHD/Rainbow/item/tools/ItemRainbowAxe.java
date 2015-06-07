package com.blockingHD.Rainbow.item.tools;

import com.blockingHD.Rainbow.item.mainClasses.ItemToolRainbowAxe;
import com.blockingHD.Rainbow.network.MessageHunger;
import com.blockingHD.Rainbow.network.MessageReduse;
import com.blockingHD.Rainbow.network.NetworkHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemRainbowAxe extends ItemToolRainbowAxe{

    public ItemRainbowAxe(){
        super();
        this.setUnlocalizedName("RainbowAxe");
        this.isItemTool(new ItemStack(this));
        this.setHarvestLevel("axe", 4);
    }

    public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag) {
        EntityPlayer Player = Minecraft.getMinecraft().thePlayer;
        if (Player.getCurrentEquippedItem() != null && Player.getCurrentEquippedItem().getItem() == this) {
            if(!Minecraft.getMinecraft().playerController.isInCreativeMode()){
                if (Player.getHealth() > 10) {
                    NetworkHandler.sendToServer(new MessageReduse());
                    NetworkHandler.sendToServer(new MessageHunger());
                }
            }
        }
    }

}
