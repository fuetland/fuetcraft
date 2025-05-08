
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package fuetcraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import fuetcraft.client.gui.StufferGuiScreen;
import fuetcraft.client.gui.GuideBookStufferScreen;
import fuetcraft.client.gui.GuideBookPorkchopChoppedScreen;
import fuetcraft.client.gui.GuideBookFuetScreen;
import fuetcraft.client.gui.GuideBookCoverScreen;
import fuetcraft.client.gui.GuideBookChopperScreen;
import fuetcraft.client.gui.ChopperGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FuetcraftModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(FuetcraftModMenus.CHOPPER_GUI.get(), ChopperGuiScreen::new);
			MenuScreens.register(FuetcraftModMenus.STUFFER_GUI.get(), StufferGuiScreen::new);
			MenuScreens.register(FuetcraftModMenus.GUIDE_BOOK_COVER.get(), GuideBookCoverScreen::new);
			MenuScreens.register(FuetcraftModMenus.GUIDE_BOOK_FUET.get(), GuideBookFuetScreen::new);
			MenuScreens.register(FuetcraftModMenus.GUIDE_BOOK_CHOPPER.get(), GuideBookChopperScreen::new);
			MenuScreens.register(FuetcraftModMenus.GUIDE_BOOK_STUFFER.get(), GuideBookStufferScreen::new);
			MenuScreens.register(FuetcraftModMenus.GUIDE_BOOK_PORKCHOP_CHOPPED.get(), GuideBookPorkchopChoppedScreen::new);
		});
	}
}
