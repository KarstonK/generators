package net.mcreator.generators;

import org.lwjgl.opengl.GL11;

import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.network.IContainerFactory;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;
import java.util.HashMap;

@Elementsgenerators.ModElement.Tag
public class MCreatorGoldGeneratorGUI6 extends Elementsgenerators.ModElement {
	public static HashMap guiinventory = new HashMap();
	public static IInventory inherited;
	private static ContainerType<GuiContainerMod> containerType = null;

	public MCreatorGoldGeneratorGUI6(Elementsgenerators instance) {
		super(instance, 18);
		elements.addNetworkMessage(ButtonPressedMessage.class, ButtonPressedMessage::buffer, ButtonPressedMessage::new, ButtonPressedMessage::handler);
		elements.addNetworkMessage(GUISlotChangedMessage.class, GUISlotChangedMessage::buffer, GUISlotChangedMessage::new,
				GUISlotChangedMessage::handler);
		containerType = new ContainerType<>(new GuiContainerModFactory());
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@OnlyIn(Dist.CLIENT)
	public void initElements() {
		ScreenManager.registerFactory(containerType, GuiWindow::new);
	}

	@SubscribeEvent
	public void registerContainer(RegistryEvent.Register<ContainerType<?>> event) {
		event.getRegistry().register(containerType.setRegistryName("goldgeneratorgui6"));
	}

	public static class GuiContainerModFactory implements IContainerFactory {
		public GuiContainerMod create(int id, PlayerInventory inv, PacketBuffer extraData) {
			return new GuiContainerMod(id, inv, extraData);
		}
	}

	public static class GuiContainerMod extends Container {
		World world;
		PlayerEntity entity;
		int x, y, z;

		public GuiContainerMod(int id, PlayerInventory inv, PacketBuffer extraData) {
			super(containerType, id);
			BlockPos pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
			IInventory inheritedinv = null;
			TileEntity ent = inv.player != null ? inv.player.world.getTileEntity(pos) : null;
			if (ent instanceof IInventory)
				inheritedinv = (IInventory) ent;
			initContainer(inv, inheritedinv);
		}

		public void initContainer(PlayerInventory inv, IInventory inheritedinv) {
			this.entity = inv.player;
			this.world = inv.player.world;
			if (inheritedinv == null)
				inherited = new Inventory(64);
			else
				inherited = inheritedinv;
			this.addSlot(new Slot(inherited, 0, 8, 57) {
				@Override
				public boolean isItemValid(ItemStack stack) {
					return (new ItemStack(Items.GOLD_INGOT, (int) (1)).getItem() == stack.getItem());
				}
			});
			this.addSlot(new Slot(inherited, 1, 26, 57) {
				@Override
				public boolean isItemValid(ItemStack stack) {
					return (new ItemStack(Items.GOLD_INGOT, (int) (1)).getItem() == stack.getItem());
				}
			});
			this.addSlot(new Slot(inherited, 2, 44, 57) {
				@Override
				public boolean isItemValid(ItemStack stack) {
					return (new ItemStack(Items.GOLD_INGOT, (int) (1)).getItem() == stack.getItem());
				}
			});
			this.addSlot(new Slot(inherited, 3, 62, 57) {
				@Override
				public boolean isItemValid(ItemStack stack) {
					return (new ItemStack(Items.GOLD_INGOT, (int) (1)).getItem() == stack.getItem());
				}
			});
			this.addSlot(new Slot(inherited, 4, 80, 57) {
				@Override
				public boolean isItemValid(ItemStack stack) {
					return (new ItemStack(Items.GOLD_INGOT, (int) (1)).getItem() == stack.getItem());
				}
			});
			this.addSlot(new Slot(inherited, 5, 98, 57) {
				@Override
				public boolean isItemValid(ItemStack stack) {
					return (new ItemStack(Items.GOLD_INGOT, (int) (1)).getItem() == stack.getItem());
				}
			});
			this.addSlot(new Slot(inherited, 6, 116, 57) {
				@Override
				public boolean isItemValid(ItemStack stack) {
					return (new ItemStack(Items.GOLD_INGOT, (int) (1)).getItem() == stack.getItem());
				}
			});
			this.addSlot(new Slot(inherited, 7, 134, 57) {
				@Override
				public boolean isItemValid(ItemStack stack) {
					return (new ItemStack(Items.GOLD_INGOT, (int) (1)).getItem() == stack.getItem());
				}
			});
			this.addSlot(new Slot(inherited, 8, 152, 57) {
				@Override
				public boolean isItemValid(ItemStack stack) {
					return (new ItemStack(Items.GOLD_INGOT, (int) (1)).getItem() == stack.getItem());
				}
			});
			int si;
			int sj;
			for (si = 0; si < 3; ++si)
				for (sj = 0; sj < 9; ++sj)
					this.addSlot(new Slot(inv, sj + (si + 1) * 9, 0 + 8 + sj * 18, 0 + 84 + si * 18));
			for (si = 0; si < 9; ++si)
				this.addSlot(new Slot(inv, si, 0 + 8 + si * 18, 0 + 142));
		}

		@Override
		public boolean canInteractWith(PlayerEntity player) {
			return true;
		}

		@Override
		public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
			ItemStack itemstack = ItemStack.EMPTY;
			Slot slot = (Slot) this.inventorySlots.get(index);
			if (slot != null && slot.getHasStack()) {
				ItemStack itemstack1 = slot.getStack();
				itemstack = itemstack1.copy();
				if (index < 9) {
					if (!this.mergeItemStack(itemstack1, 9, this.inventorySlots.size(), true)) {
						return ItemStack.EMPTY;
					}
					slot.onSlotChange(itemstack1, itemstack);
				} else if (!this.mergeItemStack(itemstack1, 0, 9, false)) {
					if (index < 9 + 27) {
						if (!this.mergeItemStack(itemstack1, 9 + 27, this.inventorySlots.size(), true)) {
							return ItemStack.EMPTY;
						}
					} else {
						if (!this.mergeItemStack(itemstack1, 9, 9 + 27, false)) {
							return ItemStack.EMPTY;
						}
					}
					return ItemStack.EMPTY;
				}
				if (itemstack1.getCount() == 0) {
					slot.putStack(ItemStack.EMPTY);
				} else {
					slot.onSlotChanged();
				}
				if (itemstack1.getCount() == itemstack.getCount()) {
					return ItemStack.EMPTY;
				}
				slot.onTake(playerIn, itemstack1);
			}
			return itemstack;
		}

		@Override
		/** 
		 * Merges provided ItemStack with the first avaliable one in the container/player inventor between minIndex (included) and maxIndex (excluded). Args : stack, minIndex, maxIndex, negativDirection. /!\ the Container implementation do not check if the item is valid for the slot
		 */
		protected boolean mergeItemStack(ItemStack stack, int startIndex, int endIndex, boolean reverseDirection) {
			boolean flag = false;
			int i = startIndex;
			if (reverseDirection) {
				i = endIndex - 1;
			}
			if (stack.isStackable()) {
				while (!stack.isEmpty()) {
					if (reverseDirection) {
						if (i < startIndex) {
							break;
						}
					} else if (i >= endIndex) {
						break;
					}
					Slot slot = this.inventorySlots.get(i);
					ItemStack itemstack = slot.getStack();
					if (slot.isItemValid(itemstack) && !itemstack.isEmpty() && areItemsAndTagsEqual(stack, itemstack)) {
						int j = itemstack.getCount() + stack.getCount();
						int maxSize = Math.min(slot.getSlotStackLimit(), stack.getMaxStackSize());
						if (j <= maxSize) {
							stack.setCount(0);
							itemstack.setCount(j);
							slot.putStack(itemstack);
							flag = true;
						} else if (itemstack.getCount() < maxSize) {
							stack.shrink(maxSize - itemstack.getCount());
							itemstack.setCount(maxSize);
							slot.putStack(itemstack);
							flag = true;
						}
					}
					if (reverseDirection) {
						--i;
					} else {
						++i;
					}
				}
			}
			if (!stack.isEmpty()) {
				if (reverseDirection) {
					i = endIndex - 1;
				} else {
					i = startIndex;
				}
				while (true) {
					if (reverseDirection) {
						if (i < startIndex) {
							break;
						}
					} else if (i >= endIndex) {
						break;
					}
					Slot slot1 = this.inventorySlots.get(i);
					ItemStack itemstack1 = slot1.getStack();
					if (itemstack1.isEmpty() && slot1.isItemValid(stack)) {
						if (stack.getCount() > slot1.getSlotStackLimit()) {
							slot1.putStack(stack.split(slot1.getSlotStackLimit()));
						} else {
							slot1.putStack(stack.split(stack.getCount()));
						}
						slot1.onSlotChanged();
						flag = true;
						break;
					}
					if (reverseDirection) {
						--i;
					} else {
						++i;
					}
				}
			}
			return flag;
		}

		@Override
		public void onContainerClosed(PlayerEntity playerIn) {
			super.onContainerClosed(playerIn);
		}

		private void slotChanged(int slotid, int ctype, int meta) {
			if (this.world != null && this.world.isRemote) {
				generators.PACKET_HANDLER.sendToServer(new GUISlotChangedMessage(slotid, x, y, z, ctype, meta));
				handleSlotAction(entity, slotid, ctype, meta, x, y, z);
			}
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class GuiWindow extends ContainerScreen<GuiContainerMod> {
		World world;
		int x, y, z;
		PlayerEntity entity;

		public GuiWindow(GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
			super(container, inventory, text);
			this.world = container.world;
			this.x = container.x;
			this.y = container.y;
			this.z = container.z;
			this.entity = container.entity;
			this.xSize = 176;
			this.ySize = 166;
		}
		private static final ResourceLocation texture = new ResourceLocation("generators:textures/goldgeneratorgui6.png");

		@Override
		public void render(int mouseX, int mouseY, float partialTicks) {
			this.renderBackground();
			super.render(mouseX, mouseY, partialTicks);
			this.renderHoveredToolTip(mouseX, mouseY);
		}

		@Override
		protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			Minecraft.getInstance().getTextureManager().bindTexture(texture);
			int k = (this.width - this.xSize) / 2;
			int l = (this.height - this.ySize) / 2;
			this.blit(k, l, 0, 0, this.xSize, this.ySize);
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("generators:textures/gold_x2.png"));
			this.blit(this.guiLeft + 149, this.guiTop + 4, 0, 0, 256, 256);
		}

		@Override
		public void tick() {
			super.tick();
		}

		@Override
		protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
			this.font.drawString("Level:6         Required:---", 7, 6, -10066330);
			this.font.drawString("Spawn rate: 2s", 7, 18, -10066330);
			this.font.drawString("Spawn amount:4", 7, 29, -10066330);
		}

		@Override
		public void removed() {
			super.removed();
			Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
		}

		@Override
		public void init(Minecraft minecraft, int width, int height) {
			super.init(minecraft, width, height);
			minecraft.keyboardListener.enableRepeatEvents(true);
			this.addButton(new Button(this.guiLeft + 98, this.guiTop + 29, 70, 20, "Upgrade", e -> {
				generators.PACKET_HANDLER.sendToServer(new ButtonPressedMessage(0, x, y, z));
				handleButtonAction(entity, 0, x, y, z);
			}));
		}
	}

	public static class ButtonPressedMessage {
		int buttonID, x, y, z;

		public ButtonPressedMessage(PacketBuffer buffer) {
			this.buttonID = buffer.readInt();
			this.x = buffer.readInt();
			this.y = buffer.readInt();
			this.z = buffer.readInt();
		}

		public ButtonPressedMessage(int buttonID, int x, int y, int z) {
			this.buttonID = buttonID;
			this.x = x;
			this.y = y;
			this.z = z;
		}

		public static void buffer(ButtonPressedMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.buttonID);
			buffer.writeInt(message.x);
			buffer.writeInt(message.y);
			buffer.writeInt(message.z);
		}

		public static void handler(ButtonPressedMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				PlayerEntity entity = context.getSender();
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			});
			context.setPacketHandled(true);
		}
	}

	public static class GUISlotChangedMessage {
		int slotID, x, y, z, changeType, meta;

		public GUISlotChangedMessage(int slotID, int x, int y, int z, int changeType, int meta) {
			this.slotID = slotID;
			this.x = x;
			this.y = y;
			this.z = z;
			this.changeType = changeType;
			this.meta = meta;
		}

		public GUISlotChangedMessage(PacketBuffer buffer) {
			this.slotID = buffer.readInt();
			this.x = buffer.readInt();
			this.y = buffer.readInt();
			this.z = buffer.readInt();
			this.changeType = buffer.readInt();
			this.meta = buffer.readInt();
		}

		public static void buffer(GUISlotChangedMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.slotID);
			buffer.writeInt(message.x);
			buffer.writeInt(message.y);
			buffer.writeInt(message.z);
			buffer.writeInt(message.changeType);
			buffer.writeInt(message.meta);
		}

		public static void handler(GUISlotChangedMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				PlayerEntity entity = context.getSender();
				int slotID = message.slotID;
				int changeType = message.changeType;
				int meta = message.meta;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleSlotAction(entity, slotID, changeType, meta, x, y, z);
			});
			context.setPacketHandled(true);
		}
	}

	private static void handleButtonAction(PlayerEntity entity, int buttonID, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				MCreatorGoldGeneratorUpgrade.executeProcedure($_dependencies);
			}
		}
	}

	private static void handleSlotAction(PlayerEntity entity, int slotID, int changeType, int meta, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
	}
}
