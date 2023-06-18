package com.mango_buff.bontany_ore_trees_reborn;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;


@Mod(BotanyOreTreesReborn.MODID)
public class BotanyOreTreesReborn {
    public static final String MODID = "bontany_ore_trees_reborn";

    public BotanyOreTreesReborn() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}