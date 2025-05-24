package fuetcraft.procedures;

import net.minecraft.world.entity.Entity;

public class GuideBookIngredientAnimation2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("ingredientsAnimation") <= 300 && entity.getPersistentData().getDouble("ingredientsAnimation") > 240) {
			return true;
		}
		return false;
	}
}
