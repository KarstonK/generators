package net.mcreator.generators;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;

@Elementsgenerators.ModElement.Tag
public class MCreatorGeneratorStart extends Elementsgenerators.ModElement {
	public MCreatorGeneratorStart(Elementsgenerators instance) {
		super(instance, 22);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorGeneratorStart!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorGeneratorStart!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorGeneratorStart!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorGeneratorStart!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((!((new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "level")) >= 0.1))) {
			{
				TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (tileEntity != null)
					tileEntity.getTileData().putDouble("level", 1);
			}
			{
				TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (tileEntity != null)
					tileEntity.getTileData().putDouble("times", 0);
			}
		}
	}
}
