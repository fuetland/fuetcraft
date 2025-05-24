package fuetcraft.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import fuetcraft.network.FuetcraftModVariables;

public class RigthArrow100VisibilityProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (getBlockNBTLogic(world, BlockPos.containing(x, y, z), FuetcraftModVariables.MapVariables.get(world).processIsActive)) {
			if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), FuetcraftModVariables.MapVariables.get(world).processTimer) < 2
					&& getBlockNBTNumber(world, BlockPos.containing(x, y, z), FuetcraftModVariables.MapVariables.get(world).processTimer) >= 0) {
				return true;
			}
		}
		return false;
	}

	private static boolean getBlockNBTLogic(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getBoolean(tag);
		return false;
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDouble(tag);
		return -1;
	}
}
