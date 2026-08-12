package com.jankosnar.minecraftplus.potions;

import com.jankosnar.minecraftplus.Constants;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class NeoForgePotions
{
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(
                    BuiltInRegistries.POTION,
                    Constants.MOD_ID
            );


    public static final DeferredHolder<Potion, Potion> HASTE =
            POTIONS.register(
                    ModPotions.HASTE_ID,
                    ModPotions::createHastePotion
            );
    public static final DeferredHolder<Potion, Potion> STRONG_HASTE =
            POTIONS.register(
                    ModPotions.STRONG_HASTE_ID,
                    ModPotions::createStrongHastePotion
            );
    public static final DeferredHolder<Potion, Potion> RESISTANCE =
            POTIONS.register(
                    ModPotions.RESISTANCE_ID,
                    ModPotions::createResistencePotion
            );
    public static final DeferredHolder<Potion, Potion> STRONG_RESISTANCE =
            POTIONS.register(
                    ModPotions.STRONG_RESISTANCE_ID,
                    ModPotions::createStrongResistencePotion
            );


    public static void register(IEventBus modBus)
    {
        POTIONS.register(modBus);

        NeoForge.EVENT_BUS.addListener(
                NeoForgePotions::registerBrewingRecipes
        );
    }


    private static void registerBrewingRecipes(
            RegisterBrewingRecipesEvent event
    )
    {
        event.getBuilder().addMix(
                Potions.AWKWARD,
                Items.PRISMARINE_SHARD,
                HASTE
        );
        event.getBuilder().addMix(
                HASTE,
                Items.GLOWSTONE_DUST,
                STRONG_HASTE
        );
        event.getBuilder().addMix(
                Potions.AWKWARD,
                Items.ARMADILLO_SCUTE,
                RESISTANCE
        );
        event.getBuilder().addMix(
                RESISTANCE,
                Items.GLOWSTONE_DUST,
                STRONG_RESISTANCE
        );
    }
}