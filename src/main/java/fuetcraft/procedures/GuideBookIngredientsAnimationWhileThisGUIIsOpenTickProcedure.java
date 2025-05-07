package fuetcraft.procedures;

import net.minecraft.world.entity.Entity;

public class GuideBookIngredientsAnimationWhileThisGUIIsOpenTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("ingredientsAnimation") <= 1) {
			entity.getPersistentData().putDouble("ingredientsAnimation", 360);
		}
		entity.getPersistentData().putDouble("ingredientsAnimation", (entity.getPersistentData().getDouble("ingredientsAnimation") - 1));
	}
}
