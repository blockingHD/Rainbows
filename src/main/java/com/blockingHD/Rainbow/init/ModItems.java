package com.blockingHD.Rainbow.init;

import com.blockingHD.Rainbow.item.dyes.*;
import com.blockingHD.Rainbow.item.ingots.ItemRainbow_Ingot;
import com.blockingHD.Rainbow.item.mainClasses.*;
import com.blockingHD.Rainbow.item.tools.*;
import com.blockingHD.Rainbow.reference.Reference;

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
	}
}
