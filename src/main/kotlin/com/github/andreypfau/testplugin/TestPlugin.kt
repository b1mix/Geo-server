package com.github.b1mix.testplugin

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.java.JavaPlugin

class TestPlugin : JavaPlugin(), Listener {
    override fun onEnable() {
        println("Плагин запущен")
        server.pluginManager.registerEvents(this, this)
    }

    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        val textComponent = Component.text("Добро пожаловать на GeoCraft", NamedTextColor.GREEN)
        event.player.sendMessage(textComponent)
    }
}