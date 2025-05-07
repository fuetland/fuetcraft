package fuetcraft.procedures;

import net.minecraft.world.entity.Entity;

public class GuideBookIngredientsAnimationThisGUIIsOpenedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("ingredientsAnimation", 360);
	}
}
