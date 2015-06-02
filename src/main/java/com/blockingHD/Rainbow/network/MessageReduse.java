package com.blockingHD.Rainbow.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;

public class MessageReduse extends MessageBase<MessageReduse>{
    @Override
    public void fromBytes(ByteBuf buf) {

    }

    @Override
    public void toBytes(ByteBuf buf) {

    }

    @Override
    public void handleClientSide(MessageReduse message, EntityPlayer player) {

    }

    @Override
    public void handleServerSide(MessageReduse message, EntityPlayer player) {
        player.setHealth(player.getMaxHealth()/2);
    }
}
