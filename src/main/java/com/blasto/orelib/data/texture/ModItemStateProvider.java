package com.blasto.orelib.data.texture;

import com.blasto.orelib.OreLib;
import com.blasto.orelib.core.init.ItemInit;
import com.blasto.orelib.util.NameUtility;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemStateProvider extends ItemModelProvider {

    public ModItemStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, OreLib.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        item(ItemInit.TIN_INGOT.get());
    }

    private void item(Item item) {
        String name = NameUtility.getItemName(item);
        getBuilder(name)
                .parent(getExistingFile(mcLoc("item/generated")))
                .texture("layer0", "item/" + name);
    }
}
