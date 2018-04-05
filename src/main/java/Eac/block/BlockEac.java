package Eac.block;

import Eac.Eac;
import Eac.block.Air.BlockDustAir;
import Eac.block.Air.BlockDustaAir;
import Eac.block.Air.BlockIngotAir;
import Eac.block.Air.BlockOreAir;
import Eac.block.Other.BlockActivationCatalyst;
import Eac.block.Other.BlockEnderPerlite;
import Eac.block.Other.BlockFeather;
import Eac.block.Other.BlockSoftfall;
import Eac.block.Shadow.BlockIngotShadow;
import Eac.block.Shadow.BlockOreShadow;

public class BlockEac extends Eac {
    public static void init() {
        oreAir = new BlockOreAir();
        oreShadow = new BlockOreShadow();
        airIngotBlock = new BlockIngotAir();
        shadowIngotBlock = new BlockIngotShadow();
        airDustBlock = new BlockDustAir();
        aAirDustBlock = new BlockDustaAir();
        benderperlite = new BlockEnderPerlite();
        featherblock = new BlockFeather();
        softfaller = new BlockSoftfall();
        activationcatalyst = new BlockActivationCatalyst();
    }

}
