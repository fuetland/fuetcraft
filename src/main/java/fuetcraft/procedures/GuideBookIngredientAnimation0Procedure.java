package fuetcraft.procedures;

import net.minecraft.world.entity.Entity;

public class GuideBookIngredientAnimation0Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("ingredientsAnimation") <= 420 && entity.getPersistentData().getDouble("ingredientsAnimation") > 360) {
			return true;
		}
		return false;
	}
}
