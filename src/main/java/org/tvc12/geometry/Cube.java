package org.tvc12.geometry;

import java.awt.*;

public class Cube implements Geometry {
    private final int x;
    private final int y;
    private final int size;
    private final int distance;
    private final Point[] points;

    public Cube(int x, int y, int size, int distance) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.distance = distance;
        points = new Point[8];

        initialCube(x, y, size, distance);
    }

    private void initialCube(int x, int y, int size, int distance) {
        points[0] = new Point(x, y);
        points[1] = new Point(x + size, y);
        points[2] = new Point(x + size, y + size);
        points[3] = new Point(x, y + size);

        int newX = x + distance;
        int newY = y + distance;
        points[4] = new Point(newX, newY);
        points[5] = new Point(newX + size, newY);
        points[6] = new Point(newX + size, newY + size);
        points[7] = new Point(newX, newY + size);
    }

    @Override
    public Point[] getPoints() {
        return points;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public void routeX(double x) {
    }

    @Override
    public void routeY(double y) {
    }

    @Override
    public void routeZ(double z) {
    }


}
