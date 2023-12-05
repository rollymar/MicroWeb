import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

class LoginFrame {

    public static void main(String[] args) {
        LoginGui();
    }

    static void LoginGui() {
        JFrame loginFrame = new JFrame("MicroWeb Alpha 0.0.1");
        JPanel loginPanel,logoPanel, logoDesignPanel;
        JTextField userText, passText;
        JLabel loginLabel, userLabel, passLabel, microWebLabel, mLogoLabel, poweredByLabel;
        JButton loginBtn, registerBtn;

        Font labelFont = new Font("Calibri", Font.BOLD, 18);
        Font logInLabel = new Font("Arial", Font.BOLD, 40);
        Font textFont = new Font("Proxima Nova", Font.PLAIN, 17);

        Color panelColor = new Color(19,24,32);
        Color labelColor = new Color(255,55,45);
        

        //Panels------------------------------------------
        loginPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                try {
                    Image backgroundImage = ImageIO.read(new File("Login copy.jpg")); // Set the correct path
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };


        loginPanel.setBounds(0, 0, 800, 600);
        loginPanel.setLayout(null);
        loginFrame.add(loginPanel);


        //Buttons-----------------------------------------
        loginBtn = new JButton("Enter");
        loginBtn.setBounds(385,360,150,60);
        loginBtn.setFocusPainted(false);
        loginBtn.setFont(labelFont);
        loginBtn.setBackground(panelColor);
        loginBtn.setForeground(Color.white);
        loginBtn.setBorder(BorderFactory.createLineBorder(labelColor));
        loginPanel.add(loginBtn);


        registerBtn = new JButton("Sign up");
        registerBtn.setBounds(565,360,150,60);
        registerBtn.setFocusPainted(false);
        registerBtn.setFont(labelFont);
        registerBtn.setBackground(panelColor);
        registerBtn.setForeground(Color.white);
        registerBtn.setBorder(BorderFactory.createLineBorder(labelColor));
        loginPanel.add(registerBtn);



        //Labels-----------------------------------------
        loginLabel = new JLabel("Log in");
        loginLabel.setBounds(490,95,150,45);
        loginLabel.setFont(logInLabel);
        loginLabel.setForeground(labelColor);
        loginPanel.add(loginLabel);

        userLabel = new JLabel("User");
        userLabel.setBounds(370,200,355,30);
        userLabel.setFont(labelFont);
        userLabel.setForeground(Color.white);
        loginPanel.add(userLabel);

        passLabel = new JLabel("Pass");
        passLabel.setBounds(370,280,355,30);
        passLabel.setFont(labelFont);
        passLabel.setForeground(Color.white);
        loginPanel.add(passLabel);

        microWebLabel = new JLabel("MicroBox");
        microWebLabel.setBounds(55,280,250,50);
        microWebLabel.setFont(new Font("Sans serif", Font.PLAIN,45));
        microWebLabel.setForeground(panelColor);
        loginPanel.add(microWebLabel);

        mLogoLabel = new JLabel("M");
        mLogoLabel.setBounds(100,80,300,300);
        mLogoLabel.setFont(new Font("Proxima Nova", Font.BOLD,110));
        mLogoLabel.setForeground(labelColor);
        loginPanel.add(mLogoLabel);

        poweredByLabel = new JLabel("MicroWeb Corp. All rights reserved.");
        poweredByLabel.setBounds(350,520,300,30);
        poweredByLabel.setFont(new Font("Proxima Nova", Font.PLAIN,12));
        poweredByLabel.setForeground(labelColor);
        loginPanel.add(poweredByLabel);

        //TextFields--------------------------------------
        userText = new JTextField();
        userText.setBounds(370,225,355,30);
        userText.setFont(textFont);
        userText.setBorder(BorderFactory.createMatteBorder(0,0,2,0, labelColor));
        userText.setBackground(panelColor);
        userText.setForeground(Color.white);
        loginPanel.add(userText);


        passText = new JPasswordField(12);
        passText.setBounds(370,305,355,30);
        passText.setFont(textFont);
        passText.setBorder(BorderFactory.createMatteBorder(0,0,2,0, labelColor));
        passText.setBackground(panelColor);
        passText.setForeground(Color.white);
        loginPanel.add(passText);


        //Frame-------------------------------------------
        loginFrame.setSize(800, 600);
        loginFrame.setLayout(null);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setResizable(false);
        loginFrame.getContentPane().setBackground(Color.white);
        loginFrame.setVisible(true);
    }
}
