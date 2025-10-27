
package Frontend;


import Backend.StudentManager;
import Backend.Students;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import Frontend.CustomdesignClasses.roundedbtn;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractCellEditor;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author LapTop
 */
public class ViewStudentPanel extends javax.swing.JPanel {

    private StudentManager manager;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ViewStudentPanel.class.getName());

    /**
     * Creates new form ViewStudentPanel
     */
    public ViewStudentPanel(StudentManager manager) {
        this.manager  = manager;
        initComponents();
        loadStudentTable();
    }

   
//    @SuppressWarnings("unchecked")
//                           
//    private void initComponents() {
//        jScrollPane1 = new javax.swing.JScrollPane();
//        jTable1 = new javax.swing.JTable();
//        viewStudent = new javax.swing.JLabel();
//        refresh = new javax.swing.JButton();
//        jScrollPane2 = new javax.swing.JScrollPane();
//        studentTable = new javax.swing.JTable();
//        search = new javax.swing.JButton();
//
//      
//        searchTxtField = new javax.swing.JTextField();
//        searchtxt = new javax.swing.JLabel();
//        UpdateBtn = new javax.swing.JButton();
//
//        searchTxtField = new javax.swing.JTextField();
//        searchtxt = new javax.swing.JLabel();
//
//        jTable1.setModel(new javax.swing.table.DefaultTableModel(
//            new Object [][] {
//                {null, null, null, null},
//                {null, null, null, null},
//                {null, null, null, null},
//                {null, null, null, null}
//            },
//            new String [] {
//                "Title 1", "Title 2", "Title 3", "Title 4"
//            }
//        ));
//        jScrollPane1.setViewportView(jTable1);
//
//       
//       setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
//
//        viewStudent.setBackground(new java.awt.Color(51, 51, 255));
//        viewStudent.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
//        viewStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//        viewStudent.setText("view student");
//        viewStudent.setToolTipText("view student");
//       add(viewStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 399, 50));
//
//        refresh.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
//        refresh.setText("refresh");
//        refresh.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                refreshActionPerformed(evt);
//            }
//        });
//       add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 73, -1));
//        refresh.getAccessibleContext().setAccessibleDescription("");
//
//        studentTable.setModel(new javax.swing.table.DefaultTableModel(
//            new Object [][] {
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null}
//            },
//            new String [] {
//                "id", "name", "age", "gender", "department", "gpa"
//            }
//        ));
//        jScrollPane2.setViewportView(studentTable);
//
//       add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 570, 213));
//
//        search.setText("search");
//        search.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                searchActionPerformed(evt);
//            }
//        });
//       add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 70, 30));
//
//        searchTxtField.setText("search here");
//        searchTxtField.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                searchTxtFieldActionPerformed(evt);
//            }
//        });
//       add(searchTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 130, 30));
//
//        searchtxt.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
//        searchtxt.setText("search by name or id:");
//       add(searchtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 130, 30));
//        searchtxt.getAccessibleContext().setAccessibleDescription("");
//
//
//    }                     
//                                           

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed

        loadStudentTable();
    }//GEN-LAST:event_refreshActionPerformed
//
                                     


                       
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton refresh;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchTxtField;
    private javax.swing.JLabel searchtxt;
    private javax.swing.JTable studentTable;
    private javax.swing.JLabel viewStudent;
                
class updateBtn extends roundedbtn implements javax.swing.table.TableCellRenderer{
public updateBtn(){
    super("UPDATE", 15, 15);
    setBackground(new Color(9, 45, 189));
   setPreferredSize(new Dimension(50,10));
    setForeground(Color.white);

}
@Override
public Component getTableCellRendererComponent(javax.swing.JTable table, Object value,boolean isSelected, boolean hasFocus , int row, int column)
{
return this;
}}
class updateBtnEditor extends  AbstractCellEditor implements TableCellEditor , ActionListener{
private roundedbtn btn;
private JTable tb;
private StudentManager manager;
private int row; 
public updateBtnEditor (JTable tb , StudentManager manager){
this.tb = tb;
this.manager  = manager;
btn = new roundedbtn("UPDATE", 15, 15);
 btn.setBackground(new Color(9, 45, 189));
    btn.setForeground(Color.white);
    btn.setPreferredSize(new Dimension(50,10));
    btn.addActionListener(this);


}

        @Override
        public Object getCellEditorValue() {
            return null;
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }



        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
           
            this.row = row;
            return btn;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
              JOptionPane.showMessageDialog(null, "CLICKED ROW "+this.row);
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
 
}
   

  
    private void initComponents() {

        viewStudent = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        search = new javax.swing.JButton();
       
        searchTxtField = new javax.swing.JTextField();
        searchtxt = new javax.swing.JLabel();
        
  
     setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewStudent.setBackground(new java.awt.Color(51, 51, 255));
        viewStudent.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        viewStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewStudent.setText("view student");
        viewStudent.setToolTipText("view student");
       add(viewStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 399, 50));

        refresh.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        refresh.setText("refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
      add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 73, -1));
        refresh.getAccessibleContext().setAccessibleDescription("");

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "name", "age", "gender", "department", "gpa","UPDATE"
            }
        ));
        studentTable.setRowHeight(35);
        jScrollPane2.setViewportView(studentTable);

       add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 570, 213));
        search.setText("search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
     add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 70, 30));

       

        searchTxtField.setText("search here");
        searchTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTxtFieldActionPerformed(evt);
            }
        });
      add(searchTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 130, 30));

        searchtxt.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        searchtxt.setText("Search by name or ID:");
       add(searchtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 130, 30));

       
    }


    private void searchTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTxtFieldActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        String key=searchTxtField.getText().trim();
        if(key.equals(""))
            JOptionPane.showMessageDialog(null, "Enter student name or ID","Error",JOptionPane.ERROR_MESSAGE);
        else if(manager.searchStudent(key)==null)
            JOptionPane.showMessageDialog(null,"Student not found","Error",JOptionPane.ERROR_MESSAGE);
        else{//momkn hna n3ml helper method walla 7aga ll display b sefa 3amma 34an el repitition
            Students found=manager.searchStudent(key);
            DefaultTableModel model=(DefaultTableModel) studentTable.getModel();
            model.setRowCount(0);
            model.addRow(new Object[]{
                found.getID(),
                found.getFullName(),
                found.getAge(),
                found.getGender(),
                found.getDepartment(),
                found.getGpa(),
                "UPDATE"
                
            });
        }  
        studentTable.getColumn("UPDATE").setCellRenderer(new updateBtn());
        studentTable.getColumn("UPDATE").setCellEditor(new updateBtnEditor(studentTable, manager));

        
    }//GEN-LAST:event_searchActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_UpdateBtnActionPerformed

    /**
     * @param args the command line arguments
     */
   

   

//    private javax.swing.JScrollPane jScrollPane2;
//    private javax.swing.JButton refresh;
//    private javax.swing.JButton search;
//    private javax.swing.JTextField searchTxtField;
//    private javax.swing.JLabel searchtxt;
//    private javax.swing.JTable studentTable;
//    private javax.swing.JLabel viewStudent;
   

    
     private void loadStudentTable() {
        DefaultTableModel model = (DefaultTableModel) studentTable.getModel();
        model.setRowCount(0);//to make sure table is empty men old data
        for (int i = 0; i < manager.getAllStudents().size(); i++) {
            Students s = manager.getAllStudents().get(i);
            model.addRow(new Object[]{
                s.getID(),
                s.getFullName(),
                s.getAge(),
                s.getGender(),
                s.getDepartment(),
                s.getGpa(),
               "UPDATE"
            });
        }
        studentTable.getColumn("UPDATE").setCellRenderer(new updateBtn());
        studentTable.getColumn("UPDATE").setCellEditor(new updateBtnEditor(studentTable, manager));
         studentTable.getColumn("UPDATE").setPreferredWidth(100);

    }
   
   private void refreshActionPreformed(java.awt.event.ActionEvent evt)
   {
   loadStudentTable();
   }
   
   
}
    
         


