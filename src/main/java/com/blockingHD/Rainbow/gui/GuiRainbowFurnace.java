package com.blockingHD.Rainbow.gui;

import com.blockingHD.Rainbow.RainbowTileEntity.TileEntityRainbowFurnace;
import com.blockingHD.Rainbow.inventory.RainbowContainerRainbowFurnace;
import com.blockingHD.Rainbow.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class GuiRainbowFurnace extends GuiContainer{

    private static final ResourceLocation furnaceGuiTextures = new ResourceLocation(Reference.MOD_ID + ":textures/gui/furnace.png");
    private TileEntityRainbowFurnace tileFurnace;

    public GuiRainbowFurnace(InventoryPlayer invplayer, TileEntityRainbowFurnace tile) {
        super(new RainbowContainerRainbowFurnace(invplayer, tile));
        this.tileFurnace = tile;
    }

    protected void drawGuiContainerForegroundLayer(int par1, int par2){
        String string = this.tileFurnace.hasCustomInventoryName() ? this.tileFurnace.getInventoryName() : I18n.format(this.tileFurnace.getInventoryName(), new Object[0]);
        this.fontRendererObj.drawString(string, this.xSize / 2 - this.fontRendererObj.getStringWidth(string), 6, 4210752);
        this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize-94, 4210752);

    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(furnaceGuiTextures);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        int i1;

        i1 = this.tileFurnace.getCookProgressScaled(24);
        this.drawTexturedModalRect(k + 79, l + 34, 176, 14, i1 + 1, 16);
    }
}
