package muliu.myfirstmod.entity.client;

import muliu.myfirstmod.Myfirstmod;
import muliu.myfirstmod.entity.custom.YellowShellerEntity;

import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class YellowShellerRenderer extends MobEntityRenderer<YellowShellerEntity, YellowShellerModel<YellowShellerEntity>> {

    private static final Identifier TEXTURE = new Identifier(Myfirstmod.MOD_ID, "textures/entity/yellowsheller.png");

    public YellowShellerRenderer(EntityRendererFactory.Context context) {
        super(context, new YellowShellerModel<>(context.getPart(ModModelLayers.YELLOW_SHELLER)), 0.5f);

    }

    @Override
    public Identifier getTexture(YellowShellerEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(YellowShellerEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        if (mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1.5f, 1.5f, 1.5f);
        }
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}