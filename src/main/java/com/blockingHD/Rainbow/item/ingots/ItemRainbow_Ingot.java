package com.blockingHD.Rainbow.item.ingots;

import com.blockingHD.Rainbow.item.mainClasses.ItemRainbow;
import net.minecraft.item.ItemStack;

/**
 * Created by thomas on 28/05/2015.
 */
public class ItemRainbow_Ingot extends ItemRainbow {
    public ItemRainbow_Ingot() {
        super();
        this.setUnlocalizedName("Rainbow_Ingot");

    }

    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }
}
