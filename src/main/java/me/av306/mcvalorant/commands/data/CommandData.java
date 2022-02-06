package me.av306.mcvalorant.commands.data;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

/**
 * POD class for command data.
 */
public class CommandData
{
	public CommandSender sender;
	public Command command;
	public String alias;
	public String[] args;
	public boolean hasArgs;

	public CommandData(CommandSender sender, Command command, String alias, String[] args ) {
		this.sender = sender;
		this.command = command;
		this.alias = alias;
		this.args = args;
		this.hasArgs = true;
	}
	public CommandData(CommandSender sender, Command command, String alias) {
		this.sender = sender;
		this.command = command;
		this.alias = alias;
		this.hasArgs= false;
	}

}