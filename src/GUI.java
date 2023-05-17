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
        //Panel principal y subpaneles:
        mainPanel = new JPanel(new GridLayout(3, 3));
        botones = new JPanel(new GridLayout(1, 2));
        guide = new JPanel(new BorderLayout());
        score = new JPanel(new BorderLayout());
        inactivos = new JPanel(new BorderLayout());
        activos = new JPanel(new BorderLayout());
        usados = new JPanel(new BorderLayout());
        containerImage = new JPanel();
        layoutInactivos = new JPanel();
        layoutUsados = new JPanel();
        layoutPuntaje = new JPanel();
        guide = new JPanel();
        dado1 = new JLabel(caraDado);
        dado2 = new JLabel(caraDado);
        dado3 = new JLabel(caraDado);
        dado4 = new JLabel(caraDado);
        dado5 = new JLabel(caraDado);
        dado6 = new JLabel(caraDado);
        dado7 = new JLabel(caraDado);
        dado8 = new JLabel(caraDado);
        dado9 = new JLabel(caraDado);
        dado10 = new JLabel(caraDado);
        gameText = new JTextArea();
        scrollPane = new JScrollPane(gameText, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        //Listeners:
        escucha = new Escucha();
        modelCraps = new ModelCraps();

        //Bordes de cada JPanel
        Border border = BorderFactory.createLineBorder(Color.red);
        inactivos.setBorder(border);
        activos.setBorder(border);
        usados.setBorder(border);
        botones.setBorder(border);
        score.setBorder(border);
        guide.setBorder(border);

        //SE AÑADEN LOS PANELES AL PANEL PRINCIPAL:

        //Panel Botones:
        mainPanel.add(botones);
        botones.setBackground(Color.black);

        //Panel Botón1
        iniciar = new JButton("Tirar dados");
        iniciar.addActionListener(escucha);
        iniciar.setBackground(Color.blue);
        iniciar.setForeground(Color.WHITE);
        iniciar.setPreferredSize(new Dimension(120, 30));
        botones.add(iniciar);

        //Panel Botón2
        continuar = new JButton("Pasar de ronda");
        continuar.setBackground(Color.RED);
        continuar.setForeground(Color.WHITE);
        continuar.addActionListener(escucha);
        continuar.setPreferredSize(new Dimension(150, 30)); // Establecemos un tamaño preferido pequeño
        botones.add(continuar);

        //Panel dados activos
        mainPanel.add(activos);
        activos.setBackground(Color.black);
        activos.add(header = new Header("Dados activos", Color.BLACK));
        header.setForeground(Color.white);
        Font font1 = new Font("Arial", Font.BOLD, 24);
        header.setFont(font1);
        activos.add(header, BorderLayout.NORTH);
        activos.add(containerImage, BorderLayout.CENTER);




        //Panel dados inactivos
        mainPanel.add(inactivos);
        inactivos.setBackground(Color.black);
        inactivos.add(header = new Header("Dados Inactivos", Color.black));
        inactivos.add(header, BorderLayout.NORTH);
        header.setForeground(Color.white);
        header.setFont(font1);
        inactivos.add(layoutInactivos, BorderLayout.CENTER);


        //Panel dados usados.
        mainPanel.add(usados);
        usados.setBackground(Color.black);
        usados.add(header = new Header("Dados usados", Color.black));
        usados.add(header, BorderLayout.NORTH);
        header.setForeground(Color.white);
        header.setFont(font1);
        usados.add(layoutUsados, BorderLayout.CENTER);

        //Panel puntaje
        mainPanel.add(score);
        score.setBackground(Color.black);
        score.add(header = new Header("Puntaje", Color.black));
        score.add(header, BorderLayout.NORTH);
        header.setForeground(Color.white);
        header.setFont(font1);
        gameText.setEditable(false);
        score.add(scrollPane, BorderLayout.CENTER);



        //Panel guía
        mainPanel.add(guide);
        imagen = new ImageIcon(getClass().getResource("/recursos/guide.png"));
        guideImg = new JLabel();
        guideImg.setIcon(imagen);
        guide.add(guideImg, "Center");
        guide.setBackground(Color.white);


        //anadimos el panel principal con el diseno a la ventana
        getContentPane().add(mainPanel);
    }



}

