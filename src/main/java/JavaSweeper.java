import javax.swing.*;
import java.awt.*;

public class JavaSweeper extends JFrame {
    private JPanel panel;

    public static void main(String[] args) {
        new JavaSweeper().setVisible(true);
    }

    private JavaSweeper() {
        InitPanel();
        InitFrame();
    }

    private void InitPanel() {
        panel = new JPanel();//create new panel
        panel.setPreferredSize(new Dimension(500, 300));//size of panel
        add(panel);//add
    }
    private void InitFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// close to exit
        setTitle("Java Sweeper"); //Title

        setVisible(true);//see window
        setResizable(false);//make format close
        pack();//rar in pack
        setLocationRelativeTo(null);//Center of center
    }
}
