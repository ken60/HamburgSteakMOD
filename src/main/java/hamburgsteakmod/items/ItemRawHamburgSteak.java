package hamburgsteakmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemRawHamburgSteak extends ItemFood
{
	public ItemRawHamburgSteak(int p_i45340_1_, boolean p_i45340_2_)
	{
		super(p_i45340_1_, p_i45340_2_);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setUnlocalizedName("rawHamburgSteak");
		this.setTextureName("hamburgsteakmod:rawHamburgsSeak");
		this.setMaxStackSize(64);
	}

	protected void OnFoodEaten(ItemStack itemStack, World world, EntityPlayer entity)
	{
		if(entity instanceof EntityLivingBase) ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(17, 3600, 0));
	}
}
