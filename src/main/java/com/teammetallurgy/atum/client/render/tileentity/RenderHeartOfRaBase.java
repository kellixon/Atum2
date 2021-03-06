package com.teammetallurgy.atum.client.render.tileentity;

import com.teammetallurgy.atum.blocks.beacon.tileentity.TileEntityHeartOfRa;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntityBeaconRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.tileentity.TileEntityBeacon;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderHeartOfRaBase extends TileEntitySpecialRenderer<TileEntityHeartOfRa> {

    @Override
    public void render(TileEntityHeartOfRa heartOfRa, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        this.renderBeam(heartOfRa, x, y, z, partialTicks);
    }

    private void renderBeam(TileEntityHeartOfRa heartOfRa, double x, double y, double z, float partialTicks) {
        GlStateManager.pushMatrix();
        GlStateManager.alphaFunc(516, 0.1F);
        this.bindTexture(TileEntityBeaconRenderer.TEXTURE_BEACON_BEAM);
        GlStateManager.disableFog();
        GlStateManager.translate(0, 2.07D, 0);
        int yOffset = 0;
        for (int j = 0; j < EnumDyeColor.values().length - 1; ++j) {
            TileEntityBeacon.BeamSegment beam = new TileEntityBeacon.BeamSegment(EnumDyeColor.RED.getColorComponentValues());
            TileEntityBeaconRenderer.renderBeamSegment(x, y, z, (double) partialTicks, 1.0F, heartOfRa.getWorld().getTotalWorldTime(), yOffset, 256 - heartOfRa.getPos().getY() - 16, beam.getColors());
            yOffset += beam.getHeight();
        }
        GlStateManager.enableFog();
        GlStateManager.popMatrix();
    }

    @Override
    public boolean isGlobalRenderer(TileEntityHeartOfRa heartOfRa) {
        return true;
    }
}