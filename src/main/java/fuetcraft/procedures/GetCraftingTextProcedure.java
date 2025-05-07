package fuetcraft.procedures;

import net.minecraft.network.chat.Component;

public class GetCraftingTextProcedure {
	public static String execute() {
		return Component.translatable("text.crafting").getString();
	}
}
