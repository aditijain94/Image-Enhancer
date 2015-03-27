package app;

import com.jgoodies.looks.plastic.Plastic3DLookAndFeel;
import java.awt.Frame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ClientGUI extends javax.swing.JFrame {

    private static ClientGUI instance;
    Icon imageIcon = null;

    static Frame getInstance() {
        return instance;
    }

    public ClientGUI() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openMenu = new javax.swing.JMenuItem();
        saveMenu = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        resetMenu = new javax.swing.JMenuItem();
        negativeMenu = new javax.swing.JMenuItem();
        greyScaleMenu = new javax.swing.JMenuItem();
        levelSlicingMenu = new javax.swing.JMenuItem();
        contrastMenu = new javax.swing.JMenuItem();
        thresholdMenu = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        lowpassMenu = new javax.swing.JMenuItem();
        highPassMenu = new javax.swing.JMenuItem();
        highBoostMenu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        drawHgMenu = new javax.swing.JMenuItem();
        equalizeHgMenu = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        lafMenu = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenuItem();
        aboutMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Image Enhancer v1.0");
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new java.awt.CardLayout());

        jLabel2.setMaximumSize(new java.awt.Dimension(600, 400));
        jScrollPane1.setViewportView(jLabel2);

        jPanel1.add(jScrollPane1, "card2");

        getContentPane().add(jPanel1, "card2");

        jMenu1.setText("   File   ");

        openMenu.setText("Open");
        openMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuActionPerformed(evt);
            }
        });
        jMenu1.add(openMenu);

        saveMenu.setText("Save");
        saveMenu.setEnabled(false);
        jMenu1.add(saveMenu);

        exitMenu.setText("Exit");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("   Image   ");

        resetMenu.setText("Reset");
        resetMenu.setEnabled(false);
        jMenu2.add(resetMenu);

        negativeMenu.setText("Negative");
        negativeMenu.setEnabled(false);
        jMenu2.add(negativeMenu);

        greyScaleMenu.setText("Grey Scale");
        greyScaleMenu.setEnabled(false);
        jMenu2.add(greyScaleMenu);

        levelSlicingMenu.setText("Level Slicing");
        levelSlicingMenu.setEnabled(false);
        jMenu2.add(levelSlicingMenu);

        contrastMenu.setText("Contrast");
        contrastMenu.setEnabled(false);
        jMenu2.add(contrastMenu);

        thresholdMenu.setText("Threshold");
        thresholdMenu.setEnabled(false);
        jMenu2.add(thresholdMenu);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("   Filters   ");

        lowpassMenu.setText("Low Pass");
        lowpassMenu.setEnabled(false);
        jMenu3.add(lowpassMenu);

        highPassMenu.setText("High Pass");
        highPassMenu.setEnabled(false);
        jMenu3.add(highPassMenu);

        highBoostMenu.setText("High Boost");
        highBoostMenu.setEnabled(false);
        jMenu3.add(highBoostMenu);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("   Histogram   ");

        drawHgMenu.setText("Draw Histogram");
        drawHgMenu.setEnabled(false);
        jMenu4.add(drawHgMenu);

        equalizeHgMenu.setText("Equalize Histogram");
        equalizeHgMenu.setEnabled(false);
        jMenu4.add(equalizeHgMenu);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("   Help   ");

        lafMenu.setText("Look And Feel");
        jMenu5.add(lafMenu);

        helpMenu.setText("Help Contents");
        jMenu5.add(helpMenu);

        aboutMenu.setText("About");
        jMenu5.add(aboutMenu);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(602, 370));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuActionPerformed

    private void openMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuActionPerformed
        imageIcon = ImageHandler.getIcon_from_file_selected_by_JFC();
        if (imageIcon != null) {
            jLabel2.setIcon(imageIcon);
            enableAllControls();
        }

    }//GEN-LAST:event_openMenuActionPerformed

    public static void main(String args[]) {

        try {

            UIManager.setLookAndFeel(new Plastic3DLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ClientGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                instance = new ClientGUI();
                instance.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenu;
    private javax.swing.JMenuItem contrastMenu;
    private javax.swing.JMenuItem drawHgMenu;
    private javax.swing.JMenuItem equalizeHgMenu;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JMenuItem greyScaleMenu;
    private javax.swing.JMenuItem helpMenu;
    private javax.swing.JMenuItem highBoostMenu;
    private javax.swing.JMenuItem highPassMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem lafMenu;
    private javax.swing.JMenuItem levelSlicingMenu;
    private javax.swing.JMenuItem lowpassMenu;
    private javax.swing.JMenuItem negativeMenu;
    private javax.swing.JMenuItem openMenu;
    private javax.swing.JMenuItem resetMenu;
    private javax.swing.JMenuItem saveMenu;
    private javax.swing.JMenuItem thresholdMenu;
    // End of variables declaration//GEN-END:variables

    private void enableAllControls() {
        contrastMenu.setEnabled(true);
        drawHgMenu.setEnabled(true);
        thresholdMenu.setEnabled(true);
        saveMenu.setEnabled(true);
        resetMenu.setEnabled(true);
        negativeMenu.setEnabled(true);
        lowpassMenu.setEnabled(true);
        levelSlicingMenu.setEnabled(true);
        highPassMenu.setEnabled(true);
        highBoostMenu.setEnabled(true);
        equalizeHgMenu.setEnabled(true);
        greyScaleMenu.setEnabled(true);
    }
}
