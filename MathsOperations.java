import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MathsOperations {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MainFrame");

        frame.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Num 1");
        frame.add(l1);

        JTextField t1 = new JTextField(10);
        frame.add(t1);

        JLabel l2 = new JLabel("Num 2");
        frame.add(l2);

        JTextField t2 = new JTextField(10);
        frame.add(t2);

        JLabel l3 = new JLabel("Result");
        frame.add(l3);

        JTextField t3 = new JTextField(10);
        frame.add(t3);

        JButton b1 = new JButton("Calculate");
        frame.add(b1);

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int res = 0;

                if (e.getSource() == b1) {
                    res = num1 + num2;
                    t3.setText(String.valueOf(res));
                }
            }
        };

        b1.addActionListener(listener);


        frame.setSize(500, 500);
        frame.setVisible(true);

    }
}