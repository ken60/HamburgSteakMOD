package hamburgsteakmod.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipe
{
	public static void RegisterRecipe()
	{
		Misic();
		Food();
		Block();
		Tool();
		Armor();
		Furnace();
	}

	private static void Misic()
	{

	}

	private static void Food()
	{
		GameRegistry.addRecipe(new ItemStack(ModItems.rawHamburgSteak, 1),
				"BBB",
				"MEM",
				"BBB",
				'B', Items.beef,
				'E', Items.egg,
				'M', Items.milk_bucket
				);

		GameRegistry.addRecipe(new ItemStack(ModItems.hamburgSteakSauce, 1),
				" D ",
				" H ",
				"   ",
				'H', ModItems.hamburgSteak,
				'D', ModItems.demiglaceSauce
				);
	}

	private static void Block()
	{

	}

	private static void Tool()
	{

	}

	private static void Armor()
	{

	}

	private static void Furnace()
	{
		GameRegistry.addSmelting(ModItems.rawHamburgSteak, new ItemStack(ModItems.hamburgSteak), 2.0F);
	}
}
