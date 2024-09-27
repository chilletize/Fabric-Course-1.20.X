package net.chilletize.mccourse.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().hunger(4).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 30), 0.25f).build();
    public static final FoodComponent BURGER = new FoodComponent.Builder().hunger(10).saturationModifier(0.5f)
            .build();
    public static final FoodComponent NUGGET = new FoodComponent.Builder().hunger(6).saturationModifier(0.4f)
            .build();
}
