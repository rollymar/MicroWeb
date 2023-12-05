import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


class RegisterView {

	public static void main(String[] args) {
		registerGui();

	}

	static void registerGui(){
		JFrame registerFrame = new JFrame();
		JPanel rightPanel, mainRegisterPanel;
		JLabel registerLabel, nameLabel, usernameLabel, passwordLabel, mLogoLabel;
		JTextField nameText, userText, passText;
		JButton cancelBtn, registerBtn;


		Color labelColor = new Color(255,55,45);
		Color panelColor = new Color(19,24,32);
		
		Font labelFont = new Font("Calibri", Font.BOLD, 16);
		Font logInLabel = new Font("Arial", Font.PLAIN,28);


		//Panels___________________________________
		mainRegisterPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                try {
                    Image backgroundImage = ImageIO.read(new File("MainPanelDesign copy.jpg")); // Set the correct path
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

		mainRegisterPanel.setBounds(0,0,800,600);
		mainRegisterPanel.setLayout(null);
		registerFrame.add(mainRegisterPanel);


		//Labels__________________________________

		registerLabel = new JLabel("Create Account");
        registerLabel.setBounds(100,150,250,50);
        registerLabel.setFont(logInLabel);
        registerLabel.setForeground(Color.white);
        mainRegisterPanel.add(registerLabel);


        mLogoLabel = new JLabel("M");
        mLogoLabel.setBounds(150,50,100,100);
        mLogoLabel.setFont(new Font("Proxima Nova", Font.BOLD,110));
        mLogoLabel.setForeground(labelColor);
        mainRegisterPanel.add(mLogoLabel);


        nameLabel = new JLabel("Name");
        nameLabel.setBounds(100,230,190,20);
        nameLabel.setFont(labelFont);
        nameLabel.setForeground(Color.white);
        mainRegisterPanel.add(nameLabel);


        usernameLabel = new JLabel("User");
        usernameLabel.setBounds(100,300,190,20);
        usernameLabel.setFont(labelFont);
        usernameLabel.setForeground(Color.white);
        mainRegisterPanel.add(usernameLabel);


        passwordLabel = new JLabel("Pass");
        passwordLabel.setBounds(100,370,190,20);
        passwordLabel.setFont(labelFont);
        passwordLabel.setForeground(Color.white);
        mainRegisterPanel.add(passwordLabel);



		//Buttons______________________________________
		registerBtn = new JButton("Register");
		registerBtn.setBounds(100,440,190,40);
		registerBtn.setFont(labelFont);
		registerBtn.setFocusPainted(false);
		registerBtn.setForeground(Color.white);
		registerBtn.setBackground(panelColor);
		registerBtn.setBorder(BorderFactory.createLineBorder(labelColor));
		mainRegisterPanel.add(registerBtn);


		cancelBtn = new JButton("Cancel");
		cancelBtn.setBounds(100,495,190,40);
		cancelBtn.setFont(labelFont);
		cancelBtn.setFocusPainted(false);
		cancelBtn.setForeground(Color.white);
		cancelBtn.setBackground(panelColor);
		cancelBtn.setBorder(BorderFactory.createLineBorder(labelColor));
		mainRegisterPanel.add(cancelBtn);

		//TextField________________________________________

		nameText = new JTextField();
		nameText.setBounds(100,255,190,20);
		nameText.setBorder(BorderFactory.createMatteBorder(0,0,2,0, labelColor));
		nameText.setBackground(panelColor);
		nameText.setForeground(Color.white);
		mainRegisterPanel.add(nameText);


		userText = new JTextField();
		userText.setBounds(100,325,190,20);
		userText.setBorder(BorderFactory.createMatteBorder(0,0,2,0, labelColor));
		userText.setBackground(panelColor);
		userText.setForeground(Color.white);
		mainRegisterPanel.add(userText);


		passText = new JTextField();
		passText.setBounds(100,395,190,20);
		passText.setBorder(BorderFactory.createMatteBorder(0,0,2,0, labelColor));
		passText.setBackground(panelColor);
		passText.setForeground(Color.white);
		mainRegisterPanel.add(passText);


		
		//Frame_________________________________
        registerFrame.setSize(800,600);
		registerFrame.setLayout(null);
		registerFrame.setResizable(false);
		registerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		registerFrame.setVisible(true);
	}
	
}