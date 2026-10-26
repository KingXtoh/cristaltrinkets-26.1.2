package net.king.cristal_t.datagen;

import net.king.cristal_t.Cristaltrinkets;
import net.king.cristal_t.block.ModBlocks;
import net.king.cristal_t.item.Moditems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;


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

    }
}
