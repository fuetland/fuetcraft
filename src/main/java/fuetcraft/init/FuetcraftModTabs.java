
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fuetcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import fuetcraft.FuetcraftMod;

public class FuetcraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FuetcraftMod.MODID);
	public static final RegistryObject<CreativeModeTab> FUETCRAFT = REGISTRY.register("fuetcraft",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.fuetcraft.fuetcraft")).icon(() -> new ItemStack(FuetcraftModItems.FUET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FuetcraftModItems.PORKCHOP_CHOPPED.get());
				tabData.accept(FuetcraftModItems.MINING_PORKCHOP_CHOPPED.get());
				tabData.accept(FuetcraftModItems.EXPLORER_PORKCHOP_CHOPPED.get());
				tabData.accept(FuetcraftModItems.SWIMMING_PORKCHOP_CHOPPED.get());
				tabData.accept(FuetcraftModItems.COMBAT_PORKCHOP_CHOPPED.get());
				tabData.accept(FuetcraftModItems.EXPIRED_PORKCHOP_CHOPPED.get());
				tabData.accept(FuetcraftModItems.TARRADELLAS_PORKCHOP_CHOPPED.get());
				tabData.accept(FuetcraftModItems.FUET.get());
				tabData.accept(FuetcraftModItems.FUET_MINING.get());
				tabData.accept(FuetcraftModItems.FUET_EXPLORING.get());
				tabData.accept(FuetcraftModItems.FUET_SWIMMING.get());
				tabData.accept(FuetcraftModItems.FUET_COMBAT.get());
				tabData.accept(FuetcraftModItems.FUET_EXPIRED.get());
				tabData.accept(FuetcraftModItems.FUET_TARRADELLAS.get());
				tabData.accept(FuetcraftModBlocks.CHOPPER.get().asItem());
				tabData.accept(FuetcraftModBlocks.STUFFER.get().asItem());
				tabData.accept(FuetcraftModItems.GUIDE_BOOK.get());
			}).withSearchBar().build());
}
