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
    private JMenuItem copiar, cortar, pegar;

    public BlockNotas() {
        super("Block de Notas");
        
        textArea = new JTextArea();
        jmenuBar = new JMenuBar();

        creaMenuArchivo();
        creaMenuEditar();

        jmenuBar.add(archivo);
        jmenuBar.add(editar);


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

    private void creaMenuEditar() {
        editar = new JMenu();
        editar.setMnemonic('E');
        editar.setText("Editar");

        copiar = new JMenuItem();
        copiar.setMnemonic('C');
        copiar.setText("Copiar");

        cortar = new JMenuItem();
        cortar.setMnemonic('O');
        cortar.setText("Cortar");
        
        pegar = new JMenuItem();
        pegar.setMnemonic('P');
        pegar.setText("Pegar");

        editar.add(copiar);
        editar.add(cortar);
        editar.add(pegar);

    }

    private void creaMenuArchivo() {
        archivo = new JMenu();
        archivo.setMnemonic('A');
        archivo.setText("Archivo");

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