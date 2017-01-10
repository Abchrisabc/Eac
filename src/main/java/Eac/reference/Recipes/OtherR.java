package Eac.reference.Recipes;

import Eac.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class OtherR extends Recipes{
    public static void recipe(){
        GameRegistry.addRecipe(new ItemStack(aersword, 1), new Object[]{
                "DBD",
                "GBG",
                "ENE",
                'D', Items.diamond, 'B', Blocks.diamond_block, 'G', Items.gold_ingot, 'E', Items.ender_eye, 'N', Items.nether_star});
        GameRegistry.addRecipe(new ItemStack(bladedblood, 1), new Object[]{
                "B",
                "A",
                "C",
                'B', Blocks.diamond_block, 'A', ModItems.enderstar, 'C', Items.blaze_rod});
        GameRegistry.addRecipe(new ItemStack(ModItems.enderstar, 1), new Object[]{
                "DND",
                "NEN",
                "DND",
                'D', Blocks.diamond_block, 'N', Items.nether_star, 'E', Blocks.dragon_egg});
        // Activation Catalyst
        GameRegistry.addRecipe(new ItemStack(activationcatalyst, 1), new Object[]{
                "DXF",
                " B ",
                "III",
                'D', ModItems.dustAir, 'X', featherblock, 'F', Items.feather, 'B', Blocks.iron_block, 'I', Items.iron_ingot});
        GameRegistry.addRecipe(new ItemStack(activationcatalyst, 1), new Object[]{
                "FXD",
                " B ",
                "III",
                'D', ModItems.dustAir, 'X', featherblock, 'F', Items.feather, 'B', Blocks.iron_block, 'I', Items.iron_ingot});
        // Featherblock
        GameRegistry.addRecipe(new ItemStack(featherblock, 1), new Object[]{
                "FFF",
                "F F",
                "FFF",
                'F', Items.feather});
    }

    public static void shapeless(){
    }

    // No Other Compatible Mods for Custom crafting, using Vanilla Recipes now.
    public static void nocm(){
    }
}
