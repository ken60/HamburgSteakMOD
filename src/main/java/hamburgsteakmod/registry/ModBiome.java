package hamburgsteakmod.registry;

import hamburgsteakmod.biome.BiomeGenHamburgSteak;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;

public class ModBiome
{
	public static int biomeHamburgSteak_ID = 164;

    public static final BiomeGenBase biomeHamburgSteak = (new BiomeGenHamburgSteak(biomeHamburgSteak_ID))
    		.setColor(353825)
    		.setBiomeName("biomeHamburgSteak");


	public static void RegisterBiome()
	{
		BiomeManager.warmBiomes.add(new BiomeManager.BiomeEntry(biomeHamburgSteak, 1000000000));
	}
}
