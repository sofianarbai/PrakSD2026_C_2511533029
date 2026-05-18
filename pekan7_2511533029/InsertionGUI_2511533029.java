package pekan7_2511533029;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class InsertionGUI_2511533029 extends JFrame {

	private static final long serialVersionUID = 1L;
	private int[] array_3029;
	private JLabel[] labelArray_3029;
	private JButton stepButton_3029, resetButton_3029, setButton_3029;
	private JTextField inputField_3029;
	private JPanel panelArray_3029;
	private JTextArea stepArea_3029;
	
	private int  i_3029 = 1, j_3029;
	private boolean sorting_3029 = false;
	private int stepCount_3029 = 1;

	/**
	 * Create the frame.
	 */
	public InsertionGUI_2511533029() {
		setTitle("Insertion Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		//Panel Input
		JPanel inputPanel_3029 = new JPanel (new FlowLayout());
		inputField_3029 = new JTextField(30);
		setButton_3029 = new JButton("Set Array");
		inputPanel_3029.add(new JLabel ("Masukkan angka (pisahkan dengan koma) : ") );
		inputPanel_3029.add(inputField_3029);
		inputPanel_3029.add(setButton_3029);
		
		
		// Panel array visual
		panelArray_3029 = new JPanel ();
		panelArray_3029.setLayout(new FlowLayout());
		
		// Panel Control
		JPanel controlPanel_3029 = new JPanel();
		stepButton_3029 = new JButton("Langkah Selanjutnya");
		resetButton_3029 = new JButton("Reset");
		stepButton_3029.setEnabled(false);
		controlPanel_3029.add(stepButton_3029);
		controlPanel_3029.add(resetButton_3029);
		
		// Area teks untuk log langkah-langkah
		stepArea_3029 = new JTextArea(8, 60);
		stepArea_3029.setEditable(false);
		stepArea_3029.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane_3029 = new JScrollPane(stepArea_3029);

		// Tambahkan panel ke frame
		add(inputPanel_3029, BorderLayout.NORTH);
		add(panelArray_3029, BorderLayout.CENTER);
		add(controlPanel_3029, BorderLayout.SOUTH);
		add(scrollPane_3029, BorderLayout.EAST);

		// Event Set Array
		setButton_3029.addActionListener(e -> setArrayFromInput_3029());

		// Event Langkah Selanjutnya
		stepButton_3029.addActionListener(e -> performStep_3029());

		// Event Reset
		resetButton_3029.addActionListener(e -> reset_3029());
	}
	private void setArrayFromInput_3029 () {
		String text_3029 = inputField_3029.getText().trim();
		if (text_3029.isEmpty()) return;
		String [] parts_3029 = text_3029.split (",");
		array_3029 = new int [parts_3029.length];
		try {
			for (int k = 0; k < parts_3029.length; k++) {
				array_3029 [k] = Integer.parseInt(parts_3029[k].trim());
		    	}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog (this, "Masukkan hanya angka yang dipisahkan "
						+ "dengan koma!" , "Error", JOptionPane.ERROR_MESSAGE);
				return; 
			}
			i_3029 = 1;
			stepCount_3029 = 1;
			sorting_3029 = true;
			stepButton_3029.setEnabled(true);
			stepArea_3029.setText("");
			panelArray_3029.removeAll();
			labelArray_3029 = new JLabel [array_3029.length];
			for (int k = 0; k < array_3029.length; k++) {
				labelArray_3029[k] = new JLabel (String.valueOf(array_3029[k]));
				labelArray_3029[k].setFont (new Font ("Arial", Font.BOLD, 24));
				labelArray_3029[k].setBorder (BorderFactory.createLineBorder(Color.BLACK));
				labelArray_3029[k].setPreferredSize(new Dimension(50, 50));
				labelArray_3029[k].setHorizontalAlignment(SwingConstants.CENTER);
				panelArray_3029.add(labelArray_3029[k]);
			}
			panelArray_3029.revalidate();
			panelArray_3029.repaint();
		}
		private void performStep_3029() {
			if (i_3029 < array_3029.length && sorting_3029) {
				int key_3029 = array_3029[i_3029];
				j_3029 = i_3029 - 1;
				
				StringBuilder stepLog_3029 = new StringBuilder();
				stepLog_3029.append("Langkah ").append(stepCount_3029).append(": Memasukkan").append(key_3029).append("\n");
				
				while (j_3029 >= 0 && array_3029[j_3029] > key_3029) {
					array_3029[j_3029 + 1] = array_3029[j_3029];
					j_3029--;
				}
				array_3029 [j_3029 + 1] = key_3029;
				
				updateLabels_3029();
				stepLog_3029.append("Hasil: ").append(arrayToString_3029(array_3029)).append("\n\n");
				stepArea_3029.append(stepLog_3029.toString());
				
				i_3029++;
				stepCount_3029++;
				
				if (i_3029 == array_3029.length) {
					sorting_3029 = false;
					stepButton_3029.setEnabled(false);
					JOptionPane.showMessageDialog(this, "Sorting seleai");
				}
			}
		}
		private void updateLabels_3029 () {
			for (int k = 0; k < array_3029.length; k++) {
				labelArray_3029[k].setText(String.valueOf(array_3029[k]));
			}
		}
		
		private void reset_3029() {
			inputField_3029.setText("");
			panelArray_3029.removeAll();
			panelArray_3029.revalidate();
			panelArray_3029.repaint();
			stepArea_3029.setText("");
			stepButton_3029.setEnabled(false);
			sorting_3029 = false;
			i_3029 = 1;
			stepCount_3029 = 1;
		}
		private String arrayToString_3029 (int [] arr_3029) {
			StringBuilder sb_3029 = new StringBuilder();
			for (int k = 0; k < arr_3029.length; k++) {
				sb_3029.append (arr_3029[k]);
				if (k < arr_3029.length - 1) sb_3029.append(", ");
			}
			return sb_3029.toString();
		}
}	
