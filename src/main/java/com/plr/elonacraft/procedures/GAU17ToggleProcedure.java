package com.plr.elonacraft.procedures;

import net.minecraft.item.ItemStack;

import java.util.Map;

import com.plr.elonacraft.ElonacraftMod;

public class GAU17ToggleProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				ElonacraftMod.LOGGER.warn("Failed to load dependency itemstack for procedure GAU17Toggle!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((((itemstack).getOrCreateTag().getDouble("activation")) == 0)) {
			(itemstack).getOrCreateTag().putDouble("activation", 1);
		} else {
			(itemstack).getOrCreateTag().putDouble("activation", 0);
		}
	}
}
