package fuetcraft.procedures;

import net.minecraft.world.entity.Entity;

public class GuideBookIngredientAnimation3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("ingredientsAnimation") <= 240 && entity.getPersistentData().getDouble("ingredientsAnimation") > 180) {
			return true;
		}
		return false;
	}
}
