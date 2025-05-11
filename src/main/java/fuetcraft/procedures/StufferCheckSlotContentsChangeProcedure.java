package fuetcraft.procedures;

import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import fuetcraft.init.FuetcraftModItems;

public class StufferCheckSlotContentsChangeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).getCount() > 0 && itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).getCount() > 0) {
			if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == FuetcraftModItems.MINING_PORKCHOP_CHOPPED.get()
					&& !(GetProcessOutputItemProcedure.execute(world, x, y, z).getItem() == FuetcraftModItems.FUET_MINING.get())) {
				ResetVariablesProcedure.execute(world, x, y, z);
			} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == FuetcraftModItems.EXPLORER_PORKCHOP_CHOPPED.get()
					&& !(GetProcessOutputItemProcedure.execute(world, x, y, z).getItem() == FuetcraftModItems.FUET_EXPLORING.get())) {
				ResetVariablesProcedure.execute(world, x, y, z);
			} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == FuetcraftModItems.COMBAT_PORKCHOP_CHOPPED.get()
					&& !(GetProcessOutputItemProcedure.execute(world, x, y, z).getItem() == FuetcraftModItems.FUET_COMBAT.get())) {
				ResetVariablesProcedure.execute(world, x, y, z);
			} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == FuetcraftModItems.SWIMMING_PORKCHOP_CHOPPED.get()
					&& !(GetProcessOutputItemProcedure.execute(world, x, y, z).getItem() == FuetcraftModItems.FUET_SWIMMING.get())) {
				ResetVariablesProcedure.execute(world, x, y, z);
			} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == FuetcraftModItems.TARRADELLAS_PORKCHOP_CHOPPED.get()
					&& !(GetProcessOutputItemProcedure.execute(world, x, y, z).getItem() == FuetcraftModItems.FUET_TARRADELLAS.get())) {
				ResetVariablesProcedure.execute(world, x, y, z);
			} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == FuetcraftModItems.EXPIRED_PORKCHOP_CHOPPED.get()
					&& !(GetProcessOutputItemProcedure.execute(world, x, y, z).getItem() == FuetcraftModItems.FUET_EXPIRED.get())) {
				ResetVariablesProcedure.execute(world, x, y, z);
			} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == FuetcraftModItems.PORKCHOP_CHOPPED.get()
					&& !(GetProcessOutputItemProcedure.execute(world, x, y, z).getItem() == FuetcraftModItems.FUET.get())) {
				ResetVariablesProcedure.execute(world, x, y, z);
			}
		} else {
			ResetVariablesProcedure.execute(world, x, y, z);
		}
	}

	private static ItemStack itemFromBlockInventory(LevelAccessor world, BlockPos pos, int slot) {
		if (world instanceof ILevelExtension ext) {
			IItemHandler itemHandler = ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
			if (itemHandler != null)
				return itemHandler.getStackInSlot(slot);
		}
		return ItemStack.EMPTY;
	}
}
