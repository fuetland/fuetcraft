
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package fuetcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import fuetcraft.world.inventory.ChopperGuiMenu;

import fuetcraft.FuetcraftMod;

public class FuetcraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, FuetcraftMod.MODID);
	public static final RegistryObject<MenuType<ChopperGuiMenu>> CHOPPER_GUI = REGISTRY.register("chopper_gui", () -> IForgeMenuType.create(ChopperGuiMenu::new));
}
