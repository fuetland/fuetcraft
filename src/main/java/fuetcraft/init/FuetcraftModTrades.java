
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package fuetcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class FuetcraftModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == FuetcraftModVillagerProfessions.CHOPPER_PROFESSION.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.BEEF),

					new ItemStack(Items.PORKCHOP), 25, 3, 0.03f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.MUTTON),

					new ItemStack(Items.PORKCHOP), 25, 3, 0.03f));
		}
		if (event.getType() == FuetcraftModVillagerProfessions.CHOPPER_PROFESSION.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.COD),

					new ItemStack(Items.SALMON), 20, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.POTATO), new ItemStack(Blocks.MOSS_BLOCK), new ItemStack(Items.POISONOUS_POTATO), 20, 5, 0.05f));
		}
		if (event.getType() == FuetcraftModVillagerProfessions.CHOPPER_PROFESSION.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.PORKCHOP),

					new ItemStack(FuetcraftModItems.PORKCHOP_CHOPPED.get()), 15, 7, 0.07f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.RAW_GOLD, 3),

					new ItemStack(FuetcraftModItems.MINING_PORKCHOP_CHOPPED.get()), 15, 7, 0.07f));
		}
		if (event.getType() == FuetcraftModVillagerProfessions.CHOPPER_PROFESSION.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(FuetcraftModItems.PORKCHOP_CHOPPED.get(), 3),

					new ItemStack(Items.EMERALD), 10, 9, 0.09f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(FuetcraftModItems.PORKCHOP_CHOPPED.get()),

					new ItemStack(Items.BOOK), 10, 9, 0.09f));
		}
		if (event.getType() == FuetcraftModVillagerProfessions.CHOPPER_PROFESSION.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64),

					new ItemStack(FuetcraftModItems.TARRADELLAS_PORKCHOP_CHOPPED.get()), 10, 11, 0.11f));
		}
	}
}
