package net.king.cristal_t.modtab;

import net.king.cristal_t.Cristaltrinkets;
import net.king.cristal_t.block.ModBlocks;
import net.king.cristal_t.item.Moditems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.rmi.registry.Registry;
import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Cristaltrinkets.MODID);

    public static final Supplier<CreativeModeTab> CRISTAL_TRINKETS_TAB = CREATIVE_MODE_TABS.register("cristal_trinkets_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.TRINKET.get()))
                    .title(Component.translatable("creativetab.cristatrinkets.trinket_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                    output.accept(Moditems.TRINKET);
                    output.accept(Moditems.CITRINE_SHARD);
                    output.accept(Moditems.CELESTITE_SHARD);
                    output.accept(Moditems.CALCITE_SHARD);

                    }).build());
    public static final Supplier<CreativeModeTab> CRISTAL_BLOCKS_TAB = CREATIVE_MODE_TABS.register("cristal_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.TRINKET.get()))
                    .title(Component.translatable("creativetab.cristatrinkets.trinket_block"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.TRINKET);
                        output.accept(ModBlocks.CITRINE_BLOCK);
                        output.accept(ModBlocks.CELESTITE_BLOCK);
                        output.accept(ModBlocks.CALCITE_BLOCK);
                        output.accept(ModBlocks.BUDDING_CITRINE);
                        output.accept(ModBlocks.BUDDING_CELESTITE);
                        output.accept(ModBlocks.BUDDING_CALCITE);
                        output.accept(ModBlocks.CITRINE_CLUSTER);
                        output.accept(ModBlocks.CELESTITE_CLUSTER);
                        output.accept(ModBlocks.CALCITE_CLUSTER);
                        output.accept(ModBlocks.LARGE_CITRINE_BUD);
                        output.accept(ModBlocks.LARGE_CELESTITE_BUD);
                        output.accept(ModBlocks.LARGE_CALCITE_BUD);
                        output.accept(ModBlocks.MEDIUM_CITRINE_BUD);
                        output.accept(ModBlocks.MEDIUM_CELESTITE_BUD);
                        output.accept(ModBlocks.MEDIUM_CALCITE_BUD);
                        output.accept(ModBlocks.SMALL_CITRINE_BUD);
                        output.accept(ModBlocks.SMALL_CELESTITE_BUD);
                        output.accept(ModBlocks.SMALL_CALCITE_BUD);


                    }).build());


    public static void register(IEventBus eventBus) {
           CREATIVE_MODE_TABS.register(eventBus);
    }

}
