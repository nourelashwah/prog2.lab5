package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CustomdesignClasses {
    public static class roundedbtn extends JButton{
private int arcW;
private int arcH;

        public roundedbtn(String text ,int arcW, int arcH) {
            super(text);
            this.arcW = arcW;
            this.arcH = arcH;
            setContentAreaFilled(false);
            setBorderPainted(false);
            setFocusPainted(false);
            setOpaque(false);

        }
        @Override
        protected void paintComponent(Graphics g){
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            if(getModel().isArmed() && getModel().isEnabled()){
                g2.setColor(getBackground().darker());
            }
            else if(getModel().isRollover() && getModel().isEnabled()){
                g2.setColor(getBackground().brighter());
            }
            else{
                g2.setColor(getBackground());
            }
            g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arcW, arcH);
            super.paintComponent(g2);
            g2.dispose();
        }

        @Override
        public Dimension getPreferredSize() {
            Dimension size = super.getPreferredSize();
            size.width = Math.max(size.width, size.height);
            size.height = Math.max(size.width, size.height);
            return size;

        }

}
    
    public static class RoundedLABELS extends JLabel {
    private int radius;
    private Color bgColor;

        public RoundedLABELS(String text, int radius, Color bgColor) {
            super(text);
            this.radius = radius;
            this.bgColor = bgColor;
            setForeground(Color.BLACK);
            setHorizontalAlignment(CENTER);
            setVerticalAlignment(CENTER);
            setOpaque(false);
            setBorder(BorderFactory.createEmptyBorder(5,10,5,10));
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(bgColor);
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
            super.paintComponent(g2);
            g2.dispose();
        }
    }

    public static class RoundedINPUTS extends JTextField {
    private int radius;
    private Color backgroundColor;

        public RoundedINPUTS(int radius, Color bgColor) {
            this.radius = radius;
            this.backgroundColor = bgColor;
            setOpaque(false);
            setBorder(BorderFactory.createEmptyBorder(5,10,5,10));
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(backgroundColor);
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
            super.paintComponent(g2);
            g2.dispose();
        }
    }
}
