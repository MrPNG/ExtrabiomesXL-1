package net.minecraft.src;

import java.util.ArrayList;
import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockBrownGrass extends BlockFlower implements ITextureProvider
{
    protected BlockBrownGrass(int par1, int par2)
    {
        super(par1, par2, Material.vine);
        setBlockBounds(0.0F, 0.0F, 0.0F, 0.01F, 0.125F, 0.01F);
	}

    protected boolean canThisPlantGrowOnThisBlockID(int par1)
    {
        return par1 == mod_ExtraBiomesXL.redRock.blockID;
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return -1;
	}
    
    public void addCreativeItems(ArrayList itemList)
    {
            itemList.add(new ItemStack(this));
    }
    
    public String getTextureFile()
    {
            return "/ExtraBiomesXL/extrabiomes.png";
    }
}
