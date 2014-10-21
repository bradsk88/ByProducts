package ca.bradj.byprod.items.bones;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ca.bradj.byprod.ByProducts;

public class ByProductsBlock extends Block {

	protected ByProductsBlock(int id, String name) {
		super(Material.rock);
		setBlockTextureName("byprod:" + name);
		setCreativeTab(ByProducts.tabByProducts);
	}

}
