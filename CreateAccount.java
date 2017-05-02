import java.awt.*;
import javax.swing.*;

class CreateAccount extends JPanel 
{
    private JPanel contentPane;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton submitBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel fNameLbl;
    private javax.swing.JLabel confirmPasswordLbl;
    private javax.swing.JLabel mIntLbl;
    private javax.swing.JLabel lNameLbl;
    private javax.swing.JLabel studentIdLbl;
    private javax.swing.JLabel genderLbl;
    private javax.swing.JLabel phNumberLbl;
    private javax.swing.JLabel userNameLbl;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JPasswordField confirmPasswordText;
    private javax.swing.JTextField fNameText;
    private javax.swing.JTextField mIntText;
    private javax.swing.JTextField lNameText;
    private javax.swing.JTextField studentIdText;
    private javax.swing.JTextField genderText;
    private javax.swing.JTextField phNumberText;
    private javax.swing.JTextField userNameText;
    private javax.swing.JTextField emailText;
    // End of variables declaration//GEN-END:variables

    public CreateAccount(JPanel panel) 
    {
        initComponents();

        //construct components
//        jcomp4 = new JButton ("openNewWindow");
//        jcomp4.addActionListener( new ActionListener()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
//                cardLayout.next(contentPane);
//            }
//        });
//        add(jcomp4);
    }


    private void initComponents() {

        //contentPane = panel;
        setOpaque(true);
        setBackground(Color.GREEN.darker().darker());

        fNameLbl = new javax.swing.JLabel();
        fNameText = new javax.swing.JTextField();
        mIntLbl = new javax.swing.JLabel();
        mIntText = new javax.swing.JTextField();
        lNameLbl = new javax.swing.JLabel();
        lNameText = new javax.swing.JTextField();
        studentIdLbl = new javax.swing.JLabel();
        studentIdText = new javax.swing.JTextField();
        genderLbl = new javax.swing.JLabel();
        genderText = new javax.swing.JTextField();
        phNumberLbl = new javax.swing.JLabel();
        phNumberText = new javax.swing.JTextField();
        userNameLbl = new javax.swing.JLabel();
        userNameText = new javax.swing.JTextField();
        passwordLbl = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        submitBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        emailLbl = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        confirmPasswordLbl = new javax.swing.JLabel();
        confirmPasswordText = new javax.swing.JPasswordField();

        fNameLbl.setText("First Name:");

        mIntLbl.setText("Middle Int:");

        mIntText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        lNameLbl.setText("Last Name:");

        studentIdLbl.setText("Student ID:");

        genderLbl.setText("Gender:");

        genderText.setText("M/F");
        genderText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        phNumberLbl.setText("Ph. Number:");

        userNameLbl.setText("User Name:");

        passwordLbl.setText("Password:");

        passwordText.setText("passwordText");
        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        submitBtn.setText("Submit");

        cancelBtn.setText("Cancel");

        emailLbl.setText("Email");

        confirmPasswordLbl.setText("Confirm Password:");

        confirmPasswordText.setText("confirmPasswordText");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(cancelBtn)
                                                .addGap(18, 18, 18)
                                                .addComponent(submitBtn))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(userNameLbl)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(phNumberLbl)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(phNumberText))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(fNameLbl)
                                                                        .addGap(26, 26, 26)
                                                                        .addComponent(fNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(studentIdLbl)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(studentIdText))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(passwordLbl)
                                                                        .addGap(18, 18, 18)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(passwordText)))))
                                                .addGap(36, 36, 36)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(mIntLbl)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(mIntText, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(genderLbl)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(genderText, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(lNameLbl)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(lNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(emailLbl)
                                                                        .addComponent(confirmPasswordLbl))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(24, 24, 24)
                                                                                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(confirmPasswordText)))))
                                                .addGap(0, 125, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(156, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(fNameLbl)
                                        .addComponent(fNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mIntLbl)
                                        .addComponent(mIntText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lNameLbl)
                                        .addComponent(lNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(studentIdLbl)
                                        .addComponent(studentIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(genderLbl)
                                        .addComponent(genderText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(phNumberLbl)
                                        .addComponent(phNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailLbl)
                                        .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(userNameLbl)
                                        .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(passwordLbl)
                                        .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(confirmPasswordLbl)
                                        .addComponent(confirmPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(submitBtn)
                                        .addComponent(cancelBtn))
                                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    @Override
    public Dimension getPreferredSize()
    {
        return (new Dimension(1000, 500));
    }
}