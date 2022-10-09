package io.github.rav1xrav1.villagerTradeInfinite;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class VillagerTradeInfinite extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("プラグインイン村人取引無限化が開始しました。");
        // Objects.requireNonNull(getCommand("test")).setExecutor(new Command());
        Bukkit.getServer().getPluginManager().registerEvents(new EventListenerClass(this), this); // register:登録
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("プラグインver2が停止しました。");
    }
}
