package org.tvc12.renderable;

import org.tvc12.geometry.Cube;

import java.awt.*;

public class CuberRender implements GeometryRender<Cube> {
    private Graphics graphics;

    public GeometryRender<Cube> withGraphic(Graphics graphics) {
        this.graphics = graphics;
        return this;
    }

    @Override
    public void render(Cube geometry) {
        int x = geometry.getX();
        int y = geometry.getY();
        int size = geometry.getSize();
        int distance = geometry.getDistance();
        graphics.drawRect(x, y, size, size);
        graphics.drawRect(x + distance, y + distance, size, size);

        Point[] points = geometry.getPoints();
        for (int index = 0; index < 4; ++index) {
            graphics.drawLine(points[index].x, points[index].y,
                    points[index + 4].x, points[index + 4].y);
        }
    }
}
