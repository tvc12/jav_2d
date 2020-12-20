package org.tvc12.renderable;

import org.tvc12.geometry.Cube;
import org.tvc12.geometry.Geometry;

import java.awt.*;

public class CuberRender implements GeometryRender<Cube> {
    private Graphics graphics;

    public GeometryRender<Cube> withGraphic(Graphics graphics) {
        this.graphics = graphics;
        return this;
    }

    @Override
    public void render(Cube geometry) {
        Point[] points = geometry.getPoints();
        int x = geometry.getX();
        int y = geometry.getY();
        int size = geometry.getSize();

        graphics.drawRect(x, y, size, size);
        graphics.drawRect(x + size, y + size, size, size);
    }
}
