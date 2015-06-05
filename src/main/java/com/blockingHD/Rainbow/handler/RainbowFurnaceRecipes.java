package com.blockingHD.Rainbow.handler;

import com.blockingHD.Rainbow.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class RainbowFurnaceRecipes {

    private static final RainbowFurnaceRecipes SMELTING_BASE = new RainbowFurnaceRecipes();

    private Map Experience = new HashMap();
    private Map smeltingList = new HashMap();

    public static RainbowFurnaceRecipes smelting(){
        return SMELTING_BASE;
    }

    private RainbowFurnaceRecipes(){
        //ToDo work this out!!!
        this.rainbowAddRecipie(new ItemStack(Items.dye, 1, 12), new ItemStack(ModItems.RainbowDyeBallBlue), 0.8F);
        this.rainbowAddRecipie(new ItemStack(Items.dye, 1, 10), new ItemStack(ModItems.RainbowDyeBallGreen), 0.8F);
        this.rainbowAddRecipie(new ItemStack(Items.dye, 1, 13), new ItemStack(ModItems.RainbowDyeBallMagenta), 0.8F);
        this.rainbowAddRecipie(new ItemStack(Items.dye, 1, 14), new ItemStack(ModItems.RainbowDyeBallOrange), 0.8F);
        this.rainbowAddRecipie(new ItemStack(Items.dye, 1, 1), new ItemStack(ModItems.RainbowDyeBallRed), 0.8F);
        this.rainbowAddRecipie(new ItemStack(Items.dye, 1, 11), new ItemStack(ModItems.RainbowDyeBallYellow), 0.8F);
    }

    public void rainbowAddRecipie(ItemStack item, ItemStack itemstack, float experience){
        this.putLists(item, itemstack, experience);
    }

    public void addLists(Item item, ItemStack itemstack, float experience){
        this.putLists(new ItemStack(item, 1, 32767), itemstack, experience);
    }

    public void putLists(ItemStack itemstack, ItemStack itemstack2, float experience){
        this.smeltingList.put(itemstack, itemstack2);
        this.Experience.put(itemstack2, Float.valueOf(experience));
    }

    public ItemStack getSmeltingResult(ItemStack itemstack){
        Iterator iterator = this.smeltingList.entrySet().iterator();
        Entry entry;

        do {
            if (!iterator.hasNext()){
                return null;
            }
            entry = (Entry) iterator.next();
        }
        while (!canBeSmelted(itemstack, (ItemStack) entry.getKey()));
        return (ItemStack) entry.getValue();
    }

    private boolean canBeSmelted(ItemStack itemstack, ItemStack key) {
        return key.getItem() == itemstack.getItem() && (key.getItemDamage() == 32767 || key.getItemDamage() == itemstack.getItemDamage());
    }

    public float giveExperience(ItemStack itemstack){
        Iterator iterator = this.Experience.entrySet().iterator();
        Entry entry;

        do {
            if (!iterator.hasNext()){
                return 0.0f;
            }

            entry = (Entry) iterator.next();
        }
        while (!this.canBeSmelted(itemstack, (ItemStack) entry.getKey()));

        if (itemstack.getItem().getSmeltingExperience(itemstack) != -1){
            return ((Float) entry.getValue()).floatValue();
        }

        return ((Float) entry.getValue()).floatValue();
    }

}
