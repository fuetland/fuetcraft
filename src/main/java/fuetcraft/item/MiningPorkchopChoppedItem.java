
package fuetcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class MiningPorkchopChoppedItem extends Item {
	public MiningPorkchopChoppedItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.3f).meat().build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 15;
	}
}
