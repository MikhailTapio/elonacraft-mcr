package com.plr.elonacraft.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.plr.elonacraft.item.ECellItem;
import com.plr.elonacraft.ElonacraftMod;

public class RailGunUseableProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ElonacraftMod.LOGGER.warn("Failed to load dependency entity for procedure RailGunUseable!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		return ((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(ECellItem.block)) : false);
	}
}
