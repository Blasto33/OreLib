package com.blasto.orelib.core.init;

import com.blasto.orelib.OreLib;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemInit {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(OreLib.MODID);

    public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties()));


    // Raw Ores registration
    public static final DeferredItem<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties()));

}
