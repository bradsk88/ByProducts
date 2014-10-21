package ca.bradj.byprod.items.bones;

import net.minecraft.item.Item;
import ca.bradj.byprod.ByProducts;

public class ByProductsItem extends Item {

	public ByProductsItem(int id, String name) {
		setTextureName("byprod:"+name);	
		setCreativeTab(ByProducts.tabByProducts);
	}

}
