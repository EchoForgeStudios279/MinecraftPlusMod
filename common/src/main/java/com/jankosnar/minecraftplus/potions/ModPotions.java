package com.jankosnar.minecraftplus.potions;

import com.jankosnar.minecraftplus.Constants;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;

public final class ModPotions {
    public static final String HASTE_ID = "haste";
    public static final int HASTE_DURATION = 20 * 60 * 3;
    public static final int HASTE_AMPLIFIER = 0;

    public static final String STRONG_HASTE_ID = "strong_haste";
    public static final int STRONG_HASTE_DURATION = 20 * 60 + 20 * 30;
    public static final int STRONG_HASTE_AMPLIFIER = 1;

    public static final String RESISTANCE_ID = "resistance";
    public static final int RESISTANCE_DURATION = 20 * 60 * 3;
    public static final int RESISTANCE_AMPLIFIER = 0;

    public static final String STRONG_RESISTANCE_ID = "strong_resistance";
    public static final int STRONG_RESISTANCE_DURATION = 20 * 60 + 20 * 30;
    public static final int STRONG_RESISTANCE_AMPLIFIER = 1;

    public static Potion createHastePotion() {
        return new Potion(
                Constants.MOD_ID + "." + HASTE_ID,
                new MobEffectInstance(
                        MobEffects.DIG_SPEED,
                        HASTE_DURATION,
                        HASTE_AMPLIFIER
                )
        );
    }
    public static Potion createStrongHastePotion()
    {
        return new Potion(
                Constants.MOD_ID + "." + HASTE_ID,
                new MobEffectInstance(
                        MobEffects.DIG_SPEED,
                        STRONG_HASTE_DURATION,
                        STRONG_HASTE_AMPLIFIER
                )
        );
    }
    public static Potion createResistencePotion()
    {
        return new Potion(
                Constants.MOD_ID + "." + RESISTANCE_ID,
                new MobEffectInstance(
                        MobEffects.DAMAGE_RESISTANCE,
                        RESISTANCE_DURATION,
                        RESISTANCE_AMPLIFIER
                )
        );
    }
    public static Potion createStrongResistencePotion()
    {
        return new Potion(
                Constants.MOD_ID + "." + RESISTANCE_ID,
                new MobEffectInstance(
                        MobEffects.DAMAGE_RESISTANCE,
                        STRONG_RESISTANCE_DURATION,
                        STRONG_RESISTANCE_AMPLIFIER
                )
        );
    }
}