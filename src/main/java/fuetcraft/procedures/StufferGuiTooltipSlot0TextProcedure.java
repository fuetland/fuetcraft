package fuetcraft.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

import fuetcraft.init.FuetcraftModItems;

public class StufferGuiTooltipSlot0TextProcedure {
	public static String execute() {
		return Component.translatable("gui.fuetcraft.stuffer_gui.tooltip_slot0").getString() + "\n" + "\n" + "- "
				+ (new ItemStack(FuetcraftModItems.PORKCHOP_CHOPPED.get()).getDisplayName().getString()).substring(1, (int) ((new ItemStack(FuetcraftModItems.PORKCHOP_CHOPPED.get()).getDisplayName().getString()).length() - 1)) + "\n" + "- "
				+ (new ItemStack(FuetcraftModItems.MINING_PORKCHOP_CHOPPED.get()).getDisplayName().getString()).substring(1, (int) ((new ItemStack(FuetcraftModItems.MINING_PORKCHOP_CHOPPED.get()).getDisplayName().getString()).length() - 1)) + "\n"
				+ "- "
				+ (new ItemStack(FuetcraftModItems.EXPLORER_PORKCHOP_CHOPPED.get()).getDisplayName().getString()).substring(1, (int) ((new ItemStack(FuetcraftModItems.EXPLORER_PORKCHOP_CHOPPED.get()).getDisplayName().getString()).length() - 1))
				+ "\n" + "- "
				+ (new ItemStack(FuetcraftModItems.EXPIRED_PORKCHOP_CHOPPED.get()).getDisplayName().getString()).substring(1, (int) ((new ItemStack(FuetcraftModItems.EXPIRED_PORKCHOP_CHOPPED.get()).getDisplayName().getString()).length() - 1)) + "\n"
				+ "- "
				+ (new ItemStack(FuetcraftModItems.SWIMMING_PORKCHOP_CHOPPED.get()).getDisplayName().getString()).substring(1, (int) ((new ItemStack(FuetcraftModItems.SWIMMING_PORKCHOP_CHOPPED.get()).getDisplayName().getString()).length() - 1))
				+ "\n" + "- "
				+ (new ItemStack(FuetcraftModItems.COMBAT_PORKCHOP_CHOPPED.get()).getDisplayName().getString()).substring(1, (int) ((new ItemStack(FuetcraftModItems.COMBAT_PORKCHOP_CHOPPED.get()).getDisplayName().getString()).length() - 1)) + "\n"
				+ "- " + (new ItemStack(FuetcraftModItems.TARRADELLAS_PORKCHOP_CHOPPED.get()).getDisplayName().getString()).substring(1,
						(int) ((new ItemStack(FuetcraftModItems.TARRADELLAS_PORKCHOP_CHOPPED.get()).getDisplayName().getString()).length() - 1));
	}
}
