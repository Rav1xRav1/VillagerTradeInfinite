package io.github.rav1xrav1.villagerTradeInfinite;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.inventory.MerchantRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class EventListenerClass implements Listener {

    public EventListenerClass(JavaPlugin samplePlugin){
        samplePlugin.getLogger().info("[Rav1System] ���l����������N��");
    }

    @EventHandler
    public void onVillagerClick(PlayerInteractAtEntityEvent event){
        if(event.getRightClicked().getType() == EntityType.VILLAGER){
            Villager villager = (Villager) event.getRightClicked(); // �v���C���[���E�N���b�N�����G���e�B�e�B���擾

            if(villager.getProfession() != Villager.Profession.NITWIT || villager.getProfession() != Villager.Profession.NONE){
                List<MerchantRecipe> new_recipes = new ArrayList<>();
                for (MerchantRecipe recipe:
                        villager.getRecipes()) {
                    recipe.setMaxUses(Integer.MAX_VALUE);
                    recipe.setUses(0);
                    new_recipes.add(recipe);
                }

                villager.setRecipes(new_recipes); // ���V�s�o�^
            }
        }
    }
}