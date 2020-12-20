package org.tvc12.geometry;

import org.tvc12.point.Point3D;

import java.awt.*;

public interface Geometry {
    Point[] getEdges();

    Point3D[] getNodes();

    void rotateX(double x);

    void rotateY(double y);

    void rotateZ(double z);
}
