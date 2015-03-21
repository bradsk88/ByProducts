package ca.bradj.byprod;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.config.Configuration;

import org.apache.logging.log4j.Logger;

import com.google.common.base.Preconditions;

import cpw.mods.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator {

    private Configuration config;
    private Logger logger;

    public WorldGen(Configuration config, Logger modLog) {
        this.config = Preconditions.checkNotNull(config);
        this.logger = Preconditions.checkNotNull(modLog);
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
        case -1: // nether
            return;
        case 0: // overworld
            new OverworldGen(config, logger, world, random, chunkX * 16, chunkZ * 16).generate();
        case 1: // end
            return;
        }
    }

}
