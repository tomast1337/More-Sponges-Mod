package io.github.tomat1337.morespongemod.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Random;

public class WetSpongeBlock  extends Block {
    private boolean islava;
    private char type;

    protected WetSpongeBlock(Properties properties, boolean islava,char type) {
        super(properties);
        this.islava = islava;
        this.type = type;
    }

    public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving) {
        if (worldIn.getDimension().doesWaterVaporize() && !islava) {//water sponges
            if (type == 'E')//extra large
                worldIn.setBlockState(pos, BlocksRegistry.extra_large_sponge.getDefaultState(), 3);
            else if (type == 'L')//large
                worldIn.setBlockState(pos, BlocksRegistry.large_sponge.getDefaultState(), 3);
            worldIn.playEvent(2009, pos, 0);
            worldIn.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 1.0F, (1.0F + worldIn.getRandom().nextFloat() * 0.2F) * 0.7F);
        }
        if (!worldIn.getDimension().doesWaterVaporize() && islava) {//lava sponges
            if (type == 'E')//extra large
                worldIn.setBlockState(pos, BlocksRegistry.lava_extra_large_sponge.getDefaultState(), 3);
            else if (type == 'L')//large
                worldIn.setBlockState(pos, BlocksRegistry.lava_large_sponge.getDefaultState(), 3);
            else// normal
                worldIn.setBlockState(pos, BlocksRegistry.lava_sponge.getDefaultState(), 3);
            worldIn.playEvent(2009, pos, 0);
            worldIn.playSound((PlayerEntity) null, pos, SoundEvents.AMBIENT_UNDERWATER_ENTER, SoundCategory.BLOCKS, 1.0F, (1.0F + worldIn.getRandom().nextFloat() * 0.2F) * 0.7F);
        }

    }

    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        Direction direction = Direction.random(rand);
        if (direction != Direction.UP) {
            BlockPos blockpos = pos.offset(direction);
            BlockState blockstate = worldIn.getBlockState(blockpos);
            if (!stateIn.isSolid() || !blockstate.isSolidSide(worldIn, blockpos, direction.getOpposite())) {
                double d0 = (double)pos.getX();
                double d1 = (double)pos.getY();
                double d2 = (double)pos.getZ();
                if (direction == Direction.DOWN) {
                    d1 = d1 - 0.05D;
                    d0 += rand.nextDouble();
                    d2 += rand.nextDouble();
                } else {
                    d1 = d1 + rand.nextDouble() * 0.8D;
                    if (direction.getAxis() == Direction.Axis.X) {
                        d2 += rand.nextDouble();
                        if (direction == Direction.EAST) {
                            ++d0;
                        } else {
                            d0 += 0.05D;
                        }
                    } else {
                        d0 += rand.nextDouble();
                        if (direction == Direction.SOUTH) {
                            ++d2;
                        } else {
                            d2 += 0.05D;
                        }
                    }
                }
                if(islava) {
                    if (rand.nextInt(5) == 0) {
                        for (int i = 0; i < rand.nextInt(1) + 1; ++i) {
                            worldIn.addParticle(ParticleTypes.LAVA, (double) ((float) pos.getX() + 0.5F), (double) ((float) pos.getY() + 0.5F), (double) ((float) pos.getZ() + 0.5F), (double) (rand.nextFloat() / 2.0F), 5.0E-5D, (double) (rand.nextFloat() / 2.0F));
                            worldIn.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, (double) ((float) pos.getX() + 0.5F), (double) ((float) pos.getY() + 0.5F), (double) ((float) pos.getZ() + 0.5F), (double) (rand.nextFloat() / 2.0F), 5.0E-5D, (double) (rand.nextFloat() / 2.0F));
                        }
                    }
                    worldIn.addParticle(ParticleTypes.LANDING_LAVA, d0, d1, d2, 0.0D, 0.0D, 0.0D);
                }
                else
                    worldIn.addParticle(ParticleTypes.DRIPPING_WATER, d0, d1, d2, 0.0D, 0.0D, 0.0D);
            }
        }
    }
}
