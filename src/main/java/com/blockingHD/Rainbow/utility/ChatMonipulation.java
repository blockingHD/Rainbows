package com.blockingHD.Rainbow.utility;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;

@SideOnly(Side.SERVER)
public class ChatMonipulation {

	public static void addMessage(String msg) {

		boolean s = false;

		if (s == true) {
			Minecraft.getMinecraft().thePlayer
					.addChatMessage(new ChatComponentText(
							"\2478[\247cTest\2478] \247f" + msg));
		}
	}

}
