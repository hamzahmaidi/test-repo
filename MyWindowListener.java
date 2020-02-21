import java.awt.*;
import java.awt.event.*;
public class MyWindowListener extends WindowAdapter{
public void windowClosing(WindowEvent evt) {
System.exit(0);
}
}