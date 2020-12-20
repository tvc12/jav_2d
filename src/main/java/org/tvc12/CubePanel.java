package org.tvc12;

import org.tvc12.geometry.Cube;
import org.tvc12.geometry.Geometry;
import org.tvc12.renderable.GeometryRender;

import javax.swing.*;
import java.awt.*;

public class CubePanel extends JPanel {
    private Geometry geometry;
    public GeometryRender render;

    public CubePanel() {
        geometry = new Cube();
        render = new GeometryRender();
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
        render
            .withGraphic(g)
            .render(getGeometry());
    }

    public Geometry getGeometry() {
        return geometry;
    }
}
