
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fuetcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import java.util.function.Function;

import fuetcraft.item.inventory.GuideBookInventoryCapability;
import fuetcraft.item.TarradellasPorkchopChoppedItem;
import fuetcraft.item.SwimmingPorkchopChoppedItem;
import fuetcraft.item.PorkchopChoppedItem;
import fuetcraft.item.MiningPorkchopChoppedItem;
import fuetcraft.item.GuideBookItem;
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

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class FuetcraftModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(FuetcraftMod.MODID);
	public static final DeferredItem<Item> CHOPPER = block(FuetcraftModBlocks.CHOPPER);
	public static final DeferredItem<Item> PORKCHOP_CHOPPED = register("porkchop_chopped", PorkchopChoppedItem::new);
	public static final DeferredItem<Item> MINING_PORKCHOP_CHOPPED = register("mining_porkchop_chopped", MiningPorkchopChoppedItem::new);
	public static final DeferredItem<Item> EXPLORER_PORKCHOP_CHOPPED = register("explorer_porkchop_chopped", ExplorerPorkchopChoppedItem::new);
	public static final DeferredItem<Item> EXPIRED_PORKCHOP_CHOPPED = register("expired_porkchop_chopped", ExpiredPorkchopChoppedItem::new);
	public static final DeferredItem<Item> SWIMMING_PORKCHOP_CHOPPED = register("swimming_porkchop_chopped", SwimmingPorkchopChoppedItem::new);
	public static final DeferredItem<Item> COMBAT_PORKCHOP_CHOPPED = register("combat_porkchop_chopped", CombatPorkchopChoppedItem::new);
	public static final DeferredItem<Item> TARRADELLAS_PORKCHOP_CHOPPED = register("tarradellas_porkchop_chopped", TarradellasPorkchopChoppedItem::new);
	public static final DeferredItem<Item> FUET = register("fuet", FuetItem::new);
	public static final DeferredItem<Item> STUFFER = block(FuetcraftModBlocks.STUFFER);
	public static final DeferredItem<Item> FUET_COMBAT = register("fuet_combat", FuetCombatItem::new);
	public static final DeferredItem<Item> FUET_EXPIRED = register("fuet_expired", FuetExpiredItem::new);
	public static final DeferredItem<Item> FUET_EXPLORING = register("fuet_exploring", FuetExploringItem::new);
	public static final DeferredItem<Item> FUET_MINING = register("fuet_mining", FuetMiningItem::new);
	public static final DeferredItem<Item> FUET_SWIMMING = register("fuet_swimming", FuetSwimmingItem::new);
	public static final DeferredItem<Item> FUET_TARRADELLAS = register("fuet_tarradellas", FuetTarradellasItem::new);
	public static final DeferredItem<Item> GUIDE_BOOK = register("guide_book", GuideBookItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.registerItem(block.getId().getPath(), properties -> new BlockItem(block.get(), properties), new Item.Properties());
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.ItemHandler.ITEM, (stack, context) -> new GuideBookInventoryCapability(stack), GUIDE_BOOK.get());
	}
}
