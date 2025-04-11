
package fuetcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PorkchopChoppedItem extends Item {
	public PorkchopChoppedItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
