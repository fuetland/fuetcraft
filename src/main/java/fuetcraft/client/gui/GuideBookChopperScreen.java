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

import fuetcraft.world.inventory.GuideBookChopperMenu;

import fuetcraft.procedures.GuideBookIngredientAnimation6Procedure;
import fuetcraft.procedures.GuideBookIngredientAnimation5Procedure;
import fuetcraft.procedures.GuideBookIngredientAnimation4Procedure;
import fuetcraft.procedures.GuideBookIngredientAnimation3Procedure;
import fuetcraft.procedures.GuideBookIngredientAnimation2Procedure;
import fuetcraft.procedures.GuideBookIngredientAnimation1Procedure;
import fuetcraft.procedures.GetSlot2TextProcedure;
import fuetcraft.procedures.GetSlot1TextProcedure;
import fuetcraft.procedures.GetIngredientsTextProcedure;
import fuetcraft.procedures.GetCraftingTextProcedure;
import fuetcraft.procedures.GetChopperGuideText2Procedure;
import fuetcraft.procedures.GetChopperGuideText1Procedure;
import fuetcraft.procedures.ChopperGuiTitleLabelProcedure;

import fuetcraft.network.GuideBookChopperButtonMessage;

import com.mojang.blaze3d.systems.RenderSystem;

public class GuideBookChopperScreen extends AbstractContainerScreen<GuideBookChopperMenu> {
	private final static HashMap<String, Object> guistate = GuideBookChopperMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_arrowleft32x16;

	public GuideBookChopperScreen(GuideBookChopperMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 256;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("fuetcraft:textures/screens/guide_book_chopper.png");

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

		guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("fuetcraft:textures/screens/chopper-icon-32x32.png"), this.leftPos + 214, this.topPos + 10, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("fuetcraft:textures/screens/chopper-craft.png"), this.leftPos + 183, this.topPos + 92, 0, 0, 63, 64, 63, 64);

		guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("fuetcraft:textures/screens/porkchop-32x32.png"), this.leftPos + 25, this.topPos + 102, 0, 0, 32, 32, 32, 32);

		if (GuideBookIngredientAnimation1Procedure.execute(entity)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("fuetcraft:textures/screens/netherite-32x32.png"), this.leftPos + 106, this.topPos + 102, 0, 0, 32, 32, 32, 32);
		}
		if (GuideBookIngredientAnimation2Procedure.execute(entity)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("fuetcraft:textures/screens/salmon-32x32.png"), this.leftPos + 106, this.topPos + 102, 0, 0, 32, 32, 32, 32);
		}
		if (GuideBookIngredientAnimation3Procedure.execute(entity)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("fuetcraft:textures/screens/ender-pearl-32x32.png"), this.leftPos + 106, this.topPos + 102, 0, 0, 32, 32, 32, 32);
		}
		if (GuideBookIngredientAnimation4Procedure.execute(entity)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("fuetcraft:textures/screens/torchflower-32x32.png"), this.leftPos + 106, this.topPos + 102, 0, 0, 32, 32, 32, 32);
		}
		if (GuideBookIngredientAnimation5Procedure.execute(entity)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("fuetcraft:textures/screens/golden-pickaxe-32x32.png"), this.leftPos + 106, this.topPos + 102, 0, 0, 32, 32, 32, 32);
		}
		if (GuideBookIngredientAnimation6Procedure.execute(entity)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("fuetcraft:textures/screens/poisonous-potato-32x32.png"), this.leftPos + 106, this.topPos + 102, 0, 0, 32, 32, 32, 32);
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
		guiGraphics.drawString(this.font,

				ChopperGuiTitleLabelProcedure.execute(), 110, 10, -12829636, false);
		guiGraphics.drawString(this.font,

				GetChopperGuideText1Procedure.execute(), 61, 34, -12829636, false);
		guiGraphics.drawString(this.font,

				GetChopperGuideText2Procedure.execute(), 80, 46, -12829636, false);
		guiGraphics.drawString(this.font,

				GetCraftingTextProcedure.execute(), 194, 79, -12829636, false);
		guiGraphics.drawString(this.font,

				GetIngredientsTextProcedure.execute(), 51, 79, -12829636, false);
		guiGraphics.drawString(this.font,

				GetSlot1TextProcedure.execute(), 25, 135, -12829636, false);
		guiGraphics.drawString(this.font,

				GetSlot2TextProcedure.execute(), 105, 135, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_arrowleft32x16 = new ImageButton(this.leftPos + 7, this.topPos + 7, 32, 16,
				new WidgetSprites(ResourceLocation.parse("fuetcraft:textures/screens/arrow-left-32x16.png"), ResourceLocation.parse("fuetcraft:textures/screens/arrow-left-hovered-32x16.png.png")), e -> {
					if (true) {
						PacketDistributor.sendToServer(new GuideBookChopperButtonMessage(0, x, y, z));
						GuideBookChopperButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(RenderType::guiTextured, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_arrowleft32x16", imagebutton_arrowleft32x16);
		this.addRenderableWidget(imagebutton_arrowleft32x16);
	}
}
