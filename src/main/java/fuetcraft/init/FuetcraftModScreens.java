
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package fuetcraft.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import fuetcraft.client.gui.StufferGuiScreen;
import fuetcraft.client.gui.GuideBookStufferScreen;
import fuetcraft.client.gui.GuideBookPorkchopChoppedScreen;
import fuetcraft.client.gui.GuideBookFuetScreen;
import fuetcraft.client.gui.GuideBookCoverScreen;
import fuetcraft.client.gui.GuideBookChopperScreen;
import fuetcraft.client.gui.ChopperGuiScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FuetcraftModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(FuetcraftModMenus.CHOPPER_GUI.get(), ChopperGuiScreen::new);
		event.register(FuetcraftModMenus.STUFFER_GUI.get(), StufferGuiScreen::new);
		event.register(FuetcraftModMenus.GUIDE_BOOK_COVER.get(), GuideBookCoverScreen::new);
		event.register(FuetcraftModMenus.GUIDE_BOOK_FUET.get(), GuideBookFuetScreen::new);
		event.register(FuetcraftModMenus.GUIDE_BOOK_CHOPPER.get(), GuideBookChopperScreen::new);
		event.register(FuetcraftModMenus.GUIDE_BOOK_STUFFER.get(), GuideBookStufferScreen::new);
		event.register(FuetcraftModMenus.GUIDE_BOOK_PORKCHOP_CHOPPED.get(), GuideBookPorkchopChoppedScreen::new);
	}
}
