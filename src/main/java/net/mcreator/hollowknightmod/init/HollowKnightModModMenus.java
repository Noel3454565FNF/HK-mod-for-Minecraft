
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hollowknightmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.hollowknightmod.world.inventory.HollowGUIMenu;
import net.mcreator.hollowknightmod.HollowKnightModMod;

public class HollowKnightModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, HollowKnightModMod.MODID);
	public static final RegistryObject<MenuType<HollowGUIMenu>> HOLLOW_GUI = REGISTRY.register("hollow_gui",
			() -> IForgeMenuType.create(HollowGUIMenu::new));
}
