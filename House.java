import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/*
<applet code="HouseApplet" width="400" height="400"></applet>
*/
public class House extends Applet {

    @Override
    public void paint(Graphics g) {
        // Set background color
        setBackground(Color.CYAN);

        // Draw the body of the house (rectangle)
        g.setColor(Color.YELLOW);
        g.fillRect(100, 150, 200, 150);

        // Draw the roof of the house (triangle)
        g.setColor(Color.RED);
        Polygon roof = new Polygon();
        roof.addPoint(100, 150); // Left point
        roof.addPoint(300, 150); // Right point
        roof.addPoint(200, 80);  // Top point
        g.fillPolygon(roof);

        // Draw the door (rectangle)
        g.setColor(Color.DARK_GRAY);
        g.fillRect(170, 220, 60, 80);

        // Draw windows (rectangles)
        g.setColor(Color.BLUE);
        g.fillRect(120, 170, 40, 40); // Left window
        g.fillRect(240, 170, 40, 40); // Right window

        // Draw window panes
        g.setColor(Color.BLACK);
        g.drawLine(140, 170, 140, 210); // Left vertical line
        g.drawLine(120, 190, 160, 190); // Left horizontal line
        g.drawLine(260, 170, 260, 210); // Right vertical line
        g.drawLine(240, 190, 280, 190); // Right horizontal line

        // Draw the door knob
        g.setColor(Color.BLACK);
        g.fillOval(220, 260, 10, 10);

        // Draw the sun
        g.setColor(Color.ORANGE);
        g.fillOval(320, 50, 50, 50);

        // Draw the ground
        g.setColor(Color.GREEN);
        g.fillRect(0, 300, 400, 100);

        // Add text
        g.setColor(Color.BLACK);
        g.drawString("A Simple House", 150, 50);
    }
}
