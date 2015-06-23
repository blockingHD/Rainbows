package com.blockingHD.Rainbow.item.mainClasses;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class Materials {
    public static Item.ToolMaterial Rainbow_Material = EnumHelper.addToolMaterial("RAINBOW", 3, -1, 30, 10, 30);
    public static ItemArmor.ArmorMaterial Rainbow_Material_ARMOR = EnumHelper.addArmorMaterial("NAME", -1, new int[]{3, 9, 7, 3}, 25);
}
