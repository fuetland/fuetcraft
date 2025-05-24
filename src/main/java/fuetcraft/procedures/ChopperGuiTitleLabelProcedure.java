package fuetcraft.procedures;

import net.minecraft.network.chat.Component;

public class ChopperGuiTitleLabelProcedure {
	public static String execute() {
		return Component.translatable("block.fuetcraft.chopper").getString();
	}
}
