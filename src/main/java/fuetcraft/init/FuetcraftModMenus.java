
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package fuetcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import fuetcraft.world.inventory.StufferGuiMenu;
import fuetcraft.world.inventory.GuideBookStufferMenu;
import fuetcraft.world.inventory.GuideBookFuetMenu;
import fuetcraft.world.inventory.GuideBookCoverMenu;
import fuetcraft.world.inventory.GuideBookChopperMenu;
import fuetcraft.world.inventory.ChopperGuiMenu;

import fuetcraft.FuetcraftMod;

public class FuetcraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, FuetcraftMod.MODID);
	public static final RegistryObject<MenuType<ChopperGuiMenu>> CHOPPER_GUI = REGISTRY.register("chopper_gui", () -> IForgeMenuType.create(ChopperGuiMenu::new));
	public static final RegistryObject<MenuType<StufferGuiMenu>> STUFFER_GUI = REGISTRY.register("stuffer_gui", () -> IForgeMenuType.create(StufferGuiMenu::new));
	public static final RegistryObject<MenuType<GuideBookCoverMenu>> GUIDE_BOOK_COVER = REGISTRY.register("guide_book_cover", () -> IForgeMenuType.create(GuideBookCoverMenu::new));
	public static final RegistryObject<MenuType<GuideBookFuetMenu>> GUIDE_BOOK_FUET = REGISTRY.register("guide_book_fuet", () -> IForgeMenuType.create(GuideBookFuetMenu::new));
	public static final RegistryObject<MenuType<GuideBookChopperMenu>> GUIDE_BOOK_CHOPPER = REGISTRY.register("guide_book_chopper", () -> IForgeMenuType.create(GuideBookChopperMenu::new));
	public static final RegistryObject<MenuType<GuideBookStufferMenu>> GUIDE_BOOK_STUFFER = REGISTRY.register("guide_book_stuffer", () -> IForgeMenuType.create(GuideBookStufferMenu::new));
}
