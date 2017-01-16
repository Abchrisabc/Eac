package Eac.reference.Recipes;

import Eac.block.BlockEac;
import Eac.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class AirR extends Recipes{
    public static void recipe(){
        GameRegistry.addRecipe(new ItemStack(airpick, 1), new Object[]{
                "III",
                " S ",
                " S ",
                'I', ModItems.ingotair, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(airaxe, 1), new Object[]{
                "II",
                "IS",
                " S",
                'I', ModItems.ingotair, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(airaxe, 1), new Object[]{
                "II",
                "SI",
                "S ",
                'I', ModItems.ingotair, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(airsword, 1), new Object[]{
                "I",
                "I",
                "S",
                'I', ModItems.ingotair, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(airspade, 1), new Object[]{
                "I",
                "S",
                "S",
                'I', ModItems.ingotair, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(airhoe, 1), new Object[]{
                "II",
                "S ",
                "S ",
                'I', ModItems.ingotair, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(airhoe, 1), new Object[]{
                "II",
                " S",
                " S",
                'I', ModItems.ingotair, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(airHelmet, 1), new Object[]{
                "III",
                "I I",
                'I', ModItems.ingotair});
        GameRegistry.addRecipe(new ItemStack(airChestPlate, 1), new Object[]{
                "I I",
                "III",
                "III",
                'I', ModItems.ingotair});
        GameRegistry.addRecipe(new ItemStack(airLegs, 1), new Object[]{
                "III",
                "I I",
                "I I",
                'I', ModItems.ingotair});
        GameRegistry.addRecipe(new ItemStack(airBoots, 1), new Object[]{
                "I I",
                "I I",
                'I', ModItems.ingotair});
        GameRegistry.addRecipe(new ItemStack(airDustBlock, 1), new Object[]{
                "DDD",
                "DDD",
                "DDD",
                'D', ModItems.dustAir});
        GameRegistry.addRecipe(new ItemStack(aAirDustBlock, 1), new Object[]{
                "DDD",
                "DDD",
                "DDD",
                'D', ModItems.dustAirAct});
        GameRegistry.addRecipe(new ItemStack(aAirDustBlock, 1), new Object[]{
                "FFF",
                "FDF",
                "FFF",
                'D', airDustBlock, 'F', Items.feather});
        GameRegistry.addRecipe(new ItemStack(airIngotBlock, 1), new Object[]{
                "III",
                "III",
                "III",
                'I', ModItems.ingotair});
    }

    public static void shapeless(){
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustAirAct, 1), new Object[]{ModItems.dustAir, Items.feather});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustAir, 9), new Object[]{airDustBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustAirAct, 9), new Object[]{aAirDustBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotair, 9), new Object[]{airIngotBlock});

        // Smelting Recipes
        GameRegistry.addSmelting(new ItemStack(ModItems.dustAirAct), new ItemStack(ModItems.ingotair), 1.0F);
    }

    // No Other Compatible Mods for Custom crafting, using Vanilla Recipes now.
    public static void nocm(){

        GameRegistry.addSmelting(new ItemStack(BlockEac.oreAir), new ItemStack(ModItems.dustAir), 1.0F);

    }
}
