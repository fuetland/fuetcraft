
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fuetcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import fuetcraft.FuetcraftMod;

public class FuetcraftModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FuetcraftMod.MODID);
	public static final RegistryObject<SoundEvent> CHOPPER_PLACE = REGISTRY.register("chopper-place", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("fuetcraft", "chopper-place")));
	public static final RegistryObject<SoundEvent> STUFFER_PLACE = REGISTRY.register("stuffer-place", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("fuetcraft", "stuffer-place")));
	public static final RegistryObject<SoundEvent> STUFFER_CRAFTING = REGISTRY.register("stuffer-crafting", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("fuetcraft", "stuffer-crafting")));
	public static final RegistryObject<SoundEvent> CHOPPER_CRAFTING = REGISTRY.register("chopper-crafting", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("fuetcraft", "chopper-crafting")));
}
