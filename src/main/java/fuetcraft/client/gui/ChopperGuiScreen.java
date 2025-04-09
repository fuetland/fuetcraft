package fuetcraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import fuetcraft.world.inventory.ChopperGuiMenu;

import com.mojang.blaze3d.systems.RenderSystem;

public class ChopperGuiScreen extends AbstractContainerScreen<ChopperGuiMenu> {
	private final static HashMap<String, Object> guistate = ChopperGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ChopperGuiScreen(ChopperGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("fuetcraft:textures/screens/chopper_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("fuetcraft:textures/screens/right-arrow.png"), this.leftPos + 96, this.topPos + 34, 0, 0, 22, 15, 22, 15);

		guiGraphics.blit(new ResourceLocation("fuetcraft:textures/screens/add.png"), this.leftPos + 42, this.topPos + 34, 0, 0, 13, 13, 13, 13);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.fuetcraft.chopper_gui.label_chopper"), 69, 7, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
