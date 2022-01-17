package exampleplugin;

import exampleplugin.commands.*;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Logger;


public class Main extends JavaPlugin
{
  public static Server server;
  public static final Logger LOGGER = Bukkit.getLogger();
  
  
  @Override
  public void onEnable()
  {
    server = this.getServer(); // get server brand
  
    LOGGER.info( String.format( "[ExamplePlugin] Hello %s server!", server.getName() ); // say hello!
    
    this.getCommand( "example" ).setExecutor( new ExampleCommand() ); // register command with name "example" defined in plugin.yml
  }
  
  
  @Override
  public void onDisable() {}
}
