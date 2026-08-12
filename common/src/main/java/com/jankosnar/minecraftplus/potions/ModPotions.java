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
}