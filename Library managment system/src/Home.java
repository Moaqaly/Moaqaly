
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JPanel;


 
/**
 *
 * @author Yousef Ghanem
 * @author Mohamad Moaqaly
 * matriculation number: 1310760
 */
public class Home extends javax.swing.JFrame {
    
    /**
     * Creates new form home
     */
    public Home() {
        initComponents();
     setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        newStudent = new javax.swing.JButton();
        newBook = new javax.swing.JButton();
        viewStudent = new javax.swing.JButton();
        displayCatalogue = new javax.swing.JButton();
        issueBook = new javax.swing.JButton();
        returnBook = new javax.swing.JButton();
        displayStatistics = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(1000, 1000));
        setLocationByPlatform(true);
        setSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setText("jButton9");
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-840, -1460, -1, -1));

        jLabel2.setText("z");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-500, -720, -1, -1));

        jPanel1.setBackground(new java.awt.Color(48, 50, 78));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setBackground(new java.awt.Color(24, 27, 52));
        logout.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_logout_50px.png"))); // NOI18N
        logout.setText("Logout");
        logout.setPreferredSize(new java.awt.Dimension(159, 59));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 770, 220, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome Admin !");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 300, 50));

        newStudent.setBackground(new java.awt.Color(24, 27, 52));
        newStudent.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        newStudent.setForeground(new java.awt.Color(255, 255, 255));
        newStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Add_Male_User_Group_50px.png"))); // NOI18N
        newStudent.setText("New Student");
        newStudent.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));
        newStudent.setPreferredSize(new java.awt.Dimension(159, 59));
        newStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStudentActionPerformed(evt);
            }
        });
        jPanel1.add(newStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 400, -1));

        newBook.setBackground(new java.awt.Color(24, 27, 52));
        newBook.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        newBook.setForeground(new java.awt.Color(255, 255, 255));
        newBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_books_50px_1.png"))); // NOI18N
        newBook.setText("New Book");
        newBook.setPreferredSize(new java.awt.Dimension(159, 59));
        newBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBookActionPerformed(evt);
            }
        });
        jPanel1.add(newBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 400, 60));

        viewStudent.setBackground(new java.awt.Color(24, 27, 52));
        viewStudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        viewStudent.setForeground(new java.awt.Color(255, 255, 255));
        viewStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_find_user_male_50px.png"))); // NOI18N
        viewStudent.setText("View Student");
        viewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStudentActionPerformed(evt);
            }
        });
        jPanel1.add(viewStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 400, 60));

        displayCatalogue.setBackground(new java.awt.Color(24, 27, 52));
        displayCatalogue.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        displayCatalogue.setForeground(new java.awt.Color(255, 255, 255));
        displayCatalogue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_literature_50px.png"))); // NOI18N
        displayCatalogue.setText("Catalogue");
        displayCatalogue.setPreferredSize(new java.awt.Dimension(159, 59));
        displayCatalogue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayCatalogueActionPerformed(evt);
            }
        });
        jPanel1.add(displayCatalogue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 400, -1));

        issueBook.setBackground(new java.awt.Color(24, 27, 52));
        issueBook.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        issueBook.setForeground(new java.awt.Color(255, 255, 255));
        issueBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_book_reading_50px.png"))); // NOI18N
        issueBook.setText("Issue Book");
        issueBook.setPreferredSize(new java.awt.Dimension(159, 59));
        issueBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBookActionPerformed(evt);
            }
        });
        jPanel1.add(issueBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 400, 60));

        returnBook.setBackground(new java.awt.Color(24, 27, 52));
        returnBook.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        returnBook.setForeground(new java.awt.Color(255, 255, 255));
        returnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_u_turn_to_left_50px.png"))); // NOI18N
        returnBook.setText("Return Book");
        returnBook.setPreferredSize(new java.awt.Dimension(159, 59));
        returnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBookActionPerformed(evt);
            }
        });
        jPanel1.add(returnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 400, -1));

        displayStatistics.setBackground(new java.awt.Color(24, 27, 52));
        displayStatistics.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        displayStatistics.setForeground(new java.awt.Color(255, 255, 255));
        displayStatistics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_combo_chart_50px.png"))); // NOI18N
        displayStatistics.setText("Statisitcs");
        displayStatistics.setPreferredSize(new java.awt.Dimension(159, 59));
        displayStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayStatisticsActionPerformed(evt);
            }
        });
        jPanel1.add(displayStatistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 400, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(24, 27, 52));
        jPanel2.setMinimumSize(new java.awt.Dimension(700, 700));
        jPanel2.setName(""); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Button for new student
    private void newStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStudentActionPerformed
        // newstudent button
        
        NewStudent newstudent1 = new NewStudent();
        JPanel panel = newstudent1.getJPanel2();
   
        if(currentPanel != null){
        currentPanel.setVisible(false);
        }
        currentPanel = panel;
        jPanel2.add(panel);
        panel.setBounds(jPanel2.getBounds());
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_newStudentActionPerformed
    // The Logout Button 
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // to close the current page and go back to login window
        //for the jpanel2
        setVisible(false);
        new LogIn().setVisible(true);
        
    }//GEN-LAST:event_logoutActionPerformed

    private void newBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBookActionPerformed
        // to add a new book 
        NewBook newBook = new NewBook();
        JPanel panel = newBook.getJPanel2(); // <-- get the JPanel from the NewBook class
        if(currentPanel != null){
            currentPanel.setVisible(false);
        }
        currentPanel = panel;
        jPanel2.add(panel);
        panel.setBounds(jPanel2.getBounds());
        jPanel2.revalidate();
        jPanel2.repaint();
    
    }//GEN-LAST:event_newBookActionPerformed

    private void displayCatalogueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayCatalogueActionPerformed
        // the Button Catalogue in Home Page
       
    Catalogue catalogue1 = new Catalogue();
    JPanel panel = catalogue1.getJPanel2(); // <-- get the JPanel from the NewBook class
    if(currentPanel != null){
        currentPanel.setVisible(false);
    }
    currentPanel = panel;
    jPanel2.add(panel);
    panel.setBounds(jPanel2.getBounds());
    jPanel2.revalidate();
    jPanel2.repaint();
       
    }//GEN-LAST:event_displayCatalogueActionPerformed

    private void viewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStudentActionPerformed
        // the view studentinfo Button in Home page
         // Create an instance of the StudentInfo class
        StudentInfo studentInfo = new StudentInfo();
        JPanel panel = studentInfo.getJPanel2(); // <-- get the JPanel from the NewBook class
        if(currentPanel != null){
        currentPanel.setVisible(false);
        }
        currentPanel = panel;
        jPanel2.add(panel);
        panel.setBounds(jPanel2.getBounds());
        jPanel2.revalidate();
        jPanel2.repaint();
     
    }//GEN-LAST:event_viewStudentActionPerformed

    private void issueBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBookActionPerformed
        // to issue a book
        IssueBook issueBook1 = new IssueBook();
        JPanel panel = issueBook1.getJPanel2(); // <-- get the JPanel from the NewBook class
        if(currentPanel != null){
            currentPanel.setVisible(false);
        }
        currentPanel = panel;
        jPanel2.add(panel);
        panel.setBounds(jPanel2.getBounds());
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_issueBookActionPerformed

    private void displayStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayStatisticsActionPerformed
        // Statistics button :
        
        Statistics  statistics1 = new Statistics();
        JPanel panel = statistics1.getJPanel2(); // <-- get the JPanel from the NewBook class
        if(currentPanel != null){
            currentPanel.setVisible(false);
        }
        currentPanel = panel;
        jPanel2.add(panel);
        panel.setBounds(jPanel2.getBounds());
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_displayStatisticsActionPerformed

    private void returnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBookActionPerformed
        // Return Book:
        ReturnBook returnBook1 = new ReturnBook();
        JPanel panel = returnBook1.getJPanel2(); // <-- get the JPanel from the NewBook class
        if(currentPanel != null){
            currentPanel.setVisible(false);
        }
        currentPanel = panel;
        jPanel2.add(panel);
        panel.setBounds(jPanel2.getBounds());
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_returnBookActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    private JPanel currentPanel = null;
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton displayCatalogue;
    private javax.swing.JButton displayStatistics;
    private javax.swing.JButton issueBook;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout;
    private javax.swing.JButton newBook;
    private javax.swing.JButton newStudent;
    private javax.swing.JButton returnBook;
    private javax.swing.JButton viewStudent;
    // End of variables declaration//GEN-END:variables
public JPanel getJPanel2() {
    return jPanel2;
}
}