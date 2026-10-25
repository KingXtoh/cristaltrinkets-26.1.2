package net.king.cristal_t.datagen;

import net.king.cristal_t.Cristaltrinkets;
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

    }
}
