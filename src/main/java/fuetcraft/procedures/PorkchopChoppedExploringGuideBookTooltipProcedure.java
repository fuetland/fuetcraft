package fuetcraft.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

import fuetcraft.init.FuetcraftModItems;

public class PorkchopChoppedExploringGuideBookTooltipProcedure {
	public static String execute() {
		return (new ItemStack(FuetcraftModItems.EXPLORER_PORKCHOP_CHOPPED.get()).getDisplayName().getString()).substring(1, (int) ((new ItemStack(FuetcraftModItems.EXPLORER_PORKCHOP_CHOPPED.get()).getDisplayName().getString()).length() - 1)) + "\n"
				+ "\n" + Component.translatable("gui.guide.book.fuet.recipe").getString() + "\n" + "- "
				+ (new ItemStack(Items.PORKCHOP).getDisplayName().getString()).substring(1, (int) ((new ItemStack(Items.PORKCHOP).getDisplayName().getString()).length() - 1)) + " + "
				+ (new ItemStack(Blocks.TORCHFLOWER).getDisplayName().getString()).substring(1, (int) ((new ItemStack(Blocks.TORCHFLOWER).getDisplayName().getString()).length() - 1));
	}
}
