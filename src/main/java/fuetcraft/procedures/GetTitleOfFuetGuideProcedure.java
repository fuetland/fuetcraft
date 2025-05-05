package fuetcraft.procedures;

import net.minecraft.network.chat.Component;

public class GetTitleOfFuetGuideProcedure {
	public static String execute() {
		return Component.translatable("gui.guide.book.fuet.title").getString();
	}
}
