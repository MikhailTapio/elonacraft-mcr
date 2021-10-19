package com.plr.elonacraft.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.plr.elonacraft.ElonacraftMod;

public class RailGunShotOnEntitiesProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ElonacraftMod.LOGGER.warn("Failed to load dependency entity for procedure RailGunShotOnEntities!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ElonacraftMod.LOGGER.warn("Failed to load dependency world for procedure RailGunShotOnEntities!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 8);
		if ((Math.random() <= 0.1)) {
			if (world instanceof World && !((World) world).isRemote) {
				((World) world).createExplosion(null, (int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ()), (float) 4,
						Explosion.Mode.NONE);
			}
		}
	}
}
