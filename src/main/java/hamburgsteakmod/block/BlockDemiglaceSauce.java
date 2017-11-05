package hamburgsteakmod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockDemiglaceSauce extends BlockFluidClassic
{
	public BlockDemiglaceSauce(Fluid fluid, Material material)
	{
		super(fluid, material);
        this.setBlockName("demiglaceSauce");
        this.setCreativeTab(CreativeTabs.tabBlock);
	}

	@Override
    public IIcon getIcon(int par1, int par2)
	{
        return blockIcon;
    }

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("hamburgsteakmod:demiglaceSaucer_flow");
	}
}
