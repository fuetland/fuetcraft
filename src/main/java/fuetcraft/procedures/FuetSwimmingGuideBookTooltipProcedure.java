package fuetcraft.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

import fuetcraft.init.FuetcraftModItems;

public class FuetSwimmingGuideBookTooltipProcedure {
	public static String execute() {
		return (new ItemStack(FuetcraftModItems.FUET_SWIMMING.get()).getDisplayName().getString()).substring(1, (int) ((new ItemStack(FuetcraftModItems.FUET_SWIMMING.get()).getDisplayName().getString()).length() - 1)) + "\n" + "\n"
				+ Component.translatable("gui.guide.book.fuet.recipe").getString() + "\n" + "- "
				+ (new ItemStack(FuetcraftModItems.SWIMMING_PORKCHOP_CHOPPED.get()).getDisplayName().getString()).substring(1, (int) ((new ItemStack(FuetcraftModItems.SWIMMING_PORKCHOP_CHOPPED.get()).getDisplayName().getString()).length() - 1))
				+ " + " + (new ItemStack(Items.LEATHER).getDisplayName().getString()).substring(1, (int) ((new ItemStack(Items.LEATHER).getDisplayName().getString()).length() - 1)) + "\n" + "\n"
				+ Component.translatable("gui.guide.book.fuet.effects").getString() + "\n" + Component.translatable("gui.guide.book.fuet.swimming.effect.1").getString() + "\n"
				+ Component.translatable("gui.guide.book.fuet.swimming.effect.2").getString();
	}
}
