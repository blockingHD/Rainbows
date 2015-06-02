package com.blockingHD.Rainbow.network;

import com.blockingHD.Rainbow.reference.Reference;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

public class NetworkHandler {
    private static SimpleNetworkWrapper INSTANCE;

    public static void init(){
        INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MOD_ID);

        INSTANCE.registerMessage(MessageReduse.class, MessageReduse.class, 0, Side.SERVER);
        INSTANCE.registerMessage(MessageStrength.class, MessageStrength.class, 1, Side.SERVER);
        INSTANCE.registerMessage(MessageHunger.class, MessageHunger.class, 2, Side.SERVER);
    }

    public static void sendToServer(IMessage message){
        INSTANCE.sendToServer(message);

    }

}
