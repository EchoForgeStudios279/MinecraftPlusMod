package com.jankosnar.minecraftplus;

import net.fabricmc.api.ModInitializer;

public final class MinecraftPlusFabric implements ModInitializer
{
    @Override
    public void onInitialize()
    {
        MinecraftPlus.init();
    }
}