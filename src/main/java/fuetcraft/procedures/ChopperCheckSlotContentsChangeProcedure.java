package fuetcraft.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

import fuetcraft.init.FuetcraftModItems;

public class ChopperCheckSlotContentsChangeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 0) > 0) {
			if (new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, BlockPos.containing(x, y, z), 1) > 0) {
				if ((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getItem() == Items.GOLDEN_PICKAXE && !(ChopperGetChoppedChopFromNBTProcedure.execute(world, x, y, z).getItem() == FuetcraftModItems.MINING_PORKCHOP_CHOPPED.get())) {
					ChopperResetVariablesProcedure.execute(world, x, y, z);
				} else if ((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getItem() == Blocks.TORCHFLOWER.asItem() && !(ChopperGetChoppedChopFromNBTProcedure.execute(world, x, y, z).getItem() == FuetcraftModItems.EXPLORER_PORKCHOP_CHOPPED.get())) {
					ChopperResetVariablesProcedure.execute(world, x, y, z);
				} else if ((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getItem() == Items.ENDER_PEARL && !(ChopperGetChoppedChopFromNBTProcedure.execute(world, x, y, z).getItem() == FuetcraftModItems.COMBAT_PORKCHOP_CHOPPED.get())) {
					ChopperResetVariablesProcedure.execute(world, x, y, z);
				} else if ((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getItem() == Items.SALMON && !(ChopperGetChoppedChopFromNBTProcedure.execute(world, x, y, z).getItem() == FuetcraftModItems.SWIMMING_PORKCHOP_CHOPPED.get())) {
					ChopperResetVariablesProcedure.execute(world, x, y, z);
				} else if ((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getItem() == Items.NETHERITE_SCRAP && !(ChopperGetChoppedChopFromNBTProcedure.execute(world, x, y, z).getItem() == FuetcraftModItems.TARRADELLAS_PORKCHOP_CHOPPED.get())) {
					ChopperResetVariablesProcedure.execute(world, x, y, z);
				} else if ((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getItem() == Items.POISONOUS_POTATO && !(ChopperGetChoppedChopFromNBTProcedure.execute(world, x, y, z).getItem() == FuetcraftModItems.EXPIRED_PORKCHOP_CHOPPED.get())) {
					ChopperResetVariablesProcedure.execute(world, x, y, z);
				}
			} else {
				if (!(ChopperGetChoppedChopFromNBTProcedure.execute(world, x, y, z).getItem() == FuetcraftModItems.PORKCHOP_CHOPPED.get())) {
					ChopperResetVariablesProcedure.execute(world, x, y, z);
				}
			}
		} else {
			ChopperResetVariablesProcedure.execute(world, x, y, z);
		}
	}
}
