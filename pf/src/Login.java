import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frmSigerSistema;
	private JFormattedTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmSigerSistema.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		MaskFormatter cpf = null;
		try {
			cpf = new MaskFormatter("###.###.###-##");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		frmSigerSistema = new JFrame();
		frmSigerSistema.setBackground(new Color(20, 50, 93));
		frmSigerSistema.getContentPane().setBackground(Color.WHITE);
		frmSigerSistema.setTitle("SIGER -  SISTEMA DE GERENCIAMENTO DE RESTAURANTES");
		frmSigerSistema.setSize(800, 800);
		frmSigerSistema.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmSigerSistema.setLocationRelativeTo(null);
		frmSigerSistema.setResizable(false);
		frmSigerSistema.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("CPF");
		lblNewLabel_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(243, 471, 70, 13);
		frmSigerSistema.getContentPane().add(lblNewLabel_1_1);
		
		textField = new JFormattedTextField("");
		textField.setFormatterFactory(new DefaultFormatterFactory(cpf));
		textField.setToolTipText(" ");
		textField.setColumns(10);
		textField.setBounds(323, 468, 254, 19);
		textField.addKeyListener(new KeyAdapter() {
			@SuppressWarnings("deprecation")
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					AdminsDAO adminsDAO = new AdminsDAO();
					if(adminsDAO.entrarNoSistemaVERDADEIRO(textField.getText().toString(), passwordField.getText().toString())==true) {
						if((adminsDAO.entrarNoSistema(textField.getText().toString(), passwordField.getText().toString())).equalsIgnoreCase("ADMINISTRADOR")){
							adminsDAO.inserirUltimoLogin(textField.getText().toString());
							frmSigerSistema.dispose();
							AreaAdmin.janelaCadastro();
						}
						else{
							frmSigerSistema.dispose();
							Atendentes.janelaAtendente();
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "CPF/senha incorretos!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
					}
				}
			}
		});
		frmSigerSistema.getContentPane().add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("SENHA");
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(243, 503, 70, 13);
		frmSigerSistema.getContentPane().add(lblNewLabel_1);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEntrar.setForeground(Color.BLACK);
		btnEntrar.setBackground(Color.WHITE);
		btnEntrar.setMnemonic(KeyEvent.VK_S);
		btnEntrar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				AdminsDAO adminsDAO = new AdminsDAO();
				if(adminsDAO.entrarNoSistemaVERDADEIRO(textField.getText().toString(), passwordField.getText().toString())==true) {
					if((adminsDAO.entrarNoSistema(textField.getText().toString(), passwordField.getText().toString())).equalsIgnoreCase("ADMINISTRADOR")){
						adminsDAO.inserirUltimoLogin(textField.getText().toString());
						frmSigerSistema.dispose();
						AreaAdmin.janelaCadastro();
					}
					else{
						frmSigerSistema.dispose();
						Atendentes.janelaAtendente();
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "CPF/senha incorretos!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		
		btnEntrar.addKeyListener(new KeyAdapter() {
			@SuppressWarnings("deprecation")
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					AdminsDAO adminsDAO = new AdminsDAO();
					if(adminsDAO.entrarNoSistemaVERDADEIRO(textField.getText().toString(), passwordField.getText().toString())==true) {
						if((adminsDAO.entrarNoSistema(textField.getText().toString(), passwordField.getText().toString())).equalsIgnoreCase("ADMINISTRADOR")){
							adminsDAO.inserirUltimoLogin(textField.getText().toString());
							frmSigerSistema.dispose();
							AreaAdmin.janelaCadastro();
						}
						else{
							frmSigerSistema.dispose();
							Atendentes.janelaAtendente();
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "CPF/senha incorretos!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
					}
				}
			}
		});
		btnEntrar.setBounds(243, 529, 334, 21);
		frmSigerSistema.getContentPane().add(btnEntrar);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBounds(323, 500, 254, 19);
		frmSigerSistema.getContentPane().add(passwordField);
		passwordField.addKeyListener(new KeyAdapter() {
			@SuppressWarnings("deprecation")
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					AdminsDAO adminsDAO = new AdminsDAO();
					if(adminsDAO.entrarNoSistemaVERDADEIRO(textField.getText().toString(), passwordField.getText().toString())==true) {
						if((adminsDAO.entrarNoSistema(textField.getText().toString(), passwordField.getText().toString())).equalsIgnoreCase("ADMINISTRADOR")){
							adminsDAO.inserirUltimoLogin(textField.getText().toString());
							frmSigerSistema.dispose();
							AreaAdmin.janelaCadastro();
						}
						else{
							frmSigerSistema.dispose();
							Atendentes.janelaAtendente();
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "CPF/senha incorretos!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
					}
				}
			}
		});
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("MOSTRAR SENHA");
		chckbxNewCheckBox.setForeground(Color.BLACK);
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setFont(new Font("Arial", Font.BOLD, 12));
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					passwordField.setEchoChar((char)0);
				}
				else {
					passwordField.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.addKeyListener(new KeyAdapter() {
			@SuppressWarnings("deprecation")
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					AdminsDAO adminsDAO = new AdminsDAO();
					if(adminsDAO.entrarNoSistemaVERDADEIRO(textField.getText().toString(), passwordField.getText().toString())==true) {
						if((adminsDAO.entrarNoSistema(textField.getText().toString(), passwordField.getText().toString())).equalsIgnoreCase("ADMINISTRADOR")){
							adminsDAO.inserirUltimoLogin(textField.getText().toString());
							frmSigerSistema.dispose();
							AreaAdmin.janelaCadastro();
						}
						else{
							frmSigerSistema.dispose();
							Atendentes.janelaAtendente();
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "CPF/senha incorretos!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
					}
				}
			}
		});
		chckbxNewCheckBox.setBounds(583, 499, 167, 21);
		frmSigerSistema.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\img.png"));
		lblNewLabel.setFont(new Font("Arial Narrow", Font.BOLD, 45));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 11, 774, 420);
		frmSigerSistema.getContentPane().add(lblNewLabel);
		
		JLabel lblAdequada = new JLabel("");
		lblAdequada.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdequada.setForeground(Color.WHITE);
		lblAdequada.setFont(new Font("Arial Narrow", Font.BOLD, 45));
		lblAdequada.setBounds(243, 161, 334, 223);
		frmSigerSistema.getContentPane().add(lblAdequada);
	}
}
