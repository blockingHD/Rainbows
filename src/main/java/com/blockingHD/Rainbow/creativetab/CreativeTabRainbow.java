package com.blockingHD.Rainbow.creativetab;

import com.blockingHD.Rainbow.init.ModItems;
import com.blockingHD.Rainbow.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabRainbow {

	public static final CreativeTabs Rainbow_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()){
	
	@Override
	public Item getTabIconItem(){ return ModItems.Rainbow_Ingot; }
	
	};
}
