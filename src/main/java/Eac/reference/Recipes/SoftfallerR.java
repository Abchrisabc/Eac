package Eac.reference.Recipes;

import Eac.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class SoftfallerR extends Recipes{
    public static void recipe(){
        // T1
        GameRegistry.addRecipe(new ItemStack(softfaller, 1, 0), new Object[]{
                " F ",
                "FBF",
                " F ",
                'B', featherblock, 'F', Items.feather});
        // T2
        GameRegistry.addRecipe(new ItemStack(softfaller, 1, 1), new Object[]{
                " B ",
                "BTB",
                " B ",
                'B', featherblock, 'T', new ItemStack(softfaller, 1, 0)});
        // T3
        GameRegistry.addRecipe(new ItemStack(softfaller, 1, 2), new Object[]{
                " Y ",
                "XTX",
                " B ",
                'B', featherblock, 'X', new ItemStack(softfaller, 1, 0), 'Y', ModItems.dustAir, 'T', new ItemStack(softfaller, 1, 1)});
        // T3
        GameRegistry.addRecipe(new ItemStack(softfaller, 1, 2), new Object[]{
                " B ",
                "XTX",
                " Y ",
                'B', featherblock, 'X', new ItemStack(softfaller, 1, 0), 'Y', ModItems.dustAir, 'T', new ItemStack(softfaller, 1, 1)});
        // T4
        GameRegistry.addRecipe(new ItemStack(softfaller, 1, 3), new Object[]{
                "XXX",
                "XYX",
                "XXX",
                'X', new ItemStack(softfaller, 1, 0), 'Y', new ItemStack(softfaller, 1, 2)});
        // T5
        GameRegistry.addRecipe(new ItemStack(softfaller, 1, 4), new Object[]{
                "YXY",
                "YZY",
                " A ",
                'X', new ItemStack(softfaller, 1, 3), 'Y', new ItemStack(softfaller, 1, 1), 'Z', ModItems.dustAir, 'A', ModItems.cdustShadow});
        // T6
        GameRegistry.addRecipe(new ItemStack(softfaller, 1, 5), new Object[]{
                "YZY",
                "YAY",
                "XXX",
                'X', new ItemStack(softfaller, 1, 4), 'Y', ModItems.dustAirAct, 'Z', Items.feather, 'A', ModItems.pdustShadow});
        // T7
        GameRegistry.addRecipe(new ItemStack(softfaller, 1, 6), new Object[]{
                "YZY",
                "BXB",
                "YAY",
                'X', new ItemStack(softfaller, 1, 5), 'Y', new ItemStack(softfaller, 1, 1), 'Z', Items.feather, 'A', Blocks.anvil, 'B', featherblock});
        // T8
        GameRegistry.addRecipe(new ItemStack(softfaller, 1, 7), new Object[]{
                "YYY",
                "ZXZ",
                "ABA",
                'X', new ItemStack(softfaller, 1, 6), 'Y', ModItems.ingotShadow, 'Z', ModItems.enderperlite, 'A', Items.feather, 'B', Items.cooked_chicken});
    }

    public static void shapeless(){
    }

    public static void nocm(){
    }
}
