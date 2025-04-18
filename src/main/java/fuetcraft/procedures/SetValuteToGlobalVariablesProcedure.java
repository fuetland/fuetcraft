package fuetcraft.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import javax.annotation.Nullable;

import fuetcraft.network.FuetcraftModVariables;

@Mod.EventBusSubscriber
public class SetValuteToGlobalVariablesProcedure {
	@SubscribeEvent
	public static void onWorldLoad(net.minecraftforge.event.level.LevelEvent.Load event) {
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
	}
}
