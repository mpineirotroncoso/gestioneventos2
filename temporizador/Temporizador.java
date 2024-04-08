import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temporizador {
    public Temporizador(){
        JFrame frame = new JFrame("Temporizador");
        frame.setSize(200,300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        final JTextField textField = new JTextField(20);
        frame.getContentPane().add(textField);

        frame.pack();
        frame.setVisible(true);

        Timer timer = new Timer(1000, new ActionListener() {
            int count = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                textField.setText(textField.getText()+"Numero "+count);
                System.out.println(count);
                if (count >= 10) {
                    timer.stop();
                }
            }
        });

        timer.start();
    }

}
