package ca.bradj.byprod.items.bones;

import ca.bradj.byprod.ByProducts;
import net.minecraft.item.ItemFood;

public class Peanuts extends ItemFood {

	public Peanuts(int id) {
		super(3, false);
		setTextureName("byprod:peanuts");
		setCreativeTab(ByProducts.tabByProducts);
		setAlwaysEdible();
	}

}
