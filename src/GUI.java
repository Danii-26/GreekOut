import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JScrollPane;
public class GUI extends JFrame {
    //atributos
    private int contadorDadosActivos=1;
    private JPanel guide, score, inactivos, activos, usados, botones;
    private JPanel containerImage, layoutInactivos, layoutUsados, layoutPuntaje;
    private JPanel mainPanel;
    private  JTextArea gameText;
    private boolean primerClick = true;
    private int puntaje =0;
    private int estado=0, ronda=0;
    private JLabel guideImg, dado1, dado2, dado3, dado4, dado5, dado6, dado7, dado8, dado9, dado10;
    private JButton iniciar, continuar;
    private ModelCraps modelCraps;
    private JScrollPane scrollPane;
    private Escucha escucha;
    private ImageIcon caraDado;
    private Header header;
    private Dice dice = new Dice();
    private ImageIcon imagen;
    public GUI() {
        initGUI();
        this.setTitle("Geek out masters");
        this.setSize(750, 500);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void initGUI() {

    }



}

