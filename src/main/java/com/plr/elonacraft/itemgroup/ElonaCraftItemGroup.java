
package com.plr.elonacraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.plr.elonacraft.item.RailGunItem;
import com.plr.elonacraft.ElonacraftModElements;

@ElonacraftModElements.ModElement.Tag
public class ElonaCraftItemGroup extends ElonacraftModElements.ModElement {
	public ElonaCraftItemGroup(ElonacraftModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabelona_craft") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RailGunItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
