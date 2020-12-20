package org.tvc12.renderable;

import org.tvc12.geometry.Cube;
import org.tvc12.point.Point3D;

import java.awt.*;

import static java.lang.Math.round;

public class CuberRender implements GeometryRender<Cube> {
    static final Color nodeColor = new Color(252, 108, 133);
    static final Color edgeColor = new Color(60, 96, 240);
    private Graphics graphics;

    public GeometryRender<Cube> withGraphic(Graphics graphics) {
        this.graphics = graphics;
        return this;
    }

    @Override
    public void render(Cube geometry) {
        Point[] edges = geometry.getEdges();
        Point3D[] nodes = geometry.getNodes();
            graphics.setColor(edgeColor);

        for (Point edge : edges) {
            Point3D node1 = nodes[edge.x];
            Point3D node2 = nodes[edge.y];
            graphics.drawLine(
                    node1.getX(), node1.getY(),
                    node2.getX(), node2.getY()
            );
        }
        for (Point3D node : nodes) {
            graphics.setColor(nodeColor);
            graphics.fillOval((int) round(node.getX()) - 5, (int) round(node.getY()) - 5, 10, 10);
        }
    }
}
