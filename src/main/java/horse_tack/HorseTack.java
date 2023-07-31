package sekelsta.horse_tack;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(HorseTack.MODID)
public class HorseTack
{
    public static final String MODID = "horse_tack";
    public static final Logger LOGGER = LogUtils.getLogger();

    public HorseTack() {
        ModItems.setup();
        ModItems.ITEM_DEFERRED.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModItems.TAB_DEFERRED.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
