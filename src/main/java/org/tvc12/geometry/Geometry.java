package org.tvc12.geometry;

import java.awt.*;

public interface Geometry {
    Point[] getPoints();

    void routeX(double x);

    void routeY(double y);

    void routeZ(double z);
}
