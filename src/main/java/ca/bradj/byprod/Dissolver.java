package ca.bradj.byprod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * The dissolver takes two inputs:
 * <ol><li>An acid</li><li>A material</li></ol>
 * The dissolver works much like an oven, turning one material into another using an acid rather than a fuel source.
 * @author Brad
 *
 */
public class Dissolver extends Block {	

	public Dissolver(int id) {
		super(Material.snow);
	}

}
