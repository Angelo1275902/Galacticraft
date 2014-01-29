package micdoodle8.mods.galacticraft.power.core.grid;

import micdoodle8.mods.galacticraft.core.tile.ITransmitter;
import net.minecraft.tileentity.TileEntity;

/**
 * The Electrical Network in interface form.
 * 
 * @author Calclavia
 * 
 */
public interface IOxygenNetwork extends IGridNetwork<IOxygenNetwork, ITransmitter, TileEntity>
{
	/**
	 * Produces electricity in this electrical network.
	 * 
	 * @return Rejected energy in Joules.
	 */
	public float produce(float sendAmount, TileEntity... ignoreTiles);

	/**
	 * Gets the total amount of electricity requested/needed in the electricity network.
	 * 
	 * @param ignoreTiles The TileEntities to ignore during this calculation (optional).
	 */
	public float getRequest(TileEntity... ignoreTiles);
}
