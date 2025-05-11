package fuetcraft.procedures;

import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import javax.annotation.Nullable;

import fuetcraft.network.FuetcraftModVariables;

@EventBusSubscriber
public class SetValuteToGlobalVariablesProcedure {
	@SubscribeEvent
	public static void onWorldLoad(net.neoforged.neoforge.event.level.LevelEvent.Load event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		FuetcraftModVariables.MapVariables.get(world).fuetMining = "mining-fuet";
		FuetcraftModVariables.MapVariables.get(world).syncData(world);
		FuetcraftModVariables.MapVariables.get(world).fuetExploration = "exploration-fuet";
		FuetcraftModVariables.MapVariables.get(world).syncData(world);
		FuetcraftModVariables.MapVariables.get(world).fuetCombat = "combat-fuet";
		FuetcraftModVariables.MapVariables.get(world).syncData(world);
		FuetcraftModVariables.MapVariables.get(world).fuetSwimming = "swimming-fuet";
		FuetcraftModVariables.MapVariables.get(world).syncData(world);
		FuetcraftModVariables.MapVariables.get(world).fuetEspetec = "espetec-fuet";
		FuetcraftModVariables.MapVariables.get(world).syncData(world);
		FuetcraftModVariables.MapVariables.get(world).fuetExpired = "expired-fuet";
		FuetcraftModVariables.MapVariables.get(world).syncData(world);
		FuetcraftModVariables.MapVariables.get(world).fuetNormal = "normal-fuet";
		FuetcraftModVariables.MapVariables.get(world).syncData(world);
		FuetcraftModVariables.MapVariables.get(world).processIsActive = "process-is-active";
		FuetcraftModVariables.MapVariables.get(world).syncData(world);
		FuetcraftModVariables.MapVariables.get(world).processTimer = "process-timer";
		FuetcraftModVariables.MapVariables.get(world).syncData(world);
		FuetcraftModVariables.MapVariables.get(world).currentTypeOfFuet = "current-type-of-fuet";
		FuetcraftModVariables.MapVariables.get(world).syncData(world);
		FuetcraftModVariables.MapVariables.get(world).ingredientsAnimation = "ingredients-animation";
		FuetcraftModVariables.MapVariables.get(world).syncData(world);
	}
}
