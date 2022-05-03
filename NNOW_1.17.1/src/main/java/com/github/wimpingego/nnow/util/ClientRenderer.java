package com.github.wimpingego.nnow.util;

import com.github.wimpingego.nnow.init.BlockList;
import com.github.wimpingego.nnow.init.LightList;
import net.minecraft.world.level.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;


public class ClientRenderer {
	
	public static void registerBlocks() {
		
		Block[] blocks = { BlockList.END_LANTERN.get()};

		Block[] bushes = { BlockList.ICE_BERRY_BUSH.get(),BlockList.COPPER_BERRY_BUSH.get(),BlockList.FIRE_BERRY_BUSH.get(),BlockList.WOODEN_BERRY_BUSH.get(),BlockList.STONE_BERRY_BUSH.get(),BlockList.SAND_BERRY_BUSH.get(),
				BlockList.CLAY_BERRY_BUSH.get(),BlockList.DIRT_BERRY_BUSH.get(),BlockList.GRAVEL_BERRY_BUSH.get(),BlockList.XP_BERRY_BUSH.get()};
		
		Block[] ore_bushes = { BlockList.IRON_BERRY_BUSH.get(),BlockList.GOLD_BERRY_BUSH.get(),BlockList.COAL_BERRY_BUSH.get(),BlockList.REDSTONE_BERRY_BUSH.get(),
				BlockList.GLOWSTONE_BERRY_BUSH.get(),BlockList.QUARTZ_BERRY_BUSH.get(),BlockList.DIAMOND_BERRY_BUSH.get(),BlockList.EMERALD_BERRY_BUSH.get(),BlockList.LAPIS_BERRY_BUSH.get(),
				BlockList.NETHERITE_BERRY_BUSH.get()};
		
		Block[] glass = { BlockList.DARK_GLASS_BLOCK.get(), BlockList.HYDROTANK.get(), BlockList.HYDROTANK_LIGHT.get(),LightList.LIGHT_BASE_BLOCK.get()};
		
		Block[] slabs = { BlockList.GRASS_SLAB.get(),BlockList.OAK_LEAVES_SLAB.get(),BlockList.DARK_OAK_LEAVES_SLAB.get(),BlockList.JUNGLE_LEAVES_SLAB.get(),BlockList.ACACIA_LEAVES_SLAB.get(),
				BlockList.SPRUCE_LEAVES_SLAB.get(),BlockList.BIRCH_LEAVES_SLAB.get()};
		
		Block[] stairs = { BlockList.OAK_LEAVES_STAIRS.get(),BlockList.DARK_OAK_LEAVES_STAIRS.get(),BlockList.JUNGLE_LEAVES_STAIRS.get(),BlockList.ACACIA_LEAVES_STAIRS.get(),
				BlockList.SPRUCE_LEAVES_STAIRS.get(),BlockList.BIRCH_LEAVES_STAIRS.get()};

		Block[] poi = { BlockList.BEEKEEPER_POI.get(),BlockList.OLD_DERPY_POI.get(),BlockList.SEA_TRADER_POI.get(),BlockList.NETHER_TRADER_POI.get(),BlockList.SEA_TRADER_POI.get()};
		
		for (Block block : blocks) {
			ItemBlockRenderTypes.setRenderLayer(block, RenderType.cutout());
		}

		for (Block block : bushes) {
			ItemBlockRenderTypes.setRenderLayer(block, RenderType.cutout());
		}
		
		for (Block block : ore_bushes) {
			ItemBlockRenderTypes.setRenderLayer(block, RenderType.cutout());
		}
		
		for (Block block : glass) {
			ItemBlockRenderTypes.setRenderLayer(block, RenderType.translucent());
		}
		
		for (Block block : slabs) {
			ItemBlockRenderTypes.setRenderLayer(block, RenderType.cutout());
		}
		
		for (Block block : stairs) {
			ItemBlockRenderTypes.setRenderLayer(block, RenderType.cutout());
		}

		for (Block block : poi) {
			ItemBlockRenderTypes.setRenderLayer(block, RenderType.cutout());
		}
	}
}