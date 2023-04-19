import java.sql.*;
import Project.connectionProvider;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author: Nassim Laaraj - 1366099
 * @author Mohamad Moaqaly
 */
public class ReturnBook extends javax.swing.JFrame {

    /**
     * Creates new form returnBook
     */
    public ReturnBook() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        returnBook = new javax.swing.JButton();
        returnDueDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        returnIssueDate = new javax.swing.JTextField();
        studentIdInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bookIdInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(980, 195));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(24, 27, 52));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        returnBook.setBackground(new java.awt.Color(48, 50, 78));
        returnBook.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        returnBook.setForeground(new java.awt.Color(255, 255, 255));
        returnBook.setText("Return Book");
        returnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBookActionPerformed(evt);
            }
        });
        jPanel1.add(returnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, 150, 40));

        returnDueDate.setEditable(false);
        returnDueDate.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(returnDueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 250, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Due Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 90, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Issue Date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, -1, 30));

        search.setBackground(new java.awt.Color(48, 50, 78));
        search.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 150, 40));

        returnIssueDate.setEditable(false);
        returnIssueDate.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(returnIssueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 250, 30));

        studentIdInput.setBackground(new java.awt.Color(255, 255, 255));
        studentIdInput.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        studentIdInput.setForeground(new java.awt.Color(0, 0, 0));
        studentIdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdInputActionPerformed(evt);
            }
        });
        jPanel1.add(studentIdInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 250, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, 30));

        bookIdInput.setBackground(new java.awt.Color(255, 255, 255));
        bookIdInput.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bookIdInput.setForeground(new java.awt.Color(0, 0, 0));
        bookIdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookIdInputActionPerformed(evt);
            }
        });
        jPanel1.add(bookIdInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 250, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book ID");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setMaximumSize(new java.awt.Dimension(43, 22));
        jLabel1.setMinimumSize(new java.awt.Dimension(43, 22));
        jLabel1.setPreferredSize(new java.awt.Dimension(43, 22));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 90, -1));

        jPanel3.setBackground(new java.awt.Color(48, 50, 78));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Return Book");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1000, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 1000));

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookIdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookIdInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookIdInputActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        //Search Button :
        String isbn = bookIdInput.getText();
        String studentID = studentIdInput.getText();
        try{
            Connection con=connectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM issue WHERE isbn='"+isbn+"'AND studentID='"+studentID+"'");
            if(rs.next()){
                returnIssueDate.setText(rs.getString(3));
                returnDueDate.setText(rs.getString(4));
                bookIdInput.setEditable(false);
                studentIdInput.setEditable(false);
            }
            else{
                JOptionPane.showMessageDialog(null,"Book is not issued to this student");
                setVisible(false);
                new ReturnBook().setVisible(true);
                System.out.println("book issue");
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Connection Error");
        }
    }//GEN-LAST:event_searchActionPerformed

    private void returnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBookActionPerformed
        // TODO add your handling code here:
        // Return button :
        
        String isbn = bookIdInput.getText(); // in our case its the book isbn not the id @Nassim
        String studentID = studentIdInput.getText();
        try{
            Connection con=connectionProvider.getCon();
            Statement st=con.createStatement();
            st.executeUpdate("UPDATE issue SET returnBook='Yes' WHERE isbn='"+isbn+"'AND studentID='"+studentID+"'");
            JOptionPane.showMessageDialog(null,"Book successfully returned");
            setVisible(false);
            new ReturnBook().setVisible(true);
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Connection Error");
        }
    }//GEN-LAST:event_returnBookActionPerformed

    private void studentIdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIdInputActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookIdInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton returnBook;
    private javax.swing.JTextField returnDueDate;
    private javax.swing.JTextField returnIssueDate;
    private javax.swing.JButton search;
    private javax.swing.JTextField studentIdInput;
    // End of variables declaration//GEN-END:variables

    JPanel getJPanel2() {
        return jPanel1;
    }
}
