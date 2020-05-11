package sekelsta.horse_tack;

import java.util.ArrayList;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModItems {
    static ArrayList<TackItem> items = new ArrayList<TackItem>();

    // Make creative mode tab
    static final CreativeTabs creativeTab = (new CreativeTabs(HorseTack.MODID + "_tab")
    {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(items.get(0));
        }		
    });

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        // Add an example item
        register("example", event);
    }

    public static void register(String name, RegistryEvent.Register<Item> event) {
        TackItem tackItem = new TackItem(name);
        event.getRegistry().register(tackItem);
        items.add(tackItem);
    }

    @SubscribeEvent
    public static void registerItemModels(ModelRegistryEvent event) {
        for (TackItem item : items) {
            ModelLoader.setCustomModelResourceLocation(item, 0, 
            new ModelResourceLocation(item.getRegistryName(), "normal"));
        }
    }
}
