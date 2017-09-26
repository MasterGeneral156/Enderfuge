package com.themastergeneral.enderfuge.common.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.themastergeneral.ctdcore.CTDCore;
import com.themastergeneral.ctdcore.client.BlockRenderRegister;
import com.themastergeneral.ctdcore.client.ItemModelProvider;
import com.themastergeneral.enderfuge.Enderfuge;
import com.themastergeneral.enderfuge.client.gui.GUIHandler;
import com.themastergeneral.enderfuge.common.tileentity.TEEnderfuge;

public class BlockEnderfuge extends BlockContainer implements
		ITileEntityProvider, BlockRenderRegister, ItemModelProvider {
	public static final PropertyDirection FACING = BlockHorizontal.FACING;
	private final boolean isBurning;
	private static boolean keepInventory;
	protected String name;

	public BlockEnderfuge(String unlocalizedName, Boolean isBurning) {
		super(Material.ROCK);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.MISC);
		this.setDefaultState(this.blockState.getBaseState().withProperty(
				FACING, EnumFacing.NORTH));
		this.setRegistryName(unlocalizedName);
		this.isBurning = isBurning;
		this.name = unlocalizedName;
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TEEnderfuge();
	}

	public boolean onBlockActivated(World world, BlockPos pos,
			IBlockState state, EntityPlayer player, EnumHand hand,
			EnumFacing side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			player.openGui(Enderfuge.instance, GUIHandler.ENDERFUGE, world,
					pos.getX(), pos.getY(), pos.getZ());
		}
		return true;
	}

	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState blockstate) {
		if (!keepInventory) {
			TileEntity tileentity = world.getTileEntity(pos);

			if (tileentity instanceof TEEnderfuge) {
				InventoryHelper.dropInventoryItems(world, pos,
						(TEEnderfuge) tileentity);
				world.updateComparatorOutputLevel(pos, this);
			}
		}
	}

	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state,
			EntityLivingBase placer, ItemStack stack) {
		if (stack.hasDisplayName()) {
			((TEEnderfuge) worldIn.getTileEntity(pos))
					.setCustomInventoryName(stack.getDisplayName());
		}
	}

	public int getRenderType() {
		return 3;
	}

	public void setDefaultFacing(World worldIn, BlockPos pos, IBlockState state) {
		if (!worldIn.isRemote) {
			IBlockState iblockstate = worldIn.getBlockState(pos.north());
			IBlockState iblockstate1 = worldIn.getBlockState(pos.south());
			IBlockState iblockstate2 = worldIn.getBlockState(pos.west());
			IBlockState iblockstate3 = worldIn.getBlockState(pos.east());
			EnumFacing enumfacing = (EnumFacing) state.getValue(FACING);

			if (enumfacing == EnumFacing.NORTH && iblockstate.isFullBlock()
					&& !iblockstate1.isFullBlock()) {
				enumfacing = EnumFacing.SOUTH;
			} else if (enumfacing == EnumFacing.SOUTH
					&& iblockstate1.isFullBlock() && !iblockstate.isFullBlock()) {
				enumfacing = EnumFacing.NORTH;
			} else if (enumfacing == EnumFacing.WEST
					&& iblockstate2.isFullBlock()
					&& !iblockstate3.isFullBlock()) {
				enumfacing = EnumFacing.EAST;
			} else if (enumfacing == EnumFacing.EAST
					&& iblockstate3.isFullBlock()
					&& !iblockstate2.isFullBlock()) {
				enumfacing = EnumFacing.WEST;
			}

			worldIn.setBlockState(pos, state.withProperty(FACING, enumfacing),
					2);
		}
	}

	@Override
	@SuppressWarnings("incomplete-switch")
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(IBlockState stateIn, World worldIn,
			BlockPos pos, Random rand) {
		if (this.isBurning) {
			EnumFacing enumfacing = (EnumFacing) stateIn.getValue(FACING);
			double d0 = (double) pos.getX() + 0.5D;
			double d1 = (double) pos.getY() + rand.nextDouble() * 6.0D / 16.0D;
			double d2 = (double) pos.getZ() + 0.5D;
			double d3 = 0.52D;
			double d4 = rand.nextDouble() * 0.6D - 0.3D;

			if (rand.nextDouble() < 0.1D) {
				worldIn.playSound((double) pos.getX() + 0.5D,
						(double) pos.getY(), (double) pos.getZ() + 0.5D,
						SoundEvents.BLOCK_PORTAL_AMBIENT, SoundCategory.BLOCKS,
						1.0F, 1.0F, false);
			}

			switch (enumfacing) {
			case WEST:
				worldIn.spawnParticle(EnumParticleTypes.PORTAL, d0 - 0.52D, d1,
						d2 + d4, 0.0D, 0.0D, 0.0D);
				worldIn.spawnParticle(EnumParticleTypes.PORTAL, d0 - 0.52D, d1,
						d2 + d4, 0.0D, 0.0D, 0.0D);
				break;
			case EAST:
				worldIn.spawnParticle(EnumParticleTypes.PORTAL, d0 + 0.52D, d1,
						d2 + d4, 0.0D, 0.0D, 0.0D);
				worldIn.spawnParticle(EnumParticleTypes.PORTAL, d0 + 0.52D, d1,
						d2 + d4, 0.0D, 0.0D, 0.0D);
				break;
			case NORTH:
				worldIn.spawnParticle(EnumParticleTypes.PORTAL, d0 + d4, d1,
						d2 - 0.52D, 0.0D, 0.0D, 0.0D);
				worldIn.spawnParticle(EnumParticleTypes.PORTAL, d0 + d4, d1,
						d2 - 0.52D, 0.0D, 0.0D, 0.0D);
				break;
			case SOUTH:
				worldIn.spawnParticle(EnumParticleTypes.PORTAL, d0 + d4, d1,
						d2 + 0.52D, 0.0D, 0.0D, 0.0D);
				worldIn.spawnParticle(EnumParticleTypes.PORTAL, d0 + d4, d1,
						d2 + 0.52D, 0.0D, 0.0D, 0.0D);
			}
		}
	}

	public IBlockState getStateForPlacement(World worldIn, BlockPos pos,
			EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
			EntityLivingBase placer) {
		return this.getDefaultState().withProperty(FACING,
				placer.getHorizontalFacing().getOpposite());
	}

	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.MODEL;
	}

	public IBlockState getStateFromMeta(int meta) {
		EnumFacing enumfacing = EnumFacing.getFront(meta);

		if (enumfacing.getAxis() == EnumFacing.Axis.Y) {
			enumfacing = EnumFacing.NORTH;
		}

		return this.getDefaultState().withProperty(FACING, enumfacing);
	}

	public int getMetaFromState(IBlockState state) {
		return ((EnumFacing) state.getValue(FACING)).getIndex();
	}

	public IBlockState withRotation(IBlockState state, Rotation rot) {
		return state.withProperty(FACING,
				rot.rotate((EnumFacing) state.getValue(FACING)));
	}

	public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
		return state.withRotation(mirrorIn.toRotation((EnumFacing) state
				.getValue(FACING)));
	}

	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { FACING });
	}

	public static void setState(boolean active, World worldIn, BlockPos pos) {
		IBlockState iblockstate = worldIn.getBlockState(pos);
		TileEntity tileentity = worldIn.getTileEntity(pos);
		keepInventory = true;

		if (active) {
			worldIn.setBlockState(
					pos,
					ModBlocks.enderfuge_active.getDefaultState().withProperty(
							FACING, iblockstate.getValue(FACING)), 3);
			worldIn.setBlockState(
					pos,
					ModBlocks.enderfuge_active.getDefaultState().withProperty(
							FACING, iblockstate.getValue(FACING)), 3);
		} else {
			worldIn.setBlockState(pos, ModBlocks.enderfuge.getDefaultState()
					.withProperty(FACING, iblockstate.getValue(FACING)), 3);
			worldIn.setBlockState(pos, ModBlocks.enderfuge.getDefaultState()
					.withProperty(FACING, iblockstate.getValue(FACING)), 3);
		}

		keepInventory = false;

		if (tileentity != null) {
			tileentity.validate();
			worldIn.setTileEntity(pos, tileentity);
		}
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(ModBlocks.enderfuge);
	}

	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
		return new ItemStack(ModBlocks.enderfuge);
	}

	@Override
	public void reg(Block block) {
		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						Item.getItemFromBlock(block),
						0,
						new ModelResourceLocation(Enderfuge.MODID + ":"
								+ block.getUnlocalizedName().substring(5),
								"inventory"));

	}

	@Override
	public void registerItemModel(Item arg0) {
		CTDCore.proxy.registerItemRenderer(Enderfuge.MODID, arg0, 0, name);
	}
}
