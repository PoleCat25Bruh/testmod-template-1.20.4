package net.polecat.testmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.polecat.testmod.TestMod;

public class ModItems {
    public static final Item OCTANITE = registerItem("octanite", new Item(new FabricItemSettings()));
    public static final Item OCTANITE_INGOT = registerItem("octanite_ingot", new Item(new FabricItemSettings()));
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(OCTANITE);
        entries.add(OCTANITE_INGOT);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TestMod.LOGGER .info("Registering Mod Items for " + TestMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
