package hamburgsteakmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import hamburgsteakmod.registry.ModArmor;
import hamburgsteakmod.registry.ModBiome;
import hamburgsteakmod.registry.ModBlock;
import hamburgsteakmod.registry.ModDimension;
import hamburgsteakmod.registry.ModItem;
import hamburgsteakmod.registry.ModRecipe;

@Mod(modid = HamburgsSeakMod.MOD_ID, name = HamburgsSeakMod.MODNAME, version = HamburgsSeakMod.VERSION)
public class HamburgsSeakMod
{
	public static final String MOD_ID = "HamburgsSeakMod";
	public static final String MODNAME = "HamburgsSeakMod";
	public static final String VERSION = "0.0.1";

	@Instance
	public static HamburgsSeakMod instance = new HamburgsSeakMod();

	@EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		ModBlock.RegisterBlock();
		ModItem.RegisterItem();
		ModArmor.RegisterArmmor();
		ModDimension.RegisterDimension();
	}

	@EventHandler
	public void init(FMLInitializationEvent e)
	{
		ModBlock.SetLanguage();
		ModItem.SetLanguage();
		ModArmor.SetLanguage();

		ModRecipe.RegisterRecipe();
		ModBiome.RegisterBiome();
	}

	@EventHandler
	public void postInit (FMLPostInitializationEvent event)
	{

	}
}
