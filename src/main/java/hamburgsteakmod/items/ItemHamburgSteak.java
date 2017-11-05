package hamburgsteakmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemHamburgSteak extends ItemFood
{
	public ItemHamburgSteak(int p_i45340_1_, boolean p_i45340_2_)
	{
		super(p_i45340_1_, p_i45340_2_);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setUnlocalizedName("hamburgSteak");
		this.setTextureName("hamburgsteakmod:hamburgsSeak");
		this.setMaxStackSize(64);
	}
}
