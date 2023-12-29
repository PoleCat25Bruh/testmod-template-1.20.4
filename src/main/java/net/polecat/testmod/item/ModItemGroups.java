package net.polecat.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.polecat.testmod.TestMod;
import net.polecat.testmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup OCTANITE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TestMod.MOD_ID, "octanite"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.octanite"))
                    .icon(() -> new ItemStack(ModItems.OCTANITE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.OCTANITE);
                        entries.add(ModItems.OCTANITE_INGOT);
                        entries.add(ModBlocks.OCTANITE_BLOCK);
                        entries.add(ModBlocks.OCTANITE_ORE);

                    }).build());

    public static void registerItemGroups() {
        TestMod.LOGGER.info("Registering Item Groups for " + TestMod.MOD_ID);
    }
}
