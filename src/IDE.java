import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IDE {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IDE window = new IDE();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IDE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(166, 0, 718, 487);
		textArea_1.setBorder(new NumberedBorder());
		frame.getContentPane().add(textArea_1);
		
		JButton btnNewButton = new JButton("Novo [ctrl-n]");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setText("");
			}
		});
		btnNewButton.setBounds(0, 0, 150, 72);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Abrir [ctrl-o]");
		btnNewButton_1.setBounds(0, 70, 150, 72);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salvar [ctrl-s]");
		btnNewButton_2.setBounds(0, 141, 150, 72);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Copiar [ctrl-c]");
		btnNewButton_3.setBounds(0, 213, 150, 72);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Colar [ctrl-v]");
		btnNewButton_4.setBounds(0, 285, 150, 72);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Recortar [ctrl-x]");
		btnNewButton_5.setBounds(0, 355, 150, 72);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Compilar [F7]");
		btnNewButton_6.setBounds(0, 426, 150, 72);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Equipe [F1]");
		btnNewButton_7.setBounds(0, 496, 150, 72);
		frame.getContentPane().add(btnNewButton_7);
		
		JTextPane txtpnPastanomeDoArquivo = new JTextPane();
		txtpnPastanomeDoArquivo.setText("pasta/nome do arquivo");
		txtpnPastanomeDoArquivo.setBounds(0, 579, 900, 25);
		frame.getContentPane().add(txtpnPastanomeDoArquivo);
		
	
	}
}
