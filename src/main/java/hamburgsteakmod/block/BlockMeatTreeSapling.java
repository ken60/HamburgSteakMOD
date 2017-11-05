package hamburgsteakmod.block;

import java.util.Random;

import hamburgsteakmod.world.gen.WorldGenMeatTree;
import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class BlockMeatTreeSapling extends Block implements IGrowable
{
	protected static final WorldGenMeatTree field_150634_aD = new WorldGenMeatTree(false);

	protected BlockMeatTreeSapling(Material material)
	{
		super(material);
		this.setTickRandomly(true);
		float f = 0.4F;
		this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
		this.setCreativeTab(CreativeTabs.tabDecorations);
	}

	public BlockMeatTreeSapling()
	{
		this(Material.plants);
	}
	public void registerBlockIcons(IIconRegister p_149651_1_)
	{
		p_149651_1_.registerIcon("hamburgsteakmod:demiglaceSauce");
	}

	public void updateTick(World world, int x, int y, int z, Random random)
	{
		if (!field_150634_aD.generate(world, random, x, y, z))
		{
			world.setBlock(x, y, z, this, 0, 4);
		}
	}

	@Override
	public boolean func_149851_a(World p_149851_1_, int p_149851_2_, int p_149851_3_, int p_149851_4_, boolean p_149851_5_)
	{
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}

	@Override
	public boolean func_149852_a(World p_149852_1_, Random p_149852_2_, int p_149852_3_, int p_149852_4_, int p_149852_5_)
	{
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void func_149853_b(World p_149853_1_, Random p_149853_2_, int p_149853_3_, int p_149853_4_, int p_149853_5_)
	{
		// TODO 自動生成されたメソッド・スタブ

	}

}
