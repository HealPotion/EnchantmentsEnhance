package com.github.healpot.plugin.enhancement.me.main;

import org.bukkit.entity.Player;

public class Permissions {

	public boolean commandHelp(Main m, Player player) {
		return player.hasPermission("Enchantmentsenhance.help") || player.hasPermission("Enchantmentsenhance.*");
	}

	public boolean commandReload(Main m, Player player) {
		return player.hasPermission("Enchantmentsenhance.reload") || player.hasPermission("Enchantmentsenhance.*");
	}

	public boolean commandVersion(Main m, Player player) {
		return player.hasPermission("Enchantmentsenhance.version") || player.hasPermission("Enchantmentsenhance.*");
	}

	public boolean commandEnhance(Main m, Player player) {
		return player.hasPermission("Enchantmentsenhance.enhance") || player.hasPermission("Enchantmentsenhance.*");
	}

	public boolean commandLore(Main m, Player player) {
		return player.hasPermission("Enchantmentsenhance.lore") || player.hasPermission("Enchantmentsenhance.*");
	}

	public boolean commandForce(Main m, Player player) {
		return player.hasPermission("Enchantmentsenhance.force") || player.hasPermission("Enchantmentsenhance.*");
	}
}