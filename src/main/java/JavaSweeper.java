import javax.swing.*;
import java.awt.*;
import sweeper.Box;
public class JavaSweeper extends JFrame {
    private final int COLS =15;
    private final int ROWS=1;
    private final int IMAGE_SIZE=50;
    private JPanel panel;

    public static void main(String[] args) {
        new JavaSweeper();
    }

    private JavaSweeper() {
        setImages();
        InitPanel();
        InitFrame();
    }

    private void InitPanel() {
        panel = new JPanel(){
            @Override
            protected  void paintComponent(Graphics g){
                super.paintComponent(g);
                for (Box box:Box.values()){
                    g.drawImage((Image) box.image,
                            box.ordinal()*IMAGE_SIZE,
                            0,this);
                }
            }
        };//create new panel
        panel.setPreferredSize(new Dimension(COLS*IMAGE_SIZE, ROWS*IMAGE_SIZE));//size of panel
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
    private void setImages(){
        for(Box box:Box.values())
            box.image=getImage(box.name().toLowerCase());
    }
    private Image getImage(String name){
        String filename="res/img/"+name+".png";
        ImageIcon icon =new javax.swing.ImageIcon(filename);
        return icon.getImage();
    }
}
