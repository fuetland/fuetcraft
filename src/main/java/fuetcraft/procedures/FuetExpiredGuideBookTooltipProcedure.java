package fuetcraft.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

import fuetcraft.init.FuetcraftModItems;

public class FuetExpiredGuideBookTooltipProcedure {
	public static String execute() {
		return (new ItemStack(FuetcraftModItems.FUET_EXPIRED.get()).getDisplayName().getString()).substring(1, (int) ((new ItemStack(FuetcraftModItems.FUET_EXPIRED.get()).getDisplayName().getString()).length() - 1)) + "\n" + "\n"
				+ Component.translatable("gui.guide.book.fuet.recipe").getString() + "\n" + "- "
				+ (new ItemStack(FuetcraftModItems.EXPIRED_PORKCHOP_CHOPPED.get()).getDisplayName().getString()).substring(1, (int) ((new ItemStack(FuetcraftModItems.EXPIRED_PORKCHOP_CHOPPED.get()).getDisplayName().getString()).length() - 1)) + " + "
				+ (new ItemStack(Items.LEATHER).getDisplayName().getString()).substring(1, (int) ((new ItemStack(Items.LEATHER).getDisplayName().getString()).length() - 1)) + "\n" + "\n"
				+ Component.translatable("gui.guide.book.fuet.effects").getString() + "\n" + Component.translatable("gui.guide.book.fuet.expired.effect.1").getString() + "\n"
				+ Component.translatable("gui.guide.book.fuet.expired.effect.2").getString() + "\n" + Component.translatable("gui.guide.book.fuet.expired.effect.3").getString() + "\n"
				+ Component.translatable("gui.guide.book.fuet.expired.effect.4").getString() + "\n" + Component.translatable("gui.guide.book.fuet.expired.effect.5").getString();
	}
}
