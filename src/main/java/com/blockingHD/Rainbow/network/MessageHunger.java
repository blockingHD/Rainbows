package com.blockingHD.Rainbow.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

/**
 * Created by thomas on 30/05/2015.
 */
public class MessageHunger extends MessageBase<MessageHunger> {


    @Override
    public void handleClientSide(MessageHunger message, EntityPlayer player) {
        player.addPotionEffect(new PotionEffect(Potion.field_76443_y.id, 120, 1));
    }

    @Override
    public void handleServerSide(MessageHunger message, EntityPlayer player) {
        player.addPotionEffect(new PotionEffect(Potion.field_76443_y.id, 120, 1));
    }

    @Override
    public void fromBytes(ByteBuf buf) {

    }

    @Override
    public void toBytes(ByteBuf buf) {

    }
}
