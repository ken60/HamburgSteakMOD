package hamburgsteakmod.registry;

import net.minecraft.util.IIcon;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluid extends Fluid
{
	private IIcon theIIcon[];

	public ModFluid(String fluidName, int density, int viscosity)
	{
		super(fluidName);
		this.setDensity(density);
		this.setViscosity(viscosity);
		FluidRegistry.registerFluid(this);
	}
}
