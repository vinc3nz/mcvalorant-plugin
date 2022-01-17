package exampleplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import org.jetbrains.annotations.NotNull;


public class ExampleCommand implements CommandExecutor
{
  @Override
  public boolean onCommand(
    @NotNull CommandSender sender, 
    @NotNull Command command, // (only used when handlimg multiple commands in a single class)
    @NotNull String alias, 
    @NotNull String[] args
  )
  {
    // send a message to the command sender
    sender.sendMessage( String.format( "Hello %s!", sender.getName() );
  }
}
