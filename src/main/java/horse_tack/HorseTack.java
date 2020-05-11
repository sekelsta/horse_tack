package sekelsta.horse_tack;

import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
//import org.apache.logging.log4j.Logger;

@Mod(modid = HorseTack.MODID, name = HorseTack.NAME, version = HorseTack.VERSION)
public class HorseTack
{
    public static final String MODID = "horse_tack";
    public static final String NAME = "Horse Tack";
    public static final String VERSION = "1.0.0";

    //private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //logger = event.getModLog();
        MinecraftForge.EVENT_BUS.register(ModItems.class);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        EnumHelper.addHorseArmor("decorative", "", 0);
        // some example code
        //logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
