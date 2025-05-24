package fuetcraft.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

public class ChopperInventorySlotAutomationPlaceConditionProcedure {
	public static boolean execute(ItemStack itemstack, double index) {
		if (index == 0 && Items.PORKCHOP == itemstack.getItem()) {
			return true;
		} else if (index == 1 && (Items.GOLDEN_PICKAXE == itemstack.getItem() || Blocks.TORCHFLOWER.asItem() == itemstack.getItem() || Items.ENDER_PEARL == itemstack.getItem() || Items.SALMON == itemstack.getItem()
				|| Items.NETHERITE_SCRAP == itemstack.getItem() || Items.POISONOUS_POTATO == itemstack.getItem())) {
			return true;
		}
		return false;
	}
}
