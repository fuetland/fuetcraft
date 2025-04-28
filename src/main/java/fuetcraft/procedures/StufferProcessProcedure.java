package fuetcraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class StufferProcessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		StufferCheckSlotContentsChangeProcedure.execute(world, x, y, z);
		ExecutionSummaryProcedure.execute();
	}
}
