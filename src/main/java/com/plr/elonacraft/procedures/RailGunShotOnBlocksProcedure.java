package com.plr.elonacraft.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;

import java.util.Map;

import com.plr.elonacraft.ElonacraftMod;

public class RailGunShotOnBlocksProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ElonacraftMod.LOGGER.warn("Failed to load dependency x for procedure RailGunShotOnBlocks!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ElonacraftMod.LOGGER.warn("Failed to load dependency y for procedure RailGunShotOnBlocks!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ElonacraftMod.LOGGER.warn("Failed to load dependency z for procedure RailGunShotOnBlocks!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ElonacraftMod.LOGGER.warn("Failed to load dependency world for procedure RailGunShotOnBlocks!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((Math.random() <= 0.1)) {
			if (world instanceof World && !((World) world).isRemote) {
				((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 4, Explosion.Mode.NONE);
			}
		}
	}
}
