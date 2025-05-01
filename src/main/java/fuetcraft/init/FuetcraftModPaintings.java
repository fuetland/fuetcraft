
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fuetcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import fuetcraft.FuetcraftMod;

public class FuetcraftModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, FuetcraftMod.MODID);
	public static final RegistryObject<PaintingVariant> PAINTING_OF_A_FUET = REGISTRY.register("painting_of_a_fuet", () -> new PaintingVariant(16, 32));
}
