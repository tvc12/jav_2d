package org.tvc12.geometry;

import org.tvc12.point.Point3D;

import java.awt.*;

public class Cube implements Geometry {
    private final Point3D[] nodes;
    private final Point[] edges;

    public Cube(int size) {
        nodes = getDefaultNode(size);
        edges = getDefaultEdges();
//        initialCube(x, y, size, distance);
    }

    private Point[] getDefaultEdges() {
        return new Point[]{
                new Point(0, 1), new Point(1, 3), new Point(3, 2), new Point(2, 0), new Point(4, 5), new Point(5, 7),
                new Point(7, 6), new Point(6, 4), new Point(0, 4), new Point(1, 5), new Point(2, 6), new Point(3, 7)
        };
    }

    private Point3D[] getDefaultNode(int size) {
        return new Point3D[]{
                new Point3D(-size, -size, -size), new Point3D(-size, -size, size), new Point3D(-size, size, -size), new Point3D(size, size, size),
                new Point3D(size, -size, -size), new Point3D(size, -size, size), new Point3D(size, size, -size), new Point3D(size, size, size)
        };
    }

    @Override
    public Point[] getEdges() {
        return edges;
    }

    @Override
    public Point3D[] getNodes() {
        return nodes;
    }

    @Override
    public void rotateX(double x) {
    }

    @Override
    public void rotateY(double y) {
    }

    @Override
    public void rotateZ(double z) {
    }


}
