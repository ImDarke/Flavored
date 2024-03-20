package net.codenamed.flavored.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.codenamed.flavored.block.FlavoredBlocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CropBlock.class)
public abstract class CropBlockMixin extends Block {
    public CropBlockMixin(Settings settings) {
        super(settings);
    }

    @Inject(method = "canPlantOnTop", at = @At("HEAD"), cancellable = true)
    private void yourModId$allowSeedingOnPlanter(BlockState floor, BlockView world, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        if (floor.isOf(FlavoredBlocks.PLANT_POT)) {
            cir.setReturnValue(true);
        }
    }

    @Inject(method = "getAvailableMoisture", at = @At("HEAD"), cancellable = true)
    private static void yourModId$alwaysMoist(Block block, BlockView world, BlockPos pos, CallbackInfoReturnable<Float> cir) {
        if (block instanceof CropBlock) {
            cir.setReturnValue(7.0F);
        }
    }
}