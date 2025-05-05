package fuetcraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import fuetcraft.world.inventory.GuideBookStufferMenu;

import fuetcraft.procedures.StufferGuiTitleLabelProcedure;
import fuetcraft.procedures.GetStufferGuideText2Procedure;
import fuetcraft.procedures.GetStufferGuideText1Procedure;

import com.mojang.blaze3d.systems.RenderSystem;

public class GuideBookStufferScreen extends AbstractContainerScreen<GuideBookStufferMenu> {
	private final static HashMap<String, Object> guistate = GuideBookStufferMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public GuideBookStufferScreen(GuideBookStufferMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 256;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("fuetcraft:textures/screens/guide_book_stuffer.png");

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

		guiGraphics.blit(new ResourceLocation("fuetcraft:textures/screens/stuffer-icon.png"), this.leftPos + 20, this.topPos + 13, 0, 0, 32, 32, 32, 32);

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
		guiGraphics.drawString(this.font,

				StufferGuiTitleLabelProcedure.execute(), 109, 8, -12829636, false);
		guiGraphics.drawString(this.font,

				GetStufferGuideText1Procedure.execute(), 65, 31, -12829636, false);
		guiGraphics.drawString(this.font,

				GetStufferGuideText2Procedure.execute(), 29, 49, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
