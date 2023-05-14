import javax.swing.*;
import java.awt.*;

public class Header extends JLabel {
    public Header(String title, Color backgroundColor){
        //Los títulos de cada panel de la ventana
        setText(title);
        setBackground(backgroundColor);
        setForeground(Color.BLACK);
        setFont(new Font ("Calibre", Font.BOLD+ Font.ITALIC,24));
        setHorizontalAlignment(JLabel.CENTER);
        setOpaque(true);
    }
}