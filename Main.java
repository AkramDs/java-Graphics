import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

class Main {
    public static void main(String[] args) {
        int x, y;

        x =+ 500;
        y =+ 500;

        JPanel gPanel = new JPanel();
        gPanel.setBounds(0, 0, x, y);

        JFrame frame = new JFrame("Test Graphics");
        frame.setSize(x, y);
        frame.setLocation(100, 100);
        frame.setVisible(true);

        frame.add(gPanel);

        Graphics g = gPanel.getGraphics();

        gPanel.paint(g);

        g.drawString("Hello", 200, 200);
        g.drawRect(150, 50, 100, 100);
        g.fillRect(50, 50, 100, 100);

    }
}