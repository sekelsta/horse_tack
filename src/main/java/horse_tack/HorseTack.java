package sekelsta.horse_tack;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(HorseTack.MODID)
public class HorseTack
{
    public static final String MODID = "horse_tack";

    public HorseTack() {
        ModItems.ITEM_DEFERRED.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
