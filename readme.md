# Tracers for Minecraft Forge 1.16.5
__Tracers - mod which draws lines from you to all other entities. Lines leading to non-player entities will be white. If the entity is a player, the lines will be red.__

___you can change the color of the lines in the Tracerc class, and in this if block___

```java
        if(entity instanceof PlayerEntity && entity!= mc.player){
            r = 1; g = 0; b = 0; a = 0.65f;
        } else {
              r = 1; g = 1; b = 1; a = 0.65f;
        }
```




__if you want to see lines only to players , just remove the else-block__

```java
          if(entity instanceof PlayerEntity && entity!= mc.player){
              r = 1; g = 0; b = 0; a = 0.65f;
          }
```
___where___
- r - red 
- g - green
- b - blue
- a - alpha



![2023-07-18_20 08 15](https://github.com/Isswmq/Tracers-Forge-1.16.5/assets/106331784/52a36e72-a01c-4f2c-b21f-1f5d0ab6cc44)

__if you found my code helpful, please give this repository a star.__
