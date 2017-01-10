package Eac.reference;

import Eac.block.BlockEac;
import Eac.init.ModItems;
import ic2.api.recipe.RecipeInputItemStack;
import ic2.api.recipe.Recipes;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ic2Recipes {
    public static void init()
    {
        NBTTagCompound oreWashDataShadow = new NBTTagCompound();            oreWashDataShadow.setInteger("amount", 2000);
        NBTTagCompound oreThermDataShadow = new NBTTagCompound();           oreThermDataShadow.setInteger("minHeat", 3500);
        NBTTagCompound oreThermDataEnderPerlite = new NBTTagCompound();     oreThermDataEnderPerlite.setInteger("minHeat", 5000);
        NBTTagCompound oreWashDataEnderPerlite = new NBTTagCompound();      oreWashDataEnderPerlite.setInteger("amount", 4000);

        Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(BlockEac.benderperlite)), null, new ItemStack(ModItems.enderperlite, 2));
        Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(BlockEac.oreShadow)), null, new ItemStack(ModItems.cdustShadow, 2));
        Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(BlockEac.oreAir)), null, new ItemStack(ModItems.dustAir, 2));
        Recipes.oreWashing.addRecipe(new RecipeInputItemStack(new ItemStack(ModItems.cdustShadow)), oreWashDataShadow, new ItemStack(ModItems.pdustShadow));
        Recipes.centrifuge.addRecipe(new RecipeInputItemStack(new ItemStack(ModItems.pdustShadow)), oreThermDataShadow, new ItemStack(ModItems.dustShadow));
        Recipes.centrifuge.addRecipe(new RecipeInputItemStack(new ItemStack(ModItems.enderperlite)), oreThermDataEnderPerlite, new ItemStack(ModItems.mEnderperlite));
        Recipes.oreWashing.addRecipe(new RecipeInputItemStack(new ItemStack(ModItems.cEnderperlite)), oreWashDataEnderPerlite, new ItemStack(ModItems.ingotEnderperlite));
    }

    public static void shaped(){
        // Only loaded if IC2 Is here


    }
}
