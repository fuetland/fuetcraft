package fuetcraft.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import fuetcraft.FuetcraftMod;

public class DefaultRigthArrowVisibilityProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		FuetcraftMod.LOGGER.info(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "isChopping"));
		if (new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "isChopping")) {
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "tickNumberUntilFinishingChopping") < 100 && new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "tickNumberUntilFinishingChopping") >= 0) {
				FuetcraftMod.LOGGER.info("B\u00E1sicamente procesando");
				return true;
			} else {
				FuetcraftMod.LOGGER.info("B\u00E1sicamente procesando otro");
				return false;
			}
		}
		FuetcraftMod.LOGGER.info("B\u00E1sicamente no choppea ");
		return true;
	}
}
