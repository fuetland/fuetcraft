
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package fuetcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import fuetcraft.world.inventory.StufferGuiMenu;
import fuetcraft.world.inventory.GuideBookStufferMenu;
import fuetcraft.world.inventory.GuideBookPorkchopChoppedMenu;
import fuetcraft.world.inventory.GuideBookFuetMenu;
import fuetcraft.world.inventory.GuideBookCoverMenu;
import fuetcraft.world.inventory.GuideBookChopperMenu;
import fuetcraft.world.inventory.ChopperGuiMenu;

import fuetcraft.FuetcraftMod;

public class FuetcraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, FuetcraftMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<ChopperGuiMenu>> CHOPPER_GUI = REGISTRY.register("chopper_gui", () -> IMenuTypeExtension.create(ChopperGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<StufferGuiMenu>> STUFFER_GUI = REGISTRY.register("stuffer_gui", () -> IMenuTypeExtension.create(StufferGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<GuideBookCoverMenu>> GUIDE_BOOK_COVER = REGISTRY.register("guide_book_cover", () -> IMenuTypeExtension.create(GuideBookCoverMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<GuideBookFuetMenu>> GUIDE_BOOK_FUET = REGISTRY.register("guide_book_fuet", () -> IMenuTypeExtension.create(GuideBookFuetMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<GuideBookChopperMenu>> GUIDE_BOOK_CHOPPER = REGISTRY.register("guide_book_chopper", () -> IMenuTypeExtension.create(GuideBookChopperMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<GuideBookStufferMenu>> GUIDE_BOOK_STUFFER = REGISTRY.register("guide_book_stuffer", () -> IMenuTypeExtension.create(GuideBookStufferMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<GuideBookPorkchopChoppedMenu>> GUIDE_BOOK_PORKCHOP_CHOPPED = REGISTRY.register("guide_book_porkchop_chopped", () -> IMenuTypeExtension.create(GuideBookPorkchopChoppedMenu::new));
}
