package com.graissant.sprinkles.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		
		GameRegistry.addSmelting(Blocks.GRASS, new ItemStack(ModItems.BLUNT, 1), 1.5f);
		
	}

}
