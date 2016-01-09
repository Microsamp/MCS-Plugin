package net.mcsproject.bungee;

import net.md_5.bungee.api.plugin.Plugin;

import java.util.logging.Level;

/**
 * Created by Phenomax on 09.01.2016.
 * Contributing to: https://github.com/MinecraftCloudSystem/MCS-Plugin/
 */
public class MCS extends Plugin {

    @Override
    public void onEnable() {

        long startTime = System.currentTimeMillis();

        //Here everything else

        long stopTime = System.currentTimeMillis();
        this.getLogger().log(Level.INFO, "MCS-BungeeCord Plugin version "
                + this.getDescription().getVersion() + "by "
                + this.getDescription().getAuthor().replaceAll("(\\[|\\])", "") + " enabled! ("
                + " enabled. ("
                + (stopTime - startTime) + " ms)");
    }

    @Override
    public void onDisable() {

    }
}
