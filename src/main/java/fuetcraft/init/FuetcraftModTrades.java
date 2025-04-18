
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package fuetcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class FuetcraftModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == FuetcraftModVillagerProfessions.CHOPPER_PROFESSION.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.PORKCHOP, 2),

					new ItemStack(FuetcraftModItems.PORKCHOP_CHOPPED.get()), 10, 5, 0.05f));
		}
	}
}
