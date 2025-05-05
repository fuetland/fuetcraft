package fuetcraft.procedures;

import net.minecraft.network.chat.Component;

public class GetTextFuetcraftProcedure {
	public static String execute() {
		return Component.translatable("item_group.fuetcraft.fuetcraft").getString();
	}
}
