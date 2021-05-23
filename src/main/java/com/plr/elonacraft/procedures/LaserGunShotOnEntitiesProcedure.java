package com.plr.elonacraft.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.plr.elonacraft.ElonacraftModElements;
import com.plr.elonacraft.ElonacraftMod;

@ElonacraftModElements.ModElement.Tag
public class LaserGunShotOnEntitiesProcedure extends ElonacraftModElements.ModElement {
	public LaserGunShotOnEntitiesProcedure(ElonacraftModElements instance) {
		super(instance, 8);
	}

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
