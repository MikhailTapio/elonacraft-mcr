package com.plr.elonacraft.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.plr.elonacraft.item.GAU17Item;
import com.plr.elonacraft.ElonacraftMod;

public class GAU17ActivatedRequirementProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ElonacraftMod.LOGGER.warn("Failed to load dependency entity for procedure GAU17ActivatedRequirement!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == GAU17Item.block)
				&& ((!(entity.isSneaking())) && ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getOrCreateTag().getDouble("activation")) == 1)))) {
			return (true);
		}
		return (false);
	}
}
