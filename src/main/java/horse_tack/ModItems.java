package sekelsta.horse_tack;

import java.util.ArrayList;

import net.minecraft.item.HorseArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = HorseTack.MODID, bus = Bus.MOD)
public class ModItems {
    static ArrayList<HorseArmorItem> items = new ArrayList<>();

    // Make creative mode tab
    static final ItemGroup creativeTab = (new ItemGroup(ItemGroup.GROUPS.length, HorseTack.MODID + "_tab")
    {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(items.get(0));
        }		
    });

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        // Add an example item
        register("example", event);
    }

    public static void register(String name, RegistryEvent.Register<Item> event) {
        // Different from the default constructor in that it does not add "horse_armor_"
        // to the fron tof the name
        ResourceLocation texture = new ResourceLocation(HorseTack.MODID, "textures/entity/horse/armor/" + name + ".png");
        HorseArmorItem tackItem = new HorseArmorItem(0, texture, (new Item.Properties()).maxStackSize(1).group(creativeTab));
        tackItem.setRegistryName(name);
        event.getRegistry().register(tackItem);
        items.add(tackItem);
    }
}
