/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import Project.connectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author javi
 * @author Mohamad Moaqaly
 */
public class NewBook extends javax.swing.JFrame {

    /**
     * Creates new form NewBook
     */
    public NewBook() {
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
        isbnInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        addBook = new javax.swing.JButton();
        titleInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        authorInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bookpublishYearInput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(980, 195));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(24, 27, 52));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        isbnInput.setBackground(new java.awt.Color(255, 255, 255));
        isbnInput.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(isbnInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 250, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ISBN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        addBook.setBackground(new java.awt.Color(48, 50, 78));
        addBook.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addBook.setForeground(new java.awt.Color(255, 255, 255));
        addBook.setText("Save");
        addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookActionPerformed(evt);
            }
        });
        jPanel1.add(addBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 220, 30));

        titleInput.setBackground(new java.awt.Color(255, 255, 255));
        titleInput.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(titleInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 250, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Title");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));

        authorInput.setBackground(new java.awt.Color(255, 255, 255));
        authorInput.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(authorInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 250, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Author");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, -1, -1));

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 250, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Publisher");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, -1));

        bookpublishYearInput.setBackground(new java.awt.Color(255, 255, 255));
        bookpublishYearInput.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(bookpublishYearInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 250, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Publication Year");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, -1, -1));

        jPanel3.setBackground(new java.awt.Color(48, 50, 78));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("New Book");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1000, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookActionPerformed
        // TODO add your handling code here:
        String isbn = isbnInput.getText();
        String title = titleInput.getText();
        String author = authorInput.getText();
        String publisher = jTextField4.getText();
        String publicationYear = bookpublishYearInput.getText();
        
        try {
            Connection con = connectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("insert into book values('"+isbn+"' ,'"+title+"','"+author+"','"+publisher+"','"+publicationYear+"')");
            //CREATE TABLE book (isbn varchar(17),title varchar(20),author varchar(20), publisher varchar(100),publicationYear varchar(10));
            JOptionPane.showMessageDialog(null,"Book successfully added");
            setVisible(false);
            new NewBook().setVisible(true);
            
        }
        catch(Exception e) {
            
            JOptionPane.showMessageDialog(null,"Error occured, book might already exist");
        }
    }//GEN-LAST:event_addBookActionPerformed

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
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBook;
    private javax.swing.JTextField authorInput;
    private javax.swing.JTextField bookpublishYearInput;
    private javax.swing.JTextField isbnInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField titleInput;
    // End of variables declaration//GEN-END:variables

    JPanel getJPanel2() {
        return jPanel1;
    }
}