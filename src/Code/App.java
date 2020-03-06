package Code;

import javax.swing.*;

public class App {
    private JComboBox cmbMain;
    private JPanel PanelMenu;

    public enum listPlanets
    {
        Mercury, Venus, Earth, Mars, Jupiter, Uranus, Neptune
    }
    

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().PanelMenu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
