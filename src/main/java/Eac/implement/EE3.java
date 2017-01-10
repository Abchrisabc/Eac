package Eac.implement;

import Eac.block.BlockEac;
import Eac.init.ModItems;
import Eac.tools.ToolsEac;
import com.pahimar.ee3.api.exchange.EnergyValueRegistryProxy;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class EE3 {
    public static void preInit() {
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ModItems.ingotair, 8192.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(BlockEac.featherblock, 384.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(BlockEac.airIngotBlock, 73728.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(BlockEac.oreAir, 16384.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ModItems.dustAir, 8144.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ModItems.dustAirAct, 8192.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(BlockEac.aAirDustBlock, 73728.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(BlockEac.airDustBlock, 73296.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(BlockEac.oreShadow, 65536.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ModItems.ingotShadow, 32768.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ModItems.dustShadow, 32768.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ModItems.pdustShadow, 31744.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ModItems.cdustShadow, 31711.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(new ItemStack(BlockEac.softfaller, 1, 0), 576.0F );
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(new ItemStack(BlockEac.softfaller, 1, 1), 2112.0F );
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(new ItemStack(BlockEac.softfaller, 1, 2), 11216.0F );
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(new ItemStack(BlockEac.softfaller, 1, 3), 15824.0F );
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(new ItemStack(BlockEac.softfaller, 1, 4), 64127.0F );
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(new ItemStack(BlockEac.softfaller, 1, 5), 256941.0F );
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(new ItemStack(BlockEac.softfaller, 1, 6), 274141.0F );
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(new ItemStack(BlockEac.softfaller, 1, 7), 634709.0F );
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(BlockEac.activationcatalyst, 11648.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ModItems.enderperlite, 131072.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(BlockEac.benderperlite, 262144.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(BlockEac.shadowIngotBlock, 294912.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ModItems.enderstar, 33947648.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ToolsEac.bladedblood, 34022912.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ToolsEac.aersword, 194304.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ToolsEac.shadowaxe, 98312.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ToolsEac.shadowpick, 98312.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ToolsEac.shadowspade, 32776.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ToolsEac.shadowhoe, 65544.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ToolsEac.shadowsword, 65540.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ToolsEac.airaxe, 24584.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ToolsEac.airpick, 24584.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ToolsEac.airspade, 8200.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ToolsEac.airhoe, 16392.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ToolsEac.airsword, 16388.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ToolsEac.endperaxe, 393224.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ToolsEac.endperpick, 393224.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ToolsEac.endperspade, 131080.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ToolsEac.endperhoe, 262152.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ToolsEac.endpersword, 262148.0F);

        //Minecraft items
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(Blocks.dragon_egg, 33554432.0F);
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(Items.stick, 4.0F);
        //TODO Fix tools not registering stick EMC
    }

    public static void init() {

    }

    public static void postInit() {

    }

    public static void clientSide() {

    }

    public static void clientInit() {

    }
}
