package io.github.yyyork;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class MyDrops extends JavaPlugin {
    public static JavaPlugin instance;
    @Override
    public void onEnable() {
        instance=this;
        saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(new MyEventHandler(), this);
        this.getLogger().info("§a[MyDrops]§e插件作者 大鸭梨 , QQ 2264117533");
        this.getLogger().info("§a[MyDrops]§eMyDrops v1.0 开启成功！");
    }
}
