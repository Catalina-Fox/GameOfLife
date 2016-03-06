import javax.swing.*;
import java.awt.*;

/**
 * Created by Catal on 07.03.2016.
 */
public class Life {

    public void main (String[] args) {
        System.out.println("jdld");

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame= new JFrame("Game of life");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Game og life");
        frame.getContentPane().add(label);
        frame.setPreferredSize(new Dimension(200,100));
    }

    public void run()
    {

    }
}


