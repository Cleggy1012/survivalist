/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.matecraft.survivalist;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author martin
 */
public class survivalist extends JavaPlugin{
    
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        
        String cmdName = (cmd.getName().toLowerCase());
        
        switch (cmdName) {
            case "survivalist":
                
                break;
        }
        
        
        return false;
    }
    
}
