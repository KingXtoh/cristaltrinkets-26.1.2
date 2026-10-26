package net.king.cristal_t.datagen;

import net.king.cristal_t.block.ModBlocks;
import net.king.cristal_t.item.Moditems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MaceItem;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.entries.LootPoolSingletonContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    public ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.CITRINE_BLOCK.get());
        dropSelf(ModBlocks.CELESTITE_BLOCK.get());
        dropSelf(ModBlocks.CALCITE_BLOCK.get());
        add(ModBlocks.CITRINE_CLUSTER.get(),
            createClusterDrop(ModBlocks.CITRINE_CLUSTER.get(), Moditems.CITRINE_SHARD.get()));
        add(ModBlocks.CELESTITE_CLUSTER.get(),
            createClusterDrop(ModBlocks.CELESTITE_CLUSTER.get(), Moditems.CELESTITE_SHARD.get()));
        add(ModBlocks.CALCITE_CLUSTER.get(),
            createClusterDrop(ModBlocks.CALCITE_CLUSTER.get(), Moditems.CALCITE_SHARD.get()));

    }

    protected LootTable.Builder createClusterDrop(Block original, Item drop) {
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        HolderLookup.RegistryLookup<Item> items = this.registries.lookupOrThrow(Registries.ITEM);
        return this.createSilkTouchDispatchTable(original,((LootPoolSingletonContainer.Builder<?>)LootItem.lootTableItem(drop).apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F))).apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE))).when(MatchTool.toolMatches(net.minecraft.advancements.criterion.ItemPredicate.Builder.item().of(items, ItemTags.CLUSTER_MAX_HARVESTABLES)))).otherwise(this.applyExplosionDecay(original, LootItem.lootTableItem(drop).apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F))))));

    }

            //this.add(Blocks.AMETHYST_CLUSTER,(block) -> this.createSilkTouchDispatchTable(block,((LootPoolSingletonContainer.Builder)LootItem.lootTableItem(Items.AMETHYST_SHARD).apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F))).apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE))).when(MatchTool.toolMatches(net.minecraft.advancements.criterion.ItemPredicate.Builder.item().of(items, ItemTags.CLUSTER_MAX_HARVESTABLES)))).otherwise((LootPoolEntryContainer.Builder)this.applyExplosionDecay(block, LootItem.lootTableItem(Items.AMETHYST_SHARD).apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
