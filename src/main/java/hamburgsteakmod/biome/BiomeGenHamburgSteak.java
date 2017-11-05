package hamburgsteakmod.biome;

import java.util.Random;

import hamburgsteakmod.registry.ModBlocks;
import hamburgsteakmod.world.gen.WorldGenMeatTree;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class BiomeGenHamburgSteak extends BiomeGenBase
{
	protected static final WorldGenMeatTree field_150634_aD = new WorldGenMeatTree(false);

	public BiomeGenHamburgSteak(int p_i1986_1_)
	{
        super(p_i1986_1_);
        this.topBlock = ModBlocks.blockJuicyMeatBlock;
        this.fillerBlock = ModBlocks.blockHardMeatBlock;
		this.theBiomeDecorator.treesPerChunk = 10;
		this.setHeight(height_LowIslands);
		this.setDisableRain();
    }

	public WorldGenAbstractTree func_150567_a(Random p_150567_1_)
	{
		return (WorldGenAbstractTree) this.field_150634_aD;
	}
}
