import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


class WelcomeView {

	public static void main(String[] args) {
		welcomeGui();
	}

	static void welcomeGui() {

		JFrame welcomeFrame = new JFrame();
		JPanel welcomeMainPanel;
		JLabel welcomeLabel;
		JButton startBtn;


		Font labelFont = new Font("Calibri", Font.BOLD, 18);
        Font logInLabel = new Font("Arial", Font.BOLD, 40);
        Font textFont = new Font("Proxima Nova", Font.PLAIN, 17);

        Color panelColor = new Color(19,24,32);
        Color labelColor = new Color(255,55,45);
        



		//Panels_________________________________________

		welcomeMainPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                try {
                    Image backgroundImage = ImageIO.read(new File("welcome copy.jpg")); // Set the correct path
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };


        welcomeMainPanel.setBounds(0,0,800,600);
        welcomeMainPanel.setLayout(null);
        welcomeFrame.add(welcomeMainPanel);




        //Labels_________________________________
        welcomeLabel = new JLabel();




        //Buttons_______________________________
        startBtn = new JButton("Start");
        startBtn.setBounds(305,330,150,60);
        startBtn.setFocusPainted(false);
        startBtn.setFont(labelFont);
        startBtn.setBackground(panelColor);
        startBtn.setForeground(Color.white);
        startBtn.setBorder(BorderFactory.createLineBorder(labelColor));
        welcomeMainPanel.add(startBtn);



        //Frame_________________________________
        welcomeFrame.setSize(800,600);
		welcomeFrame.setLayout(null);
		welcomeFrame.setResizable(false);
		welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		welcomeFrame.setVisible(true);

	}
}