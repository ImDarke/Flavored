package net.codenamed.flavored.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.codenamed.flavored.Flavored;
import net.codenamed.flavored.block.custom.*;
import net.codenamed.flavored.item.FlavoredItems;
import net.codenamed.flavored.world.tree.AncientSaplingGenerator;

public class FlavoredBlocks {

    public static final Block PALM_STEM = registerBlock("palm_stem",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));

    public static final Block STRIPPED_PALM_STEM = registerBlock("stripped_palm_stem",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));

    public static final Block PALM_WOOD = registerBlock("palm_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_PALM_WOOD = registerBlock("stripped_palm_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block PALM_PLANKS = registerBlock("palm_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block PALM_STAIRS = registerBlock("palm_stairs",
            new StairsBlock(FlavoredBlocks.PALM_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));

    public static final Block PALM_SLAB = registerBlock("palm_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));

    public static final Block PALM_DOOR = registerBlock("palm_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));

    public static final Block PALM_TRAPDOOR = registerBlock("palm_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block PALM_FENCE = registerBlock("palm_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));

    public static final Block PALM_FENCE_GATE = registerBlock("palm_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block PALM_BUTTON = registerBlock("palm_button",
            Blocks.createWoodenButtonBlock(BlockSetType.OAK));

    public static final Block PALM_PRESSURE_PLATE = registerBlock("palm_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));

    public static final Block PALM_SIGN= registerBlock("palm_sign",
            new SignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), WoodType.OAK));

    public static final Block PALM_HANGING_SIGN = registerBlock("palm_hanging_sign",
            new HangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), WoodType.OAK));

    public static final Block PALM_LEAVES = registerBlock("palm_leaves",
            new PalmLeavesBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LEAVES)));

    public static final Block PALM_SAPLING = registerBlock("palm_sapling",
            new SaplingBlock(new AncientSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

    public static final Block ANCIENT_LOG = registerBlock("ancient_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));

    public static final Block STRIPPED_ANCIENT_LOG = registerBlock("stripped_ancient_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));

    public static final Block ANCIENT_WOOD = registerBlock("ancient_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_ANCIENT_WOOD = registerBlock("stripped_ancient_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block ANCIENT_PLANKS = registerBlock("ancient_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block ANCIENT_STAIRS = registerBlock("ancient_stairs",
            new StairsBlock(FlavoredBlocks.ANCIENT_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));

    public static final Block ANCIENT_SLAB = registerBlock("ancient_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));

    public static final Block ANCIENT_DOOR = registerBlock("ancient_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));

    public static final Block ANCIENT_TRAPDOOR = registerBlock("ancient_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block ANCIENT_FENCE = registerBlock("ancient_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));

    public static final Block ANCIENT_FENCE_GATE = registerBlock("ancient_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block ANCIENT_BUTTON = registerBlock("ancient_button",
            Blocks.createWoodenButtonBlock(BlockSetType.OAK));

    public static final Block ANCIENT_PRESSURE_PLATE = registerBlock("ancient_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));

    public static final Block ANCIENT_SIGN= registerBlock("ancient_sign",
            new SignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), WoodType.OAK));

    public static final Block ANCIENT_HANGING_SIGN = registerBlock("ancient_hanging_sign",
            new HangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), WoodType.OAK));

    public static final Block ANCIENT_LEAVES = registerBlock("ancient_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.AZALEA_LEAVES)));

    public static final Block ANCIENT_SAPLING = registerBlock("ancient_sapling",
            new SaplingBlock(new AncientSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

    public static final Block FLOWERING_ANCIENT_LEAVES = registerBlock("flowering_ancient_leaves",
            new FloweringAncientLeavesBlock(FabricBlockSettings.copyOf(Blocks.AZALEA_LEAVES)));


    public static final Block PIZZA = registerBlock("pizza",
            new PizzaBlock(FabricBlockSettings.copyOf(Blocks.CAKE).strength(0.5f, 0.5f)));

    public static final Block GARLIC_BREAD = registerBlock("garlic_bread",
            new GarlicBreadBlock(FabricBlockSettings.copyOf(Blocks.CAKE).strength(0.5f, 0.5f)));

    public static final Block PUDDING = registerBlock("pudding",
            new PuddingBlock(FabricBlockSettings.copyOf(Blocks.CAKE).strength(0.4f, 0.4f)));

    public static final Block CHEESE = registerBlock("cheese",
            new CheeseBlock(FabricBlockSettings.copyOf(Blocks.CAKE).strength(0.5f, 0.5f)));

    public static final Block CORNUCOPIA = registerBlock("cornucopia",
            new CornucopiaBlock(FabricBlockSettings.copyOf(Blocks.CAKE).strength(0.5f, 0.5f)));

    public static final Block CAULIFLOWER = registerBlock("cauliflower",
            new CauliflowerBlock(FabricBlockSettings.create().mapColor(MapColor.WHITE).instrument(Instrument.DIDGERIDOO).strength(1.0F).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PLANT_POT = registerBlock("plant_pot",
            new PlantPotBlock(FabricBlockSettings.copyOf(Blocks.DECORATED_POT).strength(1.5F, 3.0F).sounds(BlockSoundGroup.STONE).nonOpaque().requiresTool()));
    public static final Block FERMENTER = registerBlock("fermenter",
            new FermenterBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)));

    public static final Block OVEN = registerBlock("oven",
            new OvenBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));

    public static final Block RANGE = registerBlock("range",
            new RangeBlock(FabricBlockSettings.copyOf(Blocks.CAULDRON)));

    public static final Block BOILER = registerBlock("boiler",
            new BoilerBlock(FabricBlockSettings.copyOf(Blocks.CAULDRON)));





    public static final Block CAULIFLOWER_STEM = registerBlock("cauliflower_stem",
            new StemBlock((GourdBlock)CAULIFLOWER, () -> {
                return FlavoredItems.CAULIFLOWER_SEEDS;
            }, FabricBlockSettings.create().mapColor(MapColor.LICHEN_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.STEM).pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block ATTACHED_CAULIFLOWER_STEM = registerBlock("attached_cauliflower_stem",
            new AttachedStemBlock((GourdBlock)CAULIFLOWER, () -> {
                return FlavoredItems.CAULIFLOWER_SEEDS;
            }, FabricBlockSettings.create().mapColor(MapColor.LICHEN_GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block CARVED_CAULIFLOWER = registerBlock("carved_cauliflower",
            new WearableCarvedCauliflowerBlock(FabricBlockSettings.create().mapColor(MapColor.WHITE).strength(1.0F).sounds(BlockSoundGroup.WOOD).allowsSpawning(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CARVED_MELON = registerBlock("carved_melon",
            new WearableCarvedMelonBlock(FabricBlockSettings.create().mapColor(MapColor.GREEN).strength(1.0F).sounds(BlockSoundGroup.WOOD).allowsSpawning(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GARLICS = registerBlock("garlics",
            new GarlicsBlock(FabricBlockSettings.copyOf(Blocks.CARROTS)
                    .mapColor(MapColor.PALE_GREEN)
                    .noCollision().ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CROP)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SPINACHES = registerBlock("spinaches",
            new SpinachesBlock(FabricBlockSettings.copyOf(Blocks.CARROTS)
                    .mapColor(MapColor.GREEN)
                    .noCollision().ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CROP)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block TOMATO_CROP = registerBlockWithoutItem("tomato_crop",
            new TomatoCropBlock(FabricBlockSettings.copy(Blocks.SWEET_BERRY_BUSH)
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .nonOpaque()
                    .sounds(BlockSoundGroup.SWEET_BERRY_BUSH)));

    public static final Block ROSEMARY_BUSH = registerBlockWithoutItem("rosemary_bush",
            new RosemaryBushBlock(FabricBlockSettings.copy(Blocks.SWEET_BERRY_BUSH)
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .nonOpaque()
                    .sounds(BlockSoundGroup.SWEET_BERRY_BUSH)));

    public static final Block FIG = registerBlockWithoutItem("fig",
            new FigBlock(FabricBlockSettings.copy(Blocks.SWEET_BERRY_BUSH)
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .nonOpaque()
                    .sounds(BlockSoundGroup.SWEET_BERRY_BUSH)));

    public static final Block DATES = registerBlockWithoutItem("dates",
            new DatesBlock(FabricBlockSettings.copy(Blocks.SWEET_BERRY_BUSH)
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .nonOpaque()
                    .sounds(BlockSoundGroup.SWEET_BERRY_BUSH)));

    public static Block CRATE = null;

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Flavored.MOD_ID, name), block);
    }

    public  static  void  registerCrate() {
        CRATE = registerBlock("crate",
                new CrateBlock(FabricBlockSettings.copyOf(Blocks.COMPOSTER)));
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Flavored.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    private static Block registerBlockWithoutItem(String name, Block block) {

        return Registry.register(Registries.BLOCK, new Identifier(Flavored.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        Flavored.LOGGER.info("Registering ModBlocks for " + Flavored.MOD_ID);
    }
}
