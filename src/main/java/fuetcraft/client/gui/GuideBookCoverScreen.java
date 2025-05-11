package fuetcraft.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import fuetcraft.world.inventory.GuideBookCoverMenu;

import fuetcraft.procedures.GetTextFuetcraftProcedure;

import fuetcraft.network.GuideBookCoverButtonMessage;

import com.mojang.blaze3d.systems.RenderSystem;

public class GuideBookCoverScreen extends AbstractContainerScreen<GuideBookCoverMenu> {
	private final static HashMap<String, Object> guistate = GuideBookCoverMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_choppericon;
	ImageButton imagebutton_stuffericon;
	ImageButton imagebutton_porkchopchopped;
	ImageButton imagebutton_fuet;

	public GuideBookCoverScreen(GuideBookCoverMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("fuetcraft:textures/screens/guide_book_cover.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(RenderType::guiTextured, texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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

				GetTextFuetcraftProcedure.execute(), 60, 7, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_choppericon = new ImageButton(this.leftPos + 33, this.topPos + 34, 32, 32,
				new WidgetSprites(ResourceLocation.parse("fuetcraft:textures/screens/chopper-icon-32x32.png"), ResourceLocation.parse("fuetcraft:textures/screens/chopper-icon-32x32.png")), e -> {
					if (true) {
						PacketDistributor.sendToServer(new GuideBookCoverButtonMessage(0, x, y, z));
						GuideBookCoverButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(RenderType::guiTextured, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_choppericon", imagebutton_choppericon);
		this.addRenderableWidget(imagebutton_choppericon);
		imagebutton_stuffericon = new ImageButton(this.leftPos + 113, this.topPos + 30, 32, 32,
				new WidgetSprites(ResourceLocation.parse("fuetcraft:textures/screens/stuffer-icon.png"), ResourceLocation.parse("fuetcraft:textures/screens/stuffer-icon.png")), e -> {
					if (true) {
						PacketDistributor.sendToServer(new GuideBookCoverButtonMessage(1, x, y, z));
						GuideBookCoverButtonMessage.handleButtonAction(entity, 1, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(RenderType::guiTextured, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_stuffericon", imagebutton_stuffericon);
		this.addRenderableWidget(imagebutton_stuffericon);
		imagebutton_porkchopchopped = new ImageButton(this.leftPos + 33, this.topPos + 106, 32, 32,
				new WidgetSprites(ResourceLocation.parse("fuetcraft:textures/screens/porkchop-chopped.png"), ResourceLocation.parse("fuetcraft:textures/screens/porkchop-chopped.png")), e -> {
					if (true) {
						PacketDistributor.sendToServer(new GuideBookCoverButtonMessage(2, x, y, z));
						GuideBookCoverButtonMessage.handleButtonAction(entity, 2, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(RenderType::guiTextured, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_porkchopchopped", imagebutton_porkchopchopped);
		this.addRenderableWidget(imagebutton_porkchopchopped);
		imagebutton_fuet = new ImageButton(this.leftPos + 114, this.topPos + 106, 32, 32, new WidgetSprites(ResourceLocation.parse("fuetcraft:textures/screens/fuet-32x32.png"), ResourceLocation.parse("fuetcraft:textures/screens/fuet-32x32.png")),
				e -> {
					if (true) {
						PacketDistributor.sendToServer(new GuideBookCoverButtonMessage(3, x, y, z));
						GuideBookCoverButtonMessage.handleButtonAction(entity, 3, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(RenderType::guiTextured, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_fuet", imagebutton_fuet);
		this.addRenderableWidget(imagebutton_fuet);
	}
}
