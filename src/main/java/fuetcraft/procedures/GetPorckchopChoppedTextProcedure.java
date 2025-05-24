package fuetcraft.procedures;

import net.minecraft.network.chat.Component;

public class GetPorckchopChoppedTextProcedure {
	public static String execute() {
		return Component.translatable("item.fuetcraft.porkchop_chopped").getString();
	}
}
