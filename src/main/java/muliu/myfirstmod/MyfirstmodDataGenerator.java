package muliu.myfirstmod;

import muliu.myfirstmod.datagen.ModAdvancementProvider;
import muliu.myfirstmod.datagen.ModBlockTagProvider;
import muliu.myfirstmod.datagen.ModItemTagProvider;
import muliu.myfirstmod.datagen.ModLootTablesProvider;
import muliu.myfirstmod.datagen.ModModelsProvider;
import muliu.myfirstmod.datagen.ModRecipesProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MyfirstmodDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModModelsProvider::new);
		pack.addProvider(ModLootTablesProvider::new);
		pack.addProvider(ModRecipesProvider::new);
		pack.addProvider(ModAdvancementProvider::new);
	}
}
