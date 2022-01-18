package me.av306.mcvalorant.commands;

import static me.av306.mcvalorant.Main.*;

import me.av306.mcvalorant.commands.*;
import me.av306.commands.data.CommandData;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Arrays;

/**
 * MCValorant command dispatcher.
 *
 * Due to a quirk in the Spigot plugin system,
 * we are unable to register more than one command.
 *
 * One way to mitigate this is to use a fake command registry, like Fundy does;
 * or to use a central dispatcher, which is used here.
 *
 * The limitation of this method is that there is only one command registered.
 */
public class CommandDispatcher implements CommandExecutor
{
	@Override
	public boolean onCommand( CommandSender sender, Command command, String alias, String[] args )
	{
		CommandData data = new CommandData( sender, command, alias, Arrays.asList(args).remove(0) );
		
		switch ( args[1].toLowerCase() )
		{
			case "help":
				new CommandHelp().run( data );
				break;
				
			case "addplayer":
				break;

			case "start":
				break;

			case "end":
				break;

			case "weapons":
				break;

			default:
				sender.sendMessage( ERROR + "Invalid subcommand!" );
				return false;
		}

		return true;
	}
}