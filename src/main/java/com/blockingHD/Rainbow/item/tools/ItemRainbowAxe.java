package com.blockingHD.Rainbow.item.tools;

import com.blockingHD.Rainbow.item.mainClasses.ItemToolRainbowAxe;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemRainbowAxe extends ItemToolRainbowAxe {

    public ItemRainbowAxe() {
        super();
        this.setUnlocalizedName("RainbowAxe");
        this.isItemTool(new ItemStack(this));
        this.setHarvestLevel("axe", 4);
    }

    public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag) {
        if (!world.isRemote) {
            EntityPlayerMP player = (EntityPlayerMP)entity;
            if (player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == this) {
                if (!player.capabilities.isCreativeMode) {
                    if (player.getHealth() > 10) {
                        player.setHealth(player.getMaxHealth() / 2);
                        player.addPotionEffect(new PotionEffect(Potion.field_76443_y.id, 120, 1));
                    }
                }
            }
        }
    }
}
