package com.github.testplugin

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.java.JavaPlugin

class TestPlugin : JavaPlugin(), Listener {
    override fun onEnable() {
        println("Плагин запущен")
    }

    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        val textComponent = Component.text("Привет", NamedTextColor.GREEN)
        event.player.sendMessage(textComponent)
    }
}