package com.jankosnar.minecraftplus;

import com.jankosnar.minecraftplus.potions.NeoForgePotions;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class MinecraftPlusNeoForge
{
    public MinecraftPlusNeoForge(IEventBus modBus)
    {
        MinecraftPlus.init();
        NeoForgePotions.register(modBus);
    }
}