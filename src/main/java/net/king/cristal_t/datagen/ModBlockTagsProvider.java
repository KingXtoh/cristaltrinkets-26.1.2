package net.king.cristal_t.datagen;

import net.king.cristal_t.Cristaltrinkets;
import net.king.cristal_t.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Cristaltrinkets.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.CITRINE_BLOCK.get())
                .add(ModBlocks.CELESTITE_BLOCK.get())
                .add(ModBlocks.CALCITE_BLOCK.get())
                .add(ModBlocks.BUDDING_CITRINE.get())
                .add(ModBlocks.BUDDING_CELESTITE.get())
                .add(ModBlocks.BUDDING_CALCITE.get())
                .add(ModBlocks.CITRINE_CLUSTER.get())
                .add(ModBlocks.CELESTITE_CLUSTER.get())
                .add(ModBlocks.CALCITE_CLUSTER.get())
                .add(ModBlocks.LARGE_CITRINE_BUD.get())
                .add(ModBlocks.LARGE_CELESTITE_BUD.get())
                .add(ModBlocks.LARGE_CALCITE_BUD.get())
                .add(ModBlocks.MEDIUM_CITRINE_BUD.get())
                .add(ModBlocks.MEDIUM_CELESTITE_BUD.get())
                .add(ModBlocks.MEDIUM_CALCITE_BUD.get())
                .add(ModBlocks.SMALL_CITRINE_BUD.get())
                .add(ModBlocks.SMALL_CELESTITE_BUD.get())
                .add(ModBlocks.SMALL_CALCITE_BUD.get())
        ;


    }
}
