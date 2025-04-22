package fuetcraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.Arrays;

import fuetcraft.world.inventory.StufferGuiMenu;

import fuetcraft.procedures.RigthArrow80VisibilityProcedure;
import fuetcraft.procedures.RigthArrow60VisibilityProcedure;
import fuetcraft.procedures.RigthArrow40VisibilityProcedure;
import fuetcraft.procedures.RigthArrow20VisibilityProcedure;
import fuetcraft.procedures.RigthArrow100VisibilityProcedure;
import fuetcraft.procedures.GuiTooltipSlot1VisibilityProcedure;
import fuetcraft.procedures.GuiTooltipSlot0VisibilityProcedure;
import fuetcraft.procedures.ChopperGuiTooltipSlot1TextProcedure;
import fuetcraft.procedures.ChopperGuiTooltipSlot0TextProcedure;

import com.mojang.blaze3d.systems.RenderSystem;

public class StufferGuiScreen extends AbstractContainerScreen<StufferGuiMenu> {
	private final static HashMap<String, Object> guistate = StufferGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public StufferGuiScreen(StufferGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("fuetcraft:textures/screens/stuffer_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (GuiTooltipSlot0VisibilityProcedure.execute(world, x, y, z))
			if (mouseX > leftPos + 15 && mouseX < leftPos + 39 && mouseY > topPos + 34 && mouseY < topPos + 58) {
				String hoverText = ChopperGuiTooltipSlot0TextProcedure.execute();
				if (hoverText != null) {
					guiGraphics.renderComponentTooltip(font, Arrays.stream(hoverText.split("\n")).map(Component::literal).collect(Collectors.toList()), mouseX, mouseY);
				}
			}
		if (GuiTooltipSlot1VisibilityProcedure.execute(world, x, y, z))
			if (mouseX > leftPos + 69 && mouseX < leftPos + 93 && mouseY > topPos + 34 && mouseY < topPos + 58) {
				String hoverText = ChopperGuiTooltipSlot1TextProcedure.execute();
				if (hoverText != null) {
					guiGraphics.renderComponentTooltip(font, Arrays.stream(hoverText.split("\n")).map(Component::literal).collect(Collectors.toList()), mouseX, mouseY);
				}
			}
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("fuetcraft:textures/screens/add.png"), this.leftPos + 42, this.topPos + 34, 0, 0, 17, 17, 17, 17);

		guiGraphics.blit(new ResourceLocation("fuetcraft:textures/screens/right-arrow.png"), this.leftPos + 96, this.topPos + 34, 0, 0, 26, 17, 26, 17);

		if (RigthArrow20VisibilityProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fuetcraft:textures/screens/right-arrow-20.png"), this.leftPos + 96, this.topPos + 34, 0, 0, 26, 17, 26, 17);
		}
		if (RigthArrow40VisibilityProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fuetcraft:textures/screens/right-arrow-40.png"), this.leftPos + 96, this.topPos + 34, 0, 0, 26, 17, 26, 17);
		}
		if (RigthArrow60VisibilityProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fuetcraft:textures/screens/right-arrow-60.png"), this.leftPos + 96, this.topPos + 34, 0, 0, 26, 17, 26, 17);
		}
		if (RigthArrow80VisibilityProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fuetcraft:textures/screens/right-arrow-80.png"), this.leftPos + 96, this.topPos + 34, 0, 0, 26, 17, 26, 17);
		}
		if (RigthArrow100VisibilityProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fuetcraft:textures/screens/right-arrow-100.png"), this.leftPos + 96, this.topPos + 34, 0, 0, 26, 17, 26, 17);
		}
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
		guiGraphics.drawString(this.font, Component.translatable("gui.fuetcraft.stuffer_gui.label_chopper"), 69, 7, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
