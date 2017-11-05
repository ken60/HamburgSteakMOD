package hamburgsteakmod.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import hamburgsteakmod.items.ItemDemiglaceSauce;
import hamburgsteakmod.items.ItemEmptyCan;
import hamburgsteakmod.items.ItemHamburgSteak;
import hamburgsteakmod.items.ItemHamburgSteakSauce;
import hamburgsteakmod.items.ItemRawHamburgSteak;
import net.minecraft.item.Item;

public class ModItems
{
	public static Item hamburgSteak = new ItemHamburgSteak(5, false);
	public static Item hamburgSteakSauce = new ItemHamburgSteakSauce(10, false);
	public static Item rawHamburgSteak = new ItemRawHamburgSteak(0, false);
	public static Item demiglaceSauce = new ItemDemiglaceSauce(0, false);
	public static Item emptyCan = new ItemEmptyCan();

	public static void RegisterItem()
	{
		GameRegistry.registerItem(hamburgSteak, "hamburgSteak");
		GameRegistry.registerItem(hamburgSteakSauce, "hamburgSteakSauce");
		GameRegistry.registerItem(rawHamburgSteak, "rawHamburgSteak");
		GameRegistry.registerItem(demiglaceSauce, "demiglaceSauce");
		GameRegistry.registerItem(emptyCan, "emptyCan");
	}

	public static void SetLanguage()
	{
		LanguageRegistry.addName(hamburgSteak, "HamburgSteak");
		LanguageRegistry.addName(hamburgSteakSauce, "HamburgSteak Sauce");
		LanguageRegistry.addName(rawHamburgSteak, "Raw HamburgSteak");
		LanguageRegistry.addName(demiglaceSauce, "Demiglace Sauce");
		LanguageRegistry.addName(emptyCan, "Empty Can");
	}
}
