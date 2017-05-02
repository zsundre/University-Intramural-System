import java.awt.*;
import javax.swing.*;

class EditStudentAccount extends JPanel
{
    private JPanel contentPane;
    private JPanel nextPanel;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton submitBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton changePasswordBtn;
    private javax.swing.JLabel fNameLbl;
    private javax.swing.JLabel mIntLbl;
    private javax.swing.JLabel lNameLbl;
    private javax.swing.JLabel studentIdLbl;
    private javax.swing.JLabel genderLbl;
    private javax.swing.JLabel phNumberLbl;
    private javax.swing.JLabel userNameLbl;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField fNameText;
    private javax.swing.JTextField mIntText;
    private javax.swing.JTextField lNameText;
    private javax.swing.JTextField studentIdText;
    private javax.swing.JTextField genderIdText;
    private javax.swing.JTextField phNumberText;
    private javax.swing.JTextField userNameText;
    private javax.swing.JTextField emailText;
    // End of variables declaration//GEN-END:variables

    public EditStudentAccount(JPanel panel) {
        initComponents();
        contentPane = panel;
        CreateAccount createAccount = new CreateAccount(nextPanel);
        setOpaque(true);

        //construct components
//        jcomp4.addActionListener( new ActionListener()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
//                cardLayout.next(contentPane);
//            }
//        });

    }


    private void initComponents() {

        submitBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        userNameLbl = new javax.swing.JLabel();
        userNameText = new javax.swing.JTextField();
        phNumberText = new javax.swing.JTextField();
        phNumberLbl = new javax.swing.JLabel();
        studentIdLbl = new javax.swing.JLabel();
        fNameLbl = new javax.swing.JLabel();
        fNameText = new javax.swing.JTextField();
        studentIdText = new javax.swing.JTextField();
        genderLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        genderIdText = new javax.swing.JTextField();
        mIntText = new javax.swing.JTextField();
        lNameText = new javax.swing.JTextField();
        lNameLbl = new javax.swing.JLabel();
        mIntLbl = new javax.swing.JLabel();
        changePasswordBtn = new javax.swing.JButton();

        submitBtn.setText("Submit");

        cancelBtn.setText("Cancel");

        userNameLbl.setText("User Name:");

        phNumberLbl.setText("Ph. Number:");

        studentIdLbl.setText("Student ID:");

        fNameLbl.setText("First Name:");

        genderLbl.setText("Gender:");

        emailLbl.setText("Email");

        genderIdText.setText("M/F");

        lNameLbl.setText("Last Name:");

        mIntLbl.setText("Middle Int:");

        changePasswordBtn.setText("Change Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(changePasswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                                                        .addGap(75, 75, 75)
                                                                        .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                                                                                .addComponent(genderIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(lNameLbl)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(lNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(emailLbl)
                                                                .addGap(98, 98, 98)
                                                                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 46, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(fNameLbl)
                                        .addComponent(fNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mIntText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lNameLbl)
                                        .addComponent(lNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mIntLbl))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(studentIdLbl)
                                        .addComponent(studentIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(genderLbl)
                                        .addComponent(genderIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(submitBtn)
                                                        .addComponent(cancelBtn)))
                                        .addComponent(changePasswordBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                                .addContainerGap())
        );
    }

    @Override
    public Dimension getPreferredSize()
    {
        return (new Dimension(400, 100));
    }
}
