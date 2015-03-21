package ca.bradj.byprod;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

    private static IWorldGenerator WORLD_GEN;

	public void preInit(FMLPreInitializationEvent e) {

		Configuration config = new Configuration(e.getSuggestedConfigurationFile());
		config.load();
        Items.init();
        WORLD_GEN = new WorldGen(config, e.getModLog());

		config.save();
	}

	public void init(FMLInitializationEvent e) {
		GameRegistry.registerWorldGenerator(WORLD_GEN, 1);
	}

	public void postInit(FMLPostInitializationEvent e) {

	}

}
