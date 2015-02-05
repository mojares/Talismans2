package Talismans2.item.talismans;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import Talismans2.Talismans2;
import Talismans2.item.ItemTalismanBauble;
import Talismans2.lib.Names;
import baubles.api.BaubleType;

/**
 * @author Gigabit101
 */

public class ItemFlameTalisman extends ItemTalismanBauble {

	public ItemFlameTalisman()
	{
		super();
		this.setCreativeTab(Talismans2.tabsTalismans);
		this.setMaxStackSize(1);
		this.setUnlocalizedName(Names.NameFlameTalisman);
	}



	@Override
	// Returns Potion Effect on Tick
	public void onWornTick(ItemStack itemstack, EntityLivingBase player)
	{
		if (!player.isPotionActive(Potion.fireResistance)) {
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id,
					Integer.MAX_VALUE, 1, true, true));
		}
	}

	// Removes Potion effect on Unequip
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player)
	{
		player.removePotionEffect(Potion.fireResistance.id);
	}

	@Override
	public BaubleType getBaubleType(ItemStack arg0)
	{
		return BaubleType.AMULET;
	}

}
