package ca.bradj.byprod.items.bones;

import java.util.ArrayList;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.google.common.collect.Lists;

public class MinersBones extends ByProductsBlock {

	private static final int BONE_CHANCE = 100;
	private static final int GOLD_NUGGET_CHANCE = 50;
	private static final int BOOTS_CHANCE = 50;

	public MinersBones(int id) {
		super(id, "minersBones");
		setHardness(4.0f);
		setHarvestLevel("pickaxe", 2);
	}

	@Override
	public int getExpDrop(IBlockAccess world, int metadata, int fortune) {
		return 50;
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = Lists.newArrayList();
		if (world.rand.nextInt(100) < BONE_CHANCE) {
			drops.add(new ItemStack(Items.bone, 1));
		}
		if (world.rand.nextInt(100) < GOLD_NUGGET_CHANCE) {
			drops.add(new ItemStack(Items.gold_nugget, 1));
		}
		if (world.rand.nextInt(100) < BOOTS_CHANCE) {
			drops.add(new ItemStack(Items.leather_boots, 1));
		}
		return drops;
	}

}
