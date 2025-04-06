
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fuetcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import fuetcraft.block.ChopperBlock;

import fuetcraft.FuetcraftMod;

public class FuetcraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FuetcraftMod.MODID);
	public static final RegistryObject<Block> CHOPPER = REGISTRY.register("chopper", () -> new ChopperBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
