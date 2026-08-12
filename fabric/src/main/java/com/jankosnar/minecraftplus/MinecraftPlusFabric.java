package com.jankosnar.minecraftplus;

import com.jankosnar.minecraftplus.loot.FabricLoot;
import com.jankosnar.minecraftplus.potions.FabricPotions;
import net.fabricmc.api.ModInitializer;

public final class MinecraftPlusFabric implements ModInitializer
{
    @Override
    public void onInitialize()
    {
        MinecraftPlus.init();

        FabricPotions.register();
        FabricLoot.register();
    }
}