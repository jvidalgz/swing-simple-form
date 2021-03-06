import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by jaime on 24-03-2015.
 */
public class Formulario extends JFrame{

    Formulario() {
        setSize(280, 400);
        setTitle("Ventana Principal");
        setResizable(false);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());


        /**
         * Etiqueta JLabel
         */
        JLabel etiqueta = new JLabel("Ingresar Datos");
        etiqueta.setBackground(Color.GREEN);
        etiqueta.setOpaque(true);
        etiqueta.setFont(new Font("Monospace", Font.BOLD, 20));


        add(etiqueta, BorderLayout.NORTH);

        /**
         * Boton  Añadir - JButton
         */

        JButton button = new JButton("Añadir alumno");
        add(button, BorderLayout.SOUTH);

        /**
         * Boton Salir -JButton
         */
         JButton buttonExit = new JButton("Salir");


        /**
         * Panel Botones - JPanel
         */

        JPanel panelBotones = new JPanel(new GridLayout(1,2) );
        panelBotones.add(button);
        panelBotones.add(buttonExit);

        add(panelBotones, BorderLayout.SOUTH);



        /**
         * JPanel
         */

        JPanel panelGrid = new JPanel(new GridLayout(5,2));

        JLabel label1 = new JLabel("Nombre");
        JLabel label2 = new JLabel("Apellido Paterno");
        JLabel label3 = new JLabel("Apellido Materno");
        JLabel label4 = new JLabel("Edad");
        JLabel label5 = new JLabel("Nota");

        final JTextField text1 = new JTextField();
        final JTextField text2 = new JTextField();
        final JTextField text3 = new JTextField();
        final JTextField text4 = new JTextField();
        final JTextField text5 = new JTextField();

        panelGrid.add(label1);
        panelGrid.add(text1);
        panelGrid.add(label2);
        panelGrid.add(text2);
        panelGrid.add(label3);
        panelGrid.add(text3);
        panelGrid.add(label4);
        panelGrid.add(text4);
        panelGrid.add(label5);
        panelGrid.add(text5);

        add(panelGrid, BorderLayout.CENTER);

        /**
         * Listener Boton
         */
        button.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {

                    Persona persona = new Persona();

                    persona.setNombre(text1.getText());
                    persona.setApellidoPaterno(text2.getText());
                    persona.setApellidoMaterno(text3.getText());

                    /**
                     * se aisla el ingreso de la edad en un método. Agrega try/catch para cuando se arroge una excepción,
                     * el error sea mostrado apropiadamente y el programa no termine abruptamente
                     */
                    try {
                        personaSetEdad(persona, text4);
                    } catch (NumberFormatException e1) {
                        System.out.println("El valor ingresado en la edad no es correcto!");
                    }
                    /**
                     * se aisla el ingreso de la nota en un método. Agrega try/catch para cuando se arroge una excepción,
                     * el error sea mostrado apropiadamente y el programa no termine abruptamente
                     */

                    try {
                        personaSetNota(persona, text5);
                    } catch (NumberFormatException e1) {
                        System.out.println("El valor ingresado en la nota es incorrecto");
                    }

                    System.out.println("Los datos ingresados de la persona son: ");
                    System.out.println("Nombre: "           + persona.getNombre());
                    System.out.println("Apellido paterno: " + persona.getApellidoPaterno());
                    System.out.println("Apellido materno: " + persona.getApellidoMaterno());
                    System.out.println("Edad: "             + persona.getEdad());
                    System.out.println("Nota: "             + persona.getNota());
                }
            }
        });

        buttonExit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {

                    dispose();
                }
            }
        });

            } // fin constructor

    /**
     * Método para establecer la edad en el (objeto) persona. La edad será ingresada desde un Textfield
     * @param persona
     * @param text5
     * @throws NumberFormatException
     */

    private static void personaSetNota(Persona persona, JTextField text5)
            throws NumberFormatException{
        persona.setNota(Integer.parseInt(text5.getText()));
    }

    /**
     * Método para establecer nota en el (objeto) persona. La edad será ingresada desde un Textfield
     * @param persona
     * @param text4
     * @throws NumberFormatException
     */

    private static void personaSetEdad(Persona persona, JTextField text4)
            throws NumberFormatException{
        persona.setEdad(Integer.parseInt(text4.getText()));
    }
}// fin clase
