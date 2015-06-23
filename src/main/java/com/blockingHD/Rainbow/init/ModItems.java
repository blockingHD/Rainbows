package com.blockingHD.Rainbow.init;

import com.blockingHD.Rainbow.item.armor.ArmorRainbow;
import com.blockingHD.Rainbow.item.dyes.*;
import com.blockingHD.Rainbow.item.ingots.ItemRainbow_Ingot;
import com.blockingHD.Rainbow.item.mainClasses.*;
import com.blockingHD.Rainbow.item.tools.*;
import com.blockingHD.Rainbow.reference.Reference;

import static com.blockingHD.Rainbow.item.mainClasses.Materials.Rainbow_Material_ARMOR;
import static cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;
import static cpw.mods.fml.common.registry.GameRegistry.registerItem;

@ObjectHolder(Reference.MOD_ID)
public class ModItems {
    //Tools
	public static final ItemToolRainbowPick RainbowPick = new ItemRainbowPick();
    public static final ItemToolRainbowSpade RainbowSpade = new ItemRainbowSpade();
    public static final ItemToolRainbowAxe RainbowAxe = new ItemRainbowAxe();
    public static final ItemToolRainbowHoe RainbowHoe = new ItemRainbowHoe();
    public static final ItemToolRainbowSword RainbowSword = new ItemRainbowSword();

	//Ingots
    public static final ItemRainbow Rainbow_Ingot = new ItemRainbow_Ingot();

    //Food

    //Dyes
    public static final ItemRainbow RainbowDyeBallBlue = new RainbowDye_ball_blue();
    public static final ItemRainbow RainbowDyeBallGreen = new RainbowDye_ball_green();
    public static final ItemRainbow RainbowDyeBallOrange = new RainbowDye_ball_orange();
    public static final ItemRainbow RainbowDyeBallRed = new RainbowDye_ball_red();
    public static final ItemRainbow RainbowDyeBallYellow = new RainbowDye_ball_yellow();
    public static final ItemRainbow RainbowDyeBallMagenta = new RainbowDye_ball_magenta();

    //armor
    public static ArmorRainbow RainbowHelmet;
    public static ArmorRainbow RainbowChestplate;
    public static ArmorRainbow RainbowLeggings;
    public static ArmorRainbow RainbowBoots;

	public static void init(){
        registerItem(Rainbow_Ingot, "Rainbow_Ingot");
		registerItem(RainbowPick, "RainbowPick");
        registerItem(RainbowSpade, "RainbowSpade");
        registerItem(RainbowAxe, "RainbowAxe");
        registerItem(RainbowHoe, "RainbowHoe");
        registerItem(RainbowSword, "RainbowSword");
        registerItem(RainbowDyeBallBlue, "RainbowDyeBallBlue");
        registerItem(RainbowDyeBallGreen, "RainbowDyeBallGreen");
        registerItem(RainbowDyeBallOrange, "RainbowDyeBallOrange");
        registerItem(RainbowDyeBallRed, "RainbowDyeBallRed");
        registerItem(RainbowDyeBallYellow, "RainbowDyeBallYellow");
        registerItem(RainbowDyeBallMagenta, "RainbowDyeBallMagenta");
        registerItem(RainbowHelmet = new ArmorRainbow("rainbow_helmet", Rainbow_Material_ARMOR, "rainbow", 0), "rainbow_helmet"); //0 for helmet
        registerItem(RainbowChestplate = new ArmorRainbow("rainbow_chestplate", Rainbow_Material_ARMOR, "rainbow", 1), "rainbow_chestplate"); // 1 for chestplate
        registerItem(RainbowLeggings = new ArmorRainbow("rainbow_leggings", Rainbow_Material_ARMOR, "rainbow", 2), "rainbow_leggings"); // 2 for leggings
        registerItem(RainbowBoots = new ArmorRainbow("rainbow_boots", Rainbow_Material_ARMOR, "rainbow", 3), "rainbow_boots"); // 3 for boots
	}
}
