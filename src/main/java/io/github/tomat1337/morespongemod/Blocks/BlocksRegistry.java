package io.github.tomat1337.morespongemod.Blocks;

import io.github.tomat1337.morespongemod.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(ModInfo.MOD_ID)
@Mod.EventBusSubscriber(modid = ModInfo.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlocksRegistry {
    //Sponge Blocks
    public static Block large_sponge =
            new SpongeBlock(Block.Properties
                    .create(Material.SPONGE)
                    .harvestTool(ToolType.get("sword"))
                    .sound(SoundType.CLOTH)
                    .hardnessAndResistance(0.5f, 0.5f)
                    , false
                    , 7
                    ,'L');
    public static Block extra_large_sponge =
            new SpongeBlock(Block.Properties
                    .create(Material.SPONGE)
                    .harvestTool(ToolType.get("sword"))
                    .sound(SoundType.CLOTH)
                    .hardnessAndResistance(0.5f, 0.5f)
                    , false
                    , 14
                    ,'E');
    public static Block lava_sponge =
            new SpongeBlock(Block.Properties
                    .create(Material.SPONGE)
                    .harvestTool(ToolType.get("sword"))
                    .sound(SoundType.CLOTH)
                    .hardnessAndResistance(0.5f, 0.5f)
                    , true
                    , 1
                    ,'N');
    public static Block lava_large_sponge =
            new SpongeBlock(Block.Properties
                    .create(Material.SPONGE)
                    .harvestTool(ToolType.get("sword"))
                    .sound(SoundType.CLOTH)
                    .hardnessAndResistance(0.5f, 0.5f)
                    , true
                    , 7
                    ,'L');
    public static Block lava_extra_large_sponge =
            new SpongeBlock(Block.Properties
                    .create(Material.SPONGE)
                    .harvestTool(ToolType.get("sword"))
                    .sound(SoundType.CLOTH)
                    .hardnessAndResistance(0.5f, 0.5f)
                    , true
                    , 14
                    ,'E');
    //Sponge Blocks Items
    public static BlockItem large_spongeItem =
            new BlockItem(large_sponge,
                    new Item
                            .Properties()
                            .maxStackSize(64)
                            .group(ItemGroup.BUILDING_BLOCKS)
            );
    public static BlockItem extra_large_spongeItem =
            new BlockItem(extra_large_sponge,
                    new Item
                            .Properties()
                            .maxStackSize(64)
                            .group(ItemGroup.BUILDING_BLOCKS)
            );
    public static BlockItem lava_spongeItem =
            new BlockItem(lava_sponge,
                    new Item
                            .Properties()
                            .maxStackSize(64)
                            .group(ItemGroup.BUILDING_BLOCKS)
            );
    public static BlockItem lava_large_spongeItem =
            new BlockItem(lava_large_sponge,
                    new Item
                            .Properties()
                            .maxStackSize(64)
                            .group(ItemGroup.BUILDING_BLOCKS)
            );
    public static BlockItem lava_extra_large_spongeItem =
            new BlockItem(lava_extra_large_sponge,
                    new Item
                            .Properties()
                            .maxStackSize(64)
                            .group(ItemGroup.BUILDING_BLOCKS)
            );
    //Wet Sponge Blocks
    public static Block wet_large_sponge =
            new WetSpongeBlock(
                    Block.Properties
                            .create(Material.SPONGE)
                            .harvestTool(ToolType.get("sword"))
                            .sound(SoundType.CLOTH)
                            .hardnessAndResistance(0.5f, 0.5f)
                    ,false
                    ,'L');
    public static Block wet_extra_large_sponge =
            new WetSpongeBlock(
                    Block.Properties
                            .create(Material.SPONGE)
                            .harvestTool(ToolType.get("sword"))
                            .sound(SoundType.CLOTH)
                            .hardnessAndResistance(0.5f, 0.5f)
                    , false
                    ,'E');
    public static Block wet_lava_sponge =
            new WetSpongeBlock(
                    Block.Properties
                            .create(Material.SPONGE)
                            .harvestTool(ToolType.get("sword"))
                            .sound(SoundType.CLOTH)
                            .hardnessAndResistance(0.5f, 0.5f)
                    , true
                    ,'N');
    public static Block wet_lava_large_sponge =
            new WetSpongeBlock(
                    Block.Properties
                            .create(Material.SPONGE)
                            .harvestTool(ToolType.get("sword"))
                            .sound(SoundType.CLOTH)
                            .hardnessAndResistance(0.5f, 0.5f)
                    , true
                    ,'L');
    public static Block wet_lava_extra_large_sponge =
            new WetSpongeBlock(
                    Block.Properties
                            .create(Material.SPONGE)
                            .harvestTool(ToolType.get("sword"))
                            .sound(SoundType.CLOTH)
                            .hardnessAndResistance(0.5f, 0.5f)
                    , true
                    ,'E');
    //Wet Sponge Blocks Items
    public static BlockItem wet_large_spongeItem =
            new BlockItem(wet_large_sponge, new
                    Item
                            .Properties()
                    .maxStackSize(64)
                    .group(ItemGroup.BUILDING_BLOCKS)
            );
    public static BlockItem wet_extra_large_spongeItem =
            new BlockItem(wet_extra_large_sponge, new
                    Item
                            .Properties()
                    .maxStackSize(64)
                    .group(ItemGroup.BUILDING_BLOCKS)
            );
    public static BlockItem wet_lava_spongeItem =
            new BlockItem(wet_lava_sponge, new
                    Item
                            .Properties()
                    .maxStackSize(64)
                    .group(ItemGroup.BUILDING_BLOCKS)
            );
    public static BlockItem wet_lava_large_spongeItem =
            new BlockItem(wet_lava_large_sponge, new
                    Item
                            .Properties()
                    .maxStackSize(64)
                    .group(ItemGroup.BUILDING_BLOCKS)
            );
    public static BlockItem wet_lava_extra_large_spongeItem =
            new BlockItem(wet_lava_extra_large_sponge, new
                    Item
                            .Properties()
                    .maxStackSize(64)
                    .group(ItemGroup.BUILDING_BLOCKS)
            );

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                //Sponge Blocks Registry
                large_sponge.setRegistryName("large_sponge"),
                extra_large_sponge.setRegistryName("extra_large_sponge"),
                lava_sponge.setRegistryName("lava_sponge"),
                lava_large_sponge.setRegistryName("lava_large_sponge"),
                lava_extra_large_sponge.setRegistryName("lava_extra_large_sponge"),
                //Wet Sponge Blocks Registry
                wet_large_sponge.setRegistryName("wet_large_sponge"),
                wet_extra_large_sponge.setRegistryName("wet_extra_large_sponge"),
                wet_lava_sponge.setRegistryName("wet_lava_sponge"),
                wet_lava_large_sponge.setRegistryName("wet_lava_large_sponge"),
                wet_lava_extra_large_sponge.setRegistryName("wet_lava_extra_large_sponge")
        );
    }
    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(
                //Sponge Blocks Items Registry
                large_spongeItem.setRegistryName("large_sponge"),
                extra_large_spongeItem.setRegistryName("extra_large_sponge"),
                lava_spongeItem.setRegistryName("lava_sponge"),
                lava_large_spongeItem.setRegistryName("lava_large_sponge"),
                lava_extra_large_spongeItem.setRegistryName("lava_extra_large_sponge"),
                //Wet Sponge Blocks Items Registry
                wet_large_spongeItem.setRegistryName("wet_large_sponge"),
                wet_extra_large_spongeItem.setRegistryName("wet_extra_large_sponge"),
                wet_lava_spongeItem.setRegistryName("wet_lava_sponge"),
                wet_lava_large_spongeItem.setRegistryName("wet_lava_large_sponge"),
                wet_lava_extra_large_spongeItem.setRegistryName("wet_lava_extra_large_sponge")
        );
    }
}
