import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class Atendentes {

	private JFrame frame;
	private JTextField nomeCliente;
	private JTextField nomeDaMae;
	private JTextField nacionalidadeCliente;
	private JTextField naturalidadeCliente;
	private JTextField ruaCliente;
	private JTextField numeroCliente;
	private JTextField referenciaCliente;
	private JTextField tempoDeMoradiaCliente;
	private JTextField qtdCliente;
	private JTextField profissaoCliente;
	private JTextField outrasDoencasCliente;
	private JTextField obsCliente;
	private JTextField bairroCliente;
	private JTextField idGeradoCliente;
	private JTextField nomeBuscarCliente;
	private JTextField idCliente;
	private JTextField nomeCompletoDependente;
	private JTextField nomeSocialCliente;
	private JTable table;
	private JTable table_1;
	private JTextField nomeClienteSenhaPesquisar;
	private JTable table_2;
	private JTable table_3;
	private JTextField idadeDep;

	/**
	 * Launch the application.
	 */
	public static void janelaAtendente() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atendentes window = new Atendentes();
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
	public Atendentes() {
		UIManager.put("OptionPane.yesButtonText", "Sim"); 
		UIManager.put("OptionPane.noButtonText", "Não");
		UIManager.put("OptionPane.cancelButtonText", "Cancelar");
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize() {
		MaskFormatter cpf = null;
		MaskFormatter telefone = null;
		MaskFormatter rg = null;
		MaskFormatter cep = null;
		MaskFormatter dataNascimento = null;
		try {
			cpf = new MaskFormatter("###.###.###-##");
			telefone = new MaskFormatter("(##)#####-####");
			rg = new MaskFormatter("#######-#");
			cep = new MaskFormatter("#####-###");
			dataNascimento = new MaskFormatter("##/##/####");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
		frame = new JFrame();
		frame.setResizable(false);
		frame.setSize(818, 691); //818 691
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
			
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 800, 650);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setSize(800, 690); //690
		panel_1.setPreferredSize(new Dimension(800, 900)); //800, 900
		tabbedPane.addTab("CADASTRAR CLIENTES", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("NOME COMPLETO");
		lblNewLabel_2.setBounds(10, 35, 160, 13);
		panel_1.add(lblNewLabel_2);
		
		nomeCliente = new JTextField();
		nomeCliente.setBounds(150, 32, 250, 19);
		nomeCliente.setColumns(10);
		panel_1.add(nomeCliente);
		
		JComboBox corCliente = new JComboBox();
		corCliente.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA A OP\u00C7\u00C3O ", "BRANCO", "PARDO", "PRETO ", "AMARELO", "IND\u00CDGENA", "N\u00C3O DECLARADO"}));
		corCliente.setBounds(495, 66, 125, 21);
		panel_1.add(corCliente);
		
		JLabel lblNewLabel_3 = new JLabel("NOME DA M\u00C3E");
		lblNewLabel_3.setBounds(410, 35, 160, 13);
		panel_1.add(lblNewLabel_3);
		
		nomeDaMae = new JTextField();
		nomeDaMae.setBounds(525, 32, 220, 19);
		nomeDaMae.setColumns(10);
		panel_1.add(nomeDaMae);
		
		JLabel lblNewLabel_4 = new JLabel("TELEFONE");
		lblNewLabel_4.setBounds(10, 105, 160, 13);
		panel_1.add(lblNewLabel_4);
		
		JFormattedTextField telefoneCliente = new JFormattedTextField(telefone);
		telefoneCliente.setBounds(150, 102, 125, 19);
		panel_1.add(telefoneCliente);
		
		JLabel lblNewLabel_5 = new JLabel("ANO DE NASCIMENTO");
		lblNewLabel_5.setBounds(10, 140, 160, 13);
		panel_1.add(lblNewLabel_5);
		
		JFormattedTextField dataNascimentoCliente = new JFormattedTextField(dataNascimento);
		dataNascimentoCliente.setBounds(150, 137, 125, 19);
		panel_1.add(dataNascimentoCliente);
		
		JLabel lblNewLabel_11 = new JLabel("G\u00CANERO");
		lblNewLabel_11.setBounds(299, 140, 79, 13);
		panel_1.add(lblNewLabel_11);
		
		JComboBox generoCliente = new JComboBox();
		generoCliente.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA A OP\u00C7\u00C3O ", "MASCULINO", "FEMININO", "OUTROS"}));
		generoCliente.setBounds(370, 136, 125, 21);
		panel_1.add(generoCliente);
		
		JLabel lblNewLabel_11_1 = new JLabel("ESTADO CIV.");
		lblNewLabel_11_1.setBounds(525, 140, 79, 13);
		panel_1.add(lblNewLabel_11_1);
		
		JComboBox estadoCivilCliente = new JComboBox();
		estadoCivilCliente.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA A OP\u00C7\u00C3O ", "SOLTEIRO", "CASADO", "DIVORCIADO", "VI\u00DAVO", "UNI\u00C3O EST\u00C1VEL"}));
		estadoCivilCliente.setBounds(620, 136, 125, 21);
		panel_1.add(estadoCivilCliente);
		
		JLabel lblNewLabel_6 = new JLabel("RG");
		lblNewLabel_6.setBounds(10, 175, 160, 13);
		panel_1.add(lblNewLabel_6);
		
		JFormattedTextField rgCliente = new JFormattedTextField(rg);
		rgCliente.setBounds(150, 172, 125, 19);
		panel_1.add(rgCliente);
		
		JLabel lblNewLabel_7 = new JLabel("CPF");
		lblNewLabel_7.setBounds(10, 210, 45, 13);
		panel_1.add(lblNewLabel_7);
		
		JFormattedTextField cpfCliente = new JFormattedTextField(cpf);
		cpfCliente.setBounds(150, 207, 125, 19);
		panel_1.add(cpfCliente);
		
		JLabel lblNewLabel_8 = new JLabel("NACIONALIDADE");
		lblNewLabel_8.setBounds(10, 245, 125, 13);
		panel_1.add(lblNewLabel_8);
		
		nacionalidadeCliente = new JTextField();
		nacionalidadeCliente.setBounds(150, 242, 125, 19);
		nacionalidadeCliente.setColumns(10);
		panel_1.add(nacionalidadeCliente);
		
		JLabel lblNewLabel_9 = new JLabel("NATURALIDADE");
		lblNewLabel_9.setBounds(10, 280, 125, 13);
		panel_1.add(lblNewLabel_9);
		
		naturalidadeCliente = new JTextField();
		naturalidadeCliente.setBounds(150, 277, 125, 19);
		naturalidadeCliente.setColumns(10);
		panel_1.add(naturalidadeCliente);
		
		JLabel lblNewLabel_10 = new JLabel("NIS");
		lblNewLabel_10.setBounds(10, 315, 45, 13);
		panel_1.add(lblNewLabel_10);
		
		JFormattedTextField nisCliente = new JFormattedTextField();
		nisCliente.setBounds(150, 312, 125, 19);
		panel_1.add(nisCliente);
		
		JLabel lblNewLabel_11_2 = new JLabel("COR");
		lblNewLabel_11_2.setBounds(410, 70, 79, 13);
		panel_1.add(lblNewLabel_11_2);
		
		JLabel lblNewLabel_12 = new JLabel("CEP");
		lblNewLabel_12.setBounds(300, 179, 125, 13);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("BAIRRO");
		lblNewLabel_13.setBounds(525, 179, 125, 13);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("RUA");
		lblNewLabel_14.setBounds(299, 214, 125, 13);
		panel_1.add(lblNewLabel_14);
		
		JFormattedTextField cepCliente = new JFormattedTextField(cep);
		cepCliente.setBounds(370, 172, 125, 19);
		panel_1.add(cepCliente);
		
		ruaCliente = new JTextField();
		ruaCliente.setBounds(370, 211, 208, 19);
		panel_1.add(ruaCliente);
		ruaCliente.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("N\u00B0");
		lblNewLabel_15.setBounds(588, 214, 45, 13);
		panel_1.add(lblNewLabel_15);
		
		numeroCliente = new JTextField();
		numeroCliente.setBounds(620, 211, 125, 19);
		panel_1.add(numeroCliente);
		numeroCliente.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("REF.");
		lblNewLabel_16.setBounds(299, 249, 101, 13);
		panel_1.add(lblNewLabel_16);
		
		referenciaCliente = new JTextField();
		referenciaCliente.setBounds(370, 246, 375, 19);
		panel_1.add(referenciaCliente);
		referenciaCliente.setColumns(10);
		
		JLabel lblTempoDeMoradia = new JLabel("TEMPO DE MORADIA");
		lblTempoDeMoradia.setBounds(299, 280, 176, 13);
		panel_1.add(lblTempoDeMoradia);
		
		tempoDeMoradiaCliente = new JTextField();
		tempoDeMoradiaCliente.setBounds(430, 277, 96, 19);
		panel_1.add(tempoDeMoradiaCliente);
		tempoDeMoradiaCliente.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("ESCOLARIDADE");
		lblNewLabel_17.setBounds(299, 315, 126, 13);
		panel_1.add(lblNewLabel_17);
		
		JComboBox escolaridadeCliente = new JComboBox();
		escolaridadeCliente.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA A OP\u00C7\u00C3O ", "ENSINO FUNDAMENTAL INCOMPLETO", "ENSINO FUNDAMENTAL COMPLETO", "ENSINO M\u00C9DIO INCOMPLETO", "ENSINO M\u00C9DIO COMPLETO", "ENSINO SUPERIOR INCOMPLETO", "ENSINO SUPERIOR COMPLETO"}));
		escolaridadeCliente.setBounds(430, 311, 315, 21);
		panel_1.add(escolaridadeCliente);
		
		JLabel lblNewLabel_18 = new JLabel("RENDA PER CAPITA");
		lblNewLabel_18.setBounds(10, 350, 125, 13);
		panel_1.add(lblNewLabel_18);
		
		JComboBox rendaCliente = new JComboBox();
		rendaCliente.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA A OP\u00C7\u00C3O ", "0 A 89,00", "89,01 A 178,00", "178,01 A MEIO SAL\u00C1RIO", "ACIMA DE MEIO SAL\u00C1RIO", "RENDA DE 1 SAL\u00C1RIO", "RENDA DE 1 A 2 SAL\u00C1RIOS", "RENDA DE 2 A 3 SAL\u00C1RIOS"}));
		rendaCliente.setBounds(150, 346, 125, 21);
		panel_1.add(rendaCliente);
		
		JLabel lblNewLabel_19 = new JLabel("PROGRAMAS SOCI.");
		lblNewLabel_19.setBounds(299, 350, 125, 13);
		panel_1.add(lblNewLabel_19);
		
		JComboBox programasCliente = new JComboBox();
		programasCliente.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA A OP\u00C7\u00C3O ", "BOLSA FAM\u00CDLIA", "AUX\u00CDLIO DOEN\u00C7A", "SEGURO DESEMPREGO", "CADASRO \u00DANICO DO GOVERNO FEDERAL", "BPC / IDOSO", "BPC / PCD", "APOSENTADO"}));
		programasCliente.setBounds(430, 346, 315, 21);
		panel_1.add(programasCliente);
		
		JLabel lblNewLabel_20 = new JLabel("EMPREGO");
		lblNewLabel_20.setBounds(10, 385, 101, 13);
		panel_1.add(lblNewLabel_20);
		
		JComboBox empregoCliente = new JComboBox();
		empregoCliente.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA A OP\u00C7\u00C3O ", "CLT", "CONTRATO", "TEMPOR\u00C1RIO", "DESEMPREGADO", "AUT\u00D4NOMO"}));
		empregoCliente.setBounds(150, 381, 125, 21);
		panel_1.add(empregoCliente);
		
		qtdCliente = new JTextField();
		qtdCliente.setBounds(530, 382, 103, 19);
		panel_1.add(qtdCliente);
		qtdCliente.setColumns(10);
		
		JLabel lblNewLabel_22 = new JLabel("QTD. DE PESSOAS TRABALHANDO");
		lblNewLabel_22.setBounds(299, 385, 208, 13);
		panel_1.add(lblNewLabel_22);
		
		JLabel lblNewLabel_21 = new JLabel("PROFISS\u00C3O DO RESPONS\u00C1VEL FAMILIAR");
		lblNewLabel_21.setBounds(10, 420, 265, 13);
		panel_1.add(lblNewLabel_21);
		
		profissaoCliente = new JTextField();
		profissaoCliente.setBounds(299, 417, 279, 19);
		panel_1.add(profissaoCliente);
		profissaoCliente.setColumns(10);
		
		JLabel lblNewLabel_23 = new JLabel("COMPOSI\u00C7\u00C3O FAMILIAR");
		lblNewLabel_23.setBounds(10, 455, 160, 13);
		panel_1.add(lblNewLabel_23);
		
		JComboBox composicaoCliente = new JComboBox();
		composicaoCliente.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA A OP\u00C7\u00C3O ", "MORA SOZINHO", "2 A 3 PESSOAS", "4 A 7 PESSOAS", "8 A 10 PESSOAS", "ACIMA DE 10 PESSOAS"}));
		composicaoCliente.setBounds(180, 451, 160, 21);
		panel_1.add(composicaoCliente);
		
		JLabel lblNewLabel_24 = new JLabel("MORADIA");
		lblNewLabel_24.setBounds(370, 455, 96, 13);
		panel_1.add(lblNewLabel_24);
		
		JComboBox moradiaCliente = new JComboBox();
		moradiaCliente.setModel(new DefaultComboBoxModel(new String[] {"SELECIONE O TIPO DE MORADIA", "PR\u00D3PRIA", "ALUGADA", "CEDIDA", "OCUPADA"}));
		moradiaCliente.setBounds(475, 451, 103, 21);
		panel_1.add(moradiaCliente);
		
		JLabel lblNewLabel_25 = new JLabel("ESTRUTURA DA MORADIA");
		lblNewLabel_25.setBounds(10, 490, 160, 13);
		panel_1.add(lblNewLabel_25);
		
		JComboBox estruturaCliente = new JComboBox();
		estruturaCliente.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA A OP\u00C7\u00C3O ", "ALVENARIA", "MADEIRA", "MISTA (MADEIRA/ALVENARIA)", "PALAFITA"}));
		estruturaCliente.setBounds(180, 486, 160, 21);
		panel_1.add(estruturaCliente);
		
		JLabel lblNewLabel_26 = new JLabel("POSSUI LIXO DOMICILIAR/COLETA?");
		lblNewLabel_26.setBounds(370, 490, 208, 13);
		panel_1.add(lblNewLabel_26);
		
		JComboBox lixoColetaCliente = new JComboBox();
		lixoColetaCliente.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA A OP\u00C7\u00C3O ", "N\u00C3O", "SIM"}));
		lixoColetaCliente.setBounds(588, 486, 157, 21);
		panel_1.add(lixoColetaCliente);
		
		JLabel lblNewLabel_27 = new JLabel("POSSUI \u00C1GUA ENCANADA?");
		lblNewLabel_27.setBounds(10, 525, 208, 13);
		panel_1.add(lblNewLabel_27);
		
		JComboBox aguaCliente = new JComboBox();
		aguaCliente.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA A OP\u00C7\u00C3O ", "REDE GERAL", "PO\u00C7O"}));
		aguaCliente.setBounds(180, 521, 160, 21);
		panel_1.add(aguaCliente);
		
		JLabel lblNewLabel_28 = new JLabel("POSSUI ENERGIA EL\u00C9TRICA?");
		lblNewLabel_28.setBounds(370, 525, 208, 13);
		panel_1.add(lblNewLabel_28);
		
		JComboBox energiaCliente = new JComboBox();
		energiaCliente.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA A OP\u00C7\u00C3O", "N\u00C3O", "SIM SEM MEDIDOR", "SIM COM MEDIDOR"}));
		energiaCliente.setBounds(588, 521, 157, 21);
		panel_1.add(energiaCliente);
		
		JLabel lblNewLabel_29 = new JLabel("ESCOAMENTO SANIT\u00C1RIO?");
		lblNewLabel_29.setBounds(10, 560, 191, 13);
		panel_1.add(lblNewLabel_29);
		
		JComboBox escoamentoCliente = new JComboBox();
		escoamentoCliente.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA A OP\u00C7\u00C3O", "REDE COLETORA DE ESGOTO OU FLUVIAL", "FOSSA S\u00C9PTICA"}));
		escoamentoCliente.setBounds(180, 556, 160, 21);
		panel_1.add(escoamentoCliente);
		
		JLabel lblNewLabel_30 = new JLabel("FREQUENTA CENTRO DE CONVIV\u00CANCIA?");
		lblNewLabel_30.setBounds(370, 560, 263, 13);
		panel_1.add(lblNewLabel_30);
		
		JComboBox centroCliente = new JComboBox();
		centroCliente.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA A OP\u00C7\u00C3O ", "N\u00C3O", "SIM"}));
		centroCliente.setBounds(643, 556, 102, 21);
		panel_1.add(centroCliente);
		
		JLabel lblNewLabel_31 = new JLabel("POSSUI ALGUMA DOEN\u00C7A?");
		lblNewLabel_31.setBounds(10, 595, 208, 13);
		panel_1.add(lblNewLabel_31);
		
		JComboBox doencasCliente = new JComboBox();
		doencasCliente.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA A OP\u00C7\u00C3O ", "N\u00C3O", "HIPERTENS\u00C3O", "C\u00C2NCER", "DIABETES", "OUTRAS"}));
		doencasCliente.setBounds(180, 591, 160, 21);
		panel_1.add(doencasCliente);
		
		JLabel lblNewLabel_32 = new JLabel("OUTRAS DOEN\u00C7AS?");
		lblNewLabel_32.setBounds(370, 595, 156, 13);
		panel_1.add(lblNewLabel_32);
		
		outrasDoencasCliente = new JTextField();
		outrasDoencasCliente.setBounds(510, 592, 235, 19);
		panel_1.add(outrasDoencasCliente);
		outrasDoencasCliente.setColumns(10);
		
		JLabel lblNewLabel_33 = new JLabel("DEFICI\u00CANCIA?");
		lblNewLabel_33.setBounds(10, 630, 101, 13);
		panel_1.add(lblNewLabel_33);
		
		JComboBox deficienciaCliente = new JComboBox();
		deficienciaCliente.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA A OP\u00C7\u00C3O ", "N\u00C3O", "SIM"}));
		deficienciaCliente.setBounds(121, 626, 142, 21);
		panel_1.add(deficienciaCliente);
		
		JLabel lblNewLabel_34 = new JLabel("LAUDO?");
		lblNewLabel_34.setBounds(299, 630, 79, 13);
		panel_1.add(lblNewLabel_34);
		
		JComboBox laudoCliente = new JComboBox();
		laudoCliente.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA A OP\u00C7\u00C3O ", "N\u00C3O", "SIM"}));
		laudoCliente.setBounds(370, 626, 96, 21);
		panel_1.add(laudoCliente);
		
		JLabel lblNewLabel_35 = new JLabel("JUSTIFICATIVA DEFICI\u00CANCIA");
		lblNewLabel_35.setBounds(10, 665, 191, 13);
		panel_1.add(lblNewLabel_35);
		
		JComboBox justificaCliente = new JComboBox();
		justificaCliente.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA A OP\u00C7\u00C3O ", "MENTAL", "VISUAL", "F\u00CDSICA", "AUDITIVA"}));
		justificaCliente.setBounds(180, 657, 160, 21);
		panel_1.add(justificaCliente);
		
		JLabel lblNewLabel_36 = new JLabel("OBSERVA\u00C7\u00C3O");
		lblNewLabel_36.setBounds(370, 665, 125, 13);
		panel_1.add(lblNewLabel_36);
		
		obsCliente = new JTextField();
		obsCliente.setBounds(510, 662, 235, 19);
		panel_1.add(obsCliente);
		obsCliente.setColumns(10);
		
		idGeradoCliente = new JTextField();
		idGeradoCliente.setEditable(false);
		idGeradoCliente.setBounds(121, 697, 142, 19);
		panel_1.add(idGeradoCliente);
		idGeradoCliente.setColumns(10);
		
		JButton btnCadastrarSemDependentes = new JButton("CADASTRAR");
		btnCadastrarSemDependentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(dataNascimentoCliente.getText().equalsIgnoreCase("") || nomeCliente.getText().equalsIgnoreCase("")) {
					JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
				}
				else {
					//System.out.println(Integer.parseInt(dataNascimentoCliente.getText().substring(6, 10)));
					Integer idade = ((2021)-(Integer.parseInt(dataNascimentoCliente.getText().substring(6, 10))));
					String idadeFormatada = (""+idade+"");
					
					if(nomeSocialCliente.getText().equalsIgnoreCase("")) {
						nomeSocialCliente.setText(nomeCliente.getText());
					}
					
					Clientes cliente = new Clientes("NULL",
							nomeCliente.getText(),
							nomeSocialCliente.getText(),
							corCliente.getSelectedItem().toString(),
							nomeDaMae.getText(),
							telefoneCliente.getText(),
							dataNascimentoCliente.getText(),
							idadeFormatada.toString(),
							generoCliente.getSelectedItem().toString(),
							estadoCivilCliente.getSelectedItem().toString(),
							rgCliente.getText(),
							cpfCliente.getText(),
							cepCliente.getText(),
							bairroCliente.getText(),
							ruaCliente.getText(),
							numeroCliente.getText(),
							referenciaCliente.getText(),
							nacionalidadeCliente.getText(),
							naturalidadeCliente.getText(),
							tempoDeMoradiaCliente.getText(),
							nisCliente.getText().toString(),
							
							escolaridadeCliente.getSelectedItem().toString(),
							rendaCliente.getSelectedItem().toString(),
							programasCliente.getSelectedItem().toString(),
							empregoCliente.getSelectedItem().toString(),
							qtdCliente.getText(),
							profissaoCliente.getText(),
							composicaoCliente.getSelectedItem().toString(),
							moradiaCliente.getSelectedItem().toString(),
							estruturaCliente.getSelectedItem().toString(),
							lixoColetaCliente.getSelectedItem().toString(),
							aguaCliente.getSelectedItem().toString(),
							energiaCliente.getSelectedItem().toString(),
							escoamentoCliente.getSelectedItem().toString(),
							centroCliente.getSelectedItem().toString(),
							
							doencasCliente.getSelectedItem().toString(),
							outrasDoencasCliente.getText(),
							deficienciaCliente.getSelectedItem().toString(),
							laudoCliente.getSelectedItem().toString(),
							justificaCliente.getSelectedItem().toString(),
							obsCliente.getText()
							);
					
					AdminsDAO adminsDAO = new AdminsDAO();
					
					if(nomeCliente.getText().equalsIgnoreCase("") && dataNascimentoCliente.getText().equalsIgnoreCase("")) {
						JOptionPane.showMessageDialog(null, "N�o foi poss�vel cadastrar o cliente, reveja as informa��es!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
					}
					else if(adminsDAO.adicionarCliente(cliente)) {
						JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
						nomeCliente.setText("");
						nomeSocialCliente.setText("");
						nomeDaMae.setText("");
						bairroCliente.setText("");
						ruaCliente.setText("");
						numeroCliente.setText("");
						referenciaCliente.setText("");
						nacionalidadeCliente.setText("");
						naturalidadeCliente.setText("");
						tempoDeMoradiaCliente.setText("");
						qtdCliente.setText("");
						profissaoCliente.setText("");
						outrasDoencasCliente.setText("");
						obsCliente.setText("");
						telefoneCliente.setText("");
						dataNascimentoCliente.setText("");
						rgCliente.setText("");
						cpfCliente.setText("");
						cepCliente.setText("");
						nisCliente.setText("");
						adminsDAO.inserirClientesCadastrados();
					}
					else {
						JOptionPane.showMessageDialog(null, "N�o foi poss�vel cadastrar o cliente, reveja as informa��es!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
					}
				}
			}
		});
		btnCadastrarSemDependentes.setBounds(265, 746, 261, 21);
		panel_1.add(btnCadastrarSemDependentes);
		
		bairroCliente = new JTextField();
		bairroCliente.setBounds(620, 171, 125, 20);
		panel_1.add(bairroCliente);
		bairroCliente.setColumns(10);
		
		JLabel lblNewLabel_37 = new JLabel("ID GERADO");
		lblNewLabel_37.setBounds(10, 700, 101, 13);
		panel_1.add(lblNewLabel_37);
		
		JScrollPane scrollPane = new JScrollPane(panel_1);
		
		JLabel lblNewLabel_41 = new JLabel("NOME SOCIAL");
		lblNewLabel_41.setBounds(10, 70, 99, 13);
		panel_1.add(lblNewLabel_41);
		
		nomeSocialCliente = new JTextField();
		nomeSocialCliente.setBounds(150, 67, 250, 19);
		panel_1.add(nomeSocialCliente);
		nomeSocialCliente.setColumns(10);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		tabbedPane.addTab("CADASTRAR CLIENTES", null, scrollPane, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("CADASTRAR DEPENDENTES", null, panel_2, null);
		panel_2.setLayout(null);
		
		nomeBuscarCliente = new JTextField();
		nomeBuscarCliente.setBounds(218, 59, 412, 19);
		panel_2.add(nomeBuscarCliente);
		nomeBuscarCliente.setColumns(10);
		
		JLabel lblNewLabel_38 = new JLabel("NOME RESPONS\u00C1VEL");
		lblNewLabel_38.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_38.setBounds(218, 36, 320, 13);
		panel_2.add(lblNewLabel_38);
		
		JButton btnNewButton = new JButton("PESQUISAR");
		btnNewButton.setBounds(640, 58, 145, 21);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*AdminsDAO adminsDAO = new AdminsDAO();
				idCliente.setText(""+adminsDAO.listarIDClientes(nomeCliente.getText().toString())+"");*/
				//DefaultTableModel dtmTabela = (DefaultTableModel) table.getModel();
				//Object[] dados = {nomeBuscarCliente.getText(), nomeBuscarCliente.getText()};
				//dtmTabela.addRow(dados);
				readTable(nomeBuscarCliente.getText());
			}
		});
		panel_2.add(btnNewButton);
		
		idCliente = new JTextField();
		idCliente.setEditable(false);
		idCliente.setBounds(218, 369, 96, 19);
		panel_2.add(idCliente);
		idCliente.setColumns(10);
				
		JLabel lblNewLabel_39 = new JLabel("ID");
		lblNewLabel_39.setBounds(218, 346, 96, 13);
		panel_2.add(lblNewLabel_39);
		
		nomeCompletoDependente = new JTextField();
		nomeCompletoDependente.setBounds(324, 369, 214, 19);
		panel_2.add(nomeCompletoDependente);
		nomeCompletoDependente.setColumns(10);
		
		JLabel lblNewLabel_40 = new JLabel("NOME COMPLETO");
		lblNewLabel_40.setBounds(324, 346, 152, 13);
		panel_2.add(lblNewLabel_40);
		
		JComboBox gene = new JComboBox();
		gene.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA A OP\u00C7\u00C3O", "MASCULINO", "FEMININO"}));
		gene.setBounds(640, 368, 145, 21);
		panel_2.add(gene);
		
		JComboBox deficienciaDependente = new JComboBox();
		deficienciaDependente.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA A OP\u00C7\u00C3O", "N\u00C3O", "SIM"}));
		deficienciaDependente.setBounds(218, 420, 165, 21);
		panel_2.add(deficienciaDependente);
		
		JLabel lblNewLabel_50 = new JLabel("DEPEND\u00CANCIA");
		lblNewLabel_50.setBounds(393, 398, 145, 13);
		panel_2.add(lblNewLabel_50);
		
		JComboBox dependencia = new JComboBox();
		dependencia.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA A OP\u00C7\u00C3O", "C\u00D4NJUGE", "UNI\u00C3O EST\u00C1VEL", "FILHO/ENTEADO", "IRM\u00C3O", "AV\u00D3", "TUTORANDO", "INCAPAZ", "AGREGADO"}));
		dependencia.setBounds(393, 420, 145, 21);
		panel_2.add(dependencia);
		
		JButton btnNewButton_1 = new JButton("ADICIONAR");
		btnNewButton_1.setBounds(640, 454, 145, 21);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(idCliente.getText().isEmpty() || nomeCompletoDependente.getText().isEmpty() || idadeDep.getText().isEmpty() || gene.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O") || deficienciaDependente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O")) {
					JOptionPane.showMessageDialog(null, "N�o foi poss�vel cadastrar o dependente, reveja as informa��es!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
				}
				else {
					Dependentes dependente = new Dependentes(idCliente.getText(), nomeCompletoDependente.getText().toString(), idadeDep.getText().toString(), gene.getSelectedItem().toString(), deficienciaDependente.getSelectedItem().toString(), dependencia.getSelectedItem().toString());
					AdminsDAO adminsDAO = new AdminsDAO();
					adminsDAO.adicionarDependentes(dependente);
					readTableDep(table.getValueAt(table.getSelectedRow(), 0).toString());
					JOptionPane.showMessageDialog(null, "Dependente cadastrado com sucesso!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
					nomeCompletoDependente.setText("");
					idadeDep.setText("");
				}
			}
		});
		panel_2.add(btnNewButton_1);
		
		JLabel lblNewLabel_42 = new JLabel("IDADE");
		lblNewLabel_42.setBounds(548, 345, 46, 14);
		panel_2.add(lblNewLabel_42);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(218, 89, 412, 198);
		panel_2.add(scrollPane_1);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				idCliente.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
				readTableDep(table.getValueAt(table.getSelectedRow(), 0).toString());
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"ID", "NOME"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(202);
		scrollPane_1.setViewportView(table);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(218, 451, 412, 162);
		panel_2.add(scrollPane_2);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"ID", "NOME DO DEPENDENTE"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_1.getColumnModel().getColumn(0).setPreferredWidth(25);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(202);
		scrollPane_2.setViewportView(table_1);
		
		JLabel lblNewLabel_43 = new JLabel("ADICIONAR DEPENDENTE");
		lblNewLabel_43.setBounds(218, 323, 320, 13);
		panel_2.add(lblNewLabel_43);
		
		JLabel lblNewLabel_44 = new JLabel("PESQUISAR O CLIENTE RESPONS\u00C1VEL");
		lblNewLabel_44.setBounds(218, 10, 376, 13);
		panel_2.add(lblNewLabel_44);
		
		JTextArea txtrPassoP = new JTextArea();
		txtrPassoP.setForeground(SystemColor.controlDkShadow);
		txtrPassoP.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtrPassoP.setText("PASSO 1: Pesquise \r\no nome do respons\u00E1vel \r\ntitular no campo \r\nindicado \"NOME \r\nRESPONS\u00C1VEL\"e clique \r\nem \"PESQUISAR\".\r\n\r\nPASSO 2: Clique no\r\nID referente ao \r\nrespons\u00E1vel pesquisado. \r\nVoc\u00EA ver\u00E1 que esse ID\r\nfoi adicionado ao campo\r\n\"ID\".\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nPASSO 3: Adicione o \r\nnome e a idade nos \r\ncampos \"NOME,\r\nDEPENDENTE\", \"IDADE\",\r\n\"G\u00CANERO\" e \"DEFICI\u00CANCIA\" \r\nrespectivamente. Por\r\nfim clique em \r\n\"ADICIONAR\", para \r\ncadastrar o dependente.");
		txtrPassoP.setBackground(SystemColor.control);
		txtrPassoP.setEditable(false);
		txtrPassoP.setBounds(10, 10, 152, 603);
		panel_2.add(txtrPassoP);
		
		idadeDep = new JTextField();
		idadeDep.setBounds(548, 369, 82, 19);
		panel_2.add(idadeDep);
		idadeDep.setColumns(10);
					
		JLabel lblNewLabel_48 = new JLabel("G\u00CANERO");
		lblNewLabel_48.setBounds(640, 346, 145, 13);
		panel_2.add(lblNewLabel_48);
		
		JLabel lblNewLabel_49 = new JLabel("POSSUI DEFICI\u00CANCIA?");
		lblNewLabel_49.setBounds(218, 398, 165, 13);
		panel_2.add(lblNewLabel_49);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("GERAR SENHA", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_45 = new JLabel("PESQUISAR CLIENTE");
		lblNewLabel_45.setBounds(159, 10, 291, 13);
		panel_3.add(lblNewLabel_45);
		
		JLabel lblNewLabel_46 = new JLabel("NOME DO CLIENTE");
		lblNewLabel_46.setBounds(159, 33, 244, 13);
		panel_3.add(lblNewLabel_46);
		
		nomeClienteSenhaPesquisar = new JTextField();
		nomeClienteSenhaPesquisar.setBounds(159, 56, 480, 19);
		panel_3.add(nomeClienteSenhaPesquisar);
		nomeClienteSenhaPesquisar.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("PESQUISAR");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(nomeClienteSenhaPesquisar.getText().toString().equalsIgnoreCase("")) {
					JOptionPane.showMessageDialog(null, "Insira o nome do respons�vel antes de clicar em PESQUISAR.", "Mensagem", JOptionPane.PLAIN_MESSAGE);
					DefaultTableModel modelo2 = (DefaultTableModel) table_2.getModel();
					modelo2.setNumRows(0);
				}
				else {
					DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
					Date date = new Date(); 
					
					AdminsDAO adminsDAO = new AdminsDAO();
					
					if(adminsDAO.checarRelatorios(dateFormat.format(date))==true) {
						JOptionPane.showMessageDialog(null, "O expediente de hoje j� foi encerrado!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
					}
					
					else {
						readTableSenha(nomeClienteSenhaPesquisar.getText());
						//AdminsDAO adminsDAO = new AdminsDAO();
						adminsDAO.deleteCED();
						DefaultTableModel modelo2 = (DefaultTableModel) table_3.getModel();
						modelo2.setNumRows(0);
					}
				}
			}
		});
		btnNewButton_2.setBounds(649, 55, 136, 21);
		panel_3.add(btnNewButton_2);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(159, 85, 480, 156);
		panel_3.add(scrollPane_3);
		
		table_2 = new JTable();
		table_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AdminsDAO adminsDAO = new AdminsDAO();
				if(adminsDAO.checarBL(table_2.getValueAt(table_2.getSelectedRow(), 1).toString())) {
					JOptionPane.showMessageDialog(null, "Este cliente j� comprou senha neste dia!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
				}
				else {
					if(adminsDAO.checarCliente(table_2.getValueAt(table_2.getSelectedRow(), 1).toString())==1) {
						adminsDAO.inserirClienteCED(table_2.getValueAt(table_2.getSelectedRow(), 1).toString());
						readTableCED(table_2.getValueAt(table_2.getSelectedRow(), 1).toString());
						DefaultTableModel dtm = (DefaultTableModel) table_2.getModel();
						dtm.removeRow(table_2.getSelectedRow());
						table_2.setModel(dtm);
					}
					else {
						adminsDAO.inserirDependenteCED(table_2.getValueAt(table_2.getSelectedRow(), 1).toString());
						readTableCED(table_2.getValueAt(table_2.getSelectedRow(), 1).toString());
						DefaultTableModel dtm = (DefaultTableModel) table_2.getModel();
						dtm.removeRow(table_2.getSelectedRow());
						table_2.setModel(dtm);
					}
				}
			}
		});
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"ID", "NOME COMPLETO", "IDADE"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_2.getColumnModel().getColumn(1).setPreferredWidth(303);
		scrollPane_3.setViewportView(table_2);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(159, 309, 480, 304);
		panel_3.add(scrollPane_4);
		
		table_3 = new JTable();
		table_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AdminsDAO adminsDAO = new AdminsDAO();
				DefaultTableModel dtm = (DefaultTableModel) table_3.getModel();
				DefaultTableModel dtmtable2 = (DefaultTableModel) table_2.getModel();
				dtmtable2.addRow(new Object[] {
					table_3.getValueAt(table_3.getSelectedRow(), 0).toString(),
					table_3.getValueAt(table_3.getSelectedRow(), 1).toString(),
					table_3.getValueAt(table_3.getSelectedRow(), 2).toString()
					});
				adminsDAO.deleteCEDporNome(table_3.getValueAt(table_3.getSelectedRow(), 1).toString());
				dtm.removeRow(table_3.getSelectedRow());
			}
		});
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"ID", "NOME COMPLETO", "IDADE"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_3.getColumnModel().getColumn(1).setPreferredWidth(202);
		scrollPane_4.setViewportView(table_3);
		
		JLabel lblNewLabel_47 = new JLabel("CLIENTES SELECIONADOS");
		lblNewLabel_47.setBounds(159, 286, 244, 13);
		panel_3.add(lblNewLabel_47);
		
		JButton btnNewButton_3 = new JButton("GERAR SENHA");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdminsDAO adminsDAO = new AdminsDAO();
				
				if(adminsDAO.retornarUltimaSenha()<400) {
					for(int i = 0; i < table_3.getRowCount(); i++) {
						
						if(adminsDAO.retornarUltimaSenha()<400) {
							adminsDAO.inserirNaBl(table_3.getValueAt(i, 1).toString());
							adminsDAO.inserirNaSenhaGerada(table_3.getValueAt(i, 1).toString());
						}
						//adminsDAO.inserirNaBl(table_3.getValueAt(i, 1).toString());
						//adminsDAO.inserirNaSenhaGerada(table_3.getValueAt(i, 1).toString());
					}
					adminsDAO.escreverNoTXT(adminsDAO.lerBdSenha());
					adminsDAO.deleteCED();
					DefaultTableModel modelo = (DefaultTableModel) table_3.getModel();
					modelo.setNumRows(0);
					adminsDAO.deletarSenhaGerada();
					DefaultTableModel modelo2 = (DefaultTableModel) table_2.getModel();
					modelo2.setNumRows(0);
					nomeClienteSenhaPesquisar.setText("");
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Senhas encerradas!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
				}
				
				
				/*for(int i = 0; i < table_3.getRowCount(); i++) {
					
					if(adminsDAO.retornarUltimaSenha()<3) {
						adminsDAO.inserirNaBl(table_3.getValueAt(i, 1).toString());
						adminsDAO.inserirNaSenhaGerada(table_3.getValueAt(i, 1).toString());
					}
					//adminsDAO.inserirNaBl(table_3.getValueAt(i, 1).toString());
					//adminsDAO.inserirNaSenhaGerada(table_3.getValueAt(i, 1).toString());
				}
				adminsDAO.escreverNoTXT(adminsDAO.lerBdSenha());
				adminsDAO.deleteCED();
				DefaultTableModel modelo = (DefaultTableModel) table_3.getModel();
				modelo.setNumRows(0);
				adminsDAO.deletarSenhaGerada();*/
			}
		});
		btnNewButton_3.setBounds(649, 309, 136, 21);
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_6 = new JButton("GEN\u00C9RICO");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminsDAO adminsDAO = new AdminsDAO();
				
				if(adminsDAO.retornarUltimaSenha()<400) {
					for(int i = 0; i < 1; i++) {
						
						if(adminsDAO.retornarUltimaSenha()<400) {
							adminsDAO.inserirGenericoNaBL();
							adminsDAO.inserirGenericoNaSenhaGerada();
						}
					}
					adminsDAO.escreverNoTXT(adminsDAO.lerBdSenha());
					adminsDAO.deleteCED();
					DefaultTableModel modelo = (DefaultTableModel) table_3.getModel();
					modelo.setNumRows(0);
					adminsDAO.deletarSenhaGerada();
					DefaultTableModel modelo2 = (DefaultTableModel) table_2.getModel();
					modelo2.setNumRows(0);
					nomeClienteSenhaPesquisar.setText("");
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Senhas encerradas!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		btnNewButton_6.setBounds(649, 341, 136, 23);
		panel_3.add(btnNewButton_6);
		
		JTextArea txtrPassoPesquise = new JTextArea();
		txtrPassoPesquise.setText("PASSO 1: Pesquise \r\npelo nome do respos\u00E1-\r\nvel no campo indicado\r\ne clique em \"PESQUISAR\"\r\nNote que ser\u00E1 exibido \r\ncomo resposta o cliente\r\nque foi pesquisado junto\r\nde seus dependentes.\r\n\r\n\r\n\r\nPASSO2: Clique sobre os\r\nnomes das pessoas para \r\nas quais voc\u00EA ir\u00E1 realizar\r\na venda das senhas.\r\nNote que ao clicar no\r\nnome das pessoas elas\r\nser\u00E3o transferidas para \r\na tabela seguinte.\r\n\r\n\r\n\r\nPASSO 3: Ao final da \r\nsele\u00E7\u00E3o, clique no bot\u00E3o \r\n\"GERAR SENHA\" e \r\nconfirme a impress\u00E3o da\r\nsenha.");
		txtrPassoPesquise.setForeground(SystemColor.controlDkShadow);
		txtrPassoPesquise.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtrPassoPesquise.setEditable(false);
		txtrPassoPesquise.setBackground(SystemColor.menu);
		txtrPassoPesquise.setBounds(10, 10, 152, 603);
		panel_3.add(txtrPassoPesquise);
		
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setSize(800, 600); // 600
		tabbedPane.addTab(null, null, panel, null);
		panel.setLayout(null);
	}
	
	public void readTable(String nomeCliente) {
		DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		modelo.setNumRows(0);
		AdminsDAO adminsDAO = new AdminsDAO();
		
		for(Clientes c: adminsDAO.listarClientesDep(nomeCliente)) {
			modelo.addRow(new Object[]{
					c.getId(),
					c.getNome_cliente()
			});
		}
	}
	
	public void readTableDep(String idClienteDep) {
		DefaultTableModel modelo = (DefaultTableModel) table_1.getModel();
		modelo.setNumRows(0);
		AdminsDAO adminsDAO = new AdminsDAO();
		
		for(Dependentes d: adminsDAO.listarDependentes(idClienteDep)) {
			System.out.println(d.getIdDependente());
			modelo.addRow(new Object[] {
					d.getIdDependente(),
					d.getNomeCompletoDependente()
			});
		}
	}
	
	public void readTableSenha(String nomeClienteSenha) {
		DefaultTableModel modelo = (DefaultTableModel) table_2.getModel();
		modelo.setNumRows(0);
		AdminsDAO adminsDAO = new AdminsDAO();
		
		for(Clientes c: adminsDAO.listarClientesDep(nomeClienteSenha)) {
			modelo.addRow(new Object[] {
					c.getId(),
					c.getNome_cliente(),
					c.getIdade_cliente()
			});
		}
		
		for(Dependentes d: adminsDAO.listarDependentes(""+adminsDAO.listarIDClientes(nomeClienteSenha)+"")) {
			modelo.addRow(new Object[] {
					d.getIdDependente(),
					d.getNomeCompletoDependente(),
					d.getIdadeDependente()
			});
		}
	}
	
	public void readTableCED(String nome) {
		DefaultTableModel modelo = (DefaultTableModel) table_3.getModel();
		AdminsDAO adminsDAO = new AdminsDAO();
		
		for(ClientesEDependentes cli: adminsDAO.listCED(nome)) {
			modelo.addRow(new Object[] {
					cli.getId(),
					cli.getNomeCompleto(),
					cli.getIdade()
			});
		}
	}
}
