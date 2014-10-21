package ca.bradj.byprod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = ByProducts.MODID, version = ByProducts.VERSION)
public class ByProducts
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    
	public static CreativeTabs tabByProducts = new CreativeTabs("tabByProducts") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Item.getItemFromBlock(Items.minersBones);
	    }
	};
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		Items.init();
    }
}
