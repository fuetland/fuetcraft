package fuetcraft.procedures;

import net.minecraft.network.chat.Component;

public class GetSlot1TextProcedure {
	public static String execute() {
		return Component.translatable("text.slot.1").getString();
	}
}
