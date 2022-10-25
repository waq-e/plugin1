package me.waqe.plugin1

import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.Bukkit
import org.bukkit.event.player.PlayerInteractEntityEvent
import org.bukkit.entity.EntityType
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener

class Plugin1 : JavaPlugin(), Listener {

    override fun onEnable() {
        super.onEnable()
        Bukkit.getPluginManager().registerEvents(this, this)
    }

    @EventHandler
    fun onRightClick(event: PlayerInteractEntityEvent) {
        if (event.rightClicked.type == EntityType.COW)
            event.rightClicked.world.createExplosion(event.rightClicked.location,5f)
    }
}