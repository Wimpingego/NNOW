package com.github.wimpingego.nnow.init;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.objects.blocks.*;
import com.github.wimpingego.nnow.objects.blocks.poi.BasePOIBlock;
import com.github.wimpingego.nnow.objects.blocks.poi.EndTraderBlock;
import com.github.wimpingego.nnow.objects.blocks.poi.MonsterTrapperBlock;
import com.github.wimpingego.nnow.objects.blocks.slabs.*;
import com.github.wimpingego.nnow.objects.blocks.stairs.*;
import com.github.wimpingego.nnow.objects.blocks.traps.*;
import com.github.wimpingego.nnow.objects.bushs.ExperienceBerryBush;
import com.github.wimpingego.nnow.objects.bushs.FireBerryBush;
import com.github.wimpingego.nnow.objects.bushs.IceBerryBush;
import com.github.wimpingego.nnow.objects.bushs.WoodenBerryBush;
import com.github.wimpingego.nnow.objects.bushs.dusts.*;
import com.github.wimpingego.nnow.objects.bushs.ores.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockList {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,NNOW.MOD_ID);
	
	public static final RegistryObject<Block> END_LANTERN = BLOCKS.register("end_lantern",() -> new LanternBlock(Block.Properties.copy(Blocks.LANTERN)));

	//Traps
	public static final RegistryObject<IronTrapBlock> IRON_TRAP = BLOCKS.register("iron_trap",() -> new IronTrapBlock(Block.Properties.copy(Blocks.IRON_BLOCK), TrapType.IRON));
	public static final RegistryObject<GoldTrapBlock> GOLDERN_TRAP = BLOCKS.register("gold_trap",() -> new GoldTrapBlock(Block.Properties.copy(Blocks.IRON_BLOCK), TrapType.GOLD));
	public static final RegistryObject<DiamondTrapBlock> DIAMOND_TRAP = BLOCKS.register("diamond_trap",() -> new DiamondTrapBlock(Block.Properties.copy(Blocks.IRON_BLOCK), TrapType.DIAMOND));
	public static final RegistryObject<WitherTrapBlock> WITHER_TRAP = BLOCKS.register("wither_trap",() -> new WitherTrapBlock(Block.Properties.copy(Blocks.IRON_BLOCK), TrapType.WITHER));
	
	//POI
	public static final RegistryObject<Block> MONSTER_TRAPPER_POI = BLOCKS.register("monster_trapper_poi",() -> new MonsterTrapperBlock(Block.Properties.copy(Blocks.STONE)));

	public static final RegistryObject<Block> BANKER_POI = BLOCKS.register("banker_poi",() -> new BasePOIBlock(Block.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));
	public static final RegistryObject<Block> OLD_DERPY_POI = BLOCKS.register("old_derpy_poi",() -> new BasePOIBlock(Block.Properties.copy(Blocks.STONE).noOcclusion()));
	public static final RegistryObject<Block> BEEKEEPER_POI = BLOCKS.register("beekeeper_poi",() -> new BasePOIBlock(Block.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));
	public static final RegistryObject<Block> SEA_FISHERMAN_POI = BLOCKS.register("sea_fisherman_poi",() -> new BasePOIBlock(Block.Properties.copy(Blocks.STONE).noOcclusion()));
	public static final RegistryObject<Block> SEA_TRADER_POI = BLOCKS.register("sea_trader_poi",() -> new BasePOIBlock(Block.Properties.copy(Blocks.STONE).noOcclusion()));
	public static final RegistryObject<Block> NETHER_TRADER_POI = BLOCKS.register("nether_trader_poi",() -> new BasePOIBlock(Block.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

	public static final RegistryObject<Block> END_TRADER_POI = BLOCKS.register("end_trader_poi",() -> new EndTraderBlock(Block.Properties.copy(Blocks.OAK_PLANKS)));

	//Blocks
	public static final RegistryObject<Block> AGG_BLOCK = BLOCKS.register("agg_block",() -> new AGBlock(Block.Properties.copy(Blocks.GRAVEL)));
	public static final RegistryObject<Block> AGS_BLOCK = BLOCKS.register("ags_block",() -> new AGBlock(Block.Properties.copy(Blocks.SAND)));
	public static final RegistryObject<Block> AGRS_BLOCK = BLOCKS.register("agrs_block",() -> new AGBlock(Block.Properties.copy(Blocks.RED_SAND)));
	
	public static final RegistryObject<Block> DARK_GLASS_BLOCK = BLOCKS.register("dark_glass_block", DarkGlass::new);
	public static final RegistryObject<Block> SUPER_OBSIDIAN = BLOCKS.register("super_obsidian", SuperObsidian::new);
	public static final RegistryObject<Block> SUPER_OBSIDIAN_BARS = BLOCKS.register("super_obsidian_bars", SuperObsidian::new);

	public static final RegistryObject<Block> HYDROTANK = BLOCKS.register("hydrotank", () -> new HydroTank(Block.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));
	public static final RegistryObject<Block> HYDROTANK_LIGHT = BLOCKS.register("hydrotank_light", () -> new HydroTankLight(Block.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().lightLevel((p_50828_) -> {return 15;})));

	//Stairs
	public static final RegistryObject<Block> GRAVEL_STAIRS = BLOCKS.register("gravel_stairs",() -> new CustomStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.GRAVEL)));
	public static final RegistryObject<Block> SAND_STAIRS = BLOCKS.register("sand_stairs",() -> new CustomStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.SAND)));
	public static final RegistryObject<Block> REDSAND_STAIRS = BLOCKS.register("redsand_stairs",() -> new CustomStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.RED_SAND)));
	public static final RegistryObject<Block> COARSEDIRT_STAIRS = BLOCKS.register("coarsedirt_stairs",() -> new CustomStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.DIRT)));
	public static final RegistryObject<Block> DIRT_STAIRS = BLOCKS.register("dirt_stairs",() -> new CustomStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.DIRT)));
	public static final RegistryObject<Block> CRACKED_STONE_STAIRS = BLOCKS.register("cracked_stone_bricks_stairs",() -> new CustomStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> BOOKSHELF_STAIRS = BLOCKS.register("bookshelf_stairs",() -> new BookshelfStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.BOOKSHELF)));
	
	public static final RegistryObject<Block> OAK_LEAVES_STAIRS = BLOCKS.register("oak_leaves_stairs",() -> new LeafStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.OAK_LEAVES)));	
	public static final RegistryObject<Block> DARK_OAK_LEAVES_STAIRS = BLOCKS.register("dark_oak_leaves_stairs",() -> new LeafStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.DARK_OAK_LEAVES)));	
	public static final RegistryObject<Block> JUNGLE_LEAVES_STAIRS = BLOCKS.register("jungle_leaves_stairs",() -> new LeafStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.JUNGLE_LEAVES)));	
	public static final RegistryObject<Block> ACACIA_LEAVES_STAIRS = BLOCKS.register("acacia_leaves_stairs",() -> new LeafStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.ACACIA_LEAVES)));	
	public static final RegistryObject<Block> SPRUCE_LEAVES_STAIRS = BLOCKS.register("spruce_leaves_stairs",() -> new SpruceStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.SPRUCE_LEAVES)));	
	public static final RegistryObject<Block> BIRCH_LEAVES_STAIRS = BLOCKS.register("birch_leaves_stairs",() -> new BirchStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.BIRCH_LEAVES)));	
	
	//Slabs
	public static final RegistryObject<Block> SUPER_OBSIDIAN_SLAB= BLOCKS.register("super_obsidian_slab", SuperObsidianSlab::new); //Set to Pickaxe
	public static final RegistryObject<Block> SUPER_OBSIDIAN_BARS_SLAB = BLOCKS.register("super_obsidian_bars_slab", SuperObsidianSlab::new); //Set to Pickaxe
	public static final RegistryObject<Block> GRASS_SLAB = BLOCKS.register("grass_slab",() -> new GrassSlab(Block.Properties.copy(Blocks.GRASS_BLOCK)));
	public static final RegistryObject<Block> PATH_SLAB = BLOCKS.register("path_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.DIRT)));
	public static final RegistryObject<Block> GRAVEL_SLAB = BLOCKS.register("gravel_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.GRAVEL)));
	public static final RegistryObject<Block> SAND_SLAB = BLOCKS.register("sand_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.SAND)));
	public static final RegistryObject<Block> REDSAND_SLAB = BLOCKS.register("redsand_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.RED_SAND)));
	public static final RegistryObject<Block> COARSEDIRT_SLAB = BLOCKS.register("coarsedirt_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.DIRT)));
	public static final RegistryObject<Block> DIRT_SLAB = BLOCKS.register("dirt_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.DIRT)));
	public static final RegistryObject<Block> CRACKED_STONE_SLAB = BLOCKS.register("cracked_stone_bricks_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> BOOKSHELF_SLAB = BLOCKS.register("bookshelf_slab",() -> new BookshelfSlabBlock(Block.Properties.copy(Blocks.BOOKSHELF)));
	
	public static final RegistryObject<Block> OAK_LEAVES_SLAB = BLOCKS.register("oak_leaves_slab",() -> new LeafSlab(Block.Properties.copy(Blocks.OAK_LEAVES)));
	public static final RegistryObject<Block> DARK_OAK_LEAVES_SLAB = BLOCKS.register("dark_oak_leaves_slab",() -> new LeafSlab(Block.Properties.copy(Blocks.DARK_OAK_LEAVES)));
	public static final RegistryObject<Block> JUNGLE_LEAVES_SLAB = BLOCKS.register("jungle_leaves_slab",() -> new LeafSlab(Block.Properties.copy(Blocks.JUNGLE_LEAVES)));
	public static final RegistryObject<Block> ACACIA_LEAVES_SLAB = BLOCKS.register("acacia_leaves_slab",() -> new LeafSlab(Block.Properties.copy(Blocks.ACACIA_LEAVES)));
	public static final RegistryObject<Block> SPRUCE_LEAVES_SLAB = BLOCKS.register("spruce_leaves_slab",() -> new SpruceSlab(Block.Properties.copy(Blocks.SPRUCE_LEAVES)));
	public static final RegistryObject<Block> BIRCH_LEAVES_SLAB = BLOCKS.register("birch_leaves_slab",() -> new BirchSlab(Block.Properties.copy(Blocks.BIRCH_LEAVES)));

	//No Item Blocks Info
	public static final DeferredRegister<Block> NO_ITEM_BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, NNOW.MOD_ID);
	
	//Bushes
	public static final RegistryObject<Block> IRON_BERRY_BUSH = NO_ITEM_BLOCK.register("iron_berry_bush",() -> new IronBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
	public static final RegistryObject<Block> COPPER_BERRY_BUSH = NO_ITEM_BLOCK.register("copper_berry_bush",() -> new CopperBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
	public static final RegistryObject<Block> GOLD_BERRY_BUSH = NO_ITEM_BLOCK.register("gold_berry_bush",() -> new GoldBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
	public static final RegistryObject<Block> COAL_BERRY_BUSH = NO_ITEM_BLOCK.register("coal_berry_bush",() -> new CoalBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
	public static final RegistryObject<Block> REDSTONE_BERRY_BUSH = NO_ITEM_BLOCK.register("redstone_berry_bush",() -> new RedstoneBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));	
	public static final RegistryObject<Block> GLOWSTONE_BERRY_BUSH = NO_ITEM_BLOCK.register("glowstone_berry_bush",() -> new GlowstoneBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));	
	public static final RegistryObject<Block> QUARTZ_BERRY_BUSH = NO_ITEM_BLOCK.register("quartz_berry_bush",() -> new QuartzBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));	
	public static final RegistryObject<Block> DIAMOND_BERRY_BUSH = NO_ITEM_BLOCK.register("diamond_berry_bush",() -> new DiamondBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));	
	public static final RegistryObject<Block> EMERALD_BERRY_BUSH = NO_ITEM_BLOCK.register("emerald_berry_bush",() -> new EmeraldBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));	
	public static final RegistryObject<Block> NETHERITE_BERRY_BUSH = NO_ITEM_BLOCK.register("netherite_berry_bush",() -> new NetheriteBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));	
	public static final RegistryObject<Block> LAPIS_BERRY_BUSH = NO_ITEM_BLOCK.register("lapis_berry_bush",() -> new LapisBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));	

	public static final RegistryObject<Block> XP_BERRY_BUSH = NO_ITEM_BLOCK.register("xp_berry_bush",() -> new ExperienceBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
	public static final RegistryObject<Block> ICE_BERRY_BUSH = NO_ITEM_BLOCK.register("ice_berry_bush",() -> new IceBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
	public static final RegistryObject<Block> FIRE_BERRY_BUSH = NO_ITEM_BLOCK.register("fire_berry_bush",() -> new FireBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
	public static final RegistryObject<Block> WOODEN_BERRY_BUSH = NO_ITEM_BLOCK.register("wooden_berry_bush",() -> new WoodenBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));

	public static final RegistryObject<Block> STONE_BERRY_BUSH = NO_ITEM_BLOCK.register("stone_berry_bush",() -> new StoneBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
	public static final RegistryObject<Block> SAND_BERRY_BUSH = NO_ITEM_BLOCK.register("sand_berry_bush",() -> new SandBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));	
	public static final RegistryObject<Block> CLAY_BERRY_BUSH = NO_ITEM_BLOCK.register("clay_berry_bush",() -> new ClayBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));	
	public static final RegistryObject<Block> DIRT_BERRY_BUSH = NO_ITEM_BLOCK.register("dirt_berry_bush",() -> new DirtBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
	public static final RegistryObject<Block> GRAVEL_BERRY_BUSH = NO_ITEM_BLOCK.register("gravel_berry_bush",() -> new GravelBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));

	//POI
	public static final RegistryObject<Block> INGOT_TRADER_POI = NO_ITEM_BLOCK.register("ingot_trader_poi",() -> new BasePOIBlock(Block.Properties.copy(Blocks.IRON_BLOCK)));

	//Config Loaded Blocks
	public static final DeferredRegister<Block> WATER = DeferredRegister.create(ForgeRegistries.BLOCKS,NNOW.MOD_ID);
	public static final RegistryObject<Block> WATERWELL = BLOCKS.register("waterwell", () -> new WaterWell(Block.Properties.copy(Blocks.IRON_BLOCK)));
	
	public static final DeferredRegister<Block> LAVA = DeferredRegister.create(ForgeRegistries.BLOCKS,NNOW.MOD_ID);
	public static final RegistryObject<Block> LAVAWELL = BLOCKS.register("lavawell",() -> new LavaWell(Block.Properties.copy(Blocks.IRON_BLOCK)));
	
	public static final DeferredRegister<Block> COBBLE_GEN = DeferredRegister.create(ForgeRegistries.BLOCKS,NNOW.MOD_ID);
	public static final RegistryObject<Block> COBBLEGEN = BLOCKS.register("cobblegen",() -> new CobbleGen(Block.Properties.copy(Blocks.IRON_BLOCK)));

}
