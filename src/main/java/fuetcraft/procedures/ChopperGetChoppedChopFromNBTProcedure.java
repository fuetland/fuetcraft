package fuetcraft.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import fuetcraft.network.FuetcraftModVariables;

import fuetcraft.init.FuetcraftModItems;

public class ChopperGetChoppedChopFromNBTProcedure {
	public static ItemStack execute(LevelAccessor world, double x, double y, double z) {
		if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, BlockPos.containing(x, y, z), FuetcraftModVariables.MapVariables.get(world).currentTypeOfFuet)).equals(FuetcraftModVariables.MapVariables.get(world).fuetNormal)) {
			return new ItemStack(FuetcraftModItems.PORKCHOP_CHOPPED.get());
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, BlockPos.containing(x, y, z), FuetcraftModVariables.MapVariables.get(world).currentTypeOfFuet)).equals(FuetcraftModVariables.MapVariables.get(world).fuetMining)) {
			return new ItemStack(FuetcraftModItems.MINING_PORKCHOP_CHOPPED.get());
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, BlockPos.containing(x, y, z), FuetcraftModVariables.MapVariables.get(world).currentTypeOfFuet)).equals(FuetcraftModVariables.MapVariables.get(world).fuetExploration)) {
			return new ItemStack(FuetcraftModItems.EXPLORER_PORKCHOP_CHOPPED.get());
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, BlockPos.containing(x, y, z), FuetcraftModVariables.MapVariables.get(world).currentTypeOfFuet)).equals(FuetcraftModVariables.MapVariables.get(world).fuetCombat)) {
			return new ItemStack(FuetcraftModItems.COMBAT_PORKCHOP_CHOPPED.get());
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, BlockPos.containing(x, y, z), FuetcraftModVariables.MapVariables.get(world).currentTypeOfFuet)).equals(FuetcraftModVariables.MapVariables.get(world).fuetSwimming)) {
			return new ItemStack(FuetcraftModItems.SWIMMING_PORKCHOP_CHOPPED.get());
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, BlockPos.containing(x, y, z), FuetcraftModVariables.MapVariables.get(world).currentTypeOfFuet)).equals(FuetcraftModVariables.MapVariables.get(world).fuetEspetec)) {
			return new ItemStack(FuetcraftModItems.TARRADELLAS_PORKCHOP_CHOPPED.get());
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, BlockPos.containing(x, y, z), FuetcraftModVariables.MapVariables.get(world).currentTypeOfFuet)).equals(FuetcraftModVariables.MapVariables.get(world).fuetExpired)) {
			return new ItemStack(FuetcraftModItems.EXPIRED_PORKCHOP_CHOPPED.get());
		}
		return new ItemStack(Blocks.AIR);
	}
}
