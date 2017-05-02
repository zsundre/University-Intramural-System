import java.awt.*;
import javax.swing.*;

/**
 * Created by ZacSundre on 5/1/17.
 */
public class ChangePassword extends JPanel {
        //private JButton jcomp4;
        private JPanel contentPane;

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton submitBtn;
        private javax.swing.JButton cancelBtn;
        private javax.swing.JLabel oldPasswordLbl;
        private javax.swing.JLabel newPasswordLbl;
        private javax.swing.JLabel confirmPasswordLbl;
        private javax.swing.JPasswordField oldPasswordText;
        private javax.swing.JPasswordField newPasswordText;
        private javax.swing.JPasswordField confirmPasswordText;
        // End of variables declaration//GEN-END:variables

        public ChangePassword(JPanel panel)
        {
            initComponents();
            //construct components
//            jcomp4 = new JButton ("openNewWindow");
//            jcomp4.addActionListener( new ActionListener()
//            {
//                public void actionPerformed(ActionEvent e)
//                {
//                    CardLayout cardLayout = (CardLayout) contentPane.getLayout();
//                    cardLayout.next(contentPane);
//                }
//            });
//            add(jcomp4);
        }

    private void initComponents() {
        //contentPane = panel;
        setOpaque(true);
        setBackground(Color.GREEN.darker().darker());

        oldPasswordLbl = new javax.swing.JLabel();
        newPasswordLbl = new javax.swing.JLabel();
        oldPasswordText = new javax.swing.JPasswordField();
        newPasswordText = new javax.swing.JPasswordField();
        confirmPasswordLbl = new javax.swing.JLabel();
        confirmPasswordText = new javax.swing.JPasswordField();
        submitBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        oldPasswordLbl.setText("Old Password:");

        newPasswordLbl.setText("New Password:");

        oldPasswordText.setText("oldPasswordText");

        newPasswordText.setText("newPasswordText");

        confirmPasswordLbl.setText("Confirm Password:");

        confirmPasswordText.setText("confirmPasswordText");

        submitBtn.setText("Submit");

        cancelBtn.setText("Cancel");

        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String oldPassword = oldPasswordText.getText();
                String newPassword = newPasswordText.getText();
                String confirmPassword = confirmPasswordText.getText();
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(oldPasswordLbl)
                                        .addComponent(newPasswordLbl)
                                        .addComponent(confirmPasswordLbl))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(confirmPasswordText, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                        .addComponent(newPasswordText)
                                        .addComponent(oldPasswordText))
                                .addContainerGap(183, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelBtn)
                                .addGap(18, 18, 18)
                                .addComponent(submitBtn)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(oldPasswordLbl)
                                        .addComponent(oldPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(newPasswordLbl)
                                        .addComponent(newPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(confirmPasswordLbl)
                                        .addComponent(confirmPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(submitBtn)
                                        .addComponent(cancelBtn))
                                .addContainerGap())
        );
    }



        @Override
        public Dimension getPreferredSize()
        {
            return (new Dimension(500, 500));
        }
    }