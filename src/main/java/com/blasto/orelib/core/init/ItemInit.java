package com.blasto.orelib.core.init;

import com.blasto.orelib.OreLib;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.blasto.orelib.core.init.BlockInit.COBALT_ORE;
import static com.blasto.orelib.core.init.BlockInit.TIN_ORE;

public class ItemInit {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(OreLib.MODID);

    public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties()));


    // Raw Ores registration
    public static final DeferredItem<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties()));

    // Ingots registration
    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COBALT_INGOT = ITEMS.registerSimpleItem("cobalt_ingot", new Item.Properties());

    // Raw Ores items registration
    public static final DeferredItem<BlockItem> TIN_ORE_ITEM = ITEMS.registerSimpleBlockItem("tin_ore", TIN_ORE);
    public static final DeferredItem<BlockItem> COBALT_ORE_ITEM = ITEMS.registerSimpleBlockItem("cobalt_ore", COBALT_ORE);
}
