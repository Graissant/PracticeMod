package com.graissant.sprinkles.items.food;

import com.graissant.sprinkles.Main;
import com.graissant.sprinkles.init.ModItems;
import com.graissant.sprinkles.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MedicineBase extends FoodBase implements IHasModel {
	
	PotionEffect effect;
	
	public  MedicineBase(String name, int amount, float saturation, boolean isAnimalFood, PotionEffect effect) {
		
		super(name, amount, saturation, isAnimalFood);
		// Make medicine always consumable
		setAlwaysEdible();
		this.effect = effect;
		
		ModItems.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		if(!worldIn.isRemote) {
			player.addPotionEffect(new PotionEffect(effect.getPotion(), effect.getDuration(), effect.getAmplifier(), effect.getIsAmbient(), effect.doesShowParticles()));
		}
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack) {
		return true;
	}

}
