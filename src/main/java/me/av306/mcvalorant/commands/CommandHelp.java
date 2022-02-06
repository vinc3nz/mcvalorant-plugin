package me.av306.mcvalorant.commands;

import me.av306.mcvalorant.Main;
import me.av306.mcvalorant.Tools;
import me.av306.mcvalorant.commands.data.CommandData;

/**
 * POD class for `help` subcommand.
 */
public class CommandHelp
{
	public CommandHelp() {}
	
	public static void run( CommandData data )
	{
		data.sender.sendMessage(Tools.format(Main.config.get("messages.help").toString()));
	}
}