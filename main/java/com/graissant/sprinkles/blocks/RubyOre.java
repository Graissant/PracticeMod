package com.graissant.sprinkles.blocks;

import java.util.Random;

import com.graissant.sprinkles.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class RubyOre extends BlockBase {

	public RubyOre(String name, Material material) {
		
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		
	}
	
	// Makes block drop custom item. | "Items." for vanilla stuff
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.RUBY;
	}

	// Make block drop 1-3 of an item
	@Override
	public int quantityDropped(Random rand) {
		return rand.nextInt(3) + 1;
	}
}
