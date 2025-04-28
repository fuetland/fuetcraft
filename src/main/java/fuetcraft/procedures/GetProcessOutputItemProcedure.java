package fuetcraft.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import fuetcraft.network.FuetcraftModVariables;

import fuetcraft.init.FuetcraftModItems;
import fuetcraft.init.FuetcraftModBlocks;

public class GetProcessOutputItemProcedure {
	public static ItemStack execute(LevelAccessor world, double x, double y, double z) {
		if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, BlockPos.containing(x, y, z), FuetcraftModVariables.MapVariables.get(world).currentTypeOfFuet)).equals(FuetcraftModVariables.MapVariables.get(world).fuetNormal)) {
			return (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FuetcraftModBlocks.CHOPPER.get() ? new ItemStack(FuetcraftModItems.PORKCHOP_CHOPPED.get()) : new ItemStack(FuetcraftModItems.FUET.get());
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, BlockPos.containing(x, y, z), FuetcraftModVariables.MapVariables.get(world).currentTypeOfFuet)).equals(FuetcraftModVariables.MapVariables.get(world).fuetMining)) {
			return (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FuetcraftModBlocks.CHOPPER.get() ? new ItemStack(FuetcraftModItems.MINING_PORKCHOP_CHOPPED.get()) : new ItemStack(FuetcraftModItems.FUET_MINING.get());
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, BlockPos.containing(x, y, z), FuetcraftModVariables.MapVariables.get(world).currentTypeOfFuet)).equals(FuetcraftModVariables.MapVariables.get(world).fuetExploration)) {
			return (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FuetcraftModBlocks.CHOPPER.get() ? new ItemStack(FuetcraftModItems.EXPLORER_PORKCHOP_CHOPPED.get()) : new ItemStack(FuetcraftModItems.FUET_EXPLORING.get());
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, BlockPos.containing(x, y, z), FuetcraftModVariables.MapVariables.get(world).currentTypeOfFuet)).equals(FuetcraftModVariables.MapVariables.get(world).fuetCombat)) {
			return (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FuetcraftModBlocks.CHOPPER.get() ? new ItemStack(FuetcraftModItems.COMBAT_PORKCHOP_CHOPPED.get()) : new ItemStack(FuetcraftModItems.FUET_COMBAT.get());
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, BlockPos.containing(x, y, z), FuetcraftModVariables.MapVariables.get(world).currentTypeOfFuet)).equals(FuetcraftModVariables.MapVariables.get(world).fuetSwimming)) {
			return (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FuetcraftModBlocks.CHOPPER.get() ? new ItemStack(FuetcraftModItems.SWIMMING_PORKCHOP_CHOPPED.get()) : new ItemStack(FuetcraftModItems.FUET_SWIMMING.get());
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, BlockPos.containing(x, y, z), FuetcraftModVariables.MapVariables.get(world).currentTypeOfFuet)).equals(FuetcraftModVariables.MapVariables.get(world).fuetEspetec)) {
			return (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FuetcraftModBlocks.CHOPPER.get() ? new ItemStack(FuetcraftModItems.TARRADELLAS_PORKCHOP_CHOPPED.get()) : new ItemStack(FuetcraftModItems.FUET_TARRADELLAS.get());
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, BlockPos.containing(x, y, z), FuetcraftModVariables.MapVariables.get(world).currentTypeOfFuet)).equals(FuetcraftModVariables.MapVariables.get(world).fuetExpired)) {
			return (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FuetcraftModBlocks.CHOPPER.get() ? new ItemStack(FuetcraftModItems.EXPIRED_PORKCHOP_CHOPPED.get()) : new ItemStack(FuetcraftModItems.FUET_EXPIRED.get());
		}
		return new ItemStack(Blocks.AIR);
	}
}
