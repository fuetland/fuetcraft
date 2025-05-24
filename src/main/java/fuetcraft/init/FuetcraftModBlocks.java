
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fuetcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;

import fuetcraft.block.StufferBlock;
import fuetcraft.block.ChopperBlock;

import fuetcraft.FuetcraftMod;

public class FuetcraftModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(FuetcraftMod.MODID);
	public static final DeferredBlock<Block> CHOPPER = register("chopper", ChopperBlock::new);
	public static final DeferredBlock<Block> STUFFER = register("stuffer", StufferBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}
