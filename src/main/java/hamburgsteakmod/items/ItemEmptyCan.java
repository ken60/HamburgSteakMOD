package hamburgsteakmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemEmptyCan extends Item
{
	public ItemEmptyCan()
	{
		super();
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setUnlocalizedName("emptyCan");
		this.setTextureName("hamburgsteakmod:emptyCan");
		this.setMaxStackSize(1);
	}
}
