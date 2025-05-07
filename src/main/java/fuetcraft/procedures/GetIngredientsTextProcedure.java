package fuetcraft.procedures;

import net.minecraft.network.chat.Component;

public class GetIngredientsTextProcedure {
	public static String execute() {
		return Component.translatable("text.ingredients").getString();
	}
}
