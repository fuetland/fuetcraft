
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fuetcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import fuetcraft.item.TarradellasPorkchopChoppedItem;
import fuetcraft.item.SwimmingPorkchopChoppedItem;
import fuetcraft.item.PorkchopChoppedItem;
import fuetcraft.item.MiningPorkchopChoppedItem;
import fuetcraft.item.ExplorerPorkchopChoppedItem;
import fuetcraft.item.ExpiredPorkchopChoppedItem;
import fuetcraft.item.CombatPorkchopChoppedItem;

import fuetcraft.FuetcraftMod;

public class FuetcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FuetcraftMod.MODID);
	public static final RegistryObject<Item> CHOPPER = block(FuetcraftModBlocks.CHOPPER);
	public static final RegistryObject<Item> PORKCHOP_CHOPPED = REGISTRY.register("porkchop_chopped", () -> new PorkchopChoppedItem());
	public static final RegistryObject<Item> MINING_PORKCHOP_CHOPPED = REGISTRY.register("mining_porkchop_chopped", () -> new MiningPorkchopChoppedItem());
	public static final RegistryObject<Item> EXPLORER_PORKCHOP_CHOPPED = REGISTRY.register("explorer_porkchop_chopped", () -> new ExplorerPorkchopChoppedItem());
	public static final RegistryObject<Item> EXPIRED_PORKCHOP_CHOPPED = REGISTRY.register("expired_porkchop_chopped", () -> new ExpiredPorkchopChoppedItem());
	public static final RegistryObject<Item> SWIMMING_PORKCHOP_CHOPPED = REGISTRY.register("swimming_porkchop_chopped", () -> new SwimmingPorkchopChoppedItem());
	public static final RegistryObject<Item> COMBAT_PORKCHOP_CHOPPED = REGISTRY.register("combat_porkchop_chopped", () -> new CombatPorkchopChoppedItem());
	public static final RegistryObject<Item> TARRADELLAS_PORKCHOP_CHOPPED = REGISTRY.register("tarradellas_porkchop_chopped", () -> new TarradellasPorkchopChoppedItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
