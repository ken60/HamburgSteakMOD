package hamburgsteakmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import hamburgsteakmod.registry.ModArmor;
import hamburgsteakmod.registry.ModBiome;
import hamburgsteakmod.registry.ModBlocks;
import hamburgsteakmod.registry.ModDimension;
import hamburgsteakmod.registry.ModItems;
import hamburgsteakmod.registry.ModRecipe;

@Mod(modid = HamburgSteakMod.MOD_ID, name = HamburgSteakMod.MODNAME, version = HamburgSteakMod.VERSION)
public class HamburgSteakMod
{
	public static final String MOD_ID = "hamburgsteakmod";
	public static final String MODNAME = "HamburgSteak Mod";
	public static final String VERSION = "0.0.1";

	@Instance
	public static HamburgSteakMod instance = new HamburgSteakMod();

	@EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		ModBlocks.RegisterBlock();
		ModItems.RegisterItem();
		ModArmor.RegisterArmmor();
		ModDimension.RegisterDimension();
	}

	@EventHandler
	public void init(FMLInitializationEvent e)
	{
		ModBlocks.SetLanguage();
		ModItems.SetLanguage();
		ModArmor.SetLanguage();

		ModRecipe.RegisterRecipe();
		ModBiome.RegisterBiome();
	}

	@EventHandler
	public void postInit (FMLPostInitializationEvent event)
	{

	}
}
