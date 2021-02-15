import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test implements ActionListener {
    private int clicks = 0;
    private JLabel label = new JLabel("ANZAHL DER KLICKS:  0     ");
    private JFrame frame = new JFrame();

    public Test()
    {
        JButton button = new JButton("klick mich");                         // der Text von Button
        button.addActionListener(this);                                     // DAS "BUTTON" WO WIR KLICKEN KÖNNEN.

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(80, 100, 60, 70)); // GROSSE DES FENSTERS
        panel.setLayout(new GridLayout(2,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Test Saidi: Java ");                                             // name des fensters//
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        clicks++;                                                           // das heisst jedes Klick + 1. ( ++ heisst je + 1 und -- heisst -1 //
        label.setText("DU HAST " + clicks + " MAL ANGEKLICKT");                      // DAS Text ÄNDERT SICH WENN WIR ALS ERSTE MAL KLICKEN UND DANN BLEIBT SO,(JEDE KLICK IMMER EIN ZAHL MEHR : 1 2 3)//
    }
    public static void main(String[] args) {
        new Test();
    }
}
