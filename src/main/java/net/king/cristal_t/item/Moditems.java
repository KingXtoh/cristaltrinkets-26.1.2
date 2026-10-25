package net.king.cristal_t.item;

import net.king.cristal_t.Cristaltrinkets;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Moditems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Cristaltrinkets.MODID);

    public static final DeferredItem<Item> TRINKET = ITEMS.registerSimpleItem("trinket");




    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
