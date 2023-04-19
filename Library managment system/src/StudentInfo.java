

import Project.connectionProvider;
import java.sql.*;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author Mohamad Moaqaly
 *  matriculation number: 1310757
 */
public class StudentInfo extends javax.swing.JFrame {
 
 
    public StudentInfo() {
        initComponents();
     
    }


public JPanel getJPanel2() {
    return jPanel2;
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        refreshStudent = new javax.swing.JButton();
        deleteStudent = new javax.swing.JButton();
        searchStudent = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(980, 195));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 825, -1, -1));

        jPanel2.setBackground(new java.awt.Color(24, 27, 52));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "studentID", "name", "fatherName", "courseName", "branchName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 1000, 450));

        refreshStudent.setBackground(new java.awt.Color(48, 50, 78));
        refreshStudent.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        refreshStudent.setForeground(new java.awt.Color(255, 255, 255));
        refreshStudent.setText("Refresh");
        refreshStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshStudentActionPerformed(evt);
            }
        });
        jPanel2.add(refreshStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, 200, 50));

        deleteStudent.setBackground(new java.awt.Color(48, 50, 78));
        deleteStudent.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        deleteStudent.setForeground(new java.awt.Color(255, 255, 255));
        deleteStudent.setText("Delete");
        deleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentActionPerformed(evt);
            }
        });
        jPanel2.add(deleteStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 700, 200, 50));

        searchStudent.setBackground(new java.awt.Color(48, 50, 78));
        searchStudent.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        searchStudent.setForeground(new java.awt.Color(255, 255, 255));
        searchStudent.setText("Search");
        searchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStudentActionPerformed(evt);
            }
        });
        jPanel2.add(searchStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 30));

        searchField.setBackground(new java.awt.Color(255, 255, 255));
        searchField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        jPanel2.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 280, 30));

        jPanel3.setBackground(new java.awt.Color(48, 50, 78));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student Information");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1000, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void refreshStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshStudentActionPerformed
        // Refresh Button in studentinfo
       
            try {
         Connection con=connectionProvider.getCon();
        Statement st=con.createStatement();
        Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT studentID, name, lastName, courseName, branchName FROM student"); 

    // 3. Create the table model
    DefaultTableModel model = new DefaultTableModel();
  
    // 4. Get the column names and add them to the model
    ResultSetMetaData meta = rs.getMetaData();
    int columnCount = meta.getColumnCount();
    for (int i = 1; i <= columnCount; i++) {
    model.addColumn(meta.getColumnName(i));
    }
  
    // 5. Add the rows to the model
    while (rs.next()) {
    Object[] row = new Object[columnCount];
    for (int i = 1; i <= columnCount; i++) {
      if (i == 1) {
        row[i - 1] = rs.getInt(i);
      } else {
        row[i - 1] = rs.getString(i);
      }
    }
    model.addRow(row);
    }
  
    // 6. Set the model for the JTable
    jTable1.setModel(model);
    } catch (SQLException e) {
    e.printStackTrace();
    }
          
    }//GEN-LAST:event_refreshStudentActionPerformed

// delete Button
    private void deleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentActionPerformed
         // delete Button
         // Get the selected row index
    int row = jTable1.getSelectedRow();
    if (row == -1) {
      // No row was selected
      JOptionPane.showMessageDialog(null, "Please select a student to delete.", "Error", JOptionPane.ERROR_MESSAGE);
      return;
    }
    // Confirm delete
    int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this student?", "Confirm", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.NO_OPTION) {
      return;
    }
    // Get the selected student ID
    int studentID = (int) jTable1.getValueAt(row, 0);
    // Delete the student from the database
      try {
         Connection con=connectionProvider.getCon();
        Statement st=con.createStatement();
        Statement stmt = con.createStatement();
      String sql = "DELETE FROM student WHERE studentID = " + studentID;
      stmt.executeUpdate(sql);
    } catch (SQLException ex) {
      ex.printStackTrace();
      return;
    }
    // Delete the student from the table model
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.removeRow(row);
  


    }//GEN-LAST:event_deleteStudentActionPerformed

    private void searchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStudentActionPerformed
     // Get the search value
    String searchValue = searchField.getText();
    // Create a row filter to search for the value
    TableRowSorter<TableModel> sorter = new TableRowSorter<>(jTable1.getModel());
    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchValue));
    // Set the row sorter for the table
    jTable1.setRowSorter(sorter);
   
    }//GEN-LAST:event_searchStudentActionPerformed

  
    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton refreshStudent;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton searchStudent;
    // End of variables declaration//GEN-END:variables
}
