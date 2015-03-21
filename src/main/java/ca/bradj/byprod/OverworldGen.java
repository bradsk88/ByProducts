package ca.bradj.byprod;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

import org.apache.logging.log4j.Logger;

import com.google.common.base.Preconditions;

public class OverworldGen {

    private World world;
    private Random random;
    private Configuration config;
    private int x;
    private int z;

    public OverworldGen(Configuration config, Logger logger, World world, Random random, int x, int z) {
        this.world = Preconditions.checkNotNull(world);
        this.random = Preconditions.checkNotNull(random);
        this.config = Preconditions.checkNotNull(config);
        this.x = x;
        this.z = z;
    }

    public void generate() {
        Property attempts = config.get("oregen", "bones", 50);
        WorldGenMinable worldGenMinable = new WorldGenMinable(Items.minersBones, 0, 3, Blocks.stone);
        for (int i = 0; i < attempts.getInt(); i++) {
            int chunkX = x + random.nextInt(16);
            int chunkY = random.nextInt(200);
            int chunkZ = z + random.nextInt(16);
            worldGenMinable.generate(world, random, chunkX, chunkY, chunkZ);
        }
    }

}
