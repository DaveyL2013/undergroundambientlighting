package me.andante.undergroundambientlighting;

import me.andante.undergroundambientlighting.config.UALConfigManager;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class UndergroundAmbientLighting implements ClientModInitializer {
    public static final String MOD_ID = "undergroundambientlighting";

    @Override
    public void onInitializeClient() {
		String FILEPATH = FabricLoader.getInstance().getConfigDir().toFile().toPath().resolve(MOD_ID + ".json").toString();
		File FILE = new File(FILEPATH);
		try {
			if (FILE.createNewFile()) {
				try (PrintWriter out = new PrintWriter(FILEPATH)) {
					out.println("{\"enabled\":true,\"start_y\":63,\"end_y\":32,\"intensity\":0.032}");
				} catch (IOException e) {
					
					}
			}
			
		} catch (IOException e) {
			
			}
		UALConfigManager.load();
		
	}	

}
