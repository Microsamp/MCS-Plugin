package net.mcsproject.cloudsigns;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

/**
 * Created by René on 14.09.2015.
 */
public class MCS extends JavaPlugin{

    @Override
    public void onLoad(){

    }

    @Override
    public void onEnable(){
        long startTime = System.currentTimeMillis();

        //Here everything else

        long stopTime = System.currentTimeMillis();

        this.getLogger().log(Level.INFO, "MCS-Signs Plugin version "
                + this.getDescription().getVersion() + "by "
                + this.getDescription().getAuthors().toString().replaceAll("(\\[|\\])", "") + " enabled! ("
                + " enabled. ("
                + (stopTime - startTime) + " ms)");
    }

    @Override
    public void onDisable(){

    }
}
