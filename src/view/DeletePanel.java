package view;


import Controller.StudentManager;
import model.Student;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;



public class DeletePanel extends javax.swing.JPanel {


    public final StudentManager manager ;
    public DeletePanel(StudentManager manager) {
        this.manager = manager;
        initComponents();
    }

    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        scrollMain = new javax.swing.JScrollPane();
        Title = new javax.swing.JLabel();
        deleteTable = new javax.swing.JTable();
      
        searchid = new javax.swing.JTextField();
        SearchLabel = new javax.swing.JLabel();
        SearchBtn = new CustomdesignClasses.roundedbtn("SEARCH BY ID", 15, 15);

        Title.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("DELETE STUDENT");

        deleteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Student Name", "Student Id", "GPA", "DELETE"}
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class, java.lang.Float.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });

        searchid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchidActionPerformed(evt);
            }
        });

        SearchLabel.setLabelFor(searchid);
        SearchLabel.setText("SEARCH BY ID");

        SearchBtn.setBackground(new java.awt.Color(102, 255, 0));
        SearchBtn.setForeground(new java.awt.Color(0, 0, 0));
       
        SearchBtn.addComponentListener(new java.awt.event.ComponentAdapter() {
           
        });
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        javax.swing.JPanel contentPanel = new javax.swing.JPanel();
        contentPanel.setLayout(new javax.swing.GroupLayout(contentPanel));
        javax.swing.GroupLayout contentLayout = (javax.swing.GroupLayout) contentPanel.getLayout();
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(SearchLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchid, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deleteTable, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                    )
                )
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchLabel)
                    .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(deleteTable, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        scrollMain.setViewportView(contentPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollMain, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollMain, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
    }

    private void searchidActionPerformed(java.awt.event.ActionEvent evt) {                                         
    }                                        
public void LoadTable(List<Student> students){

    DefaultTableModel model = (DefaultTableModel) deleteTable.getModel();
    model.setRowCount(0);
    for(Student s : students){
    Object[] row = {
    s.getName(),
        s.getId(),
        s.getGpa(),
        false};
    model.addRow(row);
    
    model.addTableModelListener(e ->{
    if(e.getColumn() == 3 && e.getType() == javax.swing.event.TableModelEvent.UPDATE){
    int r = e.getFirstRow();
        Boolean checked = (Boolean) model.getValueAt(r, 3);
            if (checked != null && checked) {
                int id = (int) model.getValueAt(r, 1);
                String name = (String) model.getValueAt(r, 0);

                int confirm = javax.swing.JOptionPane.showConfirmDialog(
                        this,
                        "ARE U SURE U WANT TO DELETE " + name + "?",
                        "Confirm Delete",
                        javax.swing.JOptionPane.YES_NO_OPTION
                );

                if (confirm == javax.swing.JOptionPane.YES_OPTION) {
                    manager.deleteStudent(id);
                    LoadTable(manager.getAllStudents());
                } else {
                    
                    model.setValueAt(false, r, 3);
                }
            }
        }
    });
}
    
    
   
}
                                          

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
       if(searchid.getText().trim().isEmpty()){
           LoadTable(manager.getAllStudents());
       }
       else{
       Student st = manager.searchStudent(searchid.getText().trim());
       if(st != null){
           java.util.List<Student> single = new java.util.ArrayList<>();
           single.add(st);
           LoadTable(single);
       }
       else{
       javax.swing.JOptionPane.showMessageDialog(this, "STUDENT DOESNT EXIST");
       }
       }
    }                                        


    
    private javax.swing.JButton SearchBtn;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel SearchLabel;
    private javax.swing.JTable deleteTable;
   
    private javax.swing.JTextField searchid;
    private javax.swing.JScrollPane scrollMain;
}
