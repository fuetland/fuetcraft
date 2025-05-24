package fuetcraft.procedures;

import net.minecraft.world.entity.Entity;

public class GuideBookStufferThisGUIIsOpenedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("totalIngredientsAnimation", 420);
		entity.getPersistentData().putDouble("ingredientsAnimation", (entity.getPersistentData().getDouble("totalIngredientsAnimation")));
	}
}
