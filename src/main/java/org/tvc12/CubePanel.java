package org.tvc12;

import org.tvc12.geometry.Cube;
import org.tvc12.renderable.CuberRender;
import org.tvc12.renderable.GeometryRenders;

import javax.swing.*;
import java.awt.*;

public class CubePanel extends JPanel {
    private final Cube geometry;

    public Cube getGeometry() {
        return geometry;
    }

    private CuberRender cuberRender;

    public CubePanel() {
        geometry = new Cube(0, 0, 50);
        cuberRender = GeometryRenders.cuberRender();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.translate(getWidth() / 2, getHeight() / 2);

        if (g instanceof Graphics2D) {
            // Render smoothing
            ((Graphics2D) g).setRenderingHint(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON
            );
        }
        cuberRender
                .withGraphic(g)
                .render(geometry);
    }

}
