package daoVentanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Pantalla_BarajaCartas extends JFrame {
	private JPanel contentPane;
	private JTextField Nombre_Baraja;	
	private static JList SeleccionCartas,Cartas_Mazo;
	private JButton Insertar;
	private int contador;
	public Pantalla_BarajaCartas() {
		setTitle("Crear Baraja");

		SeleccionCartas = new JList();

		Cartas_Mazo = new JList();

		Insertar = new JButton("---->");

		JButton Quitar = new JButton("<-----");

		JLabel lblNombreBaraja = new JLabel("Nombre Baraja");

		Nombre_Baraja = new JTextField();
		Nombre_Baraja.setColumns(10);

		JButton BuscarBaraja = new JButton("Buscar");

		JButton BarajaAleatoria = new JButton("Random");

		JButton btnLoadButton = new JButton("Load");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(47)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblNombreBaraja)
										.addGap(26)
										.addComponent(Nombre_Baraja, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(BuscarBaraja))
								.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(btnLoadButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(SeleccionCartas, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addGroup(groupLayout.createSequentialGroup()
														.addComponent(Insertar, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
														.addGap(10))
												.addGroup(groupLayout.createSequentialGroup()
														.addComponent(Quitar, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)))
										.addGap(6)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(BarajaAleatoria, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
												.addComponent(Cartas_Mazo, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))))
						.addGap(90))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
										.addGap(43)
										.addComponent(SeleccionCartas, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
										.addGap(33)
										.addComponent(Cartas_Mazo, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
										.addGap(84)
										.addComponent(Insertar)
										.addGap(61)
										.addComponent(Quitar)))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(BarajaAleatoria)
								.addComponent(btnLoadButton))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNombreBaraja)
								.addComponent(Nombre_Baraja, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(BuscarBaraja))
						.addContainerGap(55, Short.MAX_VALUE))
				);
		getContentPane().setLayout(groupLayout);
		btnLoadButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				cargarCartas();
			}
		});
		Insertar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				insertarCartas();
				
			}
		});

		this.setVisible(true);
		this.setSize(630, 400);
	}
	public void insertarCartas() {	
		DefaultListModel modelo3 =new DefaultListModel<>();
		modelo3.addElement(SeleccionCartas.getSelectedValue());
		Cartas_Mazo.setModel(modelo3);
	}
	public  void cargarCartas() {
		ArrayList pruebas = new ArrayList<>();
		pruebas.add("Hola");
		pruebas.add("Adios");
		pruebas.add("Hola_Adios");
		DefaultListModel modelo = new DefaultListModel<>();
		for (int i = 0; i < pruebas.size(); i++) {
			modelo.addElement(pruebas.get(i));
		}
		SeleccionCartas.setModel(modelo);
	}
	public static void main(String[] args) {
		Pantalla_BarajaCartas b = new Pantalla_BarajaCartas();
	}
}
