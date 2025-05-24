
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fuetcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import fuetcraft.block.entity.StufferBlockEntity;
import fuetcraft.block.entity.ChopperBlockEntity;

import fuetcraft.FuetcraftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class FuetcraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, FuetcraftMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ChopperBlockEntity>> CHOPPER = register("chopper", FuetcraftModBlocks.CHOPPER, ChopperBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<StufferBlockEntity>> STUFFER = register("stuffer", FuetcraftModBlocks.STUFFER, StufferBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> new BlockEntityType(supplier, block.get()));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CHOPPER.get(), (blockEntity, side) -> blockEntity.getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, STUFFER.get(), (blockEntity, side) -> blockEntity.getItemHandler());
	}
}
