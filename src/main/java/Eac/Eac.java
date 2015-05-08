package Eac;

import Eac.block.BlockEac;
import Eac.block.OreGeneration.oregen;
import Eac.entity.EacEntity;
import Eac.handler.ConfigHandler;
import Eac.implement.ApiLoader;
import Eac.init.ModItems;
import Eac.init.achievements;
import Eac.proxy.IProxy;
import Eac.reference.OreDict;
import Eac.reference.Recipes.Recipes;
import Eac.reference.Reference;
import Eac.tools.ToolsEac;
import Eac.util.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = "Eac.client.gui.GuiFactory")
public class Eac
{
    @Mod.Instance("Eac")
    public static Eac instance;

    @Mod.Instance(Reference.MOD_ID)
    public static Eac mobInstance;

    @Mod.Instance(Reference.MOD_ID)
    public static Eac guiInstance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;
	// Misc Tools
	public static Item aersword;
	public static Item bladedblood;
	// Air Tools
	public static Item airpick;
	public static Item airaxe;
	public static Item airsword;
	public static Item airspade;
	public static Item airhoe;
	// Shadow Tools
	public static Item shadowpick;
	public static Item shadowaxe;
	public static Item shadowsword;
	public static Item shadowspade;
	public static Item shadowhoe;
	// Enderperlite Tools
	public static Item endperpick;
	public static Item endperaxe;
	public static Item endpersword;
	public static Item endperspade;
	public static Item endperhoe;
	// Air Armor
	public static Item airHelmet;
	public static Item airChestPlate;
	public static Item airLegs;
	public static Item airBoots;
	// Shadow Armor
	public static Item shadowHelmet;
	public static Item shadowChestPlate;
	public static Item shadowLegs;
	public static Item shadowBoots;
    // Block
	public static Block airIngotBlock;
	public static Block shadowIngotBlock;
	public static Block airDustBlock;
	public static Block aAirDustBlock;
    public static Block benderperlite;
    public static Block featherblock;
    public static Block activationcatalyst;
    public static Block softfaller;
	// Ore
	public static Block oreAir;
	public static Block oreShadow;
    // Achievements
    public static Achievement airoremined;
    public static Achievement shadoworemined;
	protected static ToolMaterial aerial = EnumHelper.addToolMaterial("Aerial", 4, 1600, 12.0F, 8.5F, 30);
	protected static ToolMaterial airToolMaterial = EnumHelper.addToolMaterial("AirTool", 3, 1600, 12.0F, 3.0F, 13);
	protected static ToolMaterial shadowToolMaterial = EnumHelper.addToolMaterial("ShadowTool", 4, 1850, 13.5F, 4.0F, 17);
	protected static ToolMaterial enderperliteToolMaterial = EnumHelper.addToolMaterial("EnderPerlite", 5, 2250, 15.0F, 5.0F, 21);
	protected static ToolMaterial enderblood = EnumHelper.addToolMaterial("EnderBlood", 6, 20000, 13.0F, 14.5F, 30);
	protected static ArmorMaterial airArmorMaterial = EnumHelper.addArmorMaterial("AirArmor", 45, new int[]
			{3, 8, 6, 3}, 30);
	protected static ArmorMaterial shadowArmorMaterial = EnumHelper.addArmorMaterial("ShadowArmor", 55, new int[]
			{5, 8, 7, 4}, 35);

    @EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());
        ToolsEac.init();
		BlockEac.init();
        ModItems.init();
		Recipes.init();
        proxy.registerRenderThings();
		oregen.init();
        EacEntity.init();
		OreDict.init();
		ApiLoader.preInit();
		LogHelper.info("Seeking What blocks to Steal from Steve");
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		ApiLoader.init();
		achievements.init();
		proxy.registerNetworkStuff();
        proxy.registerTileEntities();
        LogHelper.info("*teleports through the dimensions*");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
        LogHelper.info("Done Stealing Air and Shadow Blocks from Steve, Throwing away useless diamonds");
        LogHelper.info("*Teleports back to the End*");
	}

}
