package com.solvd.footballclub.generics;

import com.solvd.footballclub.model.Player;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PlayerGen<Player> {
    public static final Logger log = LogManager.getLogger(com.solvd.footballclub.model.Player.class);
    private Player p;

    public void getPlayer(Player p) {
       log.info(p);

    }
}
