package com.plr.elonacraft.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;

import java.util.Map;

import com.plr.elonacraft.ElonacraftMod;

public class PutitSpawnProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ElonacraftMod.LOGGER.warn("Failed to load dependency world for procedure PutitSpawn!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (((world instanceof World) ? ((World) world).isDaytime() : false)) {
			return (false);
		}
		return (true);
	}
}
