package me.av306.mcvalorant.commands.data;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;

/**
 * POD class for command data.
 */
public class CommandData
{
	public CommandSender sender;
	public Command command;
	public String alias;
	public ArrayList<String> args = new ArrayList<>();

	public CommandData( CommandSender sender, Command command, String alias, ArrayList<String> args )
	{
		this.sender = sender;
		this.command = command;
		this.alias = alias;
		this.args = args;
	}
}