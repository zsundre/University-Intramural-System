import java.awt.*;
import javax.swing.*;

class Login extends JPanel 
{
    private JPanel contentPane;

    // Variables declaration - do not modify
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton createAccountBtn;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel createAccountLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea titleText;
    private javax.swing.JTextField userNameText;
    private javax.swing.JTextField passwordText;
    // End of variables declaration

    public Login(JPanel panel) {
        initComponents();
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
        setBackground(Color.GREEN.darker().darker());
        //contentPane = myPanel;
        setOpaque(true);

        loginBtn = new javax.swing.JButton();
        userNameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        titleText = new javax.swing.JTextArea();
        userNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        createAccountBtn = new javax.swing.JButton();
        createAccountLabel = new javax.swing.JLabel();

        loginBtn.setText("Login");

        userNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
//
//        passwordText.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jTextField4ActionPerformed(evt);
//            }
//        });

        titleText.setEditable(false);
        titleText.setColumns(20);
        titleText.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        titleText.setLineWrap(true);
        titleText.setRows(2);
        titleText.setText("        University Intramural System\n\n                      Please Login");
        titleText.setWrapStyleWord(true);
        jScrollPane2.setViewportView(titleText);

        userNameLabel.setText("Username:");

        passwordLabel.setText("Password:");

        createAccountBtn.setText("Click Here");
//        createAccountBtn.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton2ActionPerformed(evt);
//            }
//        });

        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String userName = userNameText.getText();
                String password = passwordText.getText();
            }
        });


        createAccountLabel.setText("To create a new account -");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(passwordLabel)
                                        .addComponent(userNameLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 45, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createAccountLabel)
                                .addGap(4, 4, 4)
                                .addComponent(createAccountBtn)
                                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(userNameLabel)
                                        .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(passwordLabel)
                                        .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(loginBtn)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(createAccountBtn)
                                        .addComponent(createAccountLabel))
                                .addContainerGap(28, Short.MAX_VALUE))
        );
    }

    @Override
    public Dimension getPreferredSize()
    {
        return (new Dimension(500, 500));
    }
}