package org.tvc12.geometry;

import java.awt.*;

public interface Geometry {
    Point[] getPoints();

    Geometry routeX(double x);

    Geometry routeY(double y);

    Geometry routeZ(double z);
}
