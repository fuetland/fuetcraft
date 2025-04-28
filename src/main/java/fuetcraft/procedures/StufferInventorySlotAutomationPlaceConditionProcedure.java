package fuetcraft.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

import fuetcraft.init.FuetcraftModItems;

public class StufferInventorySlotAutomationPlaceConditionProcedure {
	public static boolean execute(ItemStack itemstack, double index) {
		if (index == 0 && (FuetcraftModItems.PORKCHOP_CHOPPED.get() == itemstack.getItem() || FuetcraftModItems.MINING_PORKCHOP_CHOPPED.get() == itemstack.getItem() || FuetcraftModItems.EXPLORER_PORKCHOP_CHOPPED.get() == itemstack.getItem()
				|| FuetcraftModItems.EXPIRED_PORKCHOP_CHOPPED.get() == itemstack.getItem() || FuetcraftModItems.SWIMMING_PORKCHOP_CHOPPED.get() == itemstack.getItem() || FuetcraftModItems.COMBAT_PORKCHOP_CHOPPED.get() == itemstack.getItem()
				|| FuetcraftModItems.TARRADELLAS_PORKCHOP_CHOPPED.get() == itemstack.getItem())) {
			return true;
		} else if (index == 1 && Items.LEATHER == itemstack.getItem()) {
			return true;
		}
		return false;
	}
}
