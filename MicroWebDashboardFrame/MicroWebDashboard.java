import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

class MicroWebDashboard {

    MicroWebDashboard() {
        JFrame dashboardFrame = new JFrame();
        JPanel dashboardPanel;
        JScrollPane dashboardScrollPane;
        JButton addBtn, claimBtn, logOutBtn;
        JTextField itemText, quantityText, itemIdText, claimQtyText, searchText;
        JLabel itemLabel, quantityLabel, idNumLabel, claimQtyLabel, microBoxLabel, clientNameLabel;


        String data[][] = {
            {"101", "Sabon", "45"},
            {"102", "Tuna", "15"},
            {"103", "Monggos ni Nanay", "69"}
        };
        String column[] = {"ID", "ITEM NAME", "QUANTITY"};

        Font labelFont = new Font("Calibri", Font.BOLD, 18);
        Font textFont = new Font("Proxima Nova", Font.PLAIN, 15s);

        Color labelColor = new Color(255,55,45);
        Color panelColor = new Color(19,24,32);

        //Panel-------------------------------------------
        dashboardPanel = new JPanel();
        dashboardPanel.setBounds(0, 0, 800, 600);
        dashboardPanel.setBackground(new Color(19, 24, 32));
        dashboardPanel.setLayout(null);
        dashboardFrame.add(dashboardPanel);


        JTable dashboardTable = new JTable(data,column);
        dashboardTable.getTableHeader().setReorderingAllowed(false);
        dashboardTable.getTableHeader().setResizingAllowed(false);
        dashboardTable.setBounds(200, 100, 300, 400);

        //ScrollPane--------------------------------------
        dashboardScrollPane = new JScrollPane(dashboardTable);
        dashboardScrollPane.setBounds(0, 40, 800, 360);
        dashboardPanel.add(dashboardScrollPane);


        //Text--------------------------------------------
        itemText = new JTextField();
        itemText.setBounds(30,420,200,30);
        dashboardPanel.add(itemText);

        quantityText = new JTextField();
        quantityText.setBounds(30,470,200,30);
        dashboardPanel.add(quantityText);

        itemIdText = new JTextField();
        itemIdText.setBounds(350,420,200,30);
        dashboardPanel.add(itemIdText);

        claimQtyText = new JTextField();
        claimQtyText.setBounds(350,470,200,30);
        dashboardPanel.add(claimQtyText);

        //Buttons-----------------------------------------

        addBtn = new JButton("Add Item");
        addBtn.setBounds(30,510,200,40);
        addBtn.setFocusPainted(false);
        addBtn.setFont(labelFont);
        addBtn.setBackground(panelColor);
        addBtn.setForeground(Color.white);
        addBtn.setBorder(BorderFactory.createLineBorder(labelColor));
        dashboardPanel.add(addBtn);

        claimBtn = new JButton("Claim Item");
        claimBtn.setBounds(350,510,200,40);
        claimBtn.setFocusPainted(false);
        claimBtn.setFont(labelFont);
        claimBtn.setBackground(panelColor);
        claimBtn.setForeground(Color.white);
        claimBtn.setBorder(BorderFactory.createLineBorder(labelColor));
        dashboardPanel.add(claimBtn);

        logOutBtn = new JButton("Log Out");
        logOutBtn.setBounds(630,450,100,60);
        logOutBtn.setFocusPainted(false);
        logOutBtn.setFont(labelFont);
        logOutBtn.setBackground(panelColor);
        logOutBtn.setForeground(Color.white);
        logOutBtn.setBorder(BorderFactory.createLineBorder(labelColor));
        dashboardPanel.add(logOutBtn);


        //Labels------------------------------------------
        itemLabel = new JLabel("ITEM");
        itemLabel.setBounds(240,420,200,30);
        itemLabel.setFont(labelFont);
        itemLabel.setForeground(Color.white);
        dashboardPanel.add(itemLabel);

        quantityLabel = new JLabel("QTY");
        quantityLabel.setBounds(240,470,200,30);
        quantityLabel.setFont(labelFont);
        quantityLabel.setForeground(Color.white);
        dashboardPanel.add(quantityLabel);

        idNumLabel = new JLabel("ID");
        idNumLabel.setBounds(560,420,200,30);
        idNumLabel.setFont(labelFont);
        idNumLabel.setForeground(Color.white);
        dashboardPanel.add(idNumLabel);

        claimQtyLabel = new JLabel("QTY");
        claimQtyLabel.setBounds(560,470,200,30);
        claimQtyLabel.setFont(labelFont);
        claimQtyLabel.setForeground(Color.white);
        dashboardPanel.add(claimQtyLabel);

        microBoxLabel = new JLabel("MicroBox");
        microBoxLabel.setBounds(10,5,200,40);
        microBoxLabel.setFont(new Font("Calibri", Font.BOLD, 25));
        microBoxLabel.setForeground(labelColor);
        dashboardPanel.add(microBoxLabel);

        clientNameLabel = new JLabel("Rollymar");
        clientNameLabel.setBounds(635,10,200,20);
        clientNameLabel.setFont(textFont);
        clientNameLabel.setForeground(Color.white);
        dashboardPanel.add(clientNameLabel);

        //Frame-------------------------------------------
        dashboardFrame.setSize(800, 600);
        dashboardFrame.setLayout(null);
        dashboardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dashboardFrame.setResizable(false);
        dashboardFrame.getContentPane().setBackground(Color.white);
        dashboardFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new MicroWebDashboard();
    }
}
