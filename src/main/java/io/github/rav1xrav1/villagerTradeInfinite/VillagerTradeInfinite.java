package io.github.rav1xrav1.villagerTradeInfinite;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class VillagerTradeInfinite extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("�v���O�C���C�����l������������J�n���܂����B");
        // Objects.requireNonNull(getCommand("test")).setExecutor(new Command());
        Bukkit.getServer().getPluginManager().registerEvents(new EventListenerClass(this), this); // register:�o�^
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("�v���O�C��ver2����~���܂����B");
    }
}
