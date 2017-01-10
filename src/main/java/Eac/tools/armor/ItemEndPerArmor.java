package Eac.tools.armor;

import Eac.reference.Reference;
import Eac.tools.ToolsEac;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemEndPerArmor extends ItemArmor {
    public ItemEndPerArmor(ArmorMaterial endperArmorMaterial, int armorType, String name) {
        super(endperArmorMaterial, 0, armorType);
        setTextureName(Reference.MOD_ID.toLowerCase() + ":" + name);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.tabCombat);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (stack.getItem() == ToolsEac.endperHelmet || stack.getItem() == ToolsEac.endperChestPlate || stack.getItem() == ToolsEac.endperBoots) {
            return Reference.MOD_ID.toLowerCase() + ":models/armor/endPerArmor1.png";
        } else if (stack.getItem() == ToolsEac.endperLegs) {
            return Reference.MOD_ID.toLowerCase() + ":models/armor/endPerArmor2.png";
        }
        return null;
    }

}
