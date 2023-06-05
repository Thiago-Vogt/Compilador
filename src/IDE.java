import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import analisador.LexicalError;
import analisador.Lexico;
import analisador.SemanticError;
import analisador.Semantico;
import analisador.Sintatico;
import analisador.SyntaticError;

public class IDE {
	private File file;
	private JFrame frame;
	private ArrayList<Integer> listaLinha = new ArrayList<Integer>();
	JTextArea mensagem = new JTextArea();
	JTextArea editor = new JTextArea();
	JTextPane txtpnPastanomeDoArquivo = new JTextPane();

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

		
		mensagem.setBounds(166, 496, 708, 79);
		frame.getContentPane().add(mensagem);

		
		editor.setBounds(166, 0, 718, 487);
		editor.setBorder(new NumberedBorder());
		frame.getContentPane().add(editor);

		
		txtpnPastanomeDoArquivo.setText("pasta/nome do arquivo");
		txtpnPastanomeDoArquivo.setBounds(0, 579, 900, 25);
		frame.getContentPane().add(txtpnPastanomeDoArquivo);

		JButton btnNewButton = new JButton("Novo [ctrl-n]");
		ImageIcon novo = new ImageIcon("\"C:\\Users\\thivo\\Compiladores\\Imagens\\novo.png\"");
		btnNewButton.setIcon(novo);
		btnNewButton.setAutoscrolls(true);
		btnNewButton.setBounds(0, 0, 150, 72);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editor.setText("");
				mensagem.setText("");
			}
		});

		JButton btnNewButton_1 = new JButton("Abrir [ctrl-o]");
		btnNewButton_1.setBounds(0, 70, 150, 72);
		frame.getContentPane().add(btnNewButton_1);

		// Adicionando ActionListener ao botão "Abrir"
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

				int returnVal = fileChooser.showOpenDialog(frame);
				if (returnVal == JFileChooser.APPROVE_OPTION) {

					file = fileChooser.getSelectedFile();

					if (file.getName().endsWith(".txt")) {
						try {
							BufferedReader reader = new BufferedReader(new FileReader(file));
							String line = null;
							StringBuilder stringBuilder = new StringBuilder();
							while ((line = reader.readLine()) != null) {
								stringBuilder.append(line).append("\n");
							}
							editor.setText(stringBuilder.toString());
							reader.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}

						// Limpa a área para mensagens
						mensagem.setText("");

						// Atualiza a barra de status
						txtpnPastanomeDoArquivo.setText("Arquivo " + file.getName() + " aberto");
					}
				}
			}
		});

		JButton btnNewButton_2 = new JButton("Salvar [ctrl-s]");
		btnNewButton_2.setBounds(0, 141, 150, 72);
		frame.getContentPane().add(btnNewButton_2);

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (file == null) {
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

					int returnVal = fileChooser.showSaveDialog(frame);
					if (returnVal == JFileChooser.APPROVE_OPTION) {
						file = fileChooser.getSelectedFile();
						if (!file.getName().endsWith(".txt")) {
							file = new File(file.getAbsolutePath() + ".txt");
						}
					} else {
						return;
					}
				}

				try {
					BufferedWriter writer = new BufferedWriter(new FileWriter(file));
					writer.write(editor.getText());
					writer.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}

				// Limpa a área para mensagens
				mensagem.setText("");

				// Atualiza a barra de status
				txtpnPastanomeDoArquivo.setText("Arquivo " + file.getName() + " salvo");

				// Mantém no editor o texto que está sendo editado
				editor.requestFocus();
			}
		});

		JButton btnNewButton_3 = new JButton("Copiar [ctrl-c]");
		btnNewButton_3.setBounds(0, 213, 150, 72);
		frame.getContentPane().add(btnNewButton_3);

		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedText = editor.getSelectedText();
				if (selectedText != null && !selectedText.isEmpty()) {
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(selectedText),
							null);
				}
			}
		});

		JButton btnNewButton_4 = new JButton("Colar [ctrl-v]");
		btnNewButton_4.setBounds(0, 285, 150, 72);
		frame.getContentPane().add(btnNewButton_4);

		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				Transferable contents = clipboard.getContents(null);
				if (contents != null && contents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
					try {
						String text = (String) contents.getTransferData(DataFlavor.stringFlavor);
						editor.paste();
					} catch (UnsupportedFlavorException | IOException ex) {
						ex.printStackTrace();
					}
				}
			}
		});

		JButton btnNewButton_5 = new JButton("Recortar [ctrl-x]");
		btnNewButton_5.setBounds(0, 355, 150, 72);
		frame.getContentPane().add(btnNewButton_5);

		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedText = editor.getSelectedText();
				if (selectedText != null && !selectedText.isEmpty()) {
					Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
					clipboard.setContents(new StringSelection(selectedText), null);
					editor.cut();
				}
			}
		});

		JButton btnNewButton_6 = new JButton("Compilar [F7]");
		btnNewButton_6.setBounds(0, 426, 150, 72);
		frame.getContentPane().add(btnNewButton_6);

		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = editor.getText();
				Reader targetReader = new StringReader(texto);
				novaLinha();
				Lexico lexico = new Lexico();
				Sintatico sintatico = new Sintatico();
				Semantico semantico = new Semantico();
				lexico.setInput(targetReader);
				try {
					sintatico.parse(lexico, semantico); 
					mensagem.setText("programa compilado com sucesso");	
				} 		  
				catch (LexicalError erro) {
					System.out.println(erro.getMessage() + " em " + erro.getPosition());

					String caracter = texto.substring(erro.getPosition(), erro.getPosition()+1);
					String linhasAnteriores = texto.substring(0, erro.getPosition());
					System.out.println("contando linhas");
					String[] linhas = linhasAnteriores.split("\n");
					System.out.println(caracter + linhas.length);

					mensagem.setText("Erro na linha " + linhas.length + " - " + caracter +  " " + erro.getMessage());
				} catch ( SyntaticError erroSintatico )
				{
				    String msgInput = editor.getText();
				    int linha = 1;
				    int posicao = erroSintatico.getPosition();

				    for (int i = 1; i < posicao; i++) {
				        if (msgInput.charAt(i) == '\n') {
				            linha++;
				        }
				    }

					
				     
				     mensagem.setText("Erro na linha " + linha + " - encontrado " + (sintatico.getToken().getLexeme().equals("$")?"EOF":sintatico.getToken()) + " " + erroSintatico.getMessage());
					 
					//Trata erros sintáticos
					//linha 				sugestão: converter getPosition em linha
					//símbolo encontrado    sugestão: implementar um método getToken no sintatico
					//mensagem - símbolos esperados,   alterar ParserConstants.java, String[] PARSER_ERROR		
				}
				catch ( SemanticError erroSemantico )
				{
					//Trata erros semânticos
				}
			}
		});

		JButton btnNewButton_7 = new JButton("Equipe [F1]");
		btnNewButton_7.setBounds(0, 496, 150, 72);
		frame.getContentPane().add(btnNewButton_7);

		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mensagem.setText("Equipe: Thiago Vogt, Kelvin Leite, Felipe Bona");
			}
		});
		
	}
	public void novaLinha() {
	    String text = editor.getText();

	    listaLinha.clear();

	    text += "\n";

	    for (int i = 0; i < text.length(); i++) {
	        if (text.charAt(i) == '\n') {
	            listaLinha.add(i);
	        }
	    }
	}
	
	public String Token(Integer id) {

        if (id == 2) {
            return "identificador";
        } else if (id == 3) {
            return "constante_int";
        } else if (id == 4) {
            return "constante_float";
        } else if (id == 5) {
            return "constante_binario";
        } else if (id == 6) {
            return "constante_string";
        } else if (id < 19) {
            return "palavra reservada";
        } else {
            return "simbolo especial";
        }

    }
}
