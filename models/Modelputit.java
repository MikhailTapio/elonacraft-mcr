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
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		putit.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}