package me.av306.mcvalorant.commands;

import static me.av306.mcvalorant.Main.*;

import me.av306.mcvalorant.Main;
import me.av306.mcvalorant.Tools;
import me.av306.mcvalorant.commands.data.CommandData;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.lang.reflect.Method;
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
public class CommandDispatcher implements CommandExecutor {
	@Override
	public boolean onCommand( CommandSender sender, Command command, String alias, String[] args )
	{
		CommandData data = new CommandData( sender, command, alias, args );

		if(args.length <= 0) sender.sendMessage(Tools.format(Main.config.get("messages.help").toString()));
		if(args.length <= 0) return true;

		switch ( args[0].toLowerCase() )
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
			case "example":
				new CommandExample().run(data);
				break;

			default:
				sender.sendMessage(Tools.format(Main.config.get("messages.subcommand_not_found").toString()));
				//new CommandHelp().run( data );
				return true;
		}

		return true;
	}
}