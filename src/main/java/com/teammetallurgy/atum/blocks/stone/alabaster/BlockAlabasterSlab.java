package com.teammetallurgy.atum.blocks.stone.alabaster;

import com.google.common.collect.Maps;
import com.teammetallurgy.atum.blocks.base.BlockAtumSlab;
import com.teammetallurgy.atum.items.ItemAtumSlab;
import com.teammetallurgy.atum.utils.AtumRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

import java.util.Map;

public class BlockAlabasterSlab extends BlockAtumSlab {
    private static final Map<BlockAlabasterBricks.Type, Block> ALABASTER_SLAB = Maps.newEnumMap(BlockAlabasterBricks.Type.class);

    public BlockAlabasterSlab() {
        super(Material.ROCK, MapColor.QUARTZ);
        this.setHardness(2.0F);
        this.setSoundType(SoundType.STONE);
        this.useNeighborBrightness = true;
    }

    public static void registerSlabs() {
        for (BlockAlabasterBricks.Type type : BlockAlabasterBricks.Type.values()) {
            BlockAtumSlab slab = new BlockAlabasterSlab();
            ALABASTER_SLAB.put(type, slab);
            AtumRegistry.registerBlock(slab, new ItemAtumSlab(slab, slab), "alabaster_" + type.getName() + "_slab");
        }
    }
}