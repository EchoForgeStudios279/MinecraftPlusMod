# Potion of Haste

## Overview

Adds Haste potions to Minecraft.

## Registry IDs

Normal:
`minecraftplus:haste`

Strong:
`minecraftplus:strong_haste`

## Effects

### Normal

- Effect: Haste I
- Duration: 3:00

### Strong

- Effect: Haste II
- Duration: 1:30

## Brewing

### Potion of Haste

Awkward Potion + Prismarine Shard

### Strong Potion of Haste

Potion of Haste + Glowstone Dust

## Loot

Potion of Haste can appear in Buried Treasure.

Chance: 28%

The strong variant does not generate as loot.

## Implementation

### Common

`ModPotions.java`

Contains shared potion definitions.

### Fabric

`FabricPotions.java`

Registers the potions and brewing recipes through Fabric API.

`FabricLoot.java`

Injects the loot table into Buried Treasure.

### NeoForge

`NeoForgePotions.java`

Registers potions through DeferredRegister and adds brewing recipes.

NeoForge uses a Global Loot Modifier for Buried Treasure.

## Resources

Translations:

- `en_us.json`
- `de_de.json`
- `de_at.json`