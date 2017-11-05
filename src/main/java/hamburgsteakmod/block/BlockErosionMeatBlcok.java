package hamburgsteakmod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockErosionMeatBlcok extends BlockContainer
{
	public BlockErosionMeatBlcok()
	{
		super(Material.ground);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("erosionMeatBlcok");
		this.setResistance(6000000.0f);
		this.setHardness(6000000.0f);
		this.setHarvestLevel("shovel", 3);
		this.setStepSound(Block.soundTypeStone);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("hamburgsteakmod:erosionMeatBlcok");
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
	{
		return null;
	}
}