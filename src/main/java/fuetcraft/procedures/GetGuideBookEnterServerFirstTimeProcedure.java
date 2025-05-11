package fuetcraft.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import fuetcraft.init.FuetcraftModItems;

@EventBusSubscriber
public class GetGuideBookEnterServerFirstTimeProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (!entity.getPersistentData().getBoolean("hasObtainedGuideBook")) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(FuetcraftModItems.GUIDE_BOOK.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			entity.getPersistentData().putBoolean("hasObtainedGuideBook", true);
		}
	}
}
