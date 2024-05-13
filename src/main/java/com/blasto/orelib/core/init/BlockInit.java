package com.blasto.orelib.core.init;

import com.blasto.orelib.OreLib;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockInit {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(OreLib.MODID);

    // Raw Ores registration
    public static final DeferredBlock<Block> TIN_ORE = BLOCKS.register(
            "tin_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .destroyTime(1.3f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            )
    );

    public static final DeferredBlock<Block> COBALT_BLOCK = BLOCKS.register(
            "cobalt_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .destroyTime(1.3f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            )
    );

    public static final DeferredBlock<Block> COBALT_ORE = BLOCKS.register(
            "cobalt_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .destroyTime(1.3f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            )
    );

    public static final DeferredBlock<Block> RAW_COBALT_BLOCK = BLOCKS.register(
            "raw_cobalt_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .destroyTime(1.3f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            )
    );

    public static final DeferredBlock<Block> DEEPSLATE_COBALT_ORE = BLOCKS.register(
            "deepslate_cobalt_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .destroyTime(1.3f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            )
    );

}
