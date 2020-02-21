package net.mcreator.generators;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

@Elementsgenerators.ModElement.Tag
public class MCreatorIronGeneratorSpawn extends Elementsgenerators.ModElement {
	public MCreatorIronGeneratorSpawn(Elementsgenerators instance) {
		super(instance, 23);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorIronGeneratorSpawn!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorIronGeneratorSpawn!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorIronGeneratorSpawn!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorIronGeneratorSpawn!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "level")) == 1)) {
			if (((new Object() {
				public double getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "times")) >= 5)) {
				{
					TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (tileEntity != null)
						tileEntity.getTileData().putDouble("times", 0);
				}
				if (!world.isRemote && world.getServer() != null) {
					world.getServer()
							.getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d((x + 0.5), (y + 1), (z + 0.5)), Vec2f.ZERO,
											(ServerWorld) world, 4, "", new StringTextComponent(""), world.getServer(), null).withFeedbackDisabled(),
									"summon minecraft:item ~ ~ ~ {Item:{id:\"minecraft:iron_ingot\",Count:1b}}");
				}
			} else {
				{
					TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (tileEntity != null)
						tileEntity.getTileData().putDouble("times", ((new Object() {
							public double getValue(BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(new BlockPos((int) x, (int) y, (int) z), "times")) + 1));
				}
			}
		} else if (((new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "level")) == 2)) {
			if (((new Object() {
				public double getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "times")) >= 4)) {
				{
					TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (tileEntity != null)
						tileEntity.getTileData().putDouble("times", 0);
				}
				if (!world.isRemote && world.getServer() != null) {
					world.getServer()
							.getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d((x + 0.5), (y + 1), (z + 0.5)), Vec2f.ZERO,
											(ServerWorld) world, 4, "", new StringTextComponent(""), world.getServer(), null).withFeedbackDisabled(),
									"summon minecraft:item ~ ~ ~ {Item:{id:\"minecraft:iron_ingot\",Count:1b}}");
				}
			} else {
				{
					TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (tileEntity != null)
						tileEntity.getTileData().putDouble("times", ((new Object() {
							public double getValue(BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(new BlockPos((int) x, (int) y, (int) z), "times")) + 1));
				}
			}
		} else if (((new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "level")) == 3)) {
			if (((new Object() {
				public double getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "times")) >= 3)) {
				{
					TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (tileEntity != null)
						tileEntity.getTileData().putDouble("times", 0);
				}
				if (!world.isRemote && world.getServer() != null) {
					world.getServer()
							.getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d((x + 0.5), (y + 1), (z + 0.5)), Vec2f.ZERO,
											(ServerWorld) world, 4, "", new StringTextComponent(""), world.getServer(), null).withFeedbackDisabled(),
									"summon minecraft:item ~ ~ ~ {Item:{id:\"minecraft:iron_ingot\",Count:1b}}");
				}
			} else {
				{
					TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (tileEntity != null)
						tileEntity.getTileData().putDouble("times", ((new Object() {
							public double getValue(BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(new BlockPos((int) x, (int) y, (int) z), "times")) + 1));
				}
			}
		} else if (((new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "level")) == 4)) {
			if (((new Object() {
				public double getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "times")) >= 3)) {
				{
					TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (tileEntity != null)
						tileEntity.getTileData().putDouble("times", 0);
				}
				if (!world.isRemote && world.getServer() != null) {
					world.getServer()
							.getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d((x + 0.5), (y + 1), (z + 0.5)), Vec2f.ZERO,
											(ServerWorld) world, 4, "", new StringTextComponent(""), world.getServer(), null).withFeedbackDisabled(),
									"summon minecraft:item ~ ~ ~ {Item:{id:\"minecraft:iron_ingot\",Count:2b}}");
				}
			} else {
				{
					TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (tileEntity != null)
						tileEntity.getTileData().putDouble("times", ((new Object() {
							public double getValue(BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(new BlockPos((int) x, (int) y, (int) z), "times")) + 1));
				}
			}
		} else if (((new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "level")) == 5)) {
			if (((new Object() {
				public double getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "times")) >= 2)) {
				{
					TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (tileEntity != null)
						tileEntity.getTileData().putDouble("times", 0);
				}
				if (!world.isRemote && world.getServer() != null) {
					world.getServer()
							.getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d((x + 0.5), (y + 1), (z + 0.5)), Vec2f.ZERO,
											(ServerWorld) world, 4, "", new StringTextComponent(""), world.getServer(), null).withFeedbackDisabled(),
									"summon minecraft:item ~ ~ ~ {Item:{id:\"minecraft:iron_ingot\",Count:2b}}");
				}
			} else {
				{
					TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (tileEntity != null)
						tileEntity.getTileData().putDouble("times", ((new Object() {
							public double getValue(BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(new BlockPos((int) x, (int) y, (int) z), "times")) + 1));
				}
			}
		} else {
			if (((new Object() {
				public double getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "times")) >= 2)) {
				{
					TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (tileEntity != null)
						tileEntity.getTileData().putDouble("times", 0);
				}
				if (!world.isRemote && world.getServer() != null) {
					world.getServer()
							.getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d((x + 0.5), (y + 1), (z + 0.5)), Vec2f.ZERO,
											(ServerWorld) world, 4, "", new StringTextComponent(""), world.getServer(), null).withFeedbackDisabled(),
									"summon minecraft:item ~ ~ ~ {Item:{id:\"minecraft:iron_ingot\",Count:4b}}");
				}
			} else {
				{
					TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (tileEntity != null)
						tileEntity.getTileData().putDouble("times", ((new Object() {
							public double getValue(BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(new BlockPos((int) x, (int) y, (int) z), "times")) + 1));
				}
			}
		}
	}
}
