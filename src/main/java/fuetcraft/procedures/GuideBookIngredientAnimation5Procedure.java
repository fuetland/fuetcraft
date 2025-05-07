package fuetcraft.procedures;

import net.minecraft.world.entity.Entity;

public class GuideBookIngredientAnimation5Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("ingredientsAnimation") <= 120 && entity.getPersistentData().getDouble("ingredientsAnimation") > 60) {
			return true;
		}
		return false;
	}
}
