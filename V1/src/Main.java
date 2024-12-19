
import javax.swing.JFrame;

public class Main
{
    public static void main(String[] args) { new Main(); }


    int scr_w = 500, scr_h = 500;
    public Main()
    {
        JFrame window = new JFrame("Java Game Engine");

        window.setDefaultCloseOperation(3);
        window.setSize(scr_w + 14, scr_h + 37);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
}