package me.av306.mcvalorant.commands;

import me.av306.mcvalorant.Main;
import me.av306.mcvalorant.Tools;
import me.av306.mcvalorant.commands.data.CommandData;

public class CommandExample {
    public CommandExample() {}

    public static void run( CommandData data )
    {
        String a = "";
        // Looping all args
        for (String arg : data.args) {
            a+=arg + ",";
        }
        //Removing ',' from the end of string
        a = a.substring(0,a.length()-1);
        data.sender.sendMessage(Tools.format("&6&n&lSome example Command\n&3Send with following arguments: &7" + a + "\n&3Send from player: &7" + data.sender.getName()));
    }
}
