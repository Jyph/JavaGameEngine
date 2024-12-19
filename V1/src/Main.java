import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main
{
    public static void main(String[] args) { new Main(); }


    int scr_w = 500, scr_h = 500;
    public Main()
    {
        JFrame window = new JFrame("Java Game Engine");

        window.setUndecorated(true);
        window.setDefaultCloseOperation(3);
        window.setSize(scr_w + 14, scr_h + 37);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setLayout(null);

        JPanel titleBar = new UI._0(window);
        window.add(titleBar);
        window.repaint();



        // JFileChooser chooser = new JFileChooser();
        // chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        // int returnVal = chooser.showOpenDialog(null);
        // if (returnVal == JFileChooser.APPROVE_OPTION)
        // {
        //     File selectedDirectory = chooser.getSelectedFile();
        //     System.out.println("Selected directory: " + selectedDirectory.getAbsolutePath());
        // }
    }
}