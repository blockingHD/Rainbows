package com.blockingHD.Rainbow.item.armor;

import com.blockingHD.Rainbow.creativetab.CreativeTabRainbow;
import com.blockingHD.Rainbow.item.mainClasses.Materials;
import com.blockingHD.Rainbow.reference.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorRainbow extends ItemArmor{
    public String textureName;

    public ArmorRainbow(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
        super(Materials.Rainbow_Material_ARMOR, 0, type);
        this.setCreativeTab(CreativeTabRainbow.Rainbow_TAB);
        this.textureName = textureName;
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(Reference.MOD_ID + ":" + unlocalizedName);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        return Reference.MOD_ID + ":textures/armor/"  + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
    }

}
