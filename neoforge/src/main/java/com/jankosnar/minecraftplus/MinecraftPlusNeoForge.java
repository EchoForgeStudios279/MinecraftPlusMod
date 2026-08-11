package com.jankosnar.minecraftplus;

import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class MinecraftPlusNeoForge
{
    public MinecraftPlusNeoForge()
    {
        MinecraftPlus.init();
    }
}