package net.king.cristal_t.datagen;

import net.king.cristal_t.Cristaltrinkets;
import net.king.cristal_t.block.ModBlocks;
import net.king.cristal_t.item.Moditems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;


public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, Cristaltrinkets.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(Moditems.TRINKET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(Moditems.CITRINE_SHARD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(Moditems.CELESTITE_SHARD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(Moditems.CALCITE_SHARD.get(), ModelTemplates.FLAT_ITEM);

        // Block
        blockModels.createTrivialCube(ModBlocks.CITRINE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.CELESTITE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.CALCITE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.BUDDING_CITRINE.get());
        blockModels.createTrivialCube(ModBlocks.BUDDING_CELESTITE.get());
        blockModels.createTrivialCube(ModBlocks.BUDDING_CALCITE.get());
        blockModels.createAmethystCluster(ModBlocks.CITRINE_CLUSTER.get());
        blockModels.registerSimpleFlatItemModel(ModBlocks.CITRINE_CLUSTER.get());
        blockModels.createAmethystCluster(ModBlocks.CELESTITE_CLUSTER.get());
        blockModels.registerSimpleFlatItemModel(ModBlocks.CELESTITE_CLUSTER.get());
        blockModels.createAmethystCluster(ModBlocks.CALCITE_CLUSTER.get());
        blockModels.registerSimpleFlatItemModel(ModBlocks.CALCITE_CLUSTER.get());
        blockModels.createAmethystCluster(ModBlocks.LARGE_CITRINE_BUD.get());
        blockModels.registerSimpleFlatItemModel(ModBlocks.LARGE_CITRINE_BUD.get());
        blockModels.createAmethystCluster(ModBlocks.LARGE_CELESTITE_BUD.get());
        blockModels.registerSimpleFlatItemModel(ModBlocks.LARGE_CELESTITE_BUD.get());
        blockModels.createAmethystCluster(ModBlocks.LARGE_CALCITE_BUD.get());
        blockModels.registerSimpleFlatItemModel(ModBlocks.LARGE_CALCITE_BUD.get());
        blockModels.createAmethystCluster(ModBlocks.MEDIUM_CITRINE_BUD.get());
        blockModels.registerSimpleFlatItemModel(ModBlocks.MEDIUM_CITRINE_BUD.get());
        blockModels.createAmethystCluster(ModBlocks.MEDIUM_CELESTITE_BUD.get());
        blockModels.registerSimpleFlatItemModel(ModBlocks.MEDIUM_CELESTITE_BUD.get());
        blockModels.createAmethystCluster(ModBlocks.MEDIUM_CALCITE_BUD.get());
        blockModels.registerSimpleFlatItemModel(ModBlocks.MEDIUM_CALCITE_BUD.get());
        blockModels.createAmethystCluster(ModBlocks.SMALL_CITRINE_BUD.get());
        blockModels.registerSimpleFlatItemModel(ModBlocks.SMALL_CITRINE_BUD.get());
        blockModels.createAmethystCluster(ModBlocks.SMALL_CELESTITE_BUD.get());
        blockModels.registerSimpleFlatItemModel(ModBlocks.SMALL_CELESTITE_BUD.get());
        blockModels.createAmethystCluster(ModBlocks.SMALL_CALCITE_BUD.get());
        blockModels.registerSimpleFlatItemModel(ModBlocks.SMALL_CALCITE_BUD.get());


    }
}
