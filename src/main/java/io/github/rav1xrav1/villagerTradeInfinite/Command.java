package io.github.rav1xrav1.villagerTradeInfinite;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Objects;

public class Command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        if (Objects.equals(label, "test")){
            sender.sendMessage("testコマンドが入力されました。");
            return true;
        }
        return false;
    }
}
