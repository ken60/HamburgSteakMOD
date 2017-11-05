package hamburgsteakmod.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import hamburgsteakmod.block.BlockDemiglaceSauce;
import hamburgsteakmod.block.BlockErosionMeatBlcok;
import hamburgsteakmod.block.BlockHardMeatBlock;
import hamburgsteakmod.block.BlockJuicyMeatBlock;
import hamburgsteakmod.block.BlockMeatTreeSapling;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;

public class ModBlocks
{
	public static Fluid demiglaceSauceFluid = new ModFluid("DemiglaceSauce", 10, 5000);

	public static Block blockJuicyMeatBlock = new BlockJuicyMeatBlock();
	public static Block blockHardMeatBlock = new BlockHardMeatBlock();
	public static Block blockErosionMeatBlcok = new BlockErosionMeatBlcok();
	public static Block blockDemiglaceSauce = new BlockDemiglaceSauce(demiglaceSauceFluid, Material.water);
	public static Block blockMeatTreeSapling = new BlockMeatTreeSapling();

	public static void RegisterBlock()
	{
		GameRegistry.registerBlock(blockJuicyMeatBlock, "blockJuicyMeatBlock");
		GameRegistry.registerBlock(blockHardMeatBlock, "blockHardMeatBlock");
		GameRegistry.registerBlock(blockErosionMeatBlcok, "blockErosionMeatBlcok");
		GameRegistry.registerBlock(blockDemiglaceSauce, "blockDemiglaceSauce");
		GameRegistry.registerBlock(blockMeatTreeSapling, "blockMeatTreeSapling");

		demiglaceSauceFluid.setIcons(ModBlocks.blockDemiglaceSauce.getIcon(0, 0));
        FluidContainerRegistry.registerFluidContainer(demiglaceSauceFluid, new ItemStack(ModItems.emptyCan));
	}

	public static void SetLanguage()
	{
		LanguageRegistry.addName(blockJuicyMeatBlock, "Juicy Meat Block");
		LanguageRegistry.addName(blockHardMeatBlock, "Hard Meat Block");
		LanguageRegistry.addName(blockErosionMeatBlcok, "Erosion Meat Blcok");
		LanguageRegistry.addName(blockDemiglaceSauce, "Demiglace Sauce");
		LanguageRegistry.addName(blockMeatTreeSapling, "Meat Tree Sapling");
	}
}
