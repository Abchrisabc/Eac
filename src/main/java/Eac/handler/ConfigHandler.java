package Eac.handler;

import Eac.reference.Reference;
import Eac.util.LogHelper;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{
    public static Configuration configuration;
    //public static boolean testValue = false;
    public static boolean booleanBlood = true;
    public static String oreShadowC = "oreMeurodite";
    public static String oreAirC = "orePlatinum";
    public static String itemPerliteC = "gemMythril";
    public static String ingotAirC = "ingotPlatinum";

    public static void init(File configFile)
    {
        // Create the config object from the given config file
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
            LogHelper.info("No config file found; generating a new one");

        }

    }

    private static void loadConfiguration() {
        //testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value");
        booleanBlood = configuration.getBoolean("booleanBlood", Configuration.CATEGORY_GENERAL, true, "Change whether the dead blood blade is enabled");
        oreAirC = configuration.getString("oreAir", Configuration.CATEGORY_GENERAL, "orePlatinum", "Define here the Ore dictionary name of Air Ore");
        ingotAirC = configuration.getString("ingotAir", Configuration.CATEGORY_GENERAL, "ingotPlatinum", "Define here the Ore dictionary name of Air Ingot");
        oreShadowC = configuration.getString("oreShadow", Configuration.CATEGORY_GENERAL, "oreMeurodite", "Define here the Ore dictionary name of Shadow Ore");
        itemPerliteC = configuration.getString("enderperlite", Configuration.CATEGORY_GENERAL, "gemMythril", "Define here the Ore dictionary name of Ender Perlite (Item)");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            //Resync configs
            loadConfiguration();
            LogHelper.info("Reloading Configuration");
        }
    }
}
