package muliu.myfirstmod.datagen;

import muliu.myfirstmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.OnKilledCriterion;
import net.minecraft.item.ItemStack;
import net.minecraft.predicate.entity.EntityPredicate;
import net.minecraft.text.Text;

import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider {
    public ModAdvancementProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        Advancement tacticalNuclear = Advancement.Builder.create()
            .display(
                new ItemStack(ModItems.NVIDIA_GTX690),
                Text.translatable("advancement.myfirstmod.gtx690.title"),
                Text.translatable("advancement.myfirstmod.gtx690.desc"),
                null,
                AdvancementFrame.CHALLENGE,
                true, true, false
            )
            .criterion("kill_with_gtx690",

                OnKilledCriterion.Conditions.createPlayerKilledEntity(
                    EntityPredicate.Builder.create()
                        .build()
                )
            )
            .build(consumer, "myfirstmod:tactical_nuclear_strike");

        /*Advancement basketballCrafting = Advancement.Builder.create()
            .display(
                new ItemStack(ModBlocks.BASKETBALL),
                Text.translatable("advancement.myfirstmod.basketball.title"),
                Text.translatable("advancement.myfirstmod.basketball.desc"),
                null,
                AdvancementFrame.CHALLENGE,
                true, true, false
            )
            .criterion("craft_basketball",
                InventoryChangedCriterion.Conditions.items(ModBlocks.BASKETBALL.asItem())
            )
            .build(consumer, "myfirstmod:basketball_crafting");
            */
    }
}