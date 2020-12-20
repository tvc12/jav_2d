package org.tvc12.renderable;

import org.tvc12.geometry.Cube;
import org.tvc12.point.Point3D;

import java.awt.*;

public class CuberRender implements GeometryRender<Cube> {
    private Graphics graphics;

    public GeometryRender<Cube> withGraphic(Graphics graphics) {
        this.graphics = graphics;
        return this;
    }

    @Override
    public void render(Cube geometry) {
        Point[] edges = geometry.getEdges();
        Point3D[] nodes = geometry.getNodes();

        for (Point edge : edges) {
            Point3D node1 = nodes[edge.x];
            Point3D node2 = nodes[edge.y];
            graphics.drawLine(
                    node1.getX(), node1.getY(),
                    node2.getX(), node2.getY()
            );
        }
    }
}
