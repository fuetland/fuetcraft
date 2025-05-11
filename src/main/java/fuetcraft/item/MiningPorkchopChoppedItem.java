
package fuetcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

public class MiningPorkchopChoppedItem extends Item {
	public MiningPorkchopChoppedItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64).food((new FoodProperties.Builder()).nutrition(1).saturationModifier(0.3f).build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack, LivingEntity livingEntity) {
		return 15;
	}
}
