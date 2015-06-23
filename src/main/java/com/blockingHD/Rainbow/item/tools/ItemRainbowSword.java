package com.blockingHD.Rainbow.item.tools;

import com.blockingHD.Rainbow.item.mainClasses.ItemToolRainbowSword;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemRainbowSword extends ItemToolRainbowSword {

    public ItemRainbowSword() {
        super();
        this.setUnlocalizedName("RainbowSword");
        this.isItemTool(new ItemStack(this));
        this.setHarvestLevel("sword", 4);
    }

    public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag) {
        if (!world.isRemote) {
            EntityPlayerMP player = (EntityPlayerMP)entity;
            if (player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == this) {
                if (!player.capabilities.isCreativeMode) {
                    player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 120, 2));
                }
            }
        }
    }
}
