package fuetcraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import fuetcraft.world.inventory.GuideBookStufferMenu;

import fuetcraft.procedures.StufferGuiTitleLabelProcedure;
import fuetcraft.procedures.GuideBookIngredientAnimation6Procedure;
import fuetcraft.procedures.GuideBookIngredientAnimation5Procedure;
import fuetcraft.procedures.GuideBookIngredientAnimation4Procedure;
import fuetcraft.procedures.GuideBookIngredientAnimation3Procedure;
import fuetcraft.procedures.GuideBookIngredientAnimation2Procedure;
import fuetcraft.procedures.GuideBookIngredientAnimation1Procedure;
import fuetcraft.procedures.GuideBookIngredientAnimation0Procedure;
import fuetcraft.procedures.GetStufferGuideText2Procedure;
import fuetcraft.procedures.GetStufferGuideText1Procedure;
import fuetcraft.procedures.GetSlot2TextProcedure;
import fuetcraft.procedures.GetSlot1TextProcedure;
import fuetcraft.procedures.GetIngredientsTextProcedure;
import fuetcraft.procedures.GetCraftingTextProcedure;

import fuetcraft.network.GuideBookStufferButtonMessage;

import fuetcraft.FuetcraftMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class GuideBookStufferScreen extends AbstractContainerScreen<GuideBookStufferMenu> {
	private final static HashMap<String, Object> guistate = GuideBookStufferMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_arrowleft32x16;

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

		guiGraphics.blit(new ResourceLocation("fuetcraft:textures/screens/stuffer-icon.png"), this.leftPos + 214, this.topPos + 10, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(new ResourceLocation("fuetcraft:textures/screens/stuffer-craft.png"), this.leftPos + 183, this.topPos + 92, 0, 0, 62, 64, 62, 64);

		guiGraphics.blit(new ResourceLocation("fuetcraft:textures/screens/leather-32x32.png"), this.leftPos + 106, this.topPos + 102, 0, 0, 32, 32, 32, 32);

		if (GuideBookIngredientAnimation0Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("fuetcraft:textures/screens/porkchop-chopped.png"), this.leftPos + 25, this.topPos + 102, 0, 0, 32, 32, 32, 32);
		}
		if (GuideBookIngredientAnimation1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("fuetcraft:textures/screens/porkchop-chopped-tarradellas-32x32.png"), this.leftPos + 25, this.topPos + 102, 0, 0, 32, 32, 32, 32);
		}
		if (GuideBookIngredientAnimation2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("fuetcraft:textures/screens/porkchop-chopped-swimming-32x32.png"), this.leftPos + 25, this.topPos + 102, 0, 0, 32, 32, 32, 32);
		}
		if (GuideBookIngredientAnimation3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("fuetcraft:textures/screens/porkchop-chopped-mining-32x32.png"), this.leftPos + 25, this.topPos + 102, 0, 0, 32, 32, 32, 32);
		}
		if (GuideBookIngredientAnimation4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("fuetcraft:textures/screens/porkchop-chopped-exploring-32x32.png"), this.leftPos + 25, this.topPos + 102, 0, 0, 32, 32, 32, 32);
		}
		if (GuideBookIngredientAnimation5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("fuetcraft:textures/screens/porkchop-chopped-expired-32x32.png"), this.leftPos + 25, this.topPos + 102, 0, 0, 32, 32, 32, 32);
		}
		if (GuideBookIngredientAnimation6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("fuetcraft:textures/screens/porkchop-chopped-combat-32x32.png"), this.leftPos + 25, this.topPos + 102, 0, 0, 32, 32, 32, 32);
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

				StufferGuiTitleLabelProcedure.execute(), 110, 10, -12829636, false);
		guiGraphics.drawString(this.font,

				GetStufferGuideText1Procedure.execute(), 23, 33, -12829636, false);
		guiGraphics.drawString(this.font,

				GetStufferGuideText2Procedure.execute(), 48, 46, -12829636, false);
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
		imagebutton_arrowleft32x16 = new ImageButton(this.leftPos + 7, this.topPos + 7, 32, 16, 0, 0, 16, new ResourceLocation("fuetcraft:textures/screens/atlas/imagebutton_arrowleft32x16.png"), 32, 32, e -> {
			if (true) {
				FuetcraftMod.PACKET_HANDLER.sendToServer(new GuideBookStufferButtonMessage(0, x, y, z));
				GuideBookStufferButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrowleft32x16", imagebutton_arrowleft32x16);
		this.addRenderableWidget(imagebutton_arrowleft32x16);
	}
}
