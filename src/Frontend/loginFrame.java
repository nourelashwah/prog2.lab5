
package Frontend;

import javax.swing.JFrame;


public class loginFrame extends JFrame{
    public loginFrame(){
    setTitle("LOGIN");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(400, 300);
        setLocationRelativeTo(null);
        add(new LoginPanel());
        setVisible(true);
    }
    
}
