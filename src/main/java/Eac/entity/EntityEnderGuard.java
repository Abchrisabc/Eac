package Eac.entity;

import Eac.init.ModItems;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.item.Item;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityEnderGuard extends EntityEnderman {

    public EntityEnderGuard(World par1World) {
        super(par1World);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(120.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5477225684D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(40.0D);
    }

    @Override
    protected Item getDropItem() {
        return ModItems.enderperlite;
    }

    @Override
    protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
        Item item = this.getDropItem();

        if (item != null) {
            int j = this.rand.nextInt(2 + p_70628_2_);

            for (int k = 0; k < j; ++k) {
                this.dropItem(item, 1);
            }
        }
    }

    @Override
    public boolean getCanSpawnHere() {
        return this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL && this.isValidLightLevel() && super.getCanSpawnHere();
    }
}