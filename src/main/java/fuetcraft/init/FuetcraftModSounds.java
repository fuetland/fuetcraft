
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fuetcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import fuetcraft.FuetcraftMod;

public class FuetcraftModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, FuetcraftMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> CHOPPER_PLACE = REGISTRY.register("chopper-place", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fuetcraft", "chopper-place")));
	public static final DeferredHolder<SoundEvent, SoundEvent> STUFFER_PLACE = REGISTRY.register("stuffer-place", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fuetcraft", "stuffer-place")));
	public static final DeferredHolder<SoundEvent, SoundEvent> STUFFER_CRAFTING = REGISTRY.register("stuffer-crafting", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fuetcraft", "stuffer-crafting")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CHOPPER_CRAFTING = REGISTRY.register("chopper-crafting", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fuetcraft", "chopper-crafting")));
	public static final DeferredHolder<SoundEvent, SoundEvent> THINKINGINFUETS = REGISTRY.register("thinkinginfuets", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fuetcraft", "thinkinginfuets")));
	public static final DeferredHolder<SoundEvent, SoundEvent> JOYFULIBERIANDANCE = REGISTRY.register("joyfuliberiandance", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fuetcraft", "joyfuliberiandance")));
}
