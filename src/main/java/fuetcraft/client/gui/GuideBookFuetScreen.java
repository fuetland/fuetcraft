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

import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.Arrays;

import fuetcraft.world.inventory.GuideBookFuetMenu;

import fuetcraft.procedures.GetTitleOfFuetGuideProcedure;
import fuetcraft.procedures.FuetTarradellasGuideBookTooltipProcedure;
import fuetcraft.procedures.FuetSwimmingGuideBookTooltipProcedure;
import fuetcraft.procedures.FuetMiningGuideBookTooltipProcedure;
import fuetcraft.procedures.FuetGuideBookTooltipProcedure;
import fuetcraft.procedures.FuetExploringGuideBookTooltipProcedure;
import fuetcraft.procedures.FuetExpiredGuideBookTooltipProcedure;
import fuetcraft.procedures.FuetCombatGuideBookTooltipProcedure;

import fuetcraft.network.GuideBookFuetButtonMessage;

import com.mojang.blaze3d.systems.RenderSystem;

public class GuideBookFuetScreen extends AbstractContainerScreen<GuideBookFuetMenu> {
	private final static HashMap<String, Object> guistate = GuideBookFuetMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_arrowleft32x16;

	public GuideBookFuetScreen(GuideBookFuetMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 256;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("fuetcraft:textures/screens/guide_book_fuet.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 199 && mouseX < leftPos + 223 && mouseY > topPos + 68 && mouseY < topPos + 92) {
			String hoverText = FuetTarradellasGuideBookTooltipProcedure.execute();
			if (hoverText != null) {
				guiGraphics.renderComponentTooltip(font, Arrays.stream(hoverText.split("\n")).map(Component::literal).collect(Collectors.toList()), mouseX, mouseY);
			}
		}
		if (mouseX > leftPos + 167 && mouseX < leftPos + 191 && mouseY > topPos + 117 && mouseY < topPos + 141) {
			String hoverText = FuetSwimmingGuideBookTooltipProcedure.execute();
			if (hoverText != null) {
				guiGraphics.renderComponentTooltip(font, Arrays.stream(hoverText.split("\n")).map(Component::literal).collect(Collectors.toList()), mouseX, mouseY);
			}
		}
		if (mouseX > leftPos + 83 && mouseX < leftPos + 107 && mouseY > topPos + 120 && mouseY < topPos + 144) {
			String hoverText = FuetMiningGuideBookTooltipProcedure.execute();
			if (hoverText != null) {
				guiGraphics.renderComponentTooltip(font, Arrays.stream(hoverText.split("\n")).map(Component::literal).collect(Collectors.toList()), mouseX, mouseY);
			}
		}
		if (mouseX > leftPos + 27 && mouseX < leftPos + 51 && mouseY > topPos + 92 && mouseY < topPos + 116) {
			String hoverText = FuetExploringGuideBookTooltipProcedure.execute();
			if (hoverText != null) {
				guiGraphics.renderComponentTooltip(font, Arrays.stream(hoverText.split("\n")).map(Component::literal).collect(Collectors.toList()), mouseX, mouseY);
			}
		}
		if (mouseX > leftPos + 147 && mouseX < leftPos + 171 && mouseY > topPos + 36 && mouseY < topPos + 60) {
			String hoverText = FuetExpiredGuideBookTooltipProcedure.execute();
			if (hoverText != null) {
				guiGraphics.renderComponentTooltip(font, Arrays.stream(hoverText.split("\n")).map(Component::literal).collect(Collectors.toList()), mouseX, mouseY);
			}
		}
		if (mouseX > leftPos + 47 && mouseX < leftPos + 71 && mouseY > topPos + 34 && mouseY < topPos + 58) {
			String hoverText = FuetCombatGuideBookTooltipProcedure.execute();
			if (hoverText != null) {
				guiGraphics.renderComponentTooltip(font, Arrays.stream(hoverText.split("\n")).map(Component::literal).collect(Collectors.toList()), mouseX, mouseY);
			}
		}
		if (mouseX > leftPos + 102 && mouseX < leftPos + 126 && mouseY > topPos + 74 && mouseY < topPos + 98) {
			String hoverText = FuetGuideBookTooltipProcedure.execute();
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
		guiGraphics.blit(RenderType::guiTextured, texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("fuetcraft:textures/screens/fuet-32x32.png"), this.leftPos + 96, this.topPos + 68, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("fuetcraft:textures/screens/fuet-combat-32x32.png"), this.leftPos + 41, this.topPos + 28, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("fuetcraft:textures/screens/fuet-expired-32x32.png"), this.leftPos + 141, this.topPos + 30, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("fuetcraft:textures/screens/fuet-exploring-32x32.png"), this.leftPos + 22, this.topPos + 87, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("fuetcraft:textures/screens/fuet-mining-32x32.png"), this.leftPos + 77, this.topPos + 114, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("fuetcraft:textures/screens/fuet-swimming-32x32.png"), this.leftPos + 162, this.topPos + 110, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("fuetcraft:textures/screens/fuet-tarradellas-32x32.png"), this.leftPos + 193, this.topPos + 62, 0, 0, 32, 32, 32, 32);

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

				GetTitleOfFuetGuideProcedure.execute(), 110, 10, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_arrowleft32x16 = new ImageButton(this.leftPos + 7, this.topPos + 7, 32, 16,
				new WidgetSprites(ResourceLocation.parse("fuetcraft:textures/screens/arrow-left-32x16.png"), ResourceLocation.parse("fuetcraft:textures/screens/arrow-left-hovered-32x16.png.png")), e -> {
					if (true) {
						PacketDistributor.sendToServer(new GuideBookFuetButtonMessage(0, x, y, z));
						GuideBookFuetButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(RenderType::guiTextured, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_arrowleft32x16);
	}
}
