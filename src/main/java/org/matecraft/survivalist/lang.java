/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.matecraft.survivalist;

import org.bukkit.entity.Player;

/**
 *
 * @author martin
 */
public class lang {
    private final survivalist plugin;

    public lang(survivalist plugin) {
        this.plugin = plugin;
    }
    
    public void info(Player p) {
        p.sendMessage("Info about Survivalist");
    }
}
