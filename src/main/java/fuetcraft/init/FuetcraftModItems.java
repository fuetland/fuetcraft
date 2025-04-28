
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
import fuetcraft.item.FuetTarradellasItem;
import fuetcraft.item.FuetSwimmingItem;
import fuetcraft.item.FuetMiningItem;
import fuetcraft.item.FuetItem;
import fuetcraft.item.FuetExploringItem;
import fuetcraft.item.FuetExpiredItem;
import fuetcraft.item.FuetCombatItem;
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
	public static final RegistryObject<Item> FUET = REGISTRY.register("fuet", () -> new FuetItem());
	public static final RegistryObject<Item> STUFFER = block(FuetcraftModBlocks.STUFFER);
	public static final RegistryObject<Item> FUET_COMBAT = REGISTRY.register("fuet_combat", () -> new FuetCombatItem());
	public static final RegistryObject<Item> FUET_EXPIRED = REGISTRY.register("fuet_expired", () -> new FuetExpiredItem());
	public static final RegistryObject<Item> FUET_EXPLORING = REGISTRY.register("fuet_exploring", () -> new FuetExploringItem());
	public static final RegistryObject<Item> FUET_MINING = REGISTRY.register("fuet_mining", () -> new FuetMiningItem());
	public static final RegistryObject<Item> FUET_SWIMMING = REGISTRY.register("fuet_swimming", () -> new FuetSwimmingItem());
	public static final RegistryObject<Item> FUET_TARRADELLAS = REGISTRY.register("fuet_tarradellas", () -> new FuetTarradellasItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
