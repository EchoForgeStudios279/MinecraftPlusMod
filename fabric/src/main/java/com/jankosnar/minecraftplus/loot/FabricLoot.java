package com.jankosnar.minecraftplus.loot;

import com.jankosnar.minecraftplus.Constants;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.NestedLootTable;

public final class FabricLoot
{
    private static final ResourceKey<LootTable> HASTE_BURIED_TREASURE_LOOT =
            ResourceKey.create(
                    Registries.LOOT_TABLE,
                    ResourceLocation.fromNamespaceAndPath(
                            Constants.MOD_ID,
                            "inject/buried_treasure_haste"
                    )
            );
    public static void register()
    {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) ->
        {
            if (source.isBuiltin() && BuiltInLootTables.BURIED_TREASURE.equals(key))
            {
                LootPool.Builder pool = LootPool.lootPool()
                        .add(
                                NestedLootTable.lootTableReference(
                                        HASTE_BURIED_TREASURE_LOOT
                                )
                        );

                tableBuilder.withPool(pool);
            }
        });
    }
}