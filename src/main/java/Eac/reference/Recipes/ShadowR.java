package Eac.reference.Recipes;

import Eac.block.BlockEac;
import Eac.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ShadowR extends Recipes{
    public static void recipe(){
        GameRegistry.addRecipe(new ItemStack(shadowpick, 1), new Object[]{
                "III",
                " S ",
                " S ",
                'I', ModItems.ingotShadow, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(shadowaxe, 1), new Object[]{
                "II",
                "IS",
                " S",
                'I', ModItems.ingotShadow, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(shadowaxe, 1), new Object[]{
                "II",
                "SI",
                "S ",
                'I', ModItems.ingotShadow, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(shadowsword, 1), new Object[]{
                "I",
                "I",
                "S",
                'I', ModItems.ingotShadow, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(shadowspade, 1), new Object[]{
                "I",
                "S",
                "S",
                'I', ModItems.ingotShadow, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(shadowhoe, 1), new Object[]{
                "II",
                "S ",
                "S ",
                'I', ModItems.ingotShadow, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(shadowhoe, 1), new Object[]{
                "II",
                " S",
                " S",
                'I', ModItems.ingotShadow, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(shadowHelmet, 1), new Object[]{
                "III",
                "I I",
                'I', ModItems.ingotShadow});
        GameRegistry.addRecipe(new ItemStack(shadowChestPlate, 1), new Object[]{
                "I I",
                "III",
                "III",
                'I', ModItems.ingotShadow});
        GameRegistry.addRecipe(new ItemStack(shadowLegs, 1), new Object[]{
                "III",
                "I I",
                "I I",
                'I', ModItems.ingotShadow});
        GameRegistry.addRecipe(new ItemStack(shadowBoots, 1), new Object[]{
                "I I",
                "I I",
                'I', ModItems.ingotShadow});
        GameRegistry.addRecipe(new ItemStack(shadowIngotBlock, 1), new Object[]{
                "III",
                "III",
                "III",
                'I', ModItems.ingotShadow});
    }

    public static void shapeless(){
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotShadow, 9), new Object[]{shadowIngotBlock});

        // Smelting Recipes
        GameRegistry.addSmelting(new ItemStack(ModItems.dustShadow), new ItemStack(ModItems.ingotShadow), 2.0F);
    }

    // No Other Compatible Mods for Custom crafting, using Vanilla Recipes now.
    public static void nocm(){

        // testing
        GameRegistry.addRecipe(new ItemStack(ModItems.cdustShadow, 2), new Object[]{
                "PSP",
                "RAR",
                'P', Blocks.piston, 'S', BlockEac.oreShadow, 'R', Blocks.redstone_torch, 'A', Blocks.anvil
        });


    }
}
