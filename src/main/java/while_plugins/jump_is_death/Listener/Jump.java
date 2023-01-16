package while_plugins.jump_is_death.Listener;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class Jump implements Listener {

    @EventHandler
    public void JumpDeath(PlayerJumpEvent e){
        Player player = e.getPlayer();

        //ゲームモード確認、サバイバル以外return
        if (!(player.getGameMode().equals(GameMode.SURVIVAL))){
            return;
        }

        player.setHealth(0);
    }


}
