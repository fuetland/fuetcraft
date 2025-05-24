package fuetcraft.procedures;

import net.minecraft.world.entity.Entity;

public class GuideBookIngredientAnimation6Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("ingredientsAnimation") <= 60 && entity.getPersistentData().getDouble("ingredientsAnimation") > 0) {
			return true;
		}
		return false;
	}
}
