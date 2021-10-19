package com.plr.elonacraft.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.plr.elonacraft.ElonacraftMod;

public class LaserGunShotOnEntitiesProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ElonacraftMod.LOGGER.warn("Failed to load dependency entity for procedure LaserGunShotOnEntities!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 4);
	}
}
