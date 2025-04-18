
package fuetcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FuetItem extends Item {
	public FuetItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
