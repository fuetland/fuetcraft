package fuetcraft.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

import fuetcraft.init.FuetcraftModItems;

public class FuetExploringGuideBookTooltipProcedure {
	public static String execute() {
		return (new ItemStack(FuetcraftModItems.FUET_EXPLORING.get()).getDisplayName().getString()).substring(1, (int) ((new ItemStack(FuetcraftModItems.FUET_EXPLORING.get()).getDisplayName().getString()).length() - 1)) + "\n" + "\n"
				+ Component.translatable("gui.guide.book.fuet.recipe").getString() + "\n" + "- "
				+ (new ItemStack(FuetcraftModItems.EXPLORER_PORKCHOP_CHOPPED.get()).getDisplayName().getString()).substring(1, (int) ((new ItemStack(FuetcraftModItems.EXPLORER_PORKCHOP_CHOPPED.get()).getDisplayName().getString()).length() - 1))
				+ " + " + (new ItemStack(Items.LEATHER).getDisplayName().getString()).substring(1, (int) ((new ItemStack(Items.LEATHER).getDisplayName().getString()).length() - 1)) + "\n" + "\n"
				+ Component.translatable("gui.guide.book.fuet.effects").getString() + "\n" + Component.translatable("gui.guide.book.fuet.exploring.effect.1").getString() + "\n"
				+ Component.translatable("gui.guide.book.fuet.exploring.effect.2").getString() + "\n" + Component.translatable("gui.guide.book.fuet.exploring.effect.3").getString();
	}
}
