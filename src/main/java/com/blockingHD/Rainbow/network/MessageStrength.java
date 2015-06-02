package com.blockingHD.Rainbow.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

/**
 * Created by thomas on 29/05/2015.
 */
public class MessageStrength extends MessageBase<MessageStrength>{
    @Override
    public void fromBytes(ByteBuf buf) {

        }

    @Override
    public void toBytes(ByteBuf buf) {

        }

    @Override
    public void handleClientSide(MessageStrength message, EntityPlayer player) {

    }

    @Override
    public void handleServerSide(MessageStrength message, EntityPlayer player) {
        player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 20, 2));
    }
}
