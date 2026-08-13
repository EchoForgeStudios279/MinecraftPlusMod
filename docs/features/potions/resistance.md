# Potion of Haste

## Overview

Adds Resistance potions to Minecraft.

## Registry IDs

Normal:
`minecraftplus:resistance`

Strong:
`minecraftplus:strong_resistance`

## Effects

### Normal

- Effect: Resistance I
- Duration: 3:00

### Strong

- Effect: Resistance II
- Duration: 1:30

## Brewing

### Potion of Resistance

Awkward Potion + Armadilo Scute

### Strong Potion of Resistance

Potion of Resistance + Glowstone Dust

### Arrow of Resistance

Basicly like how you make any other Tipped Arrow.

## Implementation

### Common

`ModPotions.java`

Contains shared potion definitions.

### Fabric

`FabricPotions.java`

Registers the potions and brewing recipes through Fabric API.

### NeoForge

`NeoForgePotions.java`

Registers potions through DeferredRegister and adds brewing recipes.

## Resources

Translations:

- `en_us.json`
- `de_de.json`
- `de_at.json`