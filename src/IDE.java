import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class IDE {
	private File file;
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
		
		JTextArea mensagem = new JTextArea();
		mensagem.setBounds(166, 496, 708, 79);
		frame.getContentPane().add(mensagem);
		
		frame.addComponentListener(new ComponentAdapter() {
		    public void componentResized(ComponentEvent e) {
		        Dimension newSize = e.getComponent().getSize();
		        mensagem.setSize(newSize.width - 166, newSize.height - 496);
		    }
		});
		
		JTextArea editor = new JTextArea();
		editor.setBounds(166, 0, 718, 487);
		editor.setBorder(new NumberedBorder());
		frame.getContentPane().add(editor);
		
		frame.addComponentListener(new ComponentAdapter() {
		    @Override
		    public void componentResized(ComponentEvent e) {
		        Dimension size = frame.getContentPane().getSize();
		        editor.setSize(size.width - 20, size.height - 120);
		    }
		});
		
		JTextPane txtpnPastanomeDoArquivo = new JTextPane();
		txtpnPastanomeDoArquivo.setText("pasta/nome do arquivo");
		txtpnPastanomeDoArquivo.setBounds(0, 579, 900, 25);
		frame.getContentPane().add(txtpnPastanomeDoArquivo);
		
		
		JButton btnNewButton = new JButton("Novo [ctrl-n]");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editor.setText("");
			}
		});
		btnNewButton.setBounds(0, 0, 150, 72);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Abrir [ctrl-o]");
		btnNewButton_1.setBounds(0, 70, 150, 72);
		frame.getContentPane().add(btnNewButton_1);
		
		//Adicionando ActionListener ao botão "Abrir"
		btnNewButton_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        JFileChooser fileChooser = new JFileChooser(); //Cria uma instância de JFileChooser
		        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); //Permite a seleção de arquivos e pastas

		        int returnVal = fileChooser.showOpenDialog(frame); //Exibe a caixa de diálogo de seleção de arquivo/pasta
		        if (returnVal == JFileChooser.APPROVE_OPTION) { //Verifica se o usuário selecionou um arquivo
		            
		        	file = fileChooser.getSelectedFile(); //Obtém o arquivo selecionado

		            if (file.getName().endsWith(".txt")) { //Verifica se o arquivo selecionado é um arquivo de texto
		                //Carrega o arquivo selecionado no editor
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

		                //Limpa a área para mensagens2
		                mensagem.setText("");

		                //Atualiza a barra de status4
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
		        if (file == null) { //Se o arquivo ainda não existe, exibe a caixa de diálogo de seleção de arquivo/pasta
		            JFileChooser fileChooser = new JFileChooser();
		            fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

		            int returnVal = fileChooser.showSaveDialog(frame);
		            if (returnVal == JFileChooser.APPROVE_OPTION) { //Se o usuário selecionou um arquivo
		                file = fileChooser.getSelectedFile();
		                if (!file.getName().endsWith(".txt")) { //Se o arquivo selecionado não é um arquivo de texto, adiciona a extensão .txt
		                    file = new File(file.getAbsolutePath() + ".txt");
		                }
		            } else { //Se o usuário cancelou a seleção do arquivo, retorna
		                return;
		            }
		        }

		        //Salva o conteúdo do editor no arquivo
		        try {
		            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		            writer.write(editor.getText());
		            writer.close();
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }

		        //Limpa a área para mensagens2
		        mensagem.setText("");

		        //Atualiza a barra de status4
		        txtpnPastanomeDoArquivo.setText("Arquivo " + file.getName() + " salvo");

		        //Mantém no editor o texto que está sendo editado
		        editor.requestFocus();
		    }
		});
		
		JButton btnNewButton_3 = new JButton("Copiar [ctrl-c]");
		btnNewButton_3.setBounds(0, 213, 150, 72);
		frame.getContentPane().add(btnNewButton_3);

		//Adicionando ActionListener ao botão "Copiar"
		btnNewButton_3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String selectedText = editor.getSelectedText(); //Obtém o texto selecionado no editor
		        if (selectedText != null && !selectedText.isEmpty()) {
		            //Copia o texto para a área de transferência do sistema
		            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(selectedText), null);
		        }
		    }
		});
		
		JButton btnNewButton_4 = new JButton("Colar [ctrl-v]");
		btnNewButton_4.setBounds(0, 285, 150, 72);
		frame.getContentPane().add(btnNewButton_4);

		//Adicionando ActionListener ao botão "Colar"
		btnNewButton_4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //Obtém a área de transferência do sistema
		        Transferable contents = clipboard.getContents(null);
		        if (contents != null && contents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
		            try {
		                String text = (String) contents.getTransferData(DataFlavor.stringFlavor); //Obtém o conteúdo atual da área de transferência
		                editor.paste(); //Cola o texto no editor
		            } catch (UnsupportedFlavorException | IOException ex) {
		                ex.printStackTrace();
		            }
		        }
		    }
		});
		
		JButton btnNewButton_5 = new JButton("Recortar [ctrl-x]");
		btnNewButton_5.setBounds(0, 355, 150, 72);
		frame.getContentPane().add(btnNewButton_5);

		//Adicionando ActionListener ao botão "Recortar"
		btnNewButton_5.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String selectedText = editor.getSelectedText(); //Obtém o texto selecionado no editor
		        if (selectedText != null && !selectedText.isEmpty()) {
		            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //Obtém a área de transferência do sistema
		            clipboard.setContents(new StringSelection(selectedText), null); //Copia o texto selecionado para a área de transferência do sistema
		            editor.cut(); //Recorta o texto selecionado do editor
		        }
		    }
		});
		
		
		JButton btnNewButton_6 = new JButton("Compilar [F7]");
		btnNewButton_6.setBounds(0, 426, 150, 72);
		frame.getContentPane().add(btnNewButton_6);

		//Adicionando ActionListener ao botão "Compilar"
		btnNewButton_6.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        //Exibindo mensagem na área para mensagens
		        mensagem.setText("A compilação de programas ainda não foi implementada.");
		    }
		});
		
		JButton btnNewButton_7 = new JButton("Equipe [F1]");
		btnNewButton_7.setBounds(0, 496, 150, 72);
		frame.getContentPane().add(btnNewButton_7);
		
		btnNewButton_7.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        //Exibindo mensagem na área para mensagens
		        mensagem.setText("Equipe: Thiago Vogt, Kelvin Leite, Felipe Bona");
		    }
		});
		
	}
}
