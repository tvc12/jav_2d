package org.tvc12.renderable;

import org.tvc12.geometry.Geometry;

import java.awt.*;

public class GeometryRender {
    private Graphics graphics;

    public GeometryRender withGraphic(Graphics graphics) {
        this.graphics = graphics;
        return this;
    }

    public void render(Geometry geometry) {
//        graphics2D
    }
}

