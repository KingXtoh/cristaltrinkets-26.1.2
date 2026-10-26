package net.king.cristal_t.block;

import net.king.cristal_t.Cristaltrinkets;
import net.king.cristal_t.item.Moditems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Cristaltrinkets.MODID);

    public static final DeferredBlock<Block> CITRINE_BLOCK = registerBlock("citrine_block",
            properties -> new Block(properties.sound(SoundType.AMETHYST).destroyTime(3f)));
    public static final DeferredBlock<Block> CELESTITE_BLOCK = registerBlock("celestite_block",
            properties -> new Block(properties.sound(SoundType.AMETHYST).destroyTime(3f)));
    public static final DeferredBlock<Block> CALCITE_BLOCK = registerBlock("calcite_block",
            properties -> new Block(properties.sound(SoundType.AMETHYST).destroyTime(3f)));
    public static final DeferredBlock<Block> BUDDING_CITRINE = registerBlock("budding_citrine",
            properties -> new Block(properties.sound(SoundType.AMETHYST).destroyTime(3f).noLootTable()));
    public static final DeferredBlock<Block> BUDDING_CELESTITE = registerBlock("budding_celestite",
            properties -> new Block(properties.sound(SoundType.AMETHYST).destroyTime(3f).noLootTable()));
    public static final DeferredBlock<Block> BUDDING_CALCITE = registerBlock("budding_calcite",
            properties -> new Block(properties.sound(SoundType.AMETHYST).destroyTime(3f).noLootTable()));

    private static  <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name,function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        Moditems.ITEMS.registerItem(name, properties -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
