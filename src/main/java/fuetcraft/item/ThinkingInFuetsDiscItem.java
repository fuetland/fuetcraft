
package fuetcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import fuetcraft.FuetcraftMod;

public class ThinkingInFuetsDiscItem extends Item {
	public ThinkingInFuetsDiscItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(1).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(FuetcraftMod.MODID, "thinking_in_fuets_disc"))));
	}
}
