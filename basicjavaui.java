import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public final class BasicJavaUI {
    
    private static final Dimension INITIAL_SIZE = new Dimension(300, 400);

    private static final Dimension MIN_SIZE = new Dimension(150, 300);
    
    private final JFrame myFrame;
    
    private final JMenuBar myMenuBar;
    
    private final JMenu myMenu;
    
    private final JMenuItem myMenuItem;

    public BasicJavaUI() {
        myFrame = new JFrame();
        myMenuBar = new JMenuBar();
        myMenu = new JMenu("Options");
        myMenuItem = new JMenuItem("About");

    }
    
    public void start() {
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(INITIAL_SIZE);
        myFrame.setMinimumSize(MIN_SIZE);
        myFrame.setLocationRelativeTo(null);
        myMenuBar.add(myMenu);
        myMenu.add(myMenuItem);
        myFrame.setJMenuBar(myMenuBar);
        myFrame.setVisible(true);
    }
   

}
