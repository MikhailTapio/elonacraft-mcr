package com.plr.elonacraft.procedures;

import net.minecraft.entity.Entity;

import java.util.Map;

import com.plr.elonacraft.ElonacraftModElements;
import com.plr.elonacraft.ElonacraftMod;

@ElonacraftModElements.ModElement.Tag
public class GunRecoilProcedure extends ElonacraftModElements.ModElement {
	public GunRecoilProcedure(ElonacraftModElements instance) {
		super(instance, 14);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ElonacraftMod.LOGGER.warn("Failed to load dependency entity for procedure GunRecoil!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.rotationPitch = (float) (((entity.rotationPitch) - 1));
	}
}
