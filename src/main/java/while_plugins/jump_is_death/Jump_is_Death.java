package while_plugins.jump_is_death;

import org.bukkit.plugin.java.JavaPlugin;
import while_plugins.jump_is_death.Listener.Jump;

import javax.print.attribute.standard.JobHoldUntil;

public final class Jump_is_Death extends JavaPlugin {
    private static JavaPlugin plugin;
    public static Jump jump;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;

        jump = new Jump();
        getServer().getPluginManager().registerEvents(jump,this);
        this.getLogger().info("[Jump_is_Death]プラグインが有効になった。");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        this.getLogger().info("[Jump_is_Death]プラグインが無効になった。");

    }


    public static  JavaPlugin getPlugin(){return plugin;}
}
