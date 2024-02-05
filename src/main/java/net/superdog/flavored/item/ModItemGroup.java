package net.superdog.flavored.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.superdog.flavored.Flavored;
import net.superdog.flavored.block.ModBlocks;

public class ModItemGroup {
    public static ItemGroup FLAVORED_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Flavored.MOD_ID, "flavored_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.flavored_group"))
                    .icon(() -> new ItemStack(ModItems.TOMATO)).entries((displayContext, entries) -> {


                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.TOMATO_SEEDS);
                        entries.add(ModItems.GARLIC);
                        entries.add(ModItems.PASTA);
                        entries.add(ModBlocks.CHEESE);
                        entries.add(ModItems.SPAGHETTI);
                        entries.add(ModBlocks.PIZZA);
                        entries.add(ModItems.PIZZA_SLICE);
                        entries.add(ModBlocks.PUDDING);




                    }).build());

    public static void registerItemGroups() {
        // Example of adding to existing Item Group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {

        });
    }
}