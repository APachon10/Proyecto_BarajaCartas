package daoVentanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JList;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Pantalla_BarajaCartas extends JFrame {
	private JPanel contentPane;
	private JTextField Nombre_Baraja;	
	public Pantalla_BarajaCartas() {
		setTitle("Crear Baraja");

		JList SeleccionCartas = new JList();

		JList Cartas_Mazo = new JList();

		JButton Insertar = new JButton("---->");

		JButton Quitar = new JButton("<-----");

		JLabel lblNombreBaraja = new JLabel("Nombre Baraja");

		Nombre_Baraja = new JTextField();
		Nombre_Baraja.setColumns(10);

		JButton BuscarBaraja = new JButton("Buscar");

		JButton BarajaAleatoria = new JButton("Random");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(47)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(SeleccionCartas, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addGroup(groupLayout.createSequentialGroup()
														.addComponent(Insertar, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
														.addGap(10))
												.addGroup(groupLayout.createSequentialGroup()
														.addComponent(Quitar, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)))
										.addComponent(Cartas_Mazo, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblNombreBaraja)
										.addGap(26)
										.addComponent(Nombre_Baraja, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(BuscarBaraja))
								.addComponent(BarajaAleatoria, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap(47, Short.MAX_VALUE))
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
						.addGap(39)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNombreBaraja)
								.addComponent(Nombre_Baraja, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(BuscarBaraja))
						.addGap(18)
						.addComponent(BarajaAleatoria)
						.addContainerGap(29, Short.MAX_VALUE))
				);
		getContentPane().setLayout(groupLayout);
		this.setVisible(true);
		this.setSize(630, 400);
	}



	//	public static void main(String[] args) {
	//		new Pantalla_BarajaCartas();
	//	}
}
