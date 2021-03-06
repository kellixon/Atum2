package com.teammetallurgy.atum.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelQuernStone extends ModelBase {
    public ModelRenderer core;
    private ModelRenderer coreLeft;
    private ModelRenderer coreFront;
    private ModelRenderer coreBack;
    private ModelRenderer coreRight;
    private ModelRenderer handle;

    public ModelQuernStone() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.coreBack = new ModelRenderer(this, 0, 34);
        this.coreBack.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.coreBack.addBox(-4.0F, -2.0F, 5.0F, 8, 4, 1, 0.0F);
        this.coreLeft = new ModelRenderer(this, 0, 48);
        this.coreLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.coreLeft.addBox(-6.0F, -2.0F, -4.0F, 1, 4, 8, 0.0F);
        this.coreRight = new ModelRenderer(this, 0, 48);
        this.coreRight.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.coreRight.addBox(5.0F, -2.0F, -4.0F, 1, 4, 8, 0.0F);
        this.coreFront = new ModelRenderer(this, 0, 34);
        this.coreFront.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.coreFront.addBox(-4.0F, -2.0F, -6.0F, 8, 4, 1, 0.0F);
        this.core = new ModelRenderer(this, 0, 18);
        this.core.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.core.addBox(-5.0F, -2.0F, -5.0F, 10, 4, 10, 0.0F);
        this.handle = new ModelRenderer(this, 0, 0);
        this.handle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.handle.addBox(-5.0F, -5.0F, -3.0F, 1, 3, 1, 0.0F);
        this.core.addChild(this.coreBack);
        this.core.addChild(this.coreLeft);
        this.core.addChild(this.coreRight);
        this.core.addChild(this.coreFront);
        this.core.addChild(this.handle);
    }

    public void renderAll() {
        this.core.render(0.0625F);
    }
}