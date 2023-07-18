package com.isswmq.client;

import com.isswmq.client.key.Key;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@net.minecraftforge.fml.common.Mod("mod")
public class Mod {
    private static final Logger LOGGER = LogManager.getLogger();

    public Mod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new Key());
    }

    private void setup(final FMLCommonSetupEvent event) {
        Client.startup();
    }
}