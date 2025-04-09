
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fuetcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import fuetcraft.FuetcraftMod;

public class FuetcraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FuetcraftMod.MODID);
	public static final RegistryObject<CreativeModeTab> FUETCRAFT = REGISTRY.register("fuetcraft",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.fuetcraft.fuetcraft")).icon(() -> new ItemStack(Items.DEBUG_STICK)).displayItems((parameters, tabData) -> {
				tabData.accept(FuetcraftModBlocks.CHOPPER.get().asItem());
			}).withSearchBar().build());
}
