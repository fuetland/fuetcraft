package fuetcraft.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

public class ChopperGuiTooltipSlot1TextProcedure {
	public static String execute() {
		return Component.translatable("gui.fuetcraft.chopper_gui.tooltip_slot1").getString() + "\n" + "\n" + "- "
				+ (new ItemStack(Items.GOLDEN_PICKAXE).getDisplayName().getString()).substring(1, (int) ((new ItemStack(Items.GOLDEN_PICKAXE).getDisplayName().getString()).length() - 1)) + "\n" + "- "
				+ (new ItemStack(Blocks.TORCHFLOWER).getDisplayName().getString()).substring(1, (int) ((new ItemStack(Blocks.TORCHFLOWER).getDisplayName().getString()).length() - 1)) + "\n" + "- "
				+ (new ItemStack(Items.ENDER_PEARL).getDisplayName().getString()).substring(1, (int) ((new ItemStack(Items.ENDER_PEARL).getDisplayName().getString()).length() - 1)) + "\n" + "- "
				+ (new ItemStack(Items.SALMON).getDisplayName().getString()).substring(1, (int) ((new ItemStack(Items.SALMON).getDisplayName().getString()).length() - 1)) + "\n" + "- "
				+ (new ItemStack(Items.NETHERITE_SCRAP).getDisplayName().getString()).substring(1, (int) ((new ItemStack(Items.NETHERITE_SCRAP).getDisplayName().getString()).length() - 1)) + "\n" + "- "
				+ (new ItemStack(Items.POISONOUS_POTATO).getDisplayName().getString()).substring(1, (int) ((new ItemStack(Items.POISONOUS_POTATO).getDisplayName().getString()).length() - 1));
	}
}
