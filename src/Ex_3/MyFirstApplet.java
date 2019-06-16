package Ex_3;

import javax.swing.*;
import java.awt.*;

public class MyFirstApplet extends JApplet {
    @Override
    public void init() {
        JLabel lbl = new JLabel("Синий текст на желтом фоне");
        lbl.setFont(new Font("Arial",Font.BOLD,30));
        lbl.setForeground(Color.BLUE);
        lbl.setOpaque(true);
        lbl.setBackground(Color.YELLOW);
        add(lbl);
    }
}
