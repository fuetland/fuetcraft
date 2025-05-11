package fuetcraft.procedures;

import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import fuetcraft.init.FuetcraftModItems;

public class ChopperCheckSlotContentsChangeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).getCount() > 0) {
			if (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).getCount() > 0) {
				if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == Items.GOLDEN_PICKAXE && !(GetProcessOutputItemProcedure.execute(world, x, y, z).getItem() == FuetcraftModItems.MINING_PORKCHOP_CHOPPED.get())) {
					ResetVariablesProcedure.execute(world, x, y, z);
				} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == Blocks.TORCHFLOWER.asItem()
						&& !(GetProcessOutputItemProcedure.execute(world, x, y, z).getItem() == FuetcraftModItems.EXPLORER_PORKCHOP_CHOPPED.get())) {
					ResetVariablesProcedure.execute(world, x, y, z);
				} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == Items.ENDER_PEARL
						&& !(GetProcessOutputItemProcedure.execute(world, x, y, z).getItem() == FuetcraftModItems.COMBAT_PORKCHOP_CHOPPED.get())) {
					ResetVariablesProcedure.execute(world, x, y, z);
				} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == Items.SALMON && !(GetProcessOutputItemProcedure.execute(world, x, y, z).getItem() == FuetcraftModItems.SWIMMING_PORKCHOP_CHOPPED.get())) {
					ResetVariablesProcedure.execute(world, x, y, z);
				} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == Items.NETHERITE_SCRAP
						&& !(GetProcessOutputItemProcedure.execute(world, x, y, z).getItem() == FuetcraftModItems.TARRADELLAS_PORKCHOP_CHOPPED.get())) {
					ResetVariablesProcedure.execute(world, x, y, z);
				} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == Items.POISONOUS_POTATO
						&& !(GetProcessOutputItemProcedure.execute(world, x, y, z).getItem() == FuetcraftModItems.EXPIRED_PORKCHOP_CHOPPED.get())) {
					ResetVariablesProcedure.execute(world, x, y, z);
				}
			} else {
				if (!(GetProcessOutputItemProcedure.execute(world, x, y, z).getItem() == FuetcraftModItems.PORKCHOP_CHOPPED.get())) {
					ResetVariablesProcedure.execute(world, x, y, z);
				}
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
