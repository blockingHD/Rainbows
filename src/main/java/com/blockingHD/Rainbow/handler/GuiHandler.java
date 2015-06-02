package com.blockingHD.Rainbow.handler;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler{

    public enum GuiIDs{
        Rainbow_Furnace;
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (GuiIDs.values()[ID]){
            case Rainbow_Furnace:

        }
        throw new IllegalArgumentException("No gui with ID " + ID);
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (GuiIDs.values()[ID]){
            case Rainbow_Furnace:

        }
        throw new IllegalArgumentException("No gui with ID " + ID);
    }
}
