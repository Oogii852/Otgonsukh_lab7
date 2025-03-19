import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HereglegchMedeelelGUI {
    public static void main(String[] args) {
        // Үндсэн цонх үүсгэх
        JFrame frame = new JFrame("Hereglegchiin Medeelel");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2, 5, 5));

        // Ner
        JLabel nerLabel = new JLabel("Ner:");
        JTextField nerField = new JTextField(15);
        frame.add(nerLabel);
        frame.add(nerField);

        // Nas
        JLabel nasLabel = new JLabel("Nas:");
        JTextField nasField = new JTextField(15);
        frame.add(nasLabel);
        frame.add(nasField);

        // Mergejil
        JLabel mergejilLabel = new JLabel("Mergejil:");
        JTextField mergejilField = new JTextField(15);
        frame.add(mergejilLabel);
        frame.add(mergejilField);

        // Hobbi (Dropdown)
        JLabel hobbiLabel = new JLabel("Hobbi:");
        String[] hobbies = {"Sport", "Urlan zurag", "Nom unshih", "Ayalah", "Kino uzeh"};
        JComboBox<String> hobbiBox = new JComboBox<>(hobbies);
        frame.add(hobbiLabel);
        frame.add(hobbiBox);

        // Ilgeeh tovch
        JButton ilgeehButton = new JButton("Ilgeeh");
        frame.add(ilgeehButton);

        // Action Listener
        ilgeehButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ner = nerField.getText();
                String nas = nasField.getText();
                String mergejil = mergejilField.getText();
                String hobbi = (String) hobbiBox.getSelectedItem();

                System.out.println("Ner: " + ner);
                System.out.println("Nas: " + nas);
                System.out.println("Mergejil: " + mergejil);
                System.out.println("Hobbi: " + hobbi);
            }
        });

        // Tsongiig haragduulah
        frame.setVisible(true);
    }
}
