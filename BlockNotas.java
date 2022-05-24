/**
 * BlockNotas
 */
import java.awt.event.*;
import javax.swing.*;

public class BlockNotas extends JFrame {

    private JTextArea textArea;
    private JMenuBar jmenuBar;
    private JMenu archivo,editar;
    private JMenuItem nuevo, abrir, abrirReciente, guardar, guardarComo, salir, imprimir;

    public BlockNotas() {
        super("Block de Notas");
        
        textArea = new JTextArea();
        jmenuBar = new JMenuBar();

        creaMenuArchivo();

        jmenuBar.add(archivo);

        add(textArea,"Center");
        setJMenuBar(jmenuBar);

        addWindowListener(new CW() );
        setVisible(true);
        setSize(500, 550);
    }

    private class CW extends WindowAdapter {
        public void windowClosing(WindowEvent event) {
            setVisible(false);
            dispose();
        }
    }

    private class MnuSalir implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            setVisible(false);
            dispose();
        }
        
    }

    private void creaMenuArchivo() {
        archivo = new JMenu();
        archivo.setMnemonic('A');
        archivo.setText("Archivo");

        editar = new JMenu();
        editar.setMnemonic('E');
        editar.setText("Editar");

        salir = new JMenuItem();
        salir.setMnemonic('S');
        salir.setText("Salir");
        salir.addActionListener( new MnuSalir() );

        nuevo = new JMenuItem();
        nuevo.setMnemonic('N');
        nuevo.setText("Nuevo");
        //nuevo.addActionListener( new MnuSalir() );
        
        abrir = new JMenuItem();
        abrir.setMnemonic('B');
        abrir.setText("Abrir...");
        //abrir.addActionListener( new MnuSalir() );

        abrirReciente = new JMenuItem();
        abrirReciente.setMnemonic('C');
        abrirReciente.setText("Abrir Reciente...");
        //abrirReciente.addActionListener( new MnuSalir() );

        guardar = new JMenuItem();
        guardar.setMnemonic('G');
        guardar.setText("Guardar");
        //guardar.addActionListener( new MnuSalir() );
        
        guardarComo = new JMenuItem();
        guardarComo.setMnemonic('O');
        guardarComo.setText("Guardar como...");
        //guardarComo.addActionListener( new MnuSalir() );
        
        imprimir = new JMenuItem();
        imprimir.setMnemonic('I');
        imprimir.setText("Imprimir");
        //imprimir.addActionListener( new MnuSalir() );


        archivo.add(nuevo);
        archivo.add(abrir);
        archivo.add(abrirReciente);
        archivo.addSeparator();
        archivo.add(guardar);
        archivo.add(guardarComo);
        archivo.addSeparator();
        archivo.add(imprimir);
        archivo.addSeparator();
        archivo.add(salir);

    }

    public static void main(String[] args) {
        BlockNotas blockNotas = new BlockNotas();
    }
    
}