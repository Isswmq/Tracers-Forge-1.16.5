package com.isswmq.client.module;

import net.minecraftforge.common.MinecraftForge;

public class Module {
    public String name;
    public int keyCode;
    public boolean toggled;



    public Module(String name, int key){
        this.name = name;
        this.keyCode = key;
    }

    public void onEnabled(){
        MinecraftForge.EVENT_BUS.register(this);
    }

    public void onDisable(){
        MinecraftForge.EVENT_BUS.unregister(this);
    }

    public boolean isToggled(){
        return toggled;
    }

    public void toggle(){
        toggled = !toggled;
        if(toggled){
            this.onEnabled();
        }else{
            this.onDisable();
        }
    }

    public void setToggled(boolean toggled){
        this.toggled = toggled;
        if(this.toggled){
            onEnabled();
        }else{
            onDisable();
        }
    }

    public int getKey(){
        return keyCode;
    }

    public String getName(){
        return name;
    }
}
