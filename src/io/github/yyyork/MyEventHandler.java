package io.github.yyyork;

import org.bukkit.*;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.entity.Player;

import java.util.List;

public class MyEventHandler implements Listener {
    private List<String> worlds;

    public MyEventHandler(){
        worlds = new YmlFileReader().getVaildWorlds();
    }

    @org.bukkit.event.EventHandler
    public void onPlayerBreak(BlockBreakEvent event){
        Player player = event.getPlayer();
        if(worlds.contains(player.getWorld().getName())){
                if(event.getBlock().getType().equals(Material.COAL_ORE)
                        ||event.getBlock().getType().equals(Material.GOLD_ORE)
                        ||event.getBlock().getType().equals(Material.CHEST)
                        ||event.getBlock().getType().equals(Material.CHEST_MINECART)
                        ||event.getBlock().getType().equals(Material.TRAPPED_CHEST)
                        ||event.getBlock().getType().equals(Material.IRON_ORE)
                        ||event.getBlock().getType().equals(Material.DIAMOND_ORE)
                        ||event.getBlock().getType().equals(Material.REDSTONE_ORE)
                        ||event.getBlock().getType().equals(Material.NETHER_GOLD_ORE)
                        ||event.getBlock().getType().equals(Material.NETHER_QUARTZ_ORE)
                        ||event.getBlock().getType().equals(Material.LAPIS_ORE)
                        ||event.getBlock().getType().equals(Material.SPRUCE_WOOD)
                        ||event.getBlock().getType().equals(Material.OAK_WOOD)
                        ||event.getBlock().getType().equals(Material.ACACIA_WOOD)
                        ||event.getBlock().getType().equals(Material.BIRCH_WOOD)
                        ||event.getBlock().getType().equals(Material.DARK_OAK_WOOD)
                        ||event.getBlock().getType().equals(Material.JUNGLE_WOOD)
                        ||event.getBlock().getType().equals(Material.OAK_LOG)
                        ||event.getBlock().getType().equals(Material.SPRUCE_LOG)
                        ||event.getBlock().getType().equals(Material.ACACIA_LOG)
                        ||event.getBlock().getType().equals(Material.BIRCH_LOG)
                        ||event.getBlock().getType().equals(Material.DARK_OAK_LOG)
                        ||event.getBlock().getType().equals(Material.SPRUCE_LOG)
                        ||event.getBlock().getType().equals(Material.JUNGLE_LOG)){
                    event.setDropItems(true);
                    player.playSound(
                            player.getLocation(), // Location ??????????????????
                            Sound.ENTITY_EXPERIENCE_ORB_PICKUP, // ??????
                            SoundCategory.HOSTILE, // ?????????????????????
                            1, // ??????????????????????????????
                            1 // ????????????
                    );
                    player.sendMessage("??7[??6??????????????7]??a????????????????????????");
                    }else{
                event.setDropItems(false);
                    player.playSound(
                            player.getLocation(), // Location ??????????????????
                            Sound.BLOCK_WOODEN_BUTTON_CLICK_OFF, // ??????
                            SoundCategory.HOSTILE, // ?????????????????????
                            1, // ??????????????????????????????
                            1 // ????????????
                    );
                player.sendMessage("??7[??6??????????????7]??c?????????????????????????????????????????????");}
        }
    }
}
