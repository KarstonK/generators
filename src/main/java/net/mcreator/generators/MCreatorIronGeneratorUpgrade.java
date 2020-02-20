package net.mcreator.generators;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.IInventory;

import java.util.HashMap;

@Elementsgenerators.ModElement.Tag
public class MCreatorIronGeneratorUpgrade extends Elementsgenerators.ModElement {
	public MCreatorIronGeneratorUpgrade(Elementsgenerators instance) {
		super(instance, 4);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("guiinventory") == null) {
			System.err.println("Failed to load dependency guiinventory for procedure MCreatorIronGeneratorUpgrade!");
			return;
		}
		HashMap guiinventory = (HashMap) dependencies.get("guiinventory");
		double amount = 0;
		amount = (double) ((((new Object() {
			public int getAmount(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("inventoryName");
				if (inv != null) {
					ItemStack stack = inv.getStackInSlot(sltid);
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount((int) (0))) + (new Object() {
			public int getAmount(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("inventoryName");
				if (inv != null) {
					ItemStack stack = inv.getStackInSlot(sltid);
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount((int) (1)))) + ((new Object() {
			public int getAmount(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("inventoryName");
				if (inv != null) {
					ItemStack stack = inv.getStackInSlot(sltid);
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount((int) (2))) + (new Object() {
			public int getAmount(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("inventoryName");
				if (inv != null) {
					ItemStack stack = inv.getStackInSlot(sltid);
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount((int) (3))))) + ((new Object() {
			public int getAmount(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("inventoryName");
				if (inv != null) {
					ItemStack stack = inv.getStackInSlot(sltid);
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount((int) (8))) + (((new Object() {
			public int getAmount(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("inventoryName");
				if (inv != null) {
					ItemStack stack = inv.getStackInSlot(sltid);
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount((int) (4))) + (new Object() {
			public int getAmount(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("inventoryName");
				if (inv != null) {
					ItemStack stack = inv.getStackInSlot(sltid);
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount((int) (5)))) + ((new Object() {
			public int getAmount(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("inventoryName");
				if (inv != null) {
					ItemStack stack = inv.getStackInSlot(sltid);
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount((int) (6))) + (new Object() {
			public int getAmount(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("inventoryName");
				if (inv != null) {
					ItemStack stack = inv.getStackInSlot(sltid);
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount((int) (7)))))));
	}
}
