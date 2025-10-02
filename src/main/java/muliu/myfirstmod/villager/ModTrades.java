package muliu.myfirstmod.villager;

import muliu.myfirstmod.block.ModBlocks;
import muliu.myfirstmod.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.VillagerProfession;

public class ModTrades {
    public static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories -> {
            factories.add(new TradeOffers.BuyForOneEmeraldFactory(ModItems.HYPER_CORN, 2, 12, 5));
            factories.add(new TradeOffers.SellItemFactory(ModItems.HYPER_STRAWBERRY_SEEDS.getDefaultStack(), 1, 12, 5, 2, 0.5f));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.HYPER_STRAWBERRY, 5),
                    new ItemStack(Items.EMERALD, 6),
                    2, 7, 0.5f
            ));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 2, factories -> {
            factories.add(new TradeOffers.ProcessItemFactory(ModBlocks.ICE_ETHER_BLOCK,5, 5, ModItems.ICE_ETHER_HELMET, 1, 3, 3));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 2, factories -> {
            factories.add(new TradeOffers.ProcessItemFactory(ModBlocks.ICE_ETHER_BLOCK,8, 8, ModItems.ICE_ETHER_CHESTPLATE, 1, 3, 3));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 2, factories -> {
            factories.add(new TradeOffers.ProcessItemFactory(ModBlocks.ICE_ETHER_BLOCK,7, 7, ModItems.ICE_ETHER_LEGGINGS, 1, 3, 3));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 2, factories -> {
            factories.add(new TradeOffers.ProcessItemFactory(ModBlocks.ICE_ETHER_BLOCK,4, 4, ModItems.ICE_ETHER_BOOTS, 1, 3, 3));
        });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.ICE_ETHER_MASTER, 1, factories -> {
            factories.add(new TradeOffers.BuyForOneEmeraldFactory(ModItems.ICE_ETHER, 10, 12, 1));
            factories.add(new TradeOffers.SellItemFactory(ModItems.ICE_ETHER_AXE.getDefaultStack(), 3, 1, 3, 2, 0.5f));
            });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.ICE_ETHER_MASTER, 2, factories -> {
            factories.add(new TradeOffers.BuyForOneEmeraldFactory(ModItems.PIECE_OF_NVIDIA_GTX690, 640, 5, 5));
            factories.add(new TradeOffers.SellItemFactory(ModBlocks.ICE_ETHER_BLOCK.asItem().getDefaultStack(), 1, 1, 3, 2, 0.5f));
        });


        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.ICE_ETHER, 16),
                    EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SHARPNESS, 2)),
                    3, 12, 0.5F
        ));
    });
}}