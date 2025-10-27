package Frontend;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
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
        public boolean contains(int x, int y) {
            return new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), arcW, arcH).contains(x, y); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }

        @Override
        public Dimension getPreferredSize() {
            Dimension size = super.getPreferredSize();
            return size;

        }

}
    public static class roundedlabel extends JLabel{
private int arcW;
private int arcH;

        public roundedlabel(String text ,int arcW, int arcH) {
            super(text);
            this.arcW = arcW;
            this.arcH = arcH;
           
            setOpaque(false);

        }
        @Override
        protected void paintComponent(Graphics g){
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         
                g2.setColor(getBackground());
         
            g2.fill(new RoundRectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1, arcW, arcH));
            super.paintComponent(g2);
            g2.dispose();
        }

      
}
    
   public static class roundedins extends JTextField{
private int arcW;
private int arcH;
private Color borderColor = Color.GRAY;

        public roundedins(int arcW, int arcH) {
            
            this.arcW = arcW;
            this.arcH = arcH;
           
            setOpaque(false);

        }
        public void setBorderColor(Color color){
            this.borderColor = color;
            repaint();
        }
        @Override
        protected void paintComponent(Graphics g){
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         
                g2.setColor(getBackground());
         
            g2.fill(new RoundRectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1, arcW, arcH));
            super.paintComponent(g2);
            g2.dispose();
        }
        @Override
        protected void paintBorder(Graphics g){
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(borderColor);
            g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arcW, arcH);
            g2.dispose();
        }
}
         public static class roundedPASS extends JPasswordField{
private int arcW;
private int arcH;
private Color borderColor = Color.GRAY;

        public roundedPASS(int arcW, int arcH) {
            
            this.arcW = arcW;
            this.arcH = arcH;
           
            setOpaque(false);

        }
        public void setBorderColor(Color color){
            this.borderColor = color;
            repaint();
        }
        @Override
        protected void paintComponent(Graphics g){
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         
                g2.setColor(getBackground());
         
            g2.fill(new RoundRectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1, arcW, arcH));
            super.paintComponent(g2);
            g2.dispose();
        }
        @Override
        protected void paintBorder(Graphics g){
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(borderColor);
            g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arcW, arcH);
            g2.dispose();
        }

      
}
    
}
