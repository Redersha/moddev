package muliu.myfirstmod.entity.client;


import muliu.myfirstmod.entity.custom.YellowShellerEntity;
import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;


public class YellowShellerModel<T extends YellowShellerEntity> extends SinglePartEntityModel<T>{
	private final ModelPart main;
	public YellowShellerModel(ModelPart root) {
		this.main = root.getChild("main");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData main = modelPartData.addChild("main", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData right_leg = main.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData right_leg_r1 = right_leg.addChild("right_leg_r1", ModelPartBuilder.create().uv(0, 18).cuboid(-1.0F, -5.0F, -1.0F, 1.0F, 5.0F, 1.0F), ModelTransform.of(-4.0F, 0.0F, -5.0F, -0.48F, 0.1309F, 0.3491F));

		ModelPartData left_leg = main.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left_leg_r1 = left_leg.addChild("left_leg_r1", ModelPartBuilder.create().uv(4, 18).cuboid(0.0F, -5.0F, -1.0F, 1.0F, 5.0F, 1.0F), ModelTransform.of(4.0F, 0.0F, -5.0F, -0.48F, -0.1309F, -0.3491F));

		ModelPartData right_foot = main.addChild("right_foot", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 0.0F, -5.0F));

		ModelPartData right_foot_r1 = right_foot.addChild("right_foot_r1", ModelPartBuilder.create().uv(0, 13).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.2182F, -0.0436F, 0.0F));

		ModelPartData left_foot = main.addChild("left_foot", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 0.0F, -5.0F));

		ModelPartData left_foot_r1 = left_foot.addChild("left_foot_r1", ModelPartBuilder.create().uv(14, 0).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.2182F, 0.0436F, 0.0F));

		ModelPartData body = main.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData head_r1 = body.addChild("head_r1", ModelPartBuilder.create().uv(14, 9).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -4.0F, -4.0F, -0.3927F, 0.0F, 0.0F));

		ModelPartData body_r1 = body.addChild("body_r1", ModelPartBuilder.create().uv(8, 18).cuboid(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 2.0F, -0.3491F, 0.0F, 0.0F));

		ModelPartData body_r2 = body.addChild("body_r2", ModelPartBuilder.create().uv(10, 13).cuboid(-3.0F, -4.0F, -3.0F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 1.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

		ModelPartData body_r3 = body.addChild("body_r3", ModelPartBuilder.create().uv(0, 7).cuboid(-5.0F, -5.0F, -3.0F, 6.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, 1.0F, -1.0F, -0.3491F, 0.0F, 0.0F));

		ModelPartData body_r4 = body.addChild("body_r4", ModelPartBuilder.create().uv(14, 5).cuboid(-3.0F, -3.0F, -3.0F, 4.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 1.0F, 1.0F, -0.3491F, 0.0F, 0.0F));

		ModelPartData body_r5 = body.addChild("body_r5", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, -6.0F, -3.0F, 6.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, 1.0F, -2.0F, -0.3491F, 0.0F, 0.0F));

		ModelPartData body_r6 = body.addChild("body_r6", ModelPartBuilder.create().uv(14, 18).cuboid(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 3.0F, -0.3491F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 32, 32);
	}
	@Override
	public void setAngles(YellowShellerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		main.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
	@Override
	public ModelPart getPart() {
		return this.main;
	}

}