package com.graissant.sprinkles.items.food;

import com.graissant.sprinkles.Main;
import com.graissant.sprinkles.init.ModItems;
import com.graissant.sprinkles.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel {
	
	public  FoodBase(String name, int amount, float saturation, boolean isAnimalFood) {
		
		super(amount, saturation, isAnimalFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		ModItems.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
