package Eac.tools;

import Eac.Eac;
import Eac.handler.ConfigHandler;
import Eac.tools.Air.*;
import Eac.tools.EnderPerlite.*;
import Eac.tools.Other.ItemAerSword;
import Eac.tools.Other.ItemBladedBlood;
import Eac.tools.Shadow.*;
import Eac.tools.armor.ItemAirArmor;
import Eac.tools.armor.ItemEndPerArmor;
import Eac.tools.armor.ItemShadowArmor;
import cpw.mods.fml.common.registry.GameRegistry;

public class ToolsEac extends Eac
{
	public static void init()
	{
		// Misc Tools
		bladedblood = new ItemBladedBlood(enderblood);
		aersword = new ItemAerSword(aerial);
		// Air Tools
		airpick = new ItemAirPick(airToolMaterial);
		airaxe = new ItemAirAxe(airToolMaterial);
		airsword = new ItemAirSword(airToolMaterial);
		airspade = new ItemAirSpade(airToolMaterial);
		airhoe = new ItemAirHoe(airToolMaterial);
		// Shadow Tools
		shadowpick = new ItemShadowPick(shadowToolMaterial);
		shadowaxe = new ItemShadowAxe(shadowToolMaterial);
		shadowsword = new ItemShadowSword(shadowToolMaterial);
		shadowspade = new ItemShadowSpade(shadowToolMaterial);
		shadowhoe = new ItemShadowHoe(shadowToolMaterial);
		// Enderperlite Tools
		endperpick = new ItemEndPerPick(enderPerliteToolMaterial);
		endperaxe = new ItemEndPerAxe(enderPerliteToolMaterial);
		endpersword = new ItemEndPerSword(enderPerliteToolMaterial);
		endperspade = new ItemEndPerSpade(enderPerliteToolMaterial);
		endperhoe = new ItemEndPerHoe(enderPerliteToolMaterial);
		// Air Armor
		airHelmet = new ItemAirArmor(airArmorMaterial, 0, "airHelmet");
		airChestPlate = new ItemAirArmor(airArmorMaterial, 1, "airChestPlate");
		airLegs = new ItemAirArmor(airArmorMaterial, 2, "airLegs");
		airBoots = new ItemAirArmor(airArmorMaterial, 3, "airBoots");
		// Shadow Armor
		shadowHelmet = new ItemShadowArmor(shadowArmorMaterial, 0, "shadowHelmet");
		shadowChestPlate = new ItemShadowArmor(shadowArmorMaterial, 1, "shadowChestPlate");
		shadowLegs = new ItemShadowArmor(shadowArmorMaterial, 2, "shadowLegs");
		shadowBoots = new ItemShadowArmor(shadowArmorMaterial, 3, "shadowBoots");
		// Enderperlite Armor
		endperHelmet = new ItemEndPerArmor(endperArmorMaterial, 0, "endperHelmet");
		endperChestPlate = new ItemEndPerArmor(endperArmorMaterial, 1, "endperChestPlate");
		endperLegs = new ItemEndPerArmor(endperArmorMaterial, 2, "endperLegs");
		endperBoots = new ItemEndPerArmor(endperArmorMaterial, 3, "endperBoots");
		// Misc Tools
		if (ConfigHandler.booleanBlood = true ) {
			GameRegistry.registerItem(bladedblood, "Dead_Blood_Blade");
		}
		GameRegistry.registerItem(aersword, "Aerial_Sword");
		// Air Tools
		GameRegistry.registerItem(airpick, "Air_Pickaxe");
		GameRegistry.registerItem(airaxe, "Air_Axe");
		GameRegistry.registerItem(airsword, "Air_Sword");
		GameRegistry.registerItem(airspade, "Air_Shovel");
		GameRegistry.registerItem(airhoe, "Air_Hoe");
		// Shadow Tools
		GameRegistry.registerItem(shadowpick, "Shadow_Pickaxe");
		GameRegistry.registerItem(shadowaxe, "Shadow_Axe");
		GameRegistry.registerItem(shadowsword, "Shadow_Sword");
		GameRegistry.registerItem(shadowspade, "Shadow_Shovel");
		GameRegistry.registerItem(shadowhoe, "Shadow_Hoe");
		// Enderperlite Tools
		GameRegistry.registerItem(endperpick, "Enderperlite_Pickaxe");
		GameRegistry.registerItem(endperaxe, "Enderperlite_Axe");
		GameRegistry.registerItem(endpersword, "Enderperlite_Sword");
		GameRegistry.registerItem(endperspade, "Enderperlite_Shovel");
		GameRegistry.registerItem(endperhoe, "Enderperlite_Hoe");
		// Air Armor
		GameRegistry.registerItem(airHelmet, "Air_Helmet");
		GameRegistry.registerItem(airChestPlate, "Air_Chestplate");
		GameRegistry.registerItem(airLegs, "Air_Leggings");
		GameRegistry.registerItem(airBoots, "Air_Boots");
		// Shadow Armor
		GameRegistry.registerItem(shadowHelmet, "Shadow_Helmet");
		GameRegistry.registerItem(shadowChestPlate, "Shadow_Chestplate");
		GameRegistry.registerItem(shadowLegs, "Shadow_Leggings");
		GameRegistry.registerItem(shadowBoots, "Shadow_Boots");
		// Enderperlite Armor
		GameRegistry.registerItem(endperHelmet, "EnderPerlite_Helmet");
		GameRegistry.registerItem(endperChestPlate, "EnderPerlite_Chestplate");
		GameRegistry.registerItem(endperLegs, "EnderPerlite_Leggings");
		GameRegistry.registerItem(endperBoots, "EnderPerlite_Boots");
	}

}
