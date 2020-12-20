package org.tvc12.geometry;

import org.tvc12.point.Point3D;

import java.awt.*;

import static java.lang.Math.*;

public class Cube implements Geometry {
    private Point3D[] nodes;
    private Point[] edges;
    private double angleY;
    private double angleX;
    private final int size;

    public Cube(int size) {
        this.size = size;
        initDefault(size);
    }

    private void initDefault(int size) {
        nodes = getDefaultNode(size);
        edges = getDefaultEdges();
    }

    private Point[] getDefaultEdges() {
        return new Point[]{
                new Point(0, 1), new Point(1, 3), new Point(3, 2), new Point(2, 0), new Point(4, 5), new Point(5, 7),
                new Point(7, 6), new Point(6, 4), new Point(0, 4), new Point(1, 5), new Point(2, 6), new Point(3, 7)
        };
    }

    private Point3D[] getDefaultNode(int size) {
        return new Point3D[]{
                new Point3D(-size, -size, -size), new Point3D(-size, -size, size), new Point3D(-size, size, -size), new Point3D(-size, size, size),
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
    public void rotateX(double angleX) {
        initDefault(size);
        this.angleX = angleX;
        rotateCube(this.angleX, angleY);
    }

    @Override
    public void rotateY(double angleY) {
        initDefault(size);
        this.angleY = angleY;
        rotateCube(angleX, this.angleY);
    }

    @Override
    public void rotateZ(double angleZ) {
        this.angleY = angleZ;
        this.angleX = angleZ;
        initDefault(size);
        rotateCube(angleX, this.angleY);
    }


    private void rotateCube(double angleX, double angleY) {
        double sinX = sin(angleX);
        double cosX = cos(angleY);

        double sinY = sin(angleY);
        double cosY = cos(angleY);

        for (Point3D node : nodes) {
            double x = node.getX();
            double y = node.getY();
            double z = node.getZ();

            node.setX(x * cosX - z * sinX);
            node.setZ(z * cosX + x * sinX);

            z = node.getZ();

            node.setY(y * cosY - z * sinY);
            node.setZ(z * cosY + y * sinY);
        }
    }
}
