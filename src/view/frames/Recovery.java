package view.frames;

import static Controller.LinkManager.*;
import Controller.RecoveryController;
import static DAO.uqueries.*;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import model.RecoveryModel;
import static model.RecoveryModel.*;
import view.custom.scrollbar.ScrollBarCustom;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Recovery extends javax.swing.JFrame {

    public Recovery() {
        initComponents();

        q1.setEditable(false);
        q2.setEditable(false);
        q3.setEditable(false);
        txt_pwd.setEditable(false);
        txt_cpwd.setEditable(false);
        txt_pwd.togglepwdview();
        txt_cpwd.togglepwdview();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Assets/icon.png")));
        btn_q.setEnabled(false);
        btn_reset.setEnabled(false);

        scroll.setVerticalScrollBar(new ScrollBarCustom());
        addPlaceholderStyle(txt_uname);
        addPlaceholderStyle(txt_pwd);
        addPlaceholderStyle(txt_cpwd);
        addPlaceholderStyle(q1);
        addPlaceholderStyle(q2);
        addPlaceholderStyle(q3);
    }

    public void addPlaceholderStyle(JTextField textField) {

    }

    public void removePlaceholderStyle(JTextField textField) {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        roundPanel1 = new test.RoundPanel();
        Welcome_to = new javax.swing.JLabel();
        coin_logo = new javax.swing.JLabel();
        Recover_your_Account = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        inner_pane = new test.RoundPanel();
        Login_to_aacc = new javax.swing.JLabel();
        txt_uname = new textfield.TextField();
        q3 = new textfield.TextField();
        lbl_err3 = new javax.swing.JLabel();
        btn_q = new button.Button();
        btn_signup = new button.Button();
        jSeparator1 = new javax.swing.JSeparator();
        btn_reset = new button.Button();
        jSeparator2 = new javax.swing.JSeparator();
        q2 = new textfield.TextField();
        lbl_err1 = new javax.swing.JLabel();
        btn_uname = new button.Button();
        jSeparator3 = new javax.swing.JSeparator();
        q1 = new textfield.TextField();
        lbl_err2 = new javax.swing.JLabel();
        Login_to_aacc1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        button1 = new button.Button();
        txt_pwd = new passwordfield.PasswordField();
        button2 = new button.Button();
        txt_cpwd = new passwordfield.PasswordField();
        button3 = new button.Button();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new java.awt.Color(62, 62, 62));
        roundPanel1.setRoundBottomLeft(40);
        roundPanel1.setRoundBottomRight(40);
        roundPanel1.setRoundTopLeft(40);
        roundPanel1.setRoundTopRight(40);
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Welcome_to.setBackground(new java.awt.Color(62, 62, 62));
        Welcome_to.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        Welcome_to.setForeground(new java.awt.Color(255, 255, 255));
        Welcome_to.setText("Welcome to");
        roundPanel1.add(Welcome_to, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 160, 60));

        coin_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/login_logo.png"))); // NOI18N
        roundPanel1.add(coin_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 140, 70));

        Recover_your_Account.setBackground(new java.awt.Color(62, 62, 62));
        Recover_your_Account.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        Recover_your_Account.setForeground(new java.awt.Color(255, 255, 255));
        Recover_your_Account.setText("Recover your Account");
        roundPanel1.add(Recover_your_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        scroll.setBorder(null);

        inner_pane.setBackground(new java.awt.Color(62, 62, 62));
        inner_pane.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        inner_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login_to_aacc.setBackground(new java.awt.Color(62, 62, 62));
        Login_to_aacc.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        Login_to_aacc.setForeground(new java.awt.Color(255, 255, 255));
        Login_to_aacc.setText("Enter your New Passoword");
        inner_pane.add(Login_to_aacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, -1, -1));

        txt_uname.setBackground(new java.awt.Color(70, 70, 70));
        txt_uname.setForeground(new java.awt.Color(183, 183, 183));
        txt_uname.setText("    Username");
        txt_uname.setRound(30);
        txt_uname.setShadowColor(new java.awt.Color(175, 152, 20));
        txt_uname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_unameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_unameFocusLost(evt);
            }
        });
        txt_uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_unameActionPerformed(evt);
            }
        });
        txt_uname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_unameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_unameKeyReleased(evt);
            }
        });
        inner_pane.add(txt_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 270, -1));

        q3.setBackground(new java.awt.Color(70, 70, 70));
        q3.setForeground(new java.awt.Color(183, 183, 183));
        q3.setText("    What is your favourite place?");
        q3.setRound(30);
        q3.setShadowColor(new java.awt.Color(175, 152, 20));
        q3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                q3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                q3FocusLost(evt);
            }
        });
        q3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q3ActionPerformed(evt);
            }
        });
        q3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                q3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                q3KeyReleased(evt);
            }
        });
        inner_pane.add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 270, -1));

        lbl_err3.setBackground(new java.awt.Color(66, 66, 66));
        lbl_err3.setForeground(new java.awt.Color(254, 112, 113));
        inner_pane.add(lbl_err3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 710, 300, 20));

        btn_q.setBackground(new java.awt.Color(255, 226, 57));
        btn_q.setText("Verify");
        btn_q.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        btn_q.setRound(50);
        btn_q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_qActionPerformed(evt);
            }
        });
        inner_pane.add(btn_q, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 150, 50));

        btn_signup.setBackground(new java.awt.Color(62, 62, 62));
        btn_signup.setForeground(new java.awt.Color(252, 252, 252));
        btn_signup.setText("Don't have an account? Sign up");
        btn_signup.setShadowColor(new java.awt.Color(62, 62, 62));
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        inner_pane.add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 230, 20));
        inner_pane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 180, 10));

        btn_reset.setBackground(new java.awt.Color(255, 226, 57));
        btn_reset.setText("Reset");
        btn_reset.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        btn_reset.setRound(50);
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        inner_pane.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 730, 150, 50));
        inner_pane.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 340, 10));

        q2.setBackground(new java.awt.Color(70, 70, 70));
        q2.setForeground(new java.awt.Color(183, 183, 183));
        q2.setText("    What is your hobby?");
        q2.setRound(30);
        q2.setShadowColor(new java.awt.Color(175, 152, 20));
        q2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                q2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                q2FocusLost(evt);
            }
        });
        q2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q2ActionPerformed(evt);
            }
        });
        q2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                q2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                q2KeyReleased(evt);
            }
        });
        inner_pane.add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 270, -1));

        lbl_err1.setBackground(new java.awt.Color(66, 66, 66));
        lbl_err1.setForeground(new java.awt.Color(254, 112, 113));
        inner_pane.add(lbl_err1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 270, 20));

        btn_uname.setBackground(new java.awt.Color(255, 226, 57));
        btn_uname.setText("Verify");
        btn_uname.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        btn_uname.setRound(50);
        btn_uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_unameActionPerformed(evt);
            }
        });
        inner_pane.add(btn_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 150, 50));
        inner_pane.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 340, 10));

        q1.setBackground(new java.awt.Color(70, 70, 70));
        q1.setForeground(new java.awt.Color(183, 183, 183));
        q1.setText("    What is your favourite food?");
        q1.setRound(30);
        q1.setShadowColor(new java.awt.Color(175, 152, 20));
        q1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                q1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                q1FocusLost(evt);
            }
        });
        q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q1ActionPerformed(evt);
            }
        });
        q1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                q1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                q1KeyReleased(evt);
            }
        });
        inner_pane.add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 270, -1));

        lbl_err2.setBackground(new java.awt.Color(66, 66, 66));
        lbl_err2.setForeground(new java.awt.Color(254, 112, 113));
        inner_pane.add(lbl_err2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 310, 20));

        Login_to_aacc1.setBackground(new java.awt.Color(62, 62, 62));
        Login_to_aacc1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        Login_to_aacc1.setForeground(new java.awt.Color(255, 255, 255));
        Login_to_aacc1.setText("Please answer the Security Queestions");
        inner_pane.add(Login_to_aacc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));
        inner_pane.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 200, 10));

        button1.setBackground(new java.awt.Color(62, 62, 62));
        button1.setForeground(new java.awt.Color(252, 252, 252));
        button1.setText("Remember Password? Login");
        button1.setShadowColor(new java.awt.Color(62, 62, 62));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        inner_pane.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 200, 20));

        txt_pwd.setBackground(new java.awt.Color(70, 70, 70));
        txt_pwd.setForeground(new java.awt.Color(183, 183, 183));
        txt_pwd.setText("    New Password");
        txt_pwd.setRound(30);
        txt_pwd.setShadowColor(new java.awt.Color(175, 152, 20));
        txt_pwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_pwdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_pwdFocusLost(evt);
            }
        });
        txt_pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pwdActionPerformed(evt);
            }
        });
        txt_pwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_pwdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pwdKeyReleased(evt);
            }
        });
        inner_pane.add(txt_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 270, 50));

        button2.setBackground(new java.awt.Color(255, 226, 57));
        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/eye.png"))); // NOI18N
        button2.setRound(60);
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        inner_pane.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 660, 50, 50));

        txt_cpwd.setBackground(new java.awt.Color(70, 70, 70));
        txt_cpwd.setForeground(new java.awt.Color(183, 183, 183));
        txt_cpwd.setText("    Confirm New Password");
        txt_cpwd.setRound(30);
        txt_cpwd.setShadowColor(new java.awt.Color(175, 152, 20));
        txt_cpwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_cpwdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_cpwdFocusLost(evt);
            }
        });
        txt_cpwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cpwdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cpwdKeyReleased(evt);
            }
        });
        inner_pane.add(txt_cpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 660, 270, 50));

        button3.setBackground(new java.awt.Color(255, 226, 57));
        button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/eye.png"))); // NOI18N
        button3.setRound(60);
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        inner_pane.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 610, 50, 50));

        scroll.setViewportView(inner_pane);

        roundPanel1.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 400, 260));

        main_panel.add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 405, 430));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/background.png"))); // NOI18N
        main_panel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 740));

        getContentPane().add(main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 740));

        setSize(new java.awt.Dimension(1250, 765));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        SignupFrame();
        this.dispose();
    }//GEN-LAST:event_btn_signupActionPerformed

    private void btn_qActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_qActionPerformed
        switch (enablereset(txt_uname.getText(), q1.getText(), q2.getText(), q3.getText())) {
            case 0:
                displaymessage("One or more fields empty");
                break;
            case -1:
                displaymessage("One or more invalid credentials");
                break;
            case 1:
                displaymessage("Reset your password below");
                txt_pwd.setEditable(true);
                txt_cpwd.setEditable(true);
                btn_reset.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_btn_qActionPerformed

    private void txt_unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_unameActionPerformed

    private void q3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q3ActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        RecoveryController rcontrol = new RecoveryController(getuser(), this);
        rcontrol.resetuser();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void q2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q2ActionPerformed

    private void btn_unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_unameActionPerformed
        switch (enableq(txt_uname.getText())) {
            case 0:
                displaymessage("Please enter your username");
                break;
            case -1:
                displaymessage("Username doesn't exist");
                break;
            case 1:
                q1.setEditable(true);
                q2.setEditable(true);
                q3.setEditable(true);
                btn_q.setEnabled(true);
                displaymessage("Please answer the questions below");
                break;
        }
    }//GEN-LAST:event_btn_unameActionPerformed

    private void q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        LoginFrame();
        this.dispose();
    }//GEN-LAST:event_button1ActionPerformed

    private void txt_unameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_unameKeyPressed
        if (usernamevalidation(txt_uname.getText())) {
            if (!checkUsernameExists(txt_uname.getText())) {
                lbl_err1.setText("Username doesn't Exist");
            } else {
                lbl_err1.setText("");
            }
        }
    }//GEN-LAST:event_txt_unameKeyPressed

    private void txt_unameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_unameKeyReleased
        if (!checkUsernameExists(txt_uname.getText())) {
            lbl_err1.setText("Username doesn't Exist");
        } else {
            lbl_err1.setText("");
        }
    }//GEN-LAST:event_txt_unameKeyReleased

    private void q1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_q1KeyPressed
        if (!q1validation(q1.getText()))
            lbl_err2.setText("Please enter your favourite food");
        else
            lbl_err2.setText("");
    }//GEN-LAST:event_q1KeyPressed

    private void q1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_q1KeyReleased
        if (!q1validation(q1.getText()))
            lbl_err2.setText("Please enter your favourite food");
        else
            lbl_err2.setText("");
    }//GEN-LAST:event_q1KeyReleased

    private void q2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_q2KeyPressed
        if (!q2validation(q2.getText()))
            lbl_err2.setText("Please enter your hobby");
        else
            lbl_err2.setText("");
    }//GEN-LAST:event_q2KeyPressed

    private void q2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_q2KeyReleased
        if (!q2validation(q2.getText()))
            lbl_err2.setText("Please enter your hobby");
        else
            lbl_err2.setText("");
    }//GEN-LAST:event_q2KeyReleased

    private void q3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_q3KeyPressed
        if (!q3validation(q3.getText()))
            lbl_err2.setText("Please enter your favourite place");
        else
            lbl_err2.setText("");
    }//GEN-LAST:event_q3KeyPressed

    private void q3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_q3KeyReleased
        if (!q3validation(q3.getText()))
            lbl_err2.setText("Please enter your favourite place");
        else
            lbl_err2.setText("");
    }//GEN-LAST:event_q3KeyReleased

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void txt_unameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_unameFocusGained
        if (txt_uname.getText().equals("    Username")) {
            txt_uname.setText(null);
            txt_uname.requestFocus();
            removePlaceholderStyle(txt_uname);
        }
    }//GEN-LAST:event_txt_unameFocusGained

    private void txt_unameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_unameFocusLost
        if (txt_uname.getText().length() == 0) {
            addPlaceholderStyle(txt_uname);
            txt_uname.setText("    Username");
        }
    }//GEN-LAST:event_txt_unameFocusLost

    private void q1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_q1FocusGained
        if (q1.getText().equals("    What is your favourite food?")) {
            q1.setText(null);
            q1.requestFocus();
            removePlaceholderStyle(q1);
        }
    }//GEN-LAST:event_q1FocusGained

    private void q1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_q1FocusLost
        if (q1.getText().length() == 0) {
            addPlaceholderStyle(q1);
            q1.setText("    What is your favourite food?");
        }
    }//GEN-LAST:event_q1FocusLost

    private void q2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_q2FocusGained
        if (q2.getText().equals("    What is your hobby?")) {
            q2.setText(null);
            q2.requestFocus();
            removePlaceholderStyle(q2);
        }
    }//GEN-LAST:event_q2FocusGained

    private void q2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_q2FocusLost
        if (q2.getText().length() == 0) {
            addPlaceholderStyle(q2);
            q2.setText("    What is your hobby?");
        }
    }//GEN-LAST:event_q2FocusLost

    private void q3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_q3FocusGained
        if (q3.getText().equals("    What is your favourite place?")) {
            q3.setText(null);
            q3.requestFocus();
            removePlaceholderStyle(q3);
        }
    }//GEN-LAST:event_q3FocusGained

    private void q3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_q3FocusLost
        if (q3.getText().length() == 0) {
            addPlaceholderStyle(q3);
            q3.setText("    What is your favourite place?");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_q3FocusLost

    private void txt_pwdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pwdKeyPressed
        if (!pwdvalidation(txt_pwd.getText())) {
            lbl_err3.setText("Please enter your new password");
        } else {
            lbl_err3.setText("");
        }
        if (txt_pwd.getText().length() < 8) {
            lbl_err3.setText("Password must be 8 characters long");
        } else {
            lbl_err3.setText("");
        }
    }//GEN-LAST:event_txt_pwdKeyPressed

    private void txt_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pwdActionPerformed

    private void txt_pwdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pwdKeyReleased
        if (!pwdvalidation(txt_pwd.getText())) {
            lbl_err3.setText("Please enter your new password");
        } else {
            lbl_err3.setText("");
        }
        if (txt_pwd.getText().length() < 8) {
            lbl_err3.setText("Password must be 8 characters long");
        } else {
            lbl_err3.setText("");
        }
    }//GEN-LAST:event_txt_pwdKeyReleased

    private void txt_cpwdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cpwdKeyPressed
        if (!cpwdvalidation(txt_cpwd.getText())) {
            lbl_err3.setText("Please confirm your new password");
        } else {
            lbl_err3.setText("");
        }
        if (txt_cpwd.getText().length() < 8) {
            lbl_err3.setText("Password must be 8 characters long");
        } else {
            lbl_err3.setText("");
        }
    }//GEN-LAST:event_txt_cpwdKeyPressed

    private void txt_cpwdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cpwdKeyReleased
        if (!cpwdvalidation(txt_cpwd.getText())) {
            lbl_err3.setText("Please confirm your new password");
        } else {
            lbl_err3.setText("");
        }
        if (txt_cpwd.getText().length() < 8) {
            lbl_err3.setText("Password must be 8 characters long");
        } else {
            lbl_err3.setText("");
        }
    }//GEN-LAST:event_txt_cpwdKeyReleased

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        txt_pwd.togglepwdview();
    }//GEN-LAST:event_button3ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        txt_cpwd.togglepwdview();
    }//GEN-LAST:event_button2ActionPerformed

    private void txt_pwdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_pwdFocusGained
        if (txt_pwd.getText().equals("    New Password")) {
            txt_pwd.setText(null);
            txt_pwd.requestFocus();
            removePlaceholderStyle(txt_pwd);
        }
    }//GEN-LAST:event_txt_pwdFocusGained

    private void txt_pwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_pwdFocusLost
        if (txt_pwd.getText().length() == 0) {
            addPlaceholderStyle(txt_pwd);
            txt_pwd.setText("    New Password");
        }
    }//GEN-LAST:event_txt_pwdFocusLost

    private void txt_cpwdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cpwdFocusGained
        if (txt_cpwd.getText().equals("    Confirm New Password")) {
            txt_cpwd.setText(null);
            txt_cpwd.requestFocus();
            removePlaceholderStyle(txt_cpwd);
        }
    }//GEN-LAST:event_txt_cpwdFocusGained

    private void txt_cpwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cpwdFocusLost
        if (txt_cpwd.getText().length() == 0) {
            addPlaceholderStyle(txt_cpwd);
            txt_cpwd.setText("    Confirm New Password");
        }
    }//GEN-LAST:event_txt_cpwdFocusLost

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Recovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    public RecoveryModel getuser() {
        RecoveryModel rmodel = new RecoveryModel(txt_uname.getText(), txt_cpwd.getText(), txt_pwd.getText());
        return rmodel;
    }

    public void displaymessage(String msg) {
         ImageIcon icon=new ImageIcon(getClass().getResource("/Assets/error.png"));
        JOptionPane.showMessageDialog(this, msg, "Operation Status", JOptionPane.INFORMATION_MESSAGE, icon);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login_to_aacc;
    private javax.swing.JLabel Login_to_aacc1;
    private javax.swing.JLabel Recover_your_Account;
    private javax.swing.JLabel Welcome_to;
    private javax.swing.JLabel background;
    private button.Button btn_q;
    private button.Button btn_reset;
    private button.Button btn_signup;
    private button.Button btn_uname;
    private button.Button button1;
    private button.Button button2;
    private button.Button button3;
    private javax.swing.JLabel coin_logo;
    private test.RoundPanel inner_pane;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbl_err1;
    private javax.swing.JLabel lbl_err2;
    private javax.swing.JLabel lbl_err3;
    private javax.swing.JPanel main_panel;
    private textfield.TextField q1;
    private textfield.TextField q2;
    private textfield.TextField q3;
    private test.RoundPanel roundPanel1;
    private javax.swing.JScrollPane scroll;
    private passwordfield.PasswordField txt_cpwd;
    private passwordfield.PasswordField txt_pwd;
    private textfield.TextField txt_uname;
    // End of variables declaration//GEN-END:variables
}
