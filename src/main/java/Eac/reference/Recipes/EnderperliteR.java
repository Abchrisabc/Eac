package Eac.reference.Recipes;

import Eac.block.BlockEac;
import Eac.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class EnderperliteR extends Recipes{
    public static void recipe(){
        GameRegistry.addRecipe(new ItemStack(benderperlite, 2), new Object[]{
                "xx",
                "xx",
                'x', ModItems.enderperlite});
        //Tools
        GameRegistry.addRecipe(new ItemStack(endperaxe), new Object[]{
                "EE",
                "SE",
                "S ",
                'E', ModItems.ingotEnderperlite, 'S', Items.stick
        });
        GameRegistry.addRecipe(new ItemStack(endperaxe), new Object[]{
                "EE",
                "ES",
                " S",
                'E', ModItems.ingotEnderperlite, 'S', Items.stick
        });
        GameRegistry.addRecipe(new ItemStack(endperpick), new Object[]{
                "EEE",
                " S ",
                " S ",
                'E', ModItems.ingotEnderperlite, 'S', Items.stick
        });
        GameRegistry.addRecipe(new ItemStack(endperspade), new Object[]{
                "E",
                "S",
                "S",
                'E', ModItems.ingotEnderperlite, 'S', Items.stick
        });
        GameRegistry.addRecipe(new ItemStack(endpersword), new Object[]{
                "E",
                "E",
                "S",
                'E', ModItems.ingotEnderperlite, 'S', Items.stick
        });
        GameRegistry.addRecipe(new ItemStack(endperhoe), new Object[]{
                "EE",
                "S ",
                "S ",
                'E', ModItems.ingotEnderperlite, 'S', Items.stick
        });
        GameRegistry.addRecipe(new ItemStack(endperhoe), new Object[]{
                "EE",
                " S",
                " S",
                'E', ModItems.ingotEnderperlite, 'S', Items.stick
        });
        //armour
        GameRegistry.addRecipe(new ItemStack(endperHelmet), new Object[]{
                "EEE",
                "E E",
                'E', ModItems.ingotEnderperlite
        });
        GameRegistry.addRecipe(new ItemStack(endperChestPlate), new Object[]{
                "E E",
                "EEE",
                "EEE",
                'E', ModItems.ingotEnderperlite
        });
        GameRegistry.addRecipe(new ItemStack(endperLegs), new Object[]{
                "EEE",
                "E E",
                "E E",
                'E', ModItems.ingotEnderperlite
        });
        GameRegistry.addRecipe(new ItemStack(endperBoots), new Object[]{
                "E E",
                "E E",
                'E', ModItems.ingotEnderperlite
        });
        GameRegistry.addRecipe(new ItemStack(ModItems.cEnderperlite, 2), new Object[]{
                "FDF",
                "DCL",
                "GSG",
                'F', Items.flint_and_steel, 'D', Items.diamond, 'C', ModItems.mEnderperlite, 'L', Items.flint, 'G', Blocks.gold_block, 'S', Items.diamond_sword
        });
        GameRegistry.addRecipe(new ItemStack(ModItems.cEnderperlite, 2), new Object[]{
                "FDF",
                "LCD",
                "GSG",
                'F', Items.flint_and_steel, 'D', Items.diamond, 'C', ModItems.mEnderperlite, 'L', Items.flint, 'G', Blocks.gold_block, 'S', Items.diamond_sword
        });
        GameRegistry.addRecipe(new ItemStack(ModItems.cEnderperlite, 2), new Object[]{
                "FLF",
                "DCD",
                "GSG",
                'F', Items.flint_and_steel, 'D', Items.diamond, 'C', ModItems.mEnderperlite, 'L', Items.flint, 'G', Blocks.gold_block, 'S', Items.diamond_sword
        });
    }
    public static void shapeless(){

    }

    // No Other Compatible Mods for Custom crafting, using Vanilla Recipes now.
    public static void nocm(){
        GameRegistry.addRecipe(new ItemStack(ModItems.ingotEnderperlite), new Object[]{
                "IWI",
                "CCC",
                "IWI",
                'I', Blocks.ice , 'W', Items.water_bucket, 'C', ModItems.cEnderperlite
        });
        //Smelting
        GameRegistry.addSmelting(new ItemStack(ModItems.enderperlite), new ItemStack(ModItems.mEnderperlite), 8.0F);
    }
}