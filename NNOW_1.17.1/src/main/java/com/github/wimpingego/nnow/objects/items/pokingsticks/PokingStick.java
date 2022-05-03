package com.github.wimpingego.nnow.objects.items.pokingsticks;

import com.github.wimpingego.nnow.util.config.ModConfigs;

import net.minecraft.world.item.Item.Properties;

public class PokingStick extends PokingStickBase{

	static int use = ModConfigs.BASE_MAX_USES.get();
	
	public PokingStick(Properties builder) {
		super(builder.durability(use));
	}

}
