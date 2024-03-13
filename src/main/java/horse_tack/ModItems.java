package sekelsta.horse_tack;

import java.util.ArrayList;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


@Mod.EventBusSubscriber(modid = HorseTack.MODID, bus = Bus.MOD)
public class ModItems {
    public static final DeferredRegister<Item> ITEM_DEFERRED
        = DeferredRegister.create(ForgeRegistries.ITEMS, HorseTack.MODID);

    private static CreativeModeTab creativeTab = null;

    @SubscribeEvent
    static final void registerTab(CreativeModeTabEvent.Register event) {
        creativeTab = event.registerCreativeModeTab(
            new ResourceLocation(HorseTack.MODID, "tacktab"),
            (CreativeModeTab.Builder builder) -> builder
                .icon(() -> new ItemStack(items.get(0).get()))
                .title(Component.translatable("itemGroup." + HorseTack.MODID + "_tab"))
                .displayItems((displayParams, out) -> 
                    items.forEach((item) -> 
                        out.accept(item.get())
                    )
                )
        );
    }

    static ArrayList<RegistryObject<HorseArmorItem>> items = new ArrayList<>();

    static {
        // Add items here
        register("cart_harness_tack");
        register("saddle_pad_black");
        register("saddle_pad_blue");
        register("saddle_pad_brown");
        register("saddle_pad_cyan");
        register("saddle_pad_green");
        register("saddle_pad_grey");
        register("saddle_pad_light_blue");
        register("saddle_pad_lime");
        register("saddle_pad_magenta");
        register("saddle_pad_orange");
        register("saddle_pad_pink");
        register("saddle_pad_purple");
        register("saddle_pad_red");
        register("saddle_pad_silver");
        register("saddle_pad_white");
        register("saddle_pad_yellow");
        register("halter_black");
        register("halter_blue");
        register("halter_brown");
        register("halter_cyan");
        register("halter_green");
        register("halter_grey");
        register("halter_light_blue");
        register("halter_lime");
        register("halter_magenta");
        register("halter_orange");
        register("halter_pink");
        register("halter_purple");
        register("halter_red");
        register("halter_silver");
        register("halter_white");
        register("halter_yellow");
        register("english_tack_black");
        register("english_tack_blue");
        register("english_tack_brown");
        register("english_tack_cyan");
        register("english_tack_green");
        register("english_tack_grey");
        register("english_tack_light_blue");
        register("english_tack_lime");
        register("english_tack_magenta");
        register("english_tack_orange");
        register("english_tack_pink");
        register("english_tack_purple");
        register("english_tack_red");
        register("english_tack_silver");
        register("english_tack_white");
        register("english_tack_yellow");
        register("jumping_tack_black");
        register("jumping_tack_blue");
        register("jumping_tack_brown");
        register("jumping_tack_cyan");
        register("jumping_tack_green");
        register("jumping_tack_grey");
        register("jumping_tack_light_blue");
        register("jumping_tack_lime");
        register("jumping_tack_magenta");
        register("jumping_tack_orange");
        register("jumping_tack_pink");
        register("jumping_tack_purple");
        register("jumping_tack_red");
        register("jumping_tack_silver");
        register("jumping_tack_white");
        register("jumping_tack_yellow");
        register("western_tack_black");
        register("western_tack_blue");
        register("western_tack_brown");
        register("western_tack_cyan");
        register("western_tack_green");
        register("western_tack_grey");
        register("western_tack_light_blue");
        register("western_tack_lime");
        register("western_tack_magenta");
        register("western_tack_orange");
        register("western_tack_pink");
        register("western_tack_purple");
        register("western_tack_red");
        register("western_tack_silver");
        register("western_tack_white");
        register("western_tack_yellow");
        register("racing_tack_black");
        register("racing_tack_blue");
        register("racing_tack_brown");
        register("racing_tack_cyan");
        register("racing_tack_green");
        register("racing_tack_grey");
        register("racing_tack_light_blue");
        register("racing_tack_lime");
        register("racing_tack_magenta");
        register("racing_tack_orange");
        register("racing_tack_pink");
        register("racing_tack_purple");
        register("racing_tack_red");
        register("racing_tack_silver");
        register("racing_tack_white");
        register("racing_tack_yellow");
        register("blanket_black_blue");
        register("blanket_black_brown");
        register("blanket_black_cyan");
        register("blanket_black_green");
        register("blanket_black_grey");
        register("blanket_black_light_blue");
        register("blanket_black_lime");
        register("blanket_black_magenta");
        register("blanket_black_orange");
        register("blanket_black_pink");
        register("blanket_black_purple");
        register("blanket_black_red");
        register("blanket_black_silver");
        register("blanket_black_white");
        register("blanket_black_yellow");
        register("blanket_white_black");
        register("blanket_white_blue");
        register("blanket_white_brown");
        register("blanket_white_cyan");
        register("blanket_white_green");
        register("blanket_white_grey");
        register("blanket_white_light_blue");
        register("blanket_white_lime");
        register("blanket_white_magenta");
        register("blanket_white_orange");
        register("blanket_white_pink");
        register("blanket_white_purple");
        register("blanket_white_red");
        register("blanket_white_silver");
        register("blanket_white_yellow");
        register("blanket_white_trimmed_blue");
        register("blanket_white_trimmed_brown");
        register("blanket_white_trimmed_cyan");
        register("blanket_white_trimmed_green");
        register("blanket_white_trimmed_grey");
        register("blanket_white_trimmed_light_blue");
        register("blanket_white_trimmed_lime");
        register("blanket_white_trimmed_magenta");
        register("blanket_white_trimmed_orange");
        register("blanket_white_trimmed_pink");
        register("blanket_white_trimmed_purple");
        register("blanket_white_trimmed_red");
        register("blanket_white_trimmed_silver");
        register("blanket_white_trimmed_white");
        register("blanket_white_trimmed_yellow");
        register("blanket_white_trim_blue");
        register("blanket_white_trim_brown");
        register("blanket_white_trim_cyan");
        register("blanket_white_trim_green");
        register("blanket_white_trim_grey");
        register("blanket_white_trim_light_blue");
        register("blanket_white_trim_lime");
        register("blanket_white_trim_magenta");
        register("blanket_white_trim_orange");
        register("blanket_white_trim_pink");
        register("blanket_white_trim_purple");
        register("blanket_white_trim_red");
        register("blanket_white_trim_silver");
        register("blanket_white_trim_yellow");
        register("blanket_black_trimmed_blue");
        register("blanket_black_trimmed_brown");
        register("blanket_black_trimmed_cyan");
        register("blanket_black_trimmed_green");
        register("blanket_black_trimmed_grey");
        register("blanket_black_trimmed_light_blue");
        register("blanket_black_trimmed_lime");
        register("blanket_black_trimmed_magenta");
        register("blanket_black_trimmed_orange");
        register("blanket_black_trimmed_pink");
        register("blanket_black_trimmed_purple");
        register("blanket_black_trimmed_red");
        register("blanket_black_trimmed_silver");
        register("blanket_black_trimmed_white");
        register("blanket_black_trimmed_yellow");
        register("blanket_black_trim_black");
        register("blanket_black_trim_blue");
        register("blanket_black_trim_brown");
        register("blanket_black_trim_cyan");
        register("blanket_black_trim_green");
        register("blanket_black_trim_grey");
        register("blanket_black_trim_light_blue");
        register("blanket_black_trim_lime");
        register("blanket_black_trim_magenta");
        register("blanket_black_trim_orange");
        register("blanket_black_trim_pink");
        register("blanket_black_trim_purple");
        register("blanket_black_trim_red");
        register("blanket_black_trim_silver");
        register("blanket_black_trim_white");
        register("blanket_black_trim_yellow");
        register("bee_blanket");
        register("galaxy_blanket");
        register("native_blanket");
        register("red_plaid_blanket");
        register("sky_blanket");
        register("spider_blanket");
        register("blue_plaid_blanket");
        register("green_plaid_blanket");
        register("pattern_blanket");
        register("sakura_blanket");
        register("snow_blanket");
        register("white_plaid_blanket");
        register("blanket_black_halter_blue");
        register("blanket_black_halter_brown");
        register("blanket_black_halter_cyan");
        register("blanket_black_halter_green");
        register("blanket_black_halter_grey");
        register("blanket_black_halter_light_blue");
        register("blanket_black_halter_lime");
        register("blanket_black_halter_magenta");
        register("blanket_black_halter_orange");
        register("blanket_black_halter_pink");
        register("blanket_black_halter_purple");
        register("blanket_black_halter_red");
        register("blanket_black_halter_silver");
        register("blanket_black_halter_white");
        register("blanket_black_halter_yellow");
        register("blanket_blackblack_halter");
        register("blanket_blackblue_halter");
        register("blanket_blackbrown_halter");
        register("blanket_blackcyan_halter");
        register("blanket_blackgreen_halter");
        register("blanket_blackgrey_halter");
        register("blanket_blacklightblue_halter");
        register("blanket_blacklime_halter");
        register("blanket_blackmagenta_halter");
        register("blanket_blackorange_halter");
        register("blanket_blackpink_halter");
        register("blanket_blackpurple_halter");
        register("blanket_blackred_halter");
        register("blanket_blacksilver_halter");
        register("blanket_blackwhite_halter");
        register("blanket_blackyellow_halter");
        register("blanket_blueblack_halter");
        register("blanket_bluewhite_halter");
        register("blanket_brownblack_halter");
        register("blanket_brownwhite_halter");
        register("blanket_cyanblack_halter");
        register("blanket_cyanwhite_halter");
        register("blanket_greenblack_halter");
        register("blanket_greenwhite_halter");
        register("blanket_greyblack_halter");
        register("blanket_greywhite_halter");
        register("blanket_lightblueblack_halter");
        register("blanket_lightbluewhite_halter");
        register("blanket_limeblack_halter");
        register("blanket_limewhite_halter");
        register("blanket_magentablack_halter");
        register("blanket_magentawhite_halter");
        register("blanket_orangeblack_halter");
        register("blanket_orangewhite_halter");
        register("blanket_pinkblack_halter");
        register("blanket_pinkwhite_halter");
        register("blanket_purpleblack_halter");
        register("blanket_purplewhite_halter");
        register("blanket_redblack_halter");
        register("blanket_redwhite_halter");
        register("blanket_silverblack_halter");
        register("blanket_silverwhite_halter");
        register("blanket_yellowblack_halter");
        register("blanket_yellowwhite_halter");
        register("blanket_white_halter_black");
        register("blanket_white_halter_blue");
        register("blanket_white_halter_brown");
        register("blanket_white_halter_cyan");
        register("blanket_white_halter_green");
        register("blanket_white_halter_grey");
        register("blanket_white_halter_light_blue");
        register("blanket_white_halter_lime");
        register("blanket_white_halter_magenta");
        register("blanket_white_halter_orange");
        register("blanket_white_halter_pink");
        register("blanket_white_halter_purple");
        register("blanket_white_halter_red");
        register("blanket_white_halter_silver");
        register("blanket_white_halter_yellow");
        register("blanket_whiteblack_halter");
        register("blanket_whiteblue_halter");
        register("blanket_whitebrown_halter");
        register("blanket_whitecyan_halter");
        register("blanket_whitegreen_halter");
        register("blanket_whitegrey_halter");
        register("blanket_whitelightblue_halter");
        register("blanket_whitelime_halter");
        register("blanket_whitemagenta_halter");
        register("blanket_whiteorange_halter");
        register("blanket_whitepink_halter");
        register("blanket_whitepurple_halter");
        register("blanket_whitered_halter");
        register("blanket_whitesilver_halter");
        register("blanket_whitewhite_halter");
        register("blanket_whiteyellow_halter");
        register("saddle_pad_blackblack");
        register("saddle_pad_blackblue");
        register("saddle_pad_blackbrown");
        register("saddle_pad_blackcyan");
        register("saddle_pad_blackgreen");
        register("saddle_pad_blackgrey");
        register("saddle_pad_blacklight_blue");
        register("saddle_pad_blacklime");
        register("saddle_pad_blackmagenta");
        register("saddle_pad_blackorange");
        register("saddle_pad_blackpink");
        register("saddle_pad_blackpurple");
        register("saddle_pad_blackred");
        register("saddle_pad_blacksilver");
        register("saddle_pad_blackwhite");
        register("saddle_pad_blackyellow");
        register("english_tack_blackblack");
        register("english_tack_blackblue");
        register("english_tack_blackbrown");
        register("english_tack_blackcyan");
        register("english_tack_blackgreen");
        register("english_tack_blackgrey");
        register("english_tack_blacklight_blue");
        register("english_tack_blacklime");
        register("english_tack_blackmagenta");
        register("english_tack_blackorange");
        register("english_tack_blackpink");
        register("english_tack_blackpurple");
        register("english_tack_blackred");
        register("english_tack_blacksilver");
        register("english_tack_blackwhite");
        register("english_tack_blackyellow");
        register("jumping_tack_blackblack");
        register("jumping_tack_blackblue");
        register("jumping_tack_blackbrown");
        register("jumping_tack_blackcyan");
        register("jumping_tack_blackgreen");
        register("jumping_tack_blackgrey");
        register("jumping_tack_blacklight_blue");
        register("jumping_tack_blacklime");
        register("jumping_tack_blackmagenta");
        register("jumping_tack_blackorange");
        register("jumping_tack_blackpink");
        register("jumping_tack_blackpurple");
        register("jumping_tack_blackred");
        register("jumping_tack_blacksilver");
        register("jumping_tack_blackwhite");
        register("jumping_tack_blackyellow");
        register("western_tack_blackblack");
        register("western_tack_blackblue");
        register("western_tack_blackbrown");
        register("western_tack_blackcyan");
        register("western_tack_blackgreen");
        register("western_tack_blackgrey");
        register("western_tack_blacklight_blue");
        register("western_tack_blacklime");
        register("western_tack_blackmagenta");
        register("western_tack_blackorange");
        register("western_tack_blackpink");
        register("western_tack_blackpurple");
        register("western_tack_blackred");
        register("western_tack_blacksilver");
        register("western_tack_blackwhite");
        register("western_tack_blackyellow");
        register("racing_tack_blackblack");
        register("racing_tack_blackblue");
        register("racing_tack_blackbrown");
        register("racing_tack_blackcyan");
        register("racing_tack_blackgreen");
        register("racing_tack_blackgrey");
        register("racing_tack_blacklight_blue");
        register("racing_tack_blacklime");
        register("racing_tack_blackmagenta");
        register("racing_tack_blackorange");
        register("racing_tack_blackpink");
        register("racing_tack_blackpurple");
        register("racing_tack_blackred");
        register("racing_tack_blacksilver");
        register("racing_tack_blackwhite");
        register("racing_tack_blackyellow");
        register("blanket_bee_halter");
        register("blanket_galaxy_halter");
        register("blanket_native_halter");
        register("blanket_redplaid_halter");
        register("blanket_sky_halter");
        register("blanket_spider_halter");
        register("blanket_blueplaid_halter");
        register("blanket_greenplaid_halter");
        register("blanket_pattern_halter");
        register("blanket_sakura_halter");
        register("blanket_snow_halter");
        register("blanket_whiteplaid_halter");
    }

    public static void register(String name) {
        // Different from the default constructor in that it does not add "horse_armor_"
        // to the front of the name
        RegistryObject<HorseArmorItem> tackItem = ITEM_DEFERRED.register(
            name,
            () -> new HorseArmorItem(
                0,
                new ResourceLocation(HorseTack.MODID, "textures/entity/horse/armor/" + name + ".png"),
                (new Item.Properties()).stacksTo(1)
            )
        );

        items.add(tackItem);
    }
}
