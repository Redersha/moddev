package muliu.myfirstmod;


import muliu.myfirstmod.block.ModBlocks;
import muliu.myfirstmod.entity.ModEntities;
import muliu.myfirstmod.entity.client.ModModelLayers;
import muliu.myfirstmod.entity.client.YellowShellerModel;
import muliu.myfirstmod.entity.client.YellowShellerRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;

@Environment(net.fabricmc.api.EnvType.CLIENT)
public class MyfirstmodClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ICE_ETHER_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ICE_ETHER_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ICE_ETHER_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HYPER_STRAWBERRY_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HYPER_CORN_CROP, RenderLayer.getCutout());
        EntityRendererRegistry.register(ModEntities.YELLOW_SHELLER, YellowShellerRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.YELLOW_SHELLER, YellowShellerModel::getTexturedModelData);
    }
}
