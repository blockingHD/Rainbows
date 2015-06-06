package com.blockingHD.Rainbow.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static cpw.mods.fml.common.registry.GameRegistry.*;

public class Recipes {
	public static void init() {
        //Shaped
        addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.RainbowPick),"xxx", " s ", " s ", 'x', new ItemStack(ModItems.Rainbow_Ingot), 's', "stickWood"));
        addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.RainbowSpade)," x ", " s ", " s ", 'x', new ItemStack(ModItems.Rainbow_Ingot), 's', "stickWood"));
        addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.RainbowHoe)," xx", " s ", " s ", 'x', new ItemStack(ModItems.Rainbow_Ingot), 's', "stickWood"));
        addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.RainbowAxe),"xx ", "xs ", " s ", 'x', new ItemStack(ModItems.Rainbow_Ingot), 's', "stickWood"));
        addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.RainbowSword)," x ", " x ", " s ", 'x', new ItemStack(ModItems.Rainbow_Ingot), 's', "stickWood"));

//        addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.RainbowDyeBallBlue),"bbb","bnb","bbb", 'b', "dyeLightBlue", 'n', new ItemStack(Items.nether_star)));
//        addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.RainbowDyeBallGreen),"ggg","gng","ggg", 'g', "dyeLime", 'n', new ItemStack(Items.nether_star)));
//        addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.RainbowDyeBallMagenta),"mmm","mnm","mmm", 'm', "dyeMagenta", 'n', new ItemStack(Items.nether_star)));
//        addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.RainbowDyeBallOrange),"ooo","ono","ooo", 'o', "dyeOrange", 'n', new ItemStack(Items.nether_star)));
//        addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.RainbowDyeBallRed),"rrr","rnr","rrr", 'r', "dyeRed", 'n', new ItemStack(Items.nether_star)));
//        addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.RainbowDyeBallYellow),"yyy","yny","yyy", 'y', "dyeYellow", 'n', new ItemStack(Items.nether_star)));

        addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.RainbowFurnaceBlock), "ddd", "dfd", "ddd",
                'd', new ItemStack(Items.diamond),
                'f', new ItemStack(Blocks.furnace)));

        addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.Rainbow_Ingot), "roy", "gbm", "ddd",
                'r', new ItemStack(ModItems.RainbowDyeBallRed),
                'o', new ItemStack(ModItems.RainbowDyeBallOrange),
                'y', new ItemStack(ModItems.RainbowDyeBallYellow),
                'g', new ItemStack(ModItems.RainbowDyeBallGreen),
                'b', new ItemStack(ModItems.RainbowDyeBallBlue),
                'm', new ItemStack(ModItems.RainbowDyeBallMagenta),
                'd', new ItemStack(Items.diamond)));


        //Shapeless

        //Smelting

    }
}
