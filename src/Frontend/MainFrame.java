package Frontend;
import Frontend.CustomdesignClasses.roundedbtn;
import java.awt.Color;
import Frontend.DeletePanel;
import Backend.StudentManager;
public class MainFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainFrame.class.getName());
private StudentManager manager = new StudentManager();
    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

     
        mainP = new javax.swing.JTabbedPane();
        WelcomeP = new javax.swing.JPanel();
        welcomeL = new javax.swing.JLabel();
        addS = new roundedbtn("ADD STUDENT", 15, 15);
        viewS = new roundedbtn("VIEW STUDENTS", 15, 15);
        searchupdateS = new roundedbtn("SEARCH AND UPDATE STUDENTS", 15, 15);
        deleteS = new roundedbtn("DELETE STUDENTS", 15, 15);
        addP = new javax.swing.JPanel();
        viewP = new javax.swing.JPanel();
        searchP = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeL.setFont(new java.awt.Font("Segoe UI", 1, 36));
        welcomeL.setText("WELCOME ADMIN");
        welcomeL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Color mainColor = new Color(0, 153, 153);
        Color textColor = Color.WHITE;

        addS.setBackground(mainColor);
        addS.setForeground(textColor);
        viewS.setBackground(mainColor);
        viewS.setForeground(textColor);
        searchupdateS.setBackground(mainColor);
        searchupdateS.setForeground(textColor);
        deleteS.setBackground(mainColor);
        deleteS.setForeground(textColor);


        addS.addActionListener(e -> mainP.setSelectedIndex(1));
viewS.addActionListener(e -> mainP.setSelectedIndex(2));
searchupdateS.addActionListener(e -> mainP.setSelectedIndex(3));
deleteS.addActionListener(e -> mainP.setSelectedIndex(4));


        addS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSActionPerformed(evt);
            }
        });

        searchupdateS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchupdateSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout WelcomePLayout = new javax.swing.GroupLayout(WelcomeP);
        WelcomeP.setLayout(WelcomePLayout);
        WelcomePLayout.setHorizontalGroup(
            WelcomePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WelcomePLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(WelcomePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(WelcomePLayout.createSequentialGroup()
                        .addComponent(searchupdateS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(deleteS))
                    .addGroup(WelcomePLayout.createSequentialGroup()
                        .addComponent(addS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewS)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
           .addGroup(WelcomePLayout.createSequentialGroup()
    .addContainerGap()
    .addComponent(welcomeL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    .addContainerGap())

        );
        WelcomePLayout.setVerticalGroup(
            WelcomePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomePLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(welcomeL, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(WelcomePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewS)
                    .addComponent(addS))
                .addGap(58, 58, 58)
                .addGroup(WelcomePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteS)
                    .addComponent(searchupdateS))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        mainP.addTab("welcome", WelcomeP);

        javax.swing.GroupLayout addPLayout = new javax.swing.GroupLayout(addP);
        addP.setLayout(addPLayout);
        addPLayout.setHorizontalGroup(
            addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        addPLayout.setVerticalGroup(
            addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
        );
//TODOOO : REPLACE ALL dummy panels with real ppanels 
        mainP.addTab("ADD STUDENTS", addP);

        javax.swing.GroupLayout viewPLayout = new javax.swing.GroupLayout(viewP);
        //// add veiw panel
        viewP.setLayout(viewPLayout);
        viewPLayout.setHorizontalGroup(
            viewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        viewPLayout.setVerticalGroup(
            viewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
        );

        mainP.addTab("VIEW STUDENTS", viewP);

        javax.swing.GroupLayout searchPLayout = new javax.swing.GroupLayout(searchP);
        searchP.setLayout(searchPLayout);
        searchPLayout.setHorizontalGroup(
            searchPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        searchPLayout.setVerticalGroup(
            searchPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
        );

        mainP.addTab("SEARCH  STUDENTS", searchP);

        mainP.addTab("DELETE STUDENT", new DeletePanel(manager));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainP)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainP)
        );

        pack();
    }

    private void addSActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }

    private void searchupdateSActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> new loginFrame().setVisible(true));
    }

    private javax.swing.JButton addS;
    private javax.swing.JButton deleteS;
    private javax.swing.JTabbedPane mainP;
    private javax.swing.JLabel welcomeL;
    private javax.swing.JPanel WelcomeP;
    private javax.swing.JPanel addP;
    private javax.swing.JPanel viewP;
    private javax.swing.JPanel searchP;
  
    private javax.swing.JButton searchupdateS;
    private javax.swing.JButton viewS;
}
