package com.blasto.orelib.data.lang;

import com.blasto.orelib.OreLib;
import com.blasto.orelib.core.init.BlockInit;
import com.blasto.orelib.core.init.ItemInit;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModEnLangProvider extends LanguageProvider {
    public ModEnLangProvider(PackOutput output) {
        super(output, OreLib.MODID, "en_us");
    }


    @Override
    protected void addTranslations() {
        addItem(ItemInit.TIN_INGOT, "Tin Ingot");
    }
}
