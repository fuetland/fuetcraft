package fuetcraft.procedures;

import net.minecraft.world.entity.Entity;

public class GuideBookIngredientAnimation4Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("ingredientsAnimation") <= 180 && entity.getPersistentData().getDouble("ingredientsAnimation") > 120) {
			return true;
		}
		return false;
	}
}
