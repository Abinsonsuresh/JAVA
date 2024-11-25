import javax.swing.*;
import java.awt.*;

// public class BorderLayoutExample {
//     public static void main(String[] args) {
//         JFrame frame = new JFrame("BorderLayout Example");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         // Setting BorderLayout for the frame
//         frame.setLayout(new BorderLayout(10, 10));

//         // Adding components to different regions
//         frame.add(new JButton("North"), BorderLayout.NORTH);
//         frame.add(new JButton("South"), BorderLayout.SOUTH);
//         frame.add(new JButton("East"), BorderLayout.EAST);
//         frame.add(new JButton("West"), BorderLayout.WEST);
//         frame.add(new JButton("Center"), BorderLayout.CENTER);

//         frame.setSize(400, 300);
//         frame.setVisible(true);
//     }
// }

public class BorderLayoutExample {
    // BORDER LAYOUT
    // public static void main(String[] args) {
    // JFrame frame = new JFrame("BorderLayout");
    // frame.setLayout(new BorderLayout(20,10));
    // JButton B1 = new JButton("Menu");
    // JButton B2 = new JButton("RM");
    // JButton B3 = new JButton("LM");
    // JButton B4 = new JButton("DM");

    // frame.add(B1, BorderLayout.NORTH);
    // frame.add(B2, BorderLayout.EAST);
    // frame.add(B3, BorderLayout.WEST);
    // frame.add(B4, BorderLayout.SOUTH);

    // frame.setSize(500,500);
    // frame.setVisible(true);

    // }

    // BORDER LAYOUT

    // Components are arranged one after another in a single row.
    // The layout can wrap to the next line when there is insufficient space.
    // You can control alignment (left, center, right) of the components.
    // You can specify horizontal and vertical gaps between the components.

    // public static void main(String[] args) {
    // JFrame frame = new JFrame("FlowLayout");
    // frame.setLayout(new FlowLayout(FlowLayout.CENTER,100,100));
    // JButton b1 = new JButton("Enter");
    // JButton b2 = new JButton("Enter");
    // JButton b3 = new JButton("Enter");
    // JButton b4 = new JButton("Enter");

    // frame.add(b4);
    // frame.add(b1);
    // frame.add(b2);
    // frame.add(b3);

    // frame.setSize(500,500);
    // frame.setVisible(true);

    // }

    // GRID LAYOUT

    // public static void main(String[] args) {
    // JFrame frame = new JFrame("GridLayout");
    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // frame.setLayout(new GridLayout(4, 4, 10, 10));

    // JButton b1 = new JButton("Enter");
    // JButton b2 = new JButton("Enter");
    // JButton b3 = new JButton("Enter");
    // JButton b4 = new JButton("Enter");

    // frame.add(b4);
    // frame.add(b1);
    // frame.add(b2);
    // frame.add(b3);

    // frame.setSize(500, 500);
    // frame.setVisible(true);
    // }

    // BOX LAYOUT

    // public static void main(String[] args) {
    //     JFrame frame = new JFrame("BoxxLayut");
    //     frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

    //     JButton b1 = new JButton("Enter");
    //     JButton b2 = new JButton("Enter");
    //     JButton b3 = new JButton("Enter");
    //     JButton b4 = new JButton("Enter");

    //     frame.add(b4);
    //     frame.add(b1);
    //     frame.add(b2);
    //     frame.add(b3);

    //     frame.setSize(500, 500);
    //     frame.setVisible(true);
    // }

    // CARD LAYOUT

    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout");
   
        CardLayout cardLay = new CardLayout();
        JPanel panel = new JPanel(cardLay);

        JPanel Card1 = new JPanel();
        Card1.add(new JLabel("C1"));

        JPanel Card2 = new JPanel();
        Card2.add(new JLabel("C2"));

        panel.add(Card2,"CARD2");
        panel.add(Card1,"CARD1");

        frame.add(panel);

        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(e -> cardLay.next(panel));
        frame.add(nextButton, BorderLayout.SOUTH);




        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
