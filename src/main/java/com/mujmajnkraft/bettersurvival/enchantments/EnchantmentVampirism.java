package com.mujmajnkraft.bettersurvival.enchantments;

import com.mujmajnkraft.bettersurvival.Reference;
import com.mujmajnkraft.bettersurvival.config.ConfigHandler;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;

public class EnchantmentVampirism extends Enchantment {

	public EnchantmentVampirism() {
		super(Rarity.RARE, EnumEnchantmentType.WEAPON, new EntityEquipmentSlot[]{EntityEquipmentSlot.MAINHAND});
		this.setRegistryName("vampirism");
		this.setName(Reference.MOD_ID + ".vampirism");
	}
	
	@Override
	public int getMaxLevel()
    {
        return ConfigHandler.vampirismlevel;
    }
	
	public int getMinEnchantability(int enchantmentLevel)
    {
        return 10 + 15 * (enchantmentLevel - 1);
    }
	
	public int getMaxEnchantability(int enchantmentLevel)
    {
        return super.getMinEnchantability(enchantmentLevel) + 50;
    }
	
	public void onEntityDamaged(EntityLivingBase user, Entity target, int level)
    {
		if(user != null && target != null && !user.world.isRemote) {
			if(user.world.rand.nextFloat() < (float)level * 0.2F) {
				user.heal(Math.max(1.0F, (float)level * 0.2F));
			}
		}
    }
	
	public boolean isTreasureEnchantment()
    {
    	return ConfigHandler.vampirism;
    }
	
	public boolean isAllowedOnBooks()
    {
		return ConfigHandler.vampirismlevel != 0;
    }
}
