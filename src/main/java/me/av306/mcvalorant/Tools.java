package me.av306.mcvalorant;

import org.bukkit.ChatColor;

public class Tools {
    public static String format(String message) {
        return ChatColor.translateAlternateColorCodes(Main.config.get("general.colorcodes").toString().charAt(0), message.replaceAll("%PREFIX%", Main.config.get("messages.prefix").toString()));
    }
}
