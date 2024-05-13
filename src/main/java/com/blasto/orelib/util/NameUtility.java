package com.blasto.orelib.util;

import com.blasto.orelib.OreLib;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

public class NameUtility {

    public static String getItemName(Item item) {
        return BuiltInRegistries.ITEM.getKey(item).toString().replace(OreLib.MODID + ":", "");
    }
}
