package muliu.myfirstmod.entity.animation;

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

public class YellowShellerAnimation {

    public static final Animation STAND_UP = Animation.Builder.create(0.79167f)
    .addBoneAnimation("body",
        new Transformation(Transformation.Targets.TRANSLATE, 
            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                Transformation.Interpolations.LINEAR), 
            new Keyframe(0.5f, AnimationHelper.createTranslationalVector(0f, 5f, 0f),
                Transformation.Interpolations.CUBIC), 
            new Keyframe(0.75f, AnimationHelper.createTranslationalVector(0f, 5f, 0f),
                Transformation.Interpolations.LINEAR)))
    .addBoneAnimation("body",
        new Transformation(Transformation.Targets.ROTATE,
            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                Transformation.Interpolations.LINEAR),
            new Keyframe(0.75f, AnimationHelper.createRotationalVector(55f, 0f, 0f),
                Transformation.Interpolations.LINEAR)))
    .addBoneAnimation("right_foot",
        new Transformation(Transformation.Targets.TRANSLATE, 
            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                Transformation.Interpolations.LINEAR), 
            new Keyframe(0.25f, AnimationHelper.createTranslationalVector(0f, 1f, 1.2f),
                Transformation.Interpolations.LINEAR), 
            new Keyframe(0.41667f, AnimationHelper.createTranslationalVector(0f, 0f, 2f),
                Transformation.Interpolations.LINEAR), 
            new Keyframe(0.75f, AnimationHelper.createTranslationalVector(0f, 1f, 4f),
                Transformation.Interpolations.LINEAR)))
    .addBoneAnimation("right_foot",
        new Transformation(Transformation.Targets.ROTATE,
            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                Transformation.Interpolations.LINEAR),
            new Keyframe(0.54167f, AnimationHelper.createRotationalVector(90f, 0f, 0f),
                Transformation.Interpolations.LINEAR)))
    .addBoneAnimation("left_foot",
        new Transformation(Transformation.Targets.TRANSLATE, 
            new Keyframe(0.16667f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                Transformation.Interpolations.LINEAR), 
            new Keyframe(0.41667f, AnimationHelper.createTranslationalVector(0f, 0.93f, 2.32f),
                Transformation.Interpolations.CUBIC), 
            new Keyframe(0.54167f, AnimationHelper.createTranslationalVector(0f, 1f, 3f),
                Transformation.Interpolations.CUBIC), 
            new Keyframe(0.75f, AnimationHelper.createTranslationalVector(0f, 1f, 4f),
                Transformation.Interpolations.LINEAR)))
    .addBoneAnimation("left_foot",
        new Transformation(Transformation.Targets.ROTATE,
            new Keyframe(0.125f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                Transformation.Interpolations.LINEAR),
            new Keyframe(0.41667f, AnimationHelper.createRotationalVector(90f, 0f, 0f),
                Transformation.Interpolations.LINEAR)))
    .addBoneAnimation("right_leg",
        new Transformation(Transformation.Targets.TRANSLATE, 
            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                Transformation.Interpolations.LINEAR), 
            new Keyframe(0.41667f, AnimationHelper.createTranslationalVector(0f, 1f, -8f),
                Transformation.Interpolations.CUBIC), 
            new Keyframe(0.75f, AnimationHelper.createTranslationalVector(0f, 1f, 0f),
                Transformation.Interpolations.LINEAR)))
    .addBoneAnimation("right_leg",
        new Transformation(Transformation.Targets.ROTATE,
            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                Transformation.Interpolations.LINEAR),
            new Keyframe(0.41667f, AnimationHelper.createRotationalVector(-90f, 0f, 0f),
                Transformation.Interpolations.CUBIC),
            new Keyframe(0.75f, AnimationHelper.createRotationalVector(12.5f, 0f, 0f),
                Transformation.Interpolations.LINEAR)))
    .addBoneAnimation("left_leg",
        new Transformation(Transformation.Targets.TRANSLATE, 
            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                Transformation.Interpolations.LINEAR), 
            new Keyframe(0.5f, AnimationHelper.createTranslationalVector(0f, -1f, -5f),
                Transformation.Interpolations.LINEAR), 
            new Keyframe(0.75f, AnimationHelper.createTranslationalVector(0f, 0f, -1f),
                Transformation.Interpolations.LINEAR)))
    .addBoneAnimation("left_leg",
        new Transformation(Transformation.Targets.ROTATE,
            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                Transformation.Interpolations.LINEAR),
            new Keyframe(0.5f, AnimationHelper.createRotationalVector(-50f, 0f, 0f),
                Transformation.Interpolations.LINEAR),
            new Keyframe(0.75f, AnimationHelper.createRotationalVector(-7.5f, 0f, 0f),
                Transformation.Interpolations.LINEAR))).build();
}