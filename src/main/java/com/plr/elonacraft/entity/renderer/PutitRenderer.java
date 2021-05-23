package com.plr.elonacraft.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import com.plr.elonacraft.entity.PutitEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PutitRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PutitEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelputit(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("elonacraft:textures/putit.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelputit extends EntityModel<Entity> {
		private final ModelRenderer putit;
		private final ModelRenderer sub_r1;
		public Modelputit() {
			textureWidth = 32;
			textureHeight = 32;
			putit = new ModelRenderer(this);
			putit.setRotationPoint(0.0F, 24.0F, 0.0F);
			putit.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			putit.setTextureOffset(0, 3).addBox(1.0F, -6.0F, -5.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			putit.setTextureOffset(0, 0).addBox(-3.0F, -6.0F, -5.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			sub_r1 = new ModelRenderer(this);
			sub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			putit.addChild(sub_r1);
			setRotationAngle(sub_r1, 0.5236F, 0.0F, 0.0F);
			sub_r1.setTextureOffset(24, 0).addBox(-1.0F, -5.0F, 7.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			putit.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
