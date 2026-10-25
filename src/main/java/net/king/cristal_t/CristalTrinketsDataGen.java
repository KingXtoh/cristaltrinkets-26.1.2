package net.king.cristal_t;


import com.google.common.eventbus.Subscribe;
import net.king.cristal_t.datagen.ModModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = Cristaltrinkets.MODID)
public class CristalTrinketsDataGen {
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event){
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();

        generator.addProvider(true, new ModModelProvider(packOutput));


    }
}
