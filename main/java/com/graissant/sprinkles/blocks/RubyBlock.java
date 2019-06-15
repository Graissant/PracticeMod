package com.graissant.sprinkles.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyBlock extends BlockBase {

	public RubyBlock(String name, Material material) {
		
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(15.0F); // 1-15, reversed
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}

}
