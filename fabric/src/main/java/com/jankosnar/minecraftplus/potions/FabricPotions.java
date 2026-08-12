package com.jankosnar.minecraftplus.potions;

import com.jankosnar.minecraftplus.Constants;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;

public final class FabricPotions
{
    public static final Holder<Potion> HASTE =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    ResourceLocation.fromNamespaceAndPath(
                            Constants.MOD_ID,
                            ModPotions.HASTE_ID
                    ),
                    ModPotions.createHastePotion()
            );
    public static final Holder<Potion> STRONG_HASTE =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    ResourceLocation.fromNamespaceAndPath(
                            Constants.MOD_ID,
                            ModPotions.STRONG_HASTE_ID
                    ),
                    ModPotions.createStrongHastePotion()
            );
    public static final Holder<Potion> RESISTENCE =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    ResourceLocation.fromNamespaceAndPath(
                            Constants.MOD_ID,
                            ModPotions.RESISTANCE_ID
                    ),
                    ModPotions.createResistencePotion()
            );
    public static final Holder<Potion> STRONG_RESISTENCE =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    ResourceLocation.fromNamespaceAndPath(
                            Constants.MOD_ID,
                            ModPotions.STRONG_RESISTANCE_ID
                    ),
                    ModPotions.createStrongResistencePotion()
            );

    public static void register()
    {
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder ->
        {
            builder.addMix(
                    Potions.AWKWARD,
                    Items.PRISMARINE_SHARD,
                    HASTE
            );
            builder.addMix(
                    HASTE,
                    Items.GLOWSTONE_DUST,
                    STRONG_HASTE
            );
            builder.addMix(
                    Potions.AWKWARD,
                    Items.ARMADILLO_SCUTE,
                    RESISTENCE
            );
            builder.addMix(
                    RESISTENCE,
                    Items.GLOWSTONE_DUST,
                    STRONG_RESISTENCE
            );
        });
    }
}