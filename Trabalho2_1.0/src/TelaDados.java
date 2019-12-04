import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;

public class TelaDados extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//Melhorando a aparencia
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
        	System.err.println(ex);
        } catch (InstantiationException ex) {
        	System.err.println(ex);
        } catch (IllegalAccessException ex) {
        	System.err.println(ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        	System.err.println(ex);
        }
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDados frame = new TelaDados();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaDados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBorder(UIManager.getBorder("Button.border"));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Dados_Cadastrados_At\u00E9_Agora"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(519);
		table.setBounds(28, 38, 387, 166);
		contentPane.add(table);
		
		JLabel lblAlunosCasdastrar = new JLabel("Alunos Casdastrados");
		lblAlunosCasdastrar.setFont(new Font("Century Schoolbook L", Font.BOLD, 18));
		lblAlunosCasdastrar.setBounds(122, 0, 199, 26);
		contentPane.add(lblAlunosCasdastrar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Aqui onde será chamado e emplementado o remover itens da coleç
			}
		});
		btnRemover.setFont(new Font("Bitstream Charter", Font.BOLD, 16));
		btnRemover.setBounds(301, 216, 114, 25);
		contentPane.add(btnRemover);
		
		JButton button_1 = new JButton("Retornar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//Retornando para a tela inicial
				TelaInicial tela3 = new TelaInicial();
				tela3.setVisible(true);
				setVisible(false);
			}
		});
		button_1.setFont(new Font("Bitstream Charter", Font.BOLD, 16));
		button_1.setBounds(175, 216, 114, 25);
		contentPane.add(button_1);
		
		JButton btnAtualizar = new JButton("Atualizar");//Atualizar dados da Jtable
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			}
		});
		btnAtualizar.setFont(new Font("Bitstream Charter", Font.BOLD, 16));
		btnAtualizar.setBounds(54, 216, 114, 25);
		contentPane.add(btnAtualizar);
	}
}
