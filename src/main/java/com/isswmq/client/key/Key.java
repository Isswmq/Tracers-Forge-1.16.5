package com.isswmq.client.key;

import com.isswmq.client.Client;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Key {

    @SubscribeEvent
    public void onUpdate(InputEvent.KeyInputEvent event){
        Client.keyPress(event.getKey(), event.getAction());
    }
}
