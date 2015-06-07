package com.blockingHD.Rainbow.item.tools;

import com.blockingHD.Rainbow.item.mainClasses.ItemToolRainbowSword;
import com.blockingHD.Rainbow.network.MessageStrength;
import com.blockingHD.Rainbow.network.NetworkHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by thomas on 29/05/2015.
 */
public class ItemRainbowSword extends ItemToolRainbowSword {

    public ItemRainbowSword() {
        super();
        this.setUnlocalizedName("RainbowSword");
        this.isItemTool(new ItemStack(this));
        this.setHarvestLevel("sword", 4);
    }

    public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag) {
        if (!world.isRemote) {
            EntityPlayer Player = Minecraft.getMinecraft().thePlayer;
            if (Player.getCurrentEquippedItem() != null && Player.getCurrentEquippedItem().getItem() == this) {
                if (!Minecraft.getMinecraft().playerController.isInCreativeMode()) {
                    NetworkHandler.sendToServer(new MessageStrength());
                }
            }
        }
    }
}
