package fuetcraft.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

import fuetcraft.init.FuetcraftModItems;

public class PorkchopChoppedGuideBookTooltipProcedure {
	public static String execute() {
		return (new ItemStack(FuetcraftModItems.PORKCHOP_CHOPPED.get()).getDisplayName().getString()).substring(1, (int) ((new ItemStack(FuetcraftModItems.PORKCHOP_CHOPPED.get()).getDisplayName().getString()).length() - 1)) + "\n" + "\n"
				+ Component.translatable("gui.guide.book.fuet.recipe").getString() + "\n" + "- "
				+ (new ItemStack(Items.PORKCHOP).getDisplayName().getString()).substring(1, (int) ((new ItemStack(Items.PORKCHOP).getDisplayName().getString()).length() - 1));
	}
}
