package com.kotletland.client;

import java.io.File;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;

import com.kotletland.client.module.ModuleManager;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = KotletClient.MODID, name = "Kotlet Client", version = KotletClient.VERSION,
        clientSideOnly = true, acceptedMinecraftVersions = "[1.8.9]")
public class KotletClient {
    public static final String MODID = "kotletclient";
    public static final String VERSION = "1.2.0";
    public static KeyBinding openKey;
    public static KeyBinding zoomKey;
    public static KeyBinding hudKey;
    public static KeyBinding fullbrightKey;
    private File configDir;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        configDir = e.getModConfigurationDirectory();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        openKey = new KeyBinding("Open Menu", Keyboard.KEY_RSHIFT, "Kotlet Client");
        zoomKey = new KeyBinding("Zoom", Keyboard.KEY_C, "Kotlet Client");
        hudKey = new KeyBinding("Toggle HUD", Keyboard.KEY_NONE, "Kotlet Client");
        fullbrightKey = new KeyBinding("Toggle Fullbright", Keyboard.KEY_NONE, "Kotlet Client");
        ClientRegistry.registerKeyBinding(openKey);
        ClientRegistry.registerKeyBinding(hudKey);
        ClientRegistry.registerKeyBinding(fullbrightKey);
        ClientRegistry.registerKeyBinding(zoomKey);

        ModuleManager.init();
        Config.init(configDir);

        MinecraftForge.EVENT_BUS.register(new EventHandler());
        Display.setTitle("Kotlet Client " + VERSION + " | KotletLand");
    }
}
