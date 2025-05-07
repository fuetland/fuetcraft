package fuetcraft.procedures;

import net.minecraft.world.entity.Entity;

public class GuideBookIngredientAnimation1Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("ingredientsAnimation") <= 360 && entity.getPersistentData().getDouble("ingredientsAnimation") > 300) {
			return true;
		}
		return false;
	}
}
