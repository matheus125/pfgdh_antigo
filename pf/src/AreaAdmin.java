
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
//import javax.swing.JProgressBar;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AreaAdmin extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JFrame frmSigerSistema;
    private JTextField nomeAdmin;
    private JTextField emailAdmin;
    private JPasswordField senhaAdmin;
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
    private JTextField nomeBuscarCliente;
    private JTextField idCliente;
    private JTextField nomeCompletoDependente;
    private JTextField nomeSocialCliente;
    private JTable table;
    private JTable table_1;
    private JTextField nomeClienteSenhaPesquisar;
    private JTable table_2;
    private JTable table_3;
    private JTable table_4;
    private JTable table_5;
    //private JTextField nomeClienteEditar;
    private JTable table_6;
    private JTable table_7;
    private JTextField nomeNX_novoEditar;
    private JTextField nome_novoEditar;
    private JTextField rua_novoEditar;
    private JTextField bairro_novoEditar;
    private JTextField cidade_novoEditar;
    private JTextField cardapio;
    private JTextField inicioSenhas;
    private JTextField terminoSenhas;
    private JTextField terminoDistribuicao;
    //private JTextField textField_1;
    //private JTextField textField_2;
    //private JTextField textField_3;

    /**
     * Launch the application.
     */
    public static void janelaCadastro() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AreaAdmin window = new AreaAdmin();
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
    public AreaAdmin() {
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "N�o");
        UIManager.put("OptionPane.cancelButtonText", "Cancelar");
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    @SuppressWarnings({"rawtypes", "unchecked", "serial"})
    private void initialize() {
        MaskFormatter cpf = null;
        MaskFormatter telefone = null;
        MaskFormatter rg = null;
        MaskFormatter cep = null;
        MaskFormatter dataNascimento = null;
        MaskFormatter idadef = null;
        try {
            cpf = new MaskFormatter("###.###.###-##");
            telefone = new MaskFormatter("(##)#####-####");
            rg = new MaskFormatter("#######-#");
            cep = new MaskFormatter("#####-###");
            dataNascimento = new MaskFormatter("##/##/####");
            idadef = new MaskFormatter("##");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        frmSigerSistema = new JFrame();
        frmSigerSistema.setBackground(Color.WHITE);
        frmSigerSistema.setTitle("SIGER - SISTEMA DE GERENCIAMENTO DE RESTAURANTES");
        frmSigerSistema.setResizable(false);
        frmSigerSistema.setSize(818, 691); //818 691
        frmSigerSistema.setLocationRelativeTo(null);
        frmSigerSistema.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmSigerSistema.getContentPane().setLayout(null);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(0, 0, 800, 650); //800 650
        frmSigerSistema.getContentPane().add(tabbedPane);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setForeground(Color.BLACK);
        panel.setSize(800, 600); // 800 600
        tabbedPane.addTab("FUNCION�RIOS", null, panel, null);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("NOME COMPLETO");
        lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setBounds(172, 32, 123, 13);
        panel.add(lblNewLabel);

        JLabel lblCpf = new JLabel("CPF");
        lblCpf.setFont(new Font("Arial", Font.BOLD, 12));
        lblCpf.setForeground(Color.BLACK);
        lblCpf.setBounds(172, 77, 123, 13);
        panel.add(lblCpf);

        JLabel lblSenha = new JLabel("E-MAIL");
        lblSenha.setFont(new Font("Arial", Font.BOLD, 12));
        lblSenha.setForeground(Color.BLACK);
        lblSenha.setBounds(172, 122, 123, 13);
        panel.add(lblSenha);

        JLabel lblSenha_1 = new JLabel("SENHA");
        lblSenha_1.setFont(new Font("Arial", Font.BOLD, 12));
        lblSenha_1.setForeground(Color.BLACK);
        lblSenha_1.setBounds(172, 167, 123, 13);
        panel.add(lblSenha_1);

        nomeAdmin = new JTextField(null);
        nomeAdmin.setBounds(305, 29, 300, 19);
        panel.add(nomeAdmin);
        nomeAdmin.setColumns(10);

        JFormattedTextField cpfAdmin = new JFormattedTextField();
        cpfAdmin.setFormatterFactory(new DefaultFormatterFactory(cpf));
        cpfAdmin.setBounds(305, 74, 300, 19);
        panel.add(cpfAdmin);

        emailAdmin = new JTextField(null);
        emailAdmin.setColumns(10);
        emailAdmin.setBounds(305, 119, 300, 19);
        panel.add(emailAdmin);

        JButton btnCadastrar = new JButton("CADASTRAR");
        btnCadastrar.setFont(new Font("Arial", Font.BOLD, 12));
        btnCadastrar.setForeground(Color.BLACK);
        btnCadastrar.setBackground(Color.WHITE);
        btnCadastrar.setBounds(482, 312, 170, 21);
        panel.add(btnCadastrar);

        JLabel lblSenha_1_1 = new JLabel("TELEFONE");
        lblSenha_1_1.setFont(new Font("Arial", Font.BOLD, 12));
        lblSenha_1_1.setForeground(Color.BLACK);
        lblSenha_1_1.setBounds(172, 213, 123, 13);
        panel.add(lblSenha_1_1);

        JFormattedTextField telefoneAdmin = new JFormattedTextField();
        telefoneAdmin.setFormatterFactory(new DefaultFormatterFactory(telefone));
        telefoneAdmin.setBounds(305, 210, 300, 19);
        panel.add(telefoneAdmin);

        JLabel lblSenha_1_1_1 = new JLabel("CARGO");
        lblSenha_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
        lblSenha_1_1_1.setForeground(Color.BLACK);
        lblSenha_1_1_1.setBounds(172, 259, 123, 13);
        panel.add(lblSenha_1_1_1);

        JComboBox<?> cargoAdmin = new JComboBox();
        cargoAdmin.setBackground(new Color(255, 255, 255));
        cargoAdmin.setModel(new DefaultComboBoxModel(new String[]{"ADMINISTRADOR"}));
        cargoAdmin.setBounds(305, 255, 300, 21);
        panel.add(cargoAdmin);

        senhaAdmin = new JPasswordField();
        senhaAdmin.setEchoChar('*');
        senhaAdmin.setBounds(305, 164, 300, 19);
        panel.add(senhaAdmin);

        JCheckBox chckbxNewCheckBox = new JCheckBox("MOSTRAR SENHA");
        chckbxNewCheckBox.setFont(new Font("Arial", Font.BOLD, 12));
        chckbxNewCheckBox.setForeground(Color.BLACK);
        chckbxNewCheckBox.setBackground(Color.WHITE);
        chckbxNewCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (chckbxNewCheckBox.isSelected()) {
                    senhaAdmin.setEchoChar((char) 0);
                } else {
                    senhaAdmin.setEchoChar('*');
                }
            }
        });
        chckbxNewCheckBox.setBounds(611, 163, 178, 21);
        panel.add(chckbxNewCheckBox);

        JButton btnCadastrar_1 = new JButton("LIMPAR");
        btnCadastrar_1.setForeground(Color.BLACK);
        btnCadastrar_1.setFont(new Font("Arial", Font.BOLD, 12));
        btnCadastrar_1.setBackground(Color.WHITE);
        btnCadastrar_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nomeAdmin.setText("");
                cpfAdmin.setText("");
                emailAdmin.setText("");
                senhaAdmin.setText("");
                telefoneAdmin.setText("");
            }
        });
        btnCadastrar_1.setBounds(305, 312, 170, 21);
        panel.add(btnCadastrar_1);

        JTextArea txtrPassoAdicione = new JTextArea();
        txtrPassoAdicione.setText("PASSO 1: Adicione\r\ntodas informa\u00E7\u00F5es\r\nsolicitadas. Note\r\nque todos s\u00E3o \r\ncampos obrigat\u00F3rios.\r\n\r\nPASSO 2: Ao final\r\ndo preenchimento,\r\nselecione a op\u00E7\u00E3o \r\n\"CADASTRAR\".\r\nSe voc\u00EA deseja cancelar\r\na opera\u00E7\u00E3o, basta clicar\r\nno bot\u00E3o \"LIMPAR\".");
        txtrPassoAdicione.setForeground(Color.BLACK);
        txtrPassoAdicione.setFont(new Font("Arial", Font.BOLD, 12));
        txtrPassoAdicione.setEditable(false);
        txtrPassoAdicione.setBackground(Color.WHITE);
        txtrPassoAdicione.setBounds(10, 26, 152, 603);
        panel.add(txtrPassoAdicione);

        JLabel lblNewLabel_51 = new JLabel("");
        //C:\Users\JORGE TEIXEIRA\Desktop\LOGOPFGDHAAOPACO.png
        lblNewLabel_51.setIcon(new ImageIcon("C:\\img.png"));
        //lblNewLabel_51.setIcon(new ImageIcon("C:\\Users\\Usuario\\Desktop\\LOGOPFGDHAAOPACO.png"));
        lblNewLabel_51.setBounds(338, 281, 447, 330);
        panel.add(lblNewLabel_51);

        btnCadastrar.addActionListener(new ActionListener() {
            @SuppressWarnings("deprecation")
            @Override
            public void actionPerformed(ActionEvent ev) {
                Admins admin = new Admins(nomeAdmin.getText(), cpfAdmin.getText(), emailAdmin.getText(), senhaAdmin.getText(), telefoneAdmin.getText(), cargoAdmin.getSelectedItem().toString());
                AdminsDAO adminsDao = new AdminsDAO();
                if (nomeAdmin.getText().isEmpty() || cpfAdmin.getText().isEmpty() || emailAdmin.getText().isEmpty() || senhaAdmin.getText().isEmpty() || telefoneAdmin.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o administrador, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                } else if ((adminsDao.adicionarAdmin(admin)) == true) {
                    JOptionPane.showMessageDialog(null, cargoAdmin.getSelectedItem().toString() + " cadastrado com sucesso!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                    nomeAdmin.setText("");
                    cpfAdmin.setText("");
                    emailAdmin.setText("");
                    senhaAdmin.setText("");
                    telefoneAdmin.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o administrador, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });

        JPanel panel_1 = new JPanel();
        panel_1.setForeground(Color.YELLOW);
        panel_1.setBackground(Color.WHITE);
        panel_1.setSize(800, 690); //690
        panel_1.setPreferredSize(new Dimension(800, 900)); //800, 900
        tabbedPane.addTab("CADASTRAR CLIENTES", null, panel_1, null);
        panel_1.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("NOME COMPLETO");
        lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_2.setForeground(Color.RED);
        lblNewLabel_2.setBounds(10, 35, 160, 13);
        panel_1.add(lblNewLabel_2);

        JComboBox corCliente = new JComboBox();
        corCliente.setModel(new DefaultComboBoxModel(new String[]{"ESCOLHA A OP\u00C7\u00C3O ", "BRANCO", "PARDO", "PRETO ", "AMARELO", "IND\u00CDGENA", "N\u00C3O DECLARADO"}));
        corCliente.setBounds(370, 175, 125, 21);
        panel_1.add(corCliente);

        JLabel lblNewLabel_3 = new JLabel("NOME DA M\u00C3E");
        lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_3.setForeground(Color.BLACK);
        lblNewLabel_3.setBounds(10, 214, 160, 13);
        panel_1.add(lblNewLabel_3);

        nomeDaMae = new JTextField();
        nomeDaMae.setBounds(150, 210, 125, 19);
        nomeDaMae.setColumns(10);
        panel_1.add(nomeDaMae);

        JLabel lblNewLabel_4 = new JLabel("TELEFONE");
        lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_4.setForeground(Color.RED);
        lblNewLabel_4.setBounds(10, 140, 160, 13);
        panel_1.add(lblNewLabel_4);

        JFormattedTextField telefoneCliente = new JFormattedTextField(telefone);
        telefoneCliente.setBounds(150, 136, 125, 19);
        panel_1.add(telefoneCliente);

        JLabel lblNewLabel_5 = new JLabel("DATA DE NASCIMENTO");
        lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_5.setForeground(Color.RED);
        lblNewLabel_5.setBounds(410, 70, 160, 13);
        panel_1.add(lblNewLabel_5);

        JLabel lblNewLabel_11 = new JLabel("G\u00CANERO");
        lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_11.setForeground(Color.RED);
        lblNewLabel_11.setBounds(10, 105, 79, 13);
        panel_1.add(lblNewLabel_11);

        JComboBox generoCliente = new JComboBox();
        generoCliente.setModel(new DefaultComboBoxModel(new String[]{"ESCOLHA A OP\u00C7\u00C3O", "MASCULINO", "FEMININO", "OUTROS"}));
        generoCliente.setBounds(150, 101, 125, 21);
        panel_1.add(generoCliente);

        JLabel lblNewLabel_11_1 = new JLabel("ESTADO CIV.");
        lblNewLabel_11_1.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_11_1.setForeground(Color.BLACK);
        lblNewLabel_11_1.setBounds(525, 179, 79, 13);
        panel_1.add(lblNewLabel_11_1);

        JComboBox estadoCivilCliente = new JComboBox();
        estadoCivilCliente.setModel(new DefaultComboBoxModel(new String[]{"ESCOLHA A OP\u00C7\u00C3O ", "SOLTEIRO", "CASADO", "DIVORCIADO", "VI\u00DAVO", "UNI\u00C3O EST\u00C1VEL"}));
        estadoCivilCliente.setBounds(620, 175, 125, 21);
        panel_1.add(estadoCivilCliente);

        JLabel lblNewLabel_6 = new JLabel("RG");
        lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_6.setForeground(Color.BLACK);
        lblNewLabel_6.setBounds(10, 280, 160, 13);
        panel_1.add(lblNewLabel_6);

        JFormattedTextField rgCliente = new JFormattedTextField(rg);
        rgCliente.setBounds(150, 276, 125, 19);
        panel_1.add(rgCliente);

        JLabel lblNewLabel_7 = new JLabel("CPF");
        lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_7.setForeground(Color.RED);
        lblNewLabel_7.setBounds(410, 35, 45, 13);
        panel_1.add(lblNewLabel_7);

        JLabel lblNewLabel_8 = new JLabel("NACIONALIDADE");
        lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_8.setForeground(Color.BLACK);
        lblNewLabel_8.setBounds(10, 245, 125, 13);
        panel_1.add(lblNewLabel_8);

        nacionalidadeCliente = new JTextField();
        nacionalidadeCliente.setBounds(150, 242, 125, 19);
        nacionalidadeCliente.setColumns(10);
        panel_1.add(nacionalidadeCliente);

        JLabel lblNewLabel_9 = new JLabel("CIDADE");
        lblNewLabel_9.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_9.setForeground(Color.RED);
        lblNewLabel_9.setBounds(10, 179, 125, 13);
        panel_1.add(lblNewLabel_9);

        JLabel lblNewLabel_10 = new JLabel("NIS");
        lblNewLabel_10.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_10.setForeground(Color.BLACK);
        lblNewLabel_10.setBounds(10, 315, 45, 13);
        panel_1.add(lblNewLabel_10);

        JFormattedTextField nisCliente = new JFormattedTextField();
        nisCliente.setBounds(150, 312, 125, 19);
        panel_1.add(nisCliente);

        JLabel lblNewLabel_11_2 = new JLabel("COR");
        lblNewLabel_11_2.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_11_2.setForeground(Color.BLACK);
        lblNewLabel_11_2.setBounds(297, 179, 79, 13);
        panel_1.add(lblNewLabel_11_2);

        JLabel lblNewLabel_12 = new JLabel("CEP");
        lblNewLabel_12.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_12.setForeground(Color.BLACK);
        lblNewLabel_12.setBounds(300, 214, 125, 13);
        panel_1.add(lblNewLabel_12);

        JLabel lblNewLabel_13 = new JLabel("BAIRRO");
        lblNewLabel_13.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_13.setForeground(Color.RED);
        lblNewLabel_13.setBounds(525, 140, 125, 13);
        panel_1.add(lblNewLabel_13);

        JLabel lblNewLabel_14 = new JLabel("RUA");
        lblNewLabel_14.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_14.setForeground(Color.RED);
        lblNewLabel_14.setBounds(300, 140, 125, 13);
        panel_1.add(lblNewLabel_14);

        JFormattedTextField cepCliente = new JFormattedTextField(cep);
        cepCliente.setBounds(370, 210, 125, 19);
        panel_1.add(cepCliente);

        JFormattedTextField dataNascimentoCliente = new JFormattedTextField(dataNascimento);
        dataNascimentoCliente.setBounds(552, 66, 125, 19);
        panel_1.add(dataNascimentoCliente);

        JFormattedTextField cpfCliente = new JFormattedTextField(cpf);
        cpfCliente.setBounds(445, 31, 125, 19);
        panel_1.add(cpfCliente);

        JLabel lblNewLabel_15 = new JLabel("N\u00B0");
        lblNewLabel_15.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_15.setForeground(Color.BLACK);
        lblNewLabel_15.setBounds(588, 214, 45, 13);
        panel_1.add(lblNewLabel_15);

        numeroCliente = new JTextField();
        numeroCliente.setBounds(620, 211, 125, 19);
        panel_1.add(numeroCliente);
        numeroCliente.setColumns(10);

        JLabel lblNewLabel_16 = new JLabel("REF.");
        lblNewLabel_16.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_16.setForeground(Color.BLACK);
        lblNewLabel_16.setBounds(299, 249, 101, 13);
        panel_1.add(lblNewLabel_16);

        referenciaCliente = new JTextField();
        referenciaCliente.setBounds(370, 246, 375, 19);
        panel_1.add(referenciaCliente);
        referenciaCliente.setColumns(10);

        JLabel lblTempoDeMoradia = new JLabel("TEMPO DE MORADIA");
        lblTempoDeMoradia.setFont(new Font("Arial", Font.BOLD, 12));
        lblTempoDeMoradia.setForeground(Color.BLACK);
        lblTempoDeMoradia.setBounds(299, 280, 176, 13);
        panel_1.add(lblTempoDeMoradia);

        tempoDeMoradiaCliente = new JTextField();
        tempoDeMoradiaCliente.setBounds(430, 277, 96, 19);
        panel_1.add(tempoDeMoradiaCliente);
        tempoDeMoradiaCliente.setColumns(10);

        JLabel lblNewLabel_17 = new JLabel("ESCOLARIDADE");
        lblNewLabel_17.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_17.setForeground(Color.BLACK);
        lblNewLabel_17.setBounds(299, 315, 126, 13);
        panel_1.add(lblNewLabel_17);

        JComboBox escolaridadeCliente = new JComboBox();
        escolaridadeCliente.setModel(new DefaultComboBoxModel(new String[]{"ESCOLHA A OP\u00C7\u00C3O ", "ENSINO FUNDAMENTAL INCOMPLETO", "ENSINO FUNDAMENTAL COMPLETO", "ENSINO M\u00C9DIO INCOMPLETO", "ENSINO M\u00C9DIO COMPLETO", "ENSINO SUPERIOR INCOMPLETO", "ENSINO SUPERIOR COMPLETO"}));
        escolaridadeCliente.setBounds(430, 311, 315, 21);
        panel_1.add(escolaridadeCliente);

        JLabel lblNewLabel_18 = new JLabel("RENDA PER CAPITA");
        lblNewLabel_18.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_18.setForeground(Color.BLACK);
        lblNewLabel_18.setBounds(10, 350, 125, 13);
        panel_1.add(lblNewLabel_18);

        JComboBox rendaCliente = new JComboBox();
        rendaCliente.setModel(new DefaultComboBoxModel(new String[]{"ESCOLHA A OP\u00C7\u00C3O ", "0 A 89,00", "89,01 A 178,00", "178,01 A MEIO SAL\u00C1RIO", "ACIMA DE MEIO SAL\u00C1RIO", "RENDA DE 1 SAL\u00C1RIO", "RENDA DE 1 A 2 SAL\u00C1RIOS", "RENDA DE 2 A 3 SAL\u00C1RIOS"}));
        rendaCliente.setBounds(150, 346, 125, 21);
        panel_1.add(rendaCliente);

        JLabel lblNewLabel_19 = new JLabel("PROGRAMAS SOCI.");
        lblNewLabel_19.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_19.setForeground(Color.BLACK);
        lblNewLabel_19.setBounds(299, 350, 125, 13);
        panel_1.add(lblNewLabel_19);

        JComboBox programasCliente = new JComboBox();
        programasCliente.setModel(new DefaultComboBoxModel(new String[]{"ESCOLHA A OP\u00C7\u00C3O ", "BOLSA FAM\u00CDLIA", "AUX\u00CDLIO DOEN\u00C7A", "SEGURO DESEMPREGO", "CADASRO \u00DANICO DO GOVERNO FEDERAL", "BPC / IDOSO", "BPC / PCD", "APOSENTADO"}));
        programasCliente.setBounds(430, 346, 315, 21);
        panel_1.add(programasCliente);

        JLabel lblNewLabel_20 = new JLabel("EMPREGO");
        lblNewLabel_20.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_20.setForeground(Color.BLACK);
        lblNewLabel_20.setBounds(10, 385, 101, 13);
        panel_1.add(lblNewLabel_20);

        JComboBox empregoCliente = new JComboBox();
        empregoCliente.setModel(new DefaultComboBoxModel(new String[]{"ESCOLHA A OP\u00C7\u00C3O ", "CLT", "CONTRATO", "TEMPOR\u00C1RIO", "DESEMPREGADO", "AUT\u00D4NOMO"}));
        empregoCliente.setBounds(150, 381, 125, 21);
        panel_1.add(empregoCliente);

        qtdCliente = new JTextField();
        qtdCliente.setBounds(530, 382, 103, 19);
        panel_1.add(qtdCliente);
        qtdCliente.setColumns(10);

        JLabel lblNewLabel_22 = new JLabel("QTD. DE PESSOAS TRABALHANDO");
        lblNewLabel_22.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_22.setForeground(Color.BLACK);
        lblNewLabel_22.setBounds(299, 385, 208, 13);
        panel_1.add(lblNewLabel_22);

        JLabel lblNewLabel_21 = new JLabel("PROFISS\u00C3O DO RESPONS\u00C1VEL FAMILIAR");
        lblNewLabel_21.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_21.setForeground(Color.BLACK);
        lblNewLabel_21.setBounds(10, 420, 265, 13);
        panel_1.add(lblNewLabel_21);

        profissaoCliente = new JTextField();
        profissaoCliente.setBounds(299, 417, 279, 19);
        panel_1.add(profissaoCliente);
        profissaoCliente.setColumns(10);

        JLabel lblNewLabel_23 = new JLabel("COMPOSI\u00C7\u00C3O FAMILIAR");
        lblNewLabel_23.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_23.setForeground(Color.BLACK);
        lblNewLabel_23.setBounds(10, 455, 160, 13);
        panel_1.add(lblNewLabel_23);

        JComboBox composicaoCliente = new JComboBox();
        composicaoCliente.setModel(new DefaultComboBoxModel(new String[]{"ESCOLHA A OP\u00C7\u00C3O ", "MORA SOZINHO", "2 A 3 PESSOAS", "4 A 7 PESSOAS", "8 A 10 PESSOAS", "ACIMA DE 10 PESSOAS"}));
        composicaoCliente.setBounds(180, 451, 160, 21);
        panel_1.add(composicaoCliente);

        JLabel lblNewLabel_24 = new JLabel("MORADIA");
        lblNewLabel_24.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_24.setForeground(Color.BLACK);
        lblNewLabel_24.setBounds(370, 455, 96, 13);
        panel_1.add(lblNewLabel_24);

        JComboBox moradiaCliente = new JComboBox();
        moradiaCliente.setModel(new DefaultComboBoxModel(new String[]{"SELECIONE O TIPO DE MORADIA", "PR\u00D3PRIA", "ALUGADA", "CEDIDA", "OCUPADA"}));
        moradiaCliente.setBounds(475, 451, 103, 21);
        panel_1.add(moradiaCliente);

        JLabel lblNewLabel_25 = new JLabel("ESTRUTURA DA MORADIA");
        lblNewLabel_25.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_25.setForeground(Color.BLACK);
        lblNewLabel_25.setBounds(10, 490, 160, 13);
        panel_1.add(lblNewLabel_25);

        JComboBox estruturaCliente = new JComboBox();
        estruturaCliente.setModel(new DefaultComboBoxModel(new String[]{"ESCOLHA A OP\u00C7\u00C3O ", "ALVENARIA", "MADEIRA", "MISTA (MADEIRA/ALVENARIA)", "PALAFITA"}));
        estruturaCliente.setBounds(180, 486, 160, 21);
        panel_1.add(estruturaCliente);

        JLabel lblNewLabel_26 = new JLabel("POSSUI LIXO DOMICILIAR/COLETA?");
        lblNewLabel_26.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_26.setForeground(Color.BLACK);
        lblNewLabel_26.setBounds(370, 490, 208, 13);
        panel_1.add(lblNewLabel_26);

        JComboBox lixoColetaCliente = new JComboBox();
        lixoColetaCliente.setModel(new DefaultComboBoxModel(new String[]{"ESCOLHA A OP\u00C7\u00C3O ", "N\u00C3O", "SIM"}));
        lixoColetaCliente.setBounds(588, 486, 157, 21);
        panel_1.add(lixoColetaCliente);

        JLabel lblNewLabel_27 = new JLabel("POSSUI \u00C1GUA ENCANADA?");
        lblNewLabel_27.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_27.setForeground(Color.BLACK);
        lblNewLabel_27.setBounds(10, 525, 208, 13);
        panel_1.add(lblNewLabel_27);

        JComboBox aguaCliente = new JComboBox();
        aguaCliente.setModel(new DefaultComboBoxModel(new String[]{"ESCOLHA A OP\u00C7\u00C3O ", "REDE GERAL", "PO\u00C7O"}));
        aguaCliente.setBounds(180, 521, 160, 21);
        panel_1.add(aguaCliente);

        JLabel lblNewLabel_28 = new JLabel("POSSUI ENERGIA EL\u00C9TRICA?");
        lblNewLabel_28.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_28.setForeground(Color.BLACK);
        lblNewLabel_28.setBounds(370, 525, 208, 13);
        panel_1.add(lblNewLabel_28);

        JComboBox energiaCliente = new JComboBox();
        energiaCliente.setModel(new DefaultComboBoxModel(new String[]{"ESCOLHA A OP\u00C7\u00C3O", "N\u00C3O", "SIM SEM MEDIDOR", "SIM COM MEDIDOR"}));
        energiaCliente.setBounds(588, 521, 157, 21);
        panel_1.add(energiaCliente);

        JLabel lblNewLabel_29 = new JLabel("ESCOAMENTO SANIT\u00C1RIO?");
        lblNewLabel_29.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_29.setForeground(Color.BLACK);
        lblNewLabel_29.setBounds(10, 560, 191, 13);
        panel_1.add(lblNewLabel_29);

        JComboBox escoamentoCliente = new JComboBox();
        escoamentoCliente.setModel(new DefaultComboBoxModel(new String[]{"ESCOLHA A OP\u00C7\u00C3O", "REDE COLETORA DE ESGOTO OU FLUVIAL", "FOSSA S\u00C9PTICA"}));
        escoamentoCliente.setBounds(180, 556, 160, 21);
        panel_1.add(escoamentoCliente);

        JLabel lblNewLabel_30 = new JLabel("FREQUENTA CENTRO DE CONVIV\u00CANCIA?");
        lblNewLabel_30.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_30.setForeground(Color.BLACK);
        lblNewLabel_30.setBounds(370, 560, 263, 13);
        panel_1.add(lblNewLabel_30);

        JComboBox centroCliente = new JComboBox();
        centroCliente.setModel(new DefaultComboBoxModel(new String[]{"ESCOLHA A OP\u00C7\u00C3O ", "N\u00C3O", "SIM"}));
        centroCliente.setBounds(643, 556, 102, 21);
        panel_1.add(centroCliente);

        JLabel lblNewLabel_31 = new JLabel("POSSUI ALGUMA DOEN\u00C7A?");
        lblNewLabel_31.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_31.setForeground(Color.BLACK);
        lblNewLabel_31.setBounds(10, 595, 208, 13);
        panel_1.add(lblNewLabel_31);

        JComboBox doencasCliente = new JComboBox();
        doencasCliente.setModel(new DefaultComboBoxModel(new String[]{"ESCOLHA A OP\u00C7\u00C3O ", "N\u00C3O", "HIPERTENS\u00C3O", "C\u00C2NCER", "DIABETES", "OUTRAS"}));
        doencasCliente.setBounds(180, 591, 160, 21);
        panel_1.add(doencasCliente);

        JLabel lblNewLabel_32 = new JLabel("OUTRAS DOEN\u00C7AS?");
        lblNewLabel_32.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_32.setForeground(Color.BLACK);
        lblNewLabel_32.setBounds(370, 595, 156, 13);
        panel_1.add(lblNewLabel_32);

        outrasDoencasCliente = new JTextField();
        outrasDoencasCliente.setBounds(510, 592, 235, 19);
        panel_1.add(outrasDoencasCliente);
        outrasDoencasCliente.setColumns(10);

        JLabel lblNewLabel_33 = new JLabel("DEFICI\u00CANCIA?");
        lblNewLabel_33.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_33.setForeground(Color.RED);
        lblNewLabel_33.setBounds(300, 105, 101, 13);
        panel_1.add(lblNewLabel_33);

        JLabel lblNewLabel_34 = new JLabel("LAUDO?");
        lblNewLabel_34.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_34.setForeground(Color.BLACK);
        lblNewLabel_34.setBounds(10, 630, 79, 13);
        panel_1.add(lblNewLabel_34);

        JComboBox laudoCliente = new JComboBox();
        laudoCliente.setModel(new DefaultComboBoxModel(new String[]{"ESCOLHA A OP\u00C7\u00C3O ", "N\u00C3O", "SIM"}));
        laudoCliente.setBounds(179, 623, 161, 21);
        panel_1.add(laudoCliente);

        JLabel lblNewLabel_35 = new JLabel("JUSTIFICATIVA DEFICI\u00CANCIA");
        lblNewLabel_35.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_35.setForeground(Color.BLACK);
        lblNewLabel_35.setBounds(10, 665, 191, 13);
        panel_1.add(lblNewLabel_35);

        JComboBox justificaCliente = new JComboBox();
        justificaCliente.setModel(new DefaultComboBoxModel(new String[]{"ESCOLHA A OP\u00C7\u00C3O ", "MENTAL", "VISUAL", "F\u00CDSICA", "AUDITIVA"}));
        justificaCliente.setBounds(180, 657, 160, 21);
        panel_1.add(justificaCliente);

        JLabel lblNewLabel_36 = new JLabel("OBSERVA\u00C7\u00C3O");
        lblNewLabel_36.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_36.setForeground(Color.BLACK);
        lblNewLabel_36.setBounds(370, 665, 125, 13);
        panel_1.add(lblNewLabel_36);

        obsCliente = new JTextField();
        obsCliente.setBounds(510, 662, 235, 19);
        panel_1.add(obsCliente);
        obsCliente.setColumns(10);

        JComboBox deficienciaCliente = new JComboBox();
        deficienciaCliente.setModel(new DefaultComboBoxModel(new String[]{"ESCOLHA A OP\u00C7\u00C3O", "N\u00C3O", "SIM"}));
        deficienciaCliente.setBounds(384, 101, 142, 21);
        panel_1.add(deficienciaCliente);

        nomeCliente = new JTextField();
        nomeCliente.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    AdminsDAO adminsDAO = new AdminsDAO();

                    if (naturalidadeCliente.getText().toString().equalsIgnoreCase("") || bairroCliente.getText().toString().equalsIgnoreCase("") || ruaCliente.getText().toString().equalsIgnoreCase("") || telefoneCliente.getText().toString().equalsIgnoreCase("(  )     -    ") || nomeCliente.getText().toString().equalsIgnoreCase("") || cpfCliente.getText().toString().equalsIgnoreCase("   .   .   -  ") || dataNascimentoCliente.getText().toString().equalsIgnoreCase("  /  /    ") || generoCliente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O") || deficienciaCliente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O")) {
                        JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                    } else {

                        //System.out.println(Integer.parseInt(dataNascimentoCliente.getText().substring(6, 10)));
                        Integer idade = ((2021) - (Integer.parseInt(dataNascimentoCliente.getText().substring(6, 10))));
                        String idadeFormatada = ("" + idade + "");

                        if (nomeSocialCliente.getText().equalsIgnoreCase("")) {
                            nomeSocialCliente.setText(nomeCliente.getText());
                        }

                        if (adminsDAO.verificarClienteExistente(cpfCliente.getText().toString()) == false) {
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

                            if (nomeCliente.getText().equalsIgnoreCase("") && dataNascimentoCliente.getText().equalsIgnoreCase("")) {
                                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                            } else if (adminsDAO.adicionarCliente(cliente)) {

                                Uniao uni = new Uniao();

                                uni.setNomeCompletoUniao(nomeCliente.getText().toString().toUpperCase());
                                uni.setCpfUniao(cpfCliente.getText().toString());
                                uni.setRua(ruaCliente.getText().toString().toUpperCase());
                                uni.setBairro(bairroCliente.getText().toString().toUpperCase());
                                uni.setCidade(naturalidadeCliente.getText().toString().toUpperCase());
                                uni.setTelefone(telefoneCliente.getText().toString());

                                adminsDAO.inserirNaUniao(uni);

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
                            } else {
                                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Cliente com o mesmo CPF já cadastrado!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                }
            }
        });
        nomeCliente.setBounds(150, 32, 250, 19);
        nomeCliente.setColumns(10);
        panel_1.add(nomeCliente);

        telefoneCliente.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    AdminsDAO adminsDAO = new AdminsDAO();

                    if (naturalidadeCliente.getText().toString().equalsIgnoreCase("") || bairroCliente.getText().toString().equalsIgnoreCase("") || ruaCliente.getText().toString().equalsIgnoreCase("") || telefoneCliente.getText().toString().equalsIgnoreCase("(  )     -    ") || nomeCliente.getText().toString().equalsIgnoreCase("") || cpfCliente.getText().toString().equalsIgnoreCase("   .   .   -  ") || dataNascimentoCliente.getText().toString().equalsIgnoreCase("  /  /    ") || generoCliente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O") || deficienciaCliente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O")) {
                        JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                    } else {

                        //System.out.println(Integer.parseInt(dataNascimentoCliente.getText().substring(6, 10)));
                        Integer idade = ((2021) - (Integer.parseInt(dataNascimentoCliente.getText().substring(6, 10))));
                        String idadeFormatada = ("" + idade + "");

                        if (nomeSocialCliente.getText().equalsIgnoreCase("")) {
                            nomeSocialCliente.setText(nomeCliente.getText());
                        }

                        if (adminsDAO.verificarClienteExistente(cpfCliente.getText().toString()) == false) {
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

                            if (nomeCliente.getText().equalsIgnoreCase("") && dataNascimentoCliente.getText().equalsIgnoreCase("")) {
                                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                            } else if (adminsDAO.adicionarCliente(cliente)) {

                                Uniao uni = new Uniao();

                                uni.setNomeCompletoUniao(nomeCliente.getText().toString().toUpperCase());
                                uni.setCpfUniao(cpfCliente.getText().toString());
                                uni.setRua(ruaCliente.getText().toString().toUpperCase());
                                uni.setBairro(bairroCliente.getText().toString().toUpperCase());
                                uni.setCidade(naturalidadeCliente.getText().toString().toUpperCase());
                                uni.setTelefone(telefoneCliente.getText().toString());

                                adminsDAO.inserirNaUniao(uni);

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
                            } else {
                                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Cliente com o mesmo CPF já cadastrado!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                }
            }
        });

        cpfCliente.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    AdminsDAO adminsDAO = new AdminsDAO();

                    if (naturalidadeCliente.getText().toString().equalsIgnoreCase("") || bairroCliente.getText().toString().equalsIgnoreCase("") || ruaCliente.getText().toString().equalsIgnoreCase("") || telefoneCliente.getText().toString().equalsIgnoreCase("(  )     -    ") || nomeCliente.getText().toString().equalsIgnoreCase("") || cpfCliente.getText().toString().equalsIgnoreCase("   .   .   -  ") || dataNascimentoCliente.getText().toString().equalsIgnoreCase("  /  /    ") || generoCliente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O") || deficienciaCliente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O")) {
                        JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                    } else {

                        //System.out.println(Integer.parseInt(dataNascimentoCliente.getText().substring(6, 10)));
                        Integer idade = ((2021) - (Integer.parseInt(dataNascimentoCliente.getText().substring(6, 10))));
                        String idadeFormatada = ("" + idade + "");

                        if (nomeSocialCliente.getText().equalsIgnoreCase("")) {
                            nomeSocialCliente.setText(nomeCliente.getText());
                        }

                        if (adminsDAO.verificarClienteExistente(cpfCliente.getText().toString()) == false) {
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

                            if (nomeCliente.getText().equalsIgnoreCase("") && dataNascimentoCliente.getText().equalsIgnoreCase("")) {
                                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                            } else if (adminsDAO.adicionarCliente(cliente)) {

                                Uniao uni = new Uniao();

                                uni.setNomeCompletoUniao(nomeCliente.getText().toString().toUpperCase());
                                uni.setCpfUniao(cpfCliente.getText().toString());
                                uni.setRua(ruaCliente.getText().toString().toUpperCase());
                                uni.setBairro(bairroCliente.getText().toString().toUpperCase());
                                uni.setCidade(naturalidadeCliente.getText().toString().toUpperCase());
                                uni.setTelefone(telefoneCliente.getText().toString());

                                adminsDAO.inserirNaUniao(uni);

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
                            } else {
                                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Cliente com o mesmo CPF j� cadastrado!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                }
            }
        });

        generoCliente.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    AdminsDAO adminsDAO = new AdminsDAO();

                    if (naturalidadeCliente.getText().toString().equalsIgnoreCase("") || bairroCliente.getText().toString().equalsIgnoreCase("") || ruaCliente.getText().toString().equalsIgnoreCase("") || telefoneCliente.getText().toString().equalsIgnoreCase("(  )     -    ") || nomeCliente.getText().toString().equalsIgnoreCase("") || cpfCliente.getText().toString().equalsIgnoreCase("   .   .   -  ") || dataNascimentoCliente.getText().toString().equalsIgnoreCase("  /  /    ") || generoCliente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O") || deficienciaCliente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O")) {
                        JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                    } else {

                        //System.out.println(Integer.parseInt(dataNascimentoCliente.getText().substring(6, 10)));
                        Integer idade = ((2021) - (Integer.parseInt(dataNascimentoCliente.getText().substring(6, 10))));
                        String idadeFormatada = ("" + idade + "");

                        if (nomeSocialCliente.getText().equalsIgnoreCase("")) {
                            nomeSocialCliente.setText(nomeCliente.getText());
                        }

                        if (adminsDAO.verificarClienteExistente(cpfCliente.getText().toString()) == false) {
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

                            if (nomeCliente.getText().equalsIgnoreCase("") && dataNascimentoCliente.getText().equalsIgnoreCase("")) {
                                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                            } else if (adminsDAO.adicionarCliente(cliente)) {

                                Uniao uni = new Uniao();

                                uni.setNomeCompletoUniao(nomeCliente.getText().toString().toUpperCase());
                                uni.setCpfUniao(cpfCliente.getText().toString());
                                uni.setRua(ruaCliente.getText().toString().toUpperCase());
                                uni.setBairro(bairroCliente.getText().toString().toUpperCase());
                                uni.setCidade(naturalidadeCliente.getText().toString().toUpperCase());
                                uni.setTelefone(telefoneCliente.getText().toString());

                                adminsDAO.inserirNaUniao(uni);

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
                            } else {
                                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Cliente com o mesmo CPF j� cadastrado!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                }
            }
        });

        deficienciaCliente.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    AdminsDAO adminsDAO = new AdminsDAO();

                    if (naturalidadeCliente.getText().toString().equalsIgnoreCase("") || bairroCliente.getText().toString().equalsIgnoreCase("") || ruaCliente.getText().toString().equalsIgnoreCase("") || telefoneCliente.getText().toString().equalsIgnoreCase("(  )     -    ") || nomeCliente.getText().toString().equalsIgnoreCase("") || cpfCliente.getText().toString().equalsIgnoreCase("   .   .   -  ") || dataNascimentoCliente.getText().toString().equalsIgnoreCase("  /  /    ") || generoCliente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O") || deficienciaCliente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O")) {
                        JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                    } else {

                        //System.out.println(Integer.parseInt(dataNascimentoCliente.getText().substring(6, 10)));
                        Integer idade = ((2021) - (Integer.parseInt(dataNascimentoCliente.getText().substring(6, 10))));
                        String idadeFormatada = ("" + idade + "");

                        if (nomeSocialCliente.getText().equalsIgnoreCase("")) {
                            nomeSocialCliente.setText(nomeCliente.getText());
                        }

                        if (adminsDAO.verificarClienteExistente(cpfCliente.getText().toString()) == false) {
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

                            if (nomeCliente.getText().equalsIgnoreCase("") && dataNascimentoCliente.getText().equalsIgnoreCase("")) {
                                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                            } else if (adminsDAO.adicionarCliente(cliente)) {

                                Uniao uni = new Uniao();

                                uni.setNomeCompletoUniao(nomeCliente.getText().toString().toUpperCase());
                                uni.setCpfUniao(cpfCliente.getText().toString());
                                uni.setRua(ruaCliente.getText().toString().toUpperCase());
                                uni.setBairro(bairroCliente.getText().toString().toUpperCase());
                                uni.setCidade(naturalidadeCliente.getText().toString().toUpperCase());
                                uni.setTelefone(telefoneCliente.getText().toString());

                                adminsDAO.inserirNaUniao(uni);

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
                            } else {
                                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Cliente com o mesmo CPF j� cadastrado!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                }
            }
        });

        dataNascimentoCliente.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    AdminsDAO adminsDAO = new AdminsDAO();

                    if (naturalidadeCliente.getText().toString().equalsIgnoreCase("") || bairroCliente.getText().toString().equalsIgnoreCase("") || ruaCliente.getText().toString().equalsIgnoreCase("") || telefoneCliente.getText().toString().equalsIgnoreCase("(  )     -    ") || nomeCliente.getText().toString().equalsIgnoreCase("") || cpfCliente.getText().toString().equalsIgnoreCase("   .   .   -  ") || dataNascimentoCliente.getText().toString().equalsIgnoreCase("  /  /    ") || generoCliente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O") || deficienciaCliente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O")) {
                        JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                    } else {

                        //System.out.println(Integer.parseInt(dataNascimentoCliente.getText().substring(6, 10)));
                        Integer idade = ((2021) - (Integer.parseInt(dataNascimentoCliente.getText().substring(6, 10))));
                        String idadeFormatada = ("" + idade + "");

                        if (nomeSocialCliente.getText().equalsIgnoreCase("")) {
                            nomeSocialCliente.setText(nomeCliente.getText());
                        }

                        if (adminsDAO.verificarClienteExistente(cpfCliente.getText()) == false) {
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

                            if (nomeCliente.getText().equalsIgnoreCase("") && dataNascimentoCliente.getText().equalsIgnoreCase("")) {
                                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                            } else if (adminsDAO.adicionarCliente(cliente)) {

                                Uniao uni = new Uniao();

                                uni.setNomeCompletoUniao(nomeCliente.getText().toString().toUpperCase());
                                uni.setCpfUniao(cpfCliente.getText().toString());
                                uni.setRua(ruaCliente.getText().toString().toUpperCase());
                                uni.setBairro(bairroCliente.getText().toString().toUpperCase());
                                uni.setCidade(naturalidadeCliente.getText().toString().toUpperCase());
                                uni.setTelefone(telefoneCliente.getText().toString());

                                adminsDAO.inserirNaUniao(uni);

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
                            } else {
                                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Cliente com o mesmo CPF j� cadastrado!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                }
            }
        });

        JButton btnCadastrarSemDependentes = new JButton("CADASTRAR");
        btnCadastrarSemDependentes.setForeground(Color.BLACK);
        btnCadastrarSemDependentes.setBackground(Color.WHITE);
        btnCadastrarSemDependentes.setFont(new Font("Arial", Font.BOLD, 12));
        btnCadastrarSemDependentes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                AdminsDAO adminsDAO = new AdminsDAO();

                if (nomeCliente.getText().toString().equalsIgnoreCase("") || cpfCliente.getText().toString().equalsIgnoreCase("   .   .   -  ") || dataNascimentoCliente.getText().toString().equalsIgnoreCase("  /  /    ") || generoCliente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O") || deficienciaCliente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O")) {
                    JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                } else {

                    //System.out.println(Integer.parseInt(dataNascimentoCliente.getText().substring(6, 10)));
                    Integer idade = ((2021) - (Integer.parseInt(dataNascimentoCliente.getText().substring(6, 10))));
                    String idadeFormatada = ("" + idade + "");

                    if (nomeSocialCliente.getText().equalsIgnoreCase("")) {
                        nomeSocialCliente.setText(nomeCliente.getText());
                    }

                    if (adminsDAO.verificarClienteExistente(cpfCliente.getText().toString()) == false) {
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

                        if (nomeCliente.getText().equalsIgnoreCase("") && dataNascimentoCliente.getText().equalsIgnoreCase("")) {
                            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                        } else if (adminsDAO.adicionarCliente(cliente)) {

                            Uniao uni = new Uniao();

                            uni.setNomeCompletoUniao(nomeCliente.getText().toString().toUpperCase());
                            uni.setCpfUniao(cpfCliente.getText().toString());
                            uni.setRua(ruaCliente.getText().toString().toUpperCase());
                            uni.setBairro(bairroCliente.getText().toString().toUpperCase());
                            uni.setCidade(nacionalidadeCliente.getText().toString().toUpperCase());
                            uni.setTelefone(telefoneCliente.getText().toString());

                            adminsDAO.inserirNaUniao(uni);

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
                        } else {
                            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente com o mesmo CPF j� cadastrado!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                    }
                }
            }
        });
        btnCadastrarSemDependentes.setBounds(265, 746, 261, 21);
        panel_1.add(btnCadastrarSemDependentes);

        bairroCliente = new JTextField();
        bairroCliente.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    AdminsDAO adminsDAO = new AdminsDAO();

                    if (naturalidadeCliente.getText().toString().equalsIgnoreCase("") || bairroCliente.getText().toString().equalsIgnoreCase("") || ruaCliente.getText().toString().equalsIgnoreCase("") || telefoneCliente.getText().toString().equalsIgnoreCase("(  )     -    ") || nomeCliente.getText().toString().equalsIgnoreCase("") || cpfCliente.getText().toString().equalsIgnoreCase("   .   .   -  ") || dataNascimentoCliente.getText().toString().equalsIgnoreCase("  /  /    ") || generoCliente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O") || deficienciaCliente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O")) {
                        JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                    } else {

                        //System.out.println(Integer.parseInt(dataNascimentoCliente.getText().substring(6, 10)));
                        Integer idade = ((2021) - (Integer.parseInt(dataNascimentoCliente.getText().substring(6, 10))));
                        String idadeFormatada = ("" + idade + "");

                        if (nomeSocialCliente.getText().equalsIgnoreCase("")) {
                            nomeSocialCliente.setText(nomeCliente.getText());
                        }

                        if (adminsDAO.verificarClienteExistente(cpfCliente.getText().toString()) == false) {
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

                            if (nomeCliente.getText().equalsIgnoreCase("") && dataNascimentoCliente.getText().equalsIgnoreCase("")) {
                                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                            } else if (adminsDAO.adicionarCliente(cliente)) {

                                Uniao uni = new Uniao();

                                uni.setNomeCompletoUniao(nomeCliente.getText().toString().toUpperCase());
                                uni.setCpfUniao(cpfCliente.getText().toString());
                                uni.setRua(ruaCliente.getText().toString().toUpperCase());
                                uni.setBairro(bairroCliente.getText().toString().toUpperCase());
                                uni.setCidade(naturalidadeCliente.getText().toString().toUpperCase());
                                uni.setTelefone(telefoneCliente.getText().toString());

                                adminsDAO.inserirNaUniao(uni);

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
                            } else {
                                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Cliente com o mesmo CPF j� cadastrado!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                }
            }
        });
        bairroCliente.setBounds(620, 136, 125, 20);
        panel_1.add(bairroCliente);
        bairroCliente.setColumns(10);

        JScrollPane scrollPane = new JScrollPane(panel_1);

        JLabel lblNewLabel_41 = new JLabel("NOME SOCIAL");
        lblNewLabel_41.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_41.setForeground(Color.BLACK);
        lblNewLabel_41.setBounds(10, 70, 99, 13);
        panel_1.add(lblNewLabel_41);

        nomeSocialCliente = new JTextField();
        nomeSocialCliente.setBounds(150, 67, 250, 19);
        panel_1.add(nomeSocialCliente);
        nomeSocialCliente.setColumns(10);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        tabbedPane.addTab("CLIENTES", null, scrollPane, null);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(Color.WHITE);
        tabbedPane.addTab("DEPENDENTES", null, panel_2, null);
        panel_2.setLayout(null);

        nomeBuscarCliente = new JTextField();
        nomeBuscarCliente.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    readTable(nomeBuscarCliente.getText());
                }
            }
        });
        nomeBuscarCliente.setBounds(218, 59, 412, 19);
        panel_2.add(nomeBuscarCliente);
        nomeBuscarCliente.setColumns(10);

        JLabel lblNewLabel_38 = new JLabel("NOME RESPONS\u00C1VEL");
        lblNewLabel_38.setForeground(Color.BLACK);
        lblNewLabel_38.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_38.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_38.setBounds(218, 36, 320, 13);
        panel_2.add(lblNewLabel_38);

        JButton btnNewButton = new JButton("PESQUISAR");
        btnNewButton.setForeground(Color.BLACK);
        btnNewButton.setBackground(Color.WHITE);
        btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
        btnNewButton.setBounds(640, 58, 145, 20);
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
        lblNewLabel_39.setForeground(Color.BLACK);
        lblNewLabel_39.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_39.setBounds(218, 346, 96, 13);
        panel_2.add(lblNewLabel_39);

        nomeCompletoDependente = new JTextField();
        nomeCompletoDependente.setBounds(324, 369, 214, 19);
        panel_2.add(nomeCompletoDependente);
        nomeCompletoDependente.setColumns(10);

        JLabel lblNewLabel_40 = new JLabel("NOME COMPLETO");
        lblNewLabel_40.setForeground(Color.BLACK);
        lblNewLabel_40.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_40.setBounds(324, 346, 152, 13);
        panel_2.add(lblNewLabel_40);

        JComboBox gene = new JComboBox();
        gene.setForeground(Color.BLACK);
        gene.setFont(new Font("Arial", Font.BOLD, 12));
        gene.setModel(new DefaultComboBoxModel(new String[]{"ESCOLHA A OP\u00C7\u00C3O", "MASCULINO", "FEMININO"}));
        gene.setBounds(640, 368, 145, 21);
        panel_2.add(gene);

        JComboBox deficienciaDependente = new JComboBox();
        deficienciaDependente.setForeground(Color.BLACK);
        deficienciaDependente.setFont(new Font("Arial", Font.BOLD, 12));
        deficienciaDependente.setModel(new DefaultComboBoxModel(new String[]{"ESCOLHA A OP\u00C7\u00C3O", "N\u00C3O", "SIM"}));
        deficienciaDependente.setBounds(218, 420, 165, 21);
        panel_2.add(deficienciaDependente);

        JLabel lblNewLabel_50 = new JLabel("DEPEND\u00CANCIA");
        lblNewLabel_50.setForeground(Color.BLACK);
        lblNewLabel_50.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_50.setBounds(393, 398, 145, 13);
        panel_2.add(lblNewLabel_50);

        JComboBox dependencia = new JComboBox();
        dependencia.setForeground(Color.BLACK);
        dependencia.setFont(new Font("Arial", Font.BOLD, 12));
        dependencia.setModel(new DefaultComboBoxModel(new String[]{"ESCOLHA A OP\u00C7\u00C3O", "C\u00D4NJUGE", "UNI\u00C3O EST\u00C1VEL", "FILHO/ENTEADO", "IRM\u00C3O", "AV\u00D3", "TUTORANDO", "INCAPAZ", "AGREGADO"}));
        dependencia.setBounds(393, 420, 145, 21);
        panel_2.add(dependencia);

        JFormattedTextField idadeDep = new JFormattedTextField(idadef);
        idadeDep.setBounds(548, 369, 82, 20);
        panel_2.add(idadeDep);

        ruaCliente = new JTextField();
        ruaCliente.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    AdminsDAO adminsDAO = new AdminsDAO();

                    if (naturalidadeCliente.getText().toString().equalsIgnoreCase("") || bairroCliente.getText().toString().equalsIgnoreCase("") || ruaCliente.getText().toString().equalsIgnoreCase("") || telefoneCliente.getText().toString().equalsIgnoreCase("(  )     -    ") || nomeCliente.getText().toString().equalsIgnoreCase("") || cpfCliente.getText().toString().equalsIgnoreCase("   .   .   -  ") || dataNascimentoCliente.getText().toString().equalsIgnoreCase("  /  /    ") || generoCliente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O") || deficienciaCliente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O")) {
                        JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                    } else {

                        //System.out.println(Integer.parseInt(dataNascimentoCliente.getText().substring(6, 10)));
                        Integer idade = ((2021) - (Integer.parseInt(dataNascimentoCliente.getText().substring(6, 10))));
                        String idadeFormatada = ("" + idade + "");

                        if (nomeSocialCliente.getText().equalsIgnoreCase("")) {
                            nomeSocialCliente.setText(nomeCliente.getText());
                        }

                        if (adminsDAO.verificarClienteExistente(cpfCliente.getText().toString()) == false) {
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

                            if (nomeCliente.getText().equalsIgnoreCase("") && dataNascimentoCliente.getText().equalsIgnoreCase("")) {
                                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                            } else if (adminsDAO.adicionarCliente(cliente)) {

                                Uniao uni = new Uniao();

                                uni.setNomeCompletoUniao(nomeCliente.getText().toString().toUpperCase());
                                uni.setCpfUniao(cpfCliente.getText().toString());
                                uni.setRua(ruaCliente.getText().toString().toUpperCase());
                                uni.setBairro(bairroCliente.getText().toString().toUpperCase());
                                uni.setCidade(naturalidadeCliente.getText().toString().toUpperCase());
                                uni.setTelefone(telefoneCliente.getText().toString());

                                adminsDAO.inserirNaUniao(uni);

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
                            } else {
                                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Cliente com o mesmo CPF j� cadastrado!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                }
            }
        });
        ruaCliente.setBounds(370, 136, 125, 19);
        panel_1.add(ruaCliente);
        ruaCliente.setColumns(10);

        naturalidadeCliente = new JTextField();
        naturalidadeCliente.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    AdminsDAO adminsDAO = new AdminsDAO();

                    if (naturalidadeCliente.getText().toString().equalsIgnoreCase("") || bairroCliente.getText().toString().equalsIgnoreCase("") || ruaCliente.getText().toString().equalsIgnoreCase("") || telefoneCliente.getText().toString().equalsIgnoreCase("(  )     -    ") || nomeCliente.getText().toString().equalsIgnoreCase("") || cpfCliente.getText().toString().equalsIgnoreCase("   .   .   -  ") || dataNascimentoCliente.getText().toString().equalsIgnoreCase("  /  /    ") || generoCliente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O") || deficienciaCliente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O")) {
                        JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                    } else {

                        //System.out.println(Integer.parseInt(dataNascimentoCliente.getText().substring(6, 10)));
                        Integer idade = ((2021) - (Integer.parseInt(dataNascimentoCliente.getText().substring(6, 10))));
                        String idadeFormatada = ("" + idade + "");

                        if (nomeSocialCliente.getText().equalsIgnoreCase("")) {
                            nomeSocialCliente.setText(nomeCliente.getText());
                        }

                        if (adminsDAO.verificarClienteExistente(cpfCliente.getText().toString()) == false) {
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

                            if (nomeCliente.getText().equalsIgnoreCase("") && dataNascimentoCliente.getText().equalsIgnoreCase("")) {
                                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                            } else if (adminsDAO.adicionarCliente(cliente)) {

                                Uniao uni = new Uniao();

                                uni.setNomeCompletoUniao(nomeCliente.getText().toString().toUpperCase());
                                uni.setCpfUniao(cpfCliente.getText().toString());
                                uni.setRua(ruaCliente.getText().toString().toUpperCase());
                                uni.setBairro(bairroCliente.getText().toString().toUpperCase());
                                uni.setCidade(naturalidadeCliente.getText().toString().toUpperCase());
                                uni.setTelefone(telefoneCliente.getText().toString());

                                adminsDAO.inserirNaUniao(uni);

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
                            } else {
                                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o cliente, reveja as informações!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Cliente com o mesmo CPF j� cadastrado!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                }
            }
        });
        naturalidadeCliente.setBounds(150, 175, 125, 19);
        naturalidadeCliente.setColumns(10);
        panel_1.add(naturalidadeCliente);

        deficienciaDependente.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    if (dependencia.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O") || idCliente.getText().isEmpty() || nomeCompletoDependente.getText().isEmpty() || idadeDep.getText().equalsIgnoreCase("  ") || gene.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O") || deficienciaDependente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O")) {
                        JOptionPane.showMessageDialog(null, "N�o foi poss�vel cadastrar o dependente, reveja as informa��es!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        Dependentes dependente = new Dependentes(idCliente.getText(), nomeCompletoDependente.getText().toString() + " DEPENDENTE", idadeDep.getText().toString(), gene.getSelectedItem().toString(), deficienciaDependente.getSelectedItem().toString(), dependencia.getSelectedItem().toString());
                        Clientes cliente = new Clientes();
                        cliente.setNome_cliente(nomeCompletoDependente.getText().toString() + " DEPENDENTE");
                        cliente.setNomeSocial_cliente(nomeCompletoDependente.getText().toString() + " DEPENDENTE");
                        cliente.setIdade_cliente(idadeDep.getText().toString());
                        cliente.setGenero_cliente(gene.getSelectedItem().toString());
                        cliente.setDeficiencia_cliente(deficienciaDependente.getSelectedItem().toString());

                        AdminsDAO adminsDAO = new AdminsDAO();
                        adminsDAO.adicionarDependentes(dependente);
                        //adminsDAO.adicionarCliente(cliente);
                        System.out.println(adminsDAO.adicionarCliente(cliente));

                        readTableDep(table.getValueAt(table.getSelectedRow(), 0).toString());
                        JOptionPane.showMessageDialog(null, "Dependente cadastrado com sucesso!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                        nomeCompletoDependente.setText("");
                        idadeDep.setText("");
                    }

                }
            }
        });

        nomeCompletoDependente.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    if (dependencia.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O") || idCliente.getText().isEmpty() || nomeCompletoDependente.getText().isEmpty() || idadeDep.getText().equalsIgnoreCase("  ") || gene.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O") || deficienciaDependente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O")) {
                        JOptionPane.showMessageDialog(null, "N�o foi poss�vel cadastrar o dependente, reveja as informa��es!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        Dependentes dependente = new Dependentes(idCliente.getText(), nomeCompletoDependente.getText().toString() + " DEPENDENTE", idadeDep.getText().toString(), gene.getSelectedItem().toString(), deficienciaDependente.getSelectedItem().toString(), dependencia.getSelectedItem().toString());
                        Clientes cliente = new Clientes();
                        cliente.setNome_cliente(nomeCompletoDependente.getText().toString() + " DEPENDENTE");
                        cliente.setNomeSocial_cliente(nomeCompletoDependente.getText().toString() + " DEPENDENTE");
                        cliente.setIdade_cliente(idadeDep.getText().toString());
                        cliente.setGenero_cliente(gene.getSelectedItem().toString());
                        cliente.setDeficiencia_cliente(deficienciaDependente.getSelectedItem().toString());

                        AdminsDAO adminsDAO = new AdminsDAO();
                        adminsDAO.adicionarDependentes(dependente);
                        //adminsDAO.adicionarCliente(cliente);
                        System.out.println(adminsDAO.adicionarCliente(cliente));

                        readTableDep(table.getValueAt(table.getSelectedRow(), 0).toString());
                        JOptionPane.showMessageDialog(null, "Dependente cadastrado com sucesso!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                        nomeCompletoDependente.setText("");
                        idadeDep.setText("");
                    }

                }

            }
        });

        gene.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    if (dependencia.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O") || idCliente.getText().isEmpty() || nomeCompletoDependente.getText().isEmpty() || idadeDep.getText().equalsIgnoreCase("  ") || gene.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O") || deficienciaDependente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O")) {
                        JOptionPane.showMessageDialog(null, "N�o foi poss�vel cadastrar o dependente, reveja as informa��es!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        Dependentes dependente = new Dependentes(idCliente.getText(), nomeCompletoDependente.getText().toString() + " DEPENDENTE", idadeDep.getText().toString(), gene.getSelectedItem().toString(), deficienciaDependente.getSelectedItem().toString(), dependencia.getSelectedItem().toString());
                        Clientes cliente = new Clientes();
                        cliente.setNome_cliente(nomeCompletoDependente.getText().toString() + " DEPENDENTE");
                        cliente.setNomeSocial_cliente(nomeCompletoDependente.getText().toString() + " DEPENDENTE");
                        cliente.setIdade_cliente(idadeDep.getText().toString());
                        cliente.setGenero_cliente(gene.getSelectedItem().toString());
                        cliente.setDeficiencia_cliente(deficienciaDependente.getSelectedItem().toString());

                        AdminsDAO adminsDAO = new AdminsDAO();
                        adminsDAO.adicionarDependentes(dependente);
                        //adminsDAO.adicionarCliente(cliente);
                        System.out.println(adminsDAO.adicionarCliente(cliente));

                        readTableDep(table.getValueAt(table.getSelectedRow(), 0).toString());
                        JOptionPane.showMessageDialog(null, "Dependente cadastrado com sucesso!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                        nomeCompletoDependente.setText("");
                        idadeDep.setText("");
                    }

                }

            }
        });

        idadeDep.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    if (dependencia.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O") || idCliente.getText().isEmpty() || nomeCompletoDependente.getText().isEmpty() || idadeDep.getText().equalsIgnoreCase("  ") || gene.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O") || deficienciaDependente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O")) {
                        JOptionPane.showMessageDialog(null, "N�o foi poss�vel cadastrar o dependente, reveja as informa��es!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        Dependentes dependente = new Dependentes(idCliente.getText(), nomeCompletoDependente.getText().toString() + " DEPENDENTE", idadeDep.getText().toString(), gene.getSelectedItem().toString(), deficienciaDependente.getSelectedItem().toString(), dependencia.getSelectedItem().toString());
                        Clientes cliente = new Clientes();
                        cliente.setNome_cliente(nomeCompletoDependente.getText().toString() + " DEPENDENTE");
                        cliente.setNomeSocial_cliente(nomeCompletoDependente.getText().toString() + " DEPENDENTE");
                        cliente.setIdade_cliente(idadeDep.getText().toString());
                        cliente.setGenero_cliente(gene.getSelectedItem().toString());
                        cliente.setDeficiencia_cliente(deficienciaDependente.getSelectedItem().toString());

                        AdminsDAO adminsDAO = new AdminsDAO();
                        adminsDAO.adicionarDependentes(dependente);
                        //adminsDAO.adicionarCliente(cliente);
                        System.out.println(adminsDAO.adicionarCliente(cliente));

                        readTableDep(table.getValueAt(table.getSelectedRow(), 0).toString());
                        JOptionPane.showMessageDialog(null, "Dependente cadastrado com sucesso!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                        nomeCompletoDependente.setText("");
                        idadeDep.setText("");
                    }

                }

            }
        });

        dependencia.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    if (dependencia.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O") || idCliente.getText().isEmpty() || nomeCompletoDependente.getText().isEmpty() || idadeDep.getText().equalsIgnoreCase("  ") || gene.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O") || deficienciaDependente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O")) {
                        JOptionPane.showMessageDialog(null, "N�o foi poss�vel cadastrar o dependente, reveja as informa��es!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        Dependentes dependente = new Dependentes(idCliente.getText(), nomeCompletoDependente.getText().toString() + " DEPENDENTE", idadeDep.getText().toString(), gene.getSelectedItem().toString(), deficienciaDependente.getSelectedItem().toString(), dependencia.getSelectedItem().toString());
                        Clientes cliente = new Clientes();
                        cliente.setNome_cliente(nomeCompletoDependente.getText().toString() + " DEPENDENTE");
                        cliente.setNomeSocial_cliente(nomeCompletoDependente.getText().toString() + " DEPENDENTE");
                        cliente.setIdade_cliente(idadeDep.getText().toString());
                        cliente.setGenero_cliente(gene.getSelectedItem().toString());
                        cliente.setDeficiencia_cliente(deficienciaDependente.getSelectedItem().toString());

                        AdminsDAO adminsDAO = new AdminsDAO();
                        adminsDAO.adicionarDependentes(dependente);
                        //adminsDAO.adicionarCliente(cliente);
                        System.out.println(adminsDAO.adicionarCliente(cliente));

                        readTableDep(table.getValueAt(table.getSelectedRow(), 0).toString());
                        JOptionPane.showMessageDialog(null, "Dependente cadastrado com sucesso!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                        nomeCompletoDependente.setText("");
                        idadeDep.setText("");
                    }

                }
            }
        });

        JButton btnNewButton_1 = new JButton("ADICIONAR");
        btnNewButton_1.setForeground(Color.BLACK);
        btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 12));
        btnNewButton_1.setBounds(640, 454, 145, 21);
        btnNewButton_1.setBackground(Color.WHITE);
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (idCliente.getText().isEmpty() || nomeCompletoDependente.getText().isEmpty() || idadeDep.getText().equalsIgnoreCase("  ") || gene.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O") || deficienciaDependente.getSelectedItem().toString().equalsIgnoreCase("ESCOLHA A OP��O")) {
                    JOptionPane.showMessageDialog(null, "N�o foi poss�vel cadastrar o dependente, reveja as informa��es!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                } else {
                    Dependentes dependente = new Dependentes(idCliente.getText(), nomeCompletoDependente.getText().toString() + " DEPENDENTE", idadeDep.getText().toString(), gene.getSelectedItem().toString(), deficienciaDependente.getSelectedItem().toString(), dependencia.getSelectedItem().toString());
                    Clientes cliente = new Clientes();
                    cliente.setNome_cliente(nomeCompletoDependente.getText().toString() + " DEPENDENTE");
                    cliente.setNomeSocial_cliente(nomeCompletoDependente.getText().toString() + " DEPENDENTE");
                    cliente.setIdade_cliente(idadeDep.getText().toString());
                    cliente.setGenero_cliente(gene.getSelectedItem().toString());
                    cliente.setDeficiencia_cliente(deficienciaDependente.getSelectedItem().toString());

                    AdminsDAO adminsDAO = new AdminsDAO();
                    adminsDAO.adicionarDependentes(dependente);
                    //adminsDAO.adicionarCliente(cliente);
                    System.out.println(adminsDAO.adicionarCliente(cliente));

                    readTableDep(table.getValueAt(table.getSelectedRow(), 0).toString());
                    JOptionPane.showMessageDialog(null, "Dependente cadastrado com sucesso!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                    nomeCompletoDependente.setText("");
                    idadeDep.setText("");
                }
            }
        });
        panel_2.add(btnNewButton_1);

        JLabel lblNewLabel_42 = new JLabel("IDADE");
        lblNewLabel_42.setForeground(Color.BLACK);
        lblNewLabel_42.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_42.setBounds(548, 345, 46, 14);
        panel_2.add(lblNewLabel_42);

        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBackground(new Color(20, 50, 93));
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
                new Object[][]{
                    {null, null},},
                new String[]{
                    "ID", "NOME"
                }
        ) {
            /**
             *
             */
            private static final long serialVersionUID = 1L;
            boolean[] columnEditables = new boolean[]{
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
                new Object[][]{
                    {null, null},},
                new String[]{
                    "ID", "NOME DO DEPENDENTE"
                }
        ) {
            /**
             *
             */
            private static final long serialVersionUID = 1L;
            boolean[] columnEditables = new boolean[]{
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
        lblNewLabel_43.setForeground(Color.BLACK);
        lblNewLabel_43.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_43.setBounds(218, 323, 320, 13);
        panel_2.add(lblNewLabel_43);

        JLabel lblNewLabel_44 = new JLabel("PESQUISAR O CLIENTE RESPONS\u00C1VEL");
        lblNewLabel_44.setForeground(Color.BLACK);
        lblNewLabel_44.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_44.setBounds(218, 10, 376, 13);
        panel_2.add(lblNewLabel_44);

        JTextArea txtrPassoP = new JTextArea();
        txtrPassoP.setForeground(Color.BLACK);
        txtrPassoP.setFont(new Font("Arial", Font.BOLD, 12));
        txtrPassoP.setText("PASSO 1: Pesquise \r\no nome do respons\u00E1vel \r\ntitular no campo \r\nindicado \"NOME \r\nRESPONS\u00C1VEL\"e clique \r\nem \"PESQUISAR\".\r\n\r\nPASSO 2: Clique no\r\nID referente ao \r\nrespons\u00E1vel pesquisado. \r\nVoc\u00EA ver\u00E1 que esse ID\r\nfoi adicionado ao campo\r\n\"ID\".\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nPASSO 3: Adicione o \r\nnome e a idade nos \r\ncampos \"NOME,\r\nDEPENDENTE\", \"IDADE\",\r\n\"G\u00CANERO\" e \"DEFICI\u00CANCIA\" \r\nrespectivamente. Por\r\nfim clique em \r\n\"ADICIONAR\", para \r\ncadastrar o dependente.");
        txtrPassoP.setBackground(Color.WHITE);
        txtrPassoP.setEditable(false);
        txtrPassoP.setBounds(10, 10, 152, 603);
        panel_2.add(txtrPassoP);

        JLabel lblNewLabel_48 = new JLabel("G\u00CANERO");
        lblNewLabel_48.setForeground(Color.BLACK);
        lblNewLabel_48.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_48.setBounds(640, 346, 145, 13);
        panel_2.add(lblNewLabel_48);

        JLabel lblNewLabel_49 = new JLabel("POSSUI DEFICI\u00CANCIA?");
        lblNewLabel_49.setForeground(Color.BLACK);
        lblNewLabel_49.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_49.setBounds(218, 398, 165, 13);
        panel_2.add(lblNewLabel_49);

        /*JTextArea txtFinalDaCompra = new JTextArea();
		txtFinalDaCompra.setForeground(Color.WHITE);
		txtFinalDaCompra.setFont(new Font("Arial", Font.BOLD, 12));
		txtFinalDaCompra.setText("Total de clientes atendidos: 0\r\nClientes de 0 a 15 anos (Masculino): 0\r\nClientes de 0 a 15 anos (Feminino): 0\r\nClientes de 16 a 60 anos (Masculino): 0\r\nClientes de 16 a 60 anos (Feminino): 0\r\nClientes de 60+ anos (Masculino): 0\r\nClientes de 60+ anos (Feminino): 0\r\nSenhas gen\u00E9ricas vendidas: 0");
		txtFinalDaCompra.setBackground(new Color(20, 50, 93));
		txtFinalDaCompra.setEditable(false);
		txtFinalDaCompra.setBounds(159, 489, 480, 124);
		panel_3.add(txtFinalDaCompra);*/
 /*JButton btnNewButton_3 = new JButton("GERAR SENHA");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdminsDAO adminsDAO = new AdminsDAO();
				
				if(adminsDAO.retornarUltimaSenha()<450) {
					for(int i = 0; i < table_3.getRowCount(); i++) {
						
						if(adminsDAO.retornarUltimaSenha()<450) {
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
				
				
				//for(int i = 0; i < table_3.getRowCount(); i++) {
					
					//if(adminsDAO.retornarUltimaSenha()<3) {
						//adminsDAO.inserirNaBl(table_3.getValueAt(i, 1).toString());
						//adminsDAO.inserirNaSenhaGerada(table_3.getValueAt(i, 1).toString());
					//}
					//adminsDAO.inserirNaBl(table_3.getValueAt(i, 1).toString());
					//adminsDAO.inserirNaSenhaGerada(table_3.getValueAt(i, 1).toString());
				//}
				//adminsDAO.escreverNoTXT(adminsDAO.lerBdSenha());
				//adminsDAO.deleteCED();
				//DefaultTableModel modelo = (DefaultTableModel) table_3.getModel();
				//modelo.setNumRows(0);
				//dminsDAO.deletarSenhaGerada();
			}
		});
		btnNewButton_3.setBounds(649, 309, 136, 21);
		panel_3.add(btnNewButton_3);*/
        JPanel panel_3 = new JPanel();
        panel_3.setForeground(Color.BLACK);
        panel_3.setBackground(Color.WHITE);
        tabbedPane.addTab("GERAR SENHA", null, panel_3, null);
        panel_3.setLayout(null);

        JLabel ultimaSenha = new JLabel("");
        ultimaSenha.setBounds(550, 316, 154, 14);
        panel_3.add(ultimaSenha);

        AdminsDAO adminsDAO = new AdminsDAO();

        ultimaSenha.setText("Ultima senha: " + adminsDAO.retornarUltimaSenha());

        JLabel lblNewLabel_45 = new JLabel("PESQUISAR CLIENTE");
        lblNewLabel_45.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_45.setForeground(Color.BLACK);
        lblNewLabel_45.setBounds(159, 10, 291, 13);
        panel_3.add(lblNewLabel_45);

        JLabel lblNewLabel_46 = new JLabel("NOME DO CLIENTE");
        lblNewLabel_46.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_46.setForeground(Color.BLACK);
        lblNewLabel_46.setBounds(159, 33, 244, 13);
        panel_3.add(lblNewLabel_46);

        nomeClienteSenhaPesquisar = new JTextField();
        nomeClienteSenhaPesquisar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    if (nomeClienteSenhaPesquisar.getText().toString().equalsIgnoreCase("")) {
                        JOptionPane.showMessageDialog(null, "Insira o nome do respons�vel antes de clicar em PESQUISAR.", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                        DefaultTableModel modelo2 = (DefaultTableModel) table_2.getModel();
                        modelo2.setNumRows(0);
                    } else {
                        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        Date date = new Date();

                        AdminsDAO adminsDAO = new AdminsDAO();

                        if (adminsDAO.checarRelatorios(dateFormat.format(date)) == true) {
                            JOptionPane.showMessageDialog(null, "O expediente de hoje já foi encerrado!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                        } else {
                            readTableSenha(nomeClienteSenhaPesquisar.getText());
                            //AdminsDAO adminsDAO = new AdminsDAO();
                            adminsDAO.deleteCED();
                            DefaultTableModel modelo2 = (DefaultTableModel) table_3.getModel();
                            modelo2.setNumRows(0);
                        }
                    }
                }
            }
        });
        nomeClienteSenhaPesquisar.setBounds(159, 56, 480, 19);
        panel_3.add(nomeClienteSenhaPesquisar);
        nomeClienteSenhaPesquisar.setColumns(10);

        JButton btnNewButton_2 = new JButton("PESQUISAR");
        btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 12));
        btnNewButton_2.setForeground(Color.BLACK);
        btnNewButton_2.setBackground(Color.WHITE);
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (nomeClienteSenhaPesquisar.getText().toString().equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "Insira o nome do responsável antes de clicar em PESQUISAR.", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                    DefaultTableModel modelo2 = (DefaultTableModel) table_2.getModel();
                    modelo2.setNumRows(0);
                } else {
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = new Date();

                    AdminsDAO adminsDAO = new AdminsDAO();

                    if (adminsDAO.checarRelatorios(dateFormat.format(date)) == true) {
                        JOptionPane.showMessageDialog(null, "O expediente de hoje já foi encerrado!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                    } else {
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

        JFormattedTextField telefoneGerarSenha_1 = new JFormattedTextField();
        telefoneGerarSenha_1.setFormatterFactory(new DefaultFormatterFactory(telefone));
        telefoneGerarSenha_1.setBounds(249, 249, 201, 21);
        panel_3.add(telefoneGerarSenha_1);

        JScrollPane scrollPane_3 = new JScrollPane();
        scrollPane_3.setBounds(159, 85, 480, 156);
        panel_3.add(scrollPane_3);

        JButton btnNewButton_6 = new JButton("GEN\u00C9RICO");
        btnNewButton_6.setFont(new Font("Arial", Font.BOLD, 12));
        btnNewButton_6.setForeground(Color.BLACK);
        btnNewButton_6.setBackground(Color.WHITE);
        btnNewButton_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int resultado = JOptionPane.showConfirmDialog(null, "Deseja gerar senha genérica?");

                System.out.println(resultado + "!!!!");

                if (resultado == 0) {
                    AdminsDAO adminsDAO = new AdminsDAO();

                    if (adminsDAO.retornarUltimaSenha() < 5) {

                        for (int i = 0; i < 1; i++) {

                            if (adminsDAO.retornarUltimaSenha() < 5) {
                                adminsDAO.inserirGenericoNaBL();
                                adminsDAO.inserirGenericoNaSenhaGerada();
                                adminsDAO.escreverNoTXT(adminsDAO.lerBdSenha());
                                ultimaSenha.setText("Ultima senha: " + adminsDAO.retornarUltimaSenha());
                            }
                        }

                        adminsDAO.deleteCED();
                        DefaultTableModel modelo = (DefaultTableModel) table_3.getModel();
                        modelo.setNumRows(0);
                        adminsDAO.deletarSenhaGerada();
                        DefaultTableModel modelo2 = (DefaultTableModel) table_2.getModel();
                        modelo2.setNumRows(0);
                        nomeClienteSenhaPesquisar.setText("");

                        Relatorios relatorio = new Relatorios();

                        relatorio = adminsDAO.lerParaOBl(relatorio);

                    } else {
                        JOptionPane.showMessageDialog(null, "Senhas encerradas!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Você cancelou essa ação!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        btnNewButton_6.setBounds(649, 414, 136, 23);
        panel_3.add(btnNewButton_6);

        JButton btnNewButton_3 = new JButton("GERAR SENHA");
        btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 12));
        btnNewButton_3.setForeground(Color.BLACK);
        btnNewButton_3.setEnabled(false);
        btnNewButton_3.setBackground(Color.WHITE);
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                AdminsDAO adminsDAO = new AdminsDAO();

                if (adminsDAO.retornarUltimaSenha() < 250) {

                    for (int i = 0; i < table_3.getRowCount(); i++) {

                        if (adminsDAO.retornarUltimaSenha() < 250) {
                            adminsDAO.inserirNaBl(table_3.getValueAt(i, 1).toString());
                            adminsDAO.inserirNaSenhaGerada(table_3.getValueAt(i, 1).toString());
                            adminsDAO.escreverNoTXT(adminsDAO.lerBdSenha());
                            ultimaSenha.setText("Ultima senha: " + adminsDAO.retornarUltimaSenha());
                        }
                    }

                    adminsDAO.deleteCED();
                    DefaultTableModel modelo = (DefaultTableModel) table_3.getModel();
                    modelo.setNumRows(0);
                    adminsDAO.deletarSenhaGerada();
                    DefaultTableModel modelo2 = (DefaultTableModel) table_2.getModel();
                    modelo2.setNumRows(0);
                    nomeClienteSenhaPesquisar.setText("");
                    btnNewButton_3.setEnabled(false);

                    Relatorios relatorio = new Relatorios();

                    relatorio = adminsDAO.lerParaOBl(relatorio);
                } else {
                    JOptionPane.showMessageDialog(null, "Senhas encerradas!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        btnNewButton_3.setBounds(649, 382, 136, 21);
        panel_3.add(btnNewButton_3);

        table_2 = new JTable();
        table_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AdminsDAO adminsDAO = new AdminsDAO();
                if (adminsDAO.checarBL(table_2.getValueAt(table_2.getSelectedRow(), 1).toString())) {
                    JOptionPane.showMessageDialog(null, "Este cliente já comprou senha neste dia!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                } else {
                    if (adminsDAO.retornarNumeroDeTelefone(table_2.getValueAt(table_2.getSelectedRow(), 1).toString()).equalsIgnoreCase("")) {
                        telefoneGerarSenha_1.setText("Telefone não cadastrado!");

                        btnNewButton_3.setEnabled(true);
                        if (adminsDAO.checarCliente(table_2.getValueAt(table_2.getSelectedRow(), 1).toString()) == 1) {
                            adminsDAO.inserirClienteCED(table_2.getValueAt(table_2.getSelectedRow(), 1).toString());
                            readTableCED(table_2.getValueAt(table_2.getSelectedRow(), 1).toString());
                            DefaultTableModel dtm = (DefaultTableModel) table_2.getModel();
                            dtm.removeRow(table_2.getSelectedRow());
                            table_2.setModel(dtm);
                        } else {
                            adminsDAO.inserirDependenteCED(table_2.getValueAt(table_2.getSelectedRow(), 1).toString());
                            readTableCED(table_2.getValueAt(table_2.getSelectedRow(), 1).toString());
                            DefaultTableModel dtm = (DefaultTableModel) table_2.getModel();
                            dtm.removeRow(table_2.getSelectedRow());
                            table_2.setModel(dtm);
                        }
                    } else {
                        telefoneGerarSenha_1.setText(adminsDAO.retornarNumeroDeTelefone(table_2.getValueAt(table_2.getSelectedRow(), 1).toString()));
                        btnNewButton_3.setEnabled(true);
                        if (adminsDAO.checarCliente(table_2.getValueAt(table_2.getSelectedRow(), 1).toString()) == 1) {
                            adminsDAO.inserirClienteCED(table_2.getValueAt(table_2.getSelectedRow(), 1).toString());
                            readTableCED(table_2.getValueAt(table_2.getSelectedRow(), 1).toString());
                            DefaultTableModel dtm = (DefaultTableModel) table_2.getModel();
                            dtm.removeRow(table_2.getSelectedRow());
                            table_2.setModel(dtm);
                        } else {
                            adminsDAO.inserirDependenteCED(table_2.getValueAt(table_2.getSelectedRow(), 1).toString());
                            readTableCED(table_2.getValueAt(table_2.getSelectedRow(), 1).toString());
                            DefaultTableModel dtm = (DefaultTableModel) table_2.getModel();
                            dtm.removeRow(table_2.getSelectedRow());
                            table_2.setModel(dtm);
                        }
                    }
                }
            }
        });
        table_2.setModel(new DefaultTableModel(
                new Object[][]{
                    {null, null, null},},
                new String[]{
                    "ID", "NOME COMPLETO", "IDADE"
                }
        ) {
            /**
             *
             */
            private static final long serialVersionUID = 1L;
            boolean[] columnEditables = new boolean[]{
                false, false, false
            };

            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });
        table_2.getColumnModel().getColumn(1).setPreferredWidth(303);
        scrollPane_3.setViewportView(table_2);

        JScrollPane scrollPane_4 = new JScrollPane();
        scrollPane_4.setBounds(159, 341, 480, 270);
        panel_3.add(scrollPane_4);

        table_3 = new JTable();
        table_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AdminsDAO adminsDAO = new AdminsDAO();
                DefaultTableModel dtm = (DefaultTableModel) table_3.getModel();
                DefaultTableModel dtmtable2 = (DefaultTableModel) table_2.getModel();
                dtmtable2.addRow(new Object[]{
                    table_3.getValueAt(table_3.getSelectedRow(), 0).toString(),
                    table_3.getValueAt(table_3.getSelectedRow(), 1).toString(),
                    table_3.getValueAt(table_3.getSelectedRow(), 2).toString()
                });
                adminsDAO.deleteCEDporNome(table_3.getValueAt(table_3.getSelectedRow(), 1).toString());
                dtm.removeRow(table_3.getSelectedRow());
                btnNewButton_3.setEnabled(false);
            }
        });
        table_3.setModel(new DefaultTableModel(
                new Object[][]{
                    {null, null, null},},
                new String[]{
                    "ID", "NOME COMPLETO", "IDADE"
                }
        ) {
            /**
             *
             */
            private static final long serialVersionUID = 1L;
            boolean[] columnEditables = new boolean[]{
                false, false, false
            };

            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });
        table_3.getColumnModel().getColumn(1).setPreferredWidth(202);
        scrollPane_4.setViewportView(table_3);

        JLabel lblNewLabel_47 = new JLabel("CLIENTES SELECIONADOS");
        lblNewLabel_47.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_47.setForeground(Color.BLACK);
        lblNewLabel_47.setBounds(159, 317, 244, 13);
        panel_3.add(lblNewLabel_47);

        JTextArea txtrPassoPesquise = new JTextArea();
        txtrPassoPesquise.setText("PASSO 1: Pesquise \r\npelo nome do respos\u00E1-\r\nvel no campo indicado\r\ne clique em \"PESQUISAR\"\r\nNote que ser\u00E1 exibido \r\ncomo resposta o cliente\r\nque foi pesquisado junto\r\nde seus dependentes.\r\n\r\n\r\n\r\nPASSO2: Clique sobre os\r\nnomes das pessoas para \r\nas quais voc\u00EA ir\u00E1 realizar\r\na venda das senhas.\r\nNote que ao clicar no\r\nnome das pessoas elas\r\nser\u00E3o transferidas para \r\na tabela seguinte.\r\n\r\n\r\n\r\nPASSO 3: Ao final da \r\nsele\u00E7\u00E3o, clique no bot\u00E3o \r\n\"GERAR SENHA\" e \r\nconfirme a impress\u00E3o da\r\nsenha.");
        txtrPassoPesquise.setForeground(Color.BLACK);
        txtrPassoPesquise.setFont(new Font("Arial", Font.BOLD, 12));
        txtrPassoPesquise.setEditable(false);
        txtrPassoPesquise.setBackground(Color.WHITE);
        txtrPassoPesquise.setBounds(10, 10, 152, 603);
        panel_3.add(txtrPassoPesquise);

        JLabel lblNewLabel_1 = new JLabel("TELEFONE:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1.setForeground(Color.BLACK);
        lblNewLabel_1.setBounds(172, 252, 110, 14);
        panel_3.add(lblNewLabel_1);

        JButton btnNewButton_10 = new JButton("ATUALIZAR TELEFONE");
        btnNewButton_10.setBackground(Color.WHITE);
        btnNewButton_10.setForeground(Color.BLACK);
        btnNewButton_10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                AdminsDAO adminsDAO = new AdminsDAO();

                if ((adminsDAO.atualizarTelefone(table_3.getValueAt(0, 1).toString(), telefoneGerarSenha_1.getText())) == true) {
                    JOptionPane.showMessageDialog(null, "Telefone atualizado", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Telefone n�o atualizado, reveja as informa��es", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                }

            }
        });
        btnNewButton_10.setBounds(460, 248, 179, 23);
        panel_3.add(btnNewButton_10);

        JPanel panel_4 = new JPanel();
        panel_4.setBackground(Color.WHITE);
        tabbedPane.addTab("EXPEDIENTE", null, panel_4, null);
        panel_4.setLayout(null);

        JScrollPane scrollPane_5 = new JScrollPane();
        scrollPane_5.setBounds(10, 10, 605, 302);
        panel_4.add(scrollPane_5);

        table_4 = new JTable();
        table_4.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "SENHA", "NOME COMPLETO", "G\u00CANERO", "IDADE"
                }
        ) {
            /**
             *
             */
            private static final long serialVersionUID = 1L;
            boolean[] columnEditables = new boolean[]{
                false, false, false, false
            };

            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });
        table_4.getColumnModel().getColumn(1).setPreferredWidth(202);
        scrollPane_5.setViewportView(table_4);

        JButton btnNewButton_4 = new JButton("SENHAS GERADAS");
        btnNewButton_4.setForeground(Color.BLACK);
        btnNewButton_4.setBackground(Color.WHITE);
        btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 12));
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                readTableBLACK();
            }
        });
        btnNewButton_4.setBounds(625, 13, 160, 21);
        panel_4.add(btnNewButton_4);

        JLabel lblNewLabel_37 = new JLabel("CARD\u00C1PIO:");
        lblNewLabel_37.setBounds(10, 355, 130, 14);
        panel_4.add(lblNewLabel_37);

        cardapio = new JTextField();
        cardapio.setBounds(184, 352, 300, 20);
        panel_4.add(cardapio);
        cardapio.setColumns(10);

        JLabel lblNewLabel_52 = new JLabel("IN\u00CDCIO DAS SENHAS:");
        lblNewLabel_52.setBounds(10, 380, 130, 14);
        panel_4.add(lblNewLabel_52);

        inicioSenhas = new JTextField();
        inicioSenhas.setBounds(184, 377, 151, 20);
        panel_4.add(inicioSenhas);
        inicioSenhas.setColumns(10);

        JLabel lblNewLabel_53 = new JLabel("T\u00C9RMINO DAS SENHAS:");
        lblNewLabel_53.setBounds(10, 405, 130, 14);
        panel_4.add(lblNewLabel_53);

        terminoSenhas = new JTextField();
        terminoSenhas.setBounds(184, 402, 151, 20);
        panel_4.add(terminoSenhas);
        terminoSenhas.setColumns(10);

        JLabel lblNewLabel_54 = new JLabel("T\u00C9RMINO DA DISTRIBUI\u00C7\u00C3O:");
        lblNewLabel_54.setBounds(10, 430, 160, 14);
        panel_4.add(lblNewLabel_54);

        terminoDistribuicao = new JTextField();
        terminoDistribuicao.setBounds(184, 427, 151, 20);
        panel_4.add(terminoDistribuicao);
        terminoDistribuicao.setColumns(10);

        JLabel lblNewLabel_55 = new JLabel("OCORR\u00CANCIAS:");
        lblNewLabel_55.setBounds(10, 455, 160, 14);
        panel_4.add(lblNewLabel_55);

        JScrollPane scrollPane_7 = new JScrollPane();
        scrollPane_7.setBounds(184, 455, 300, 156);
        panel_4.add(scrollPane_7);

        JTextArea ocorrencias = new JTextArea();
        ocorrencias.setLineWrap(true);
        scrollPane_7.setViewportView(ocorrencias);

        JButton btnNewButton_5 = new JButton("FECHAR O DIA");
        btnNewButton_5.setBackground(Color.WHITE);
        btnNewButton_5.setFont(new Font("Arial", Font.BOLD, 12));
        btnNewButton_5.setForeground(Color.BLACK);
        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String resultado = JOptionPane.showInputDialog(null, "Insira uma senha de Administrador para encerrar o expediente.");

                AdminsDAO adminsDAO = new AdminsDAO();

                if (adminsDAO.checarSenhaAdmin(resultado) == 1) {

                    String totalServido = JOptionPane.showInputDialog(null, "Insira o total de refei��es servidas.");

                    String ocorr = "CARD�PIO: " + cardapio.getText().toString().toUpperCase()
                            + "\n In�cio das senhas: " + inicioSenhas.getText().toString().toUpperCase()
                            + "\n T�rmino das senhas: " + terminoSenhas.getText().toString().toUpperCase()
                            + "\n T�rmino da distribui��o: " + terminoDistribuicao.getText().toString().toUpperCase()
                            + "\n Ocorr�ncias: " + ocorrencias.getText().toString().toUpperCase();

                    if (adminsDAO.inserirNasRefeicoesVendidas(Integer.parseInt(totalServido)) == true && !totalServido.toString().equalsIgnoreCase("")) {
                        Relatorios relatorio = new Relatorios();
                        adminsDAO.lerParaOBl(relatorio);
                        if (adminsDAO.inserirNosRelatorios(relatorio)) {
                            DefaultTableModel modelo2 = (DefaultTableModel) table_4.getModel();
                            modelo2.setNumRows(0);
                            JOptionPane.showMessageDialog(null, "Expediente encerrado!", "Mensagem", JOptionPane.PLAIN_MESSAGE);

                            cardapio.setText("");
                            inicioSenhas.setText("");
                            terminoSenhas.setText("");
                            terminoDistribuicao.setText("");
                            ocorrencias.setText("");

                            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                            Date date = new Date();

                            try {
                                adminsDAO.escreverNoRELATORIOTXT(adminsDAO.lerRelatorios(dateFormat.format(date), ocorr));
                                adminsDAO.dropBl();
                                adminsDAO.dropSenhaGerada();
                                adminsDAO.dropResumoDia();
                                adminsDAO.criarResumoDia();
                                adminsDAO.criarBL();
                                adminsDAO.criarSenhaGerada();

                            } catch (FileNotFoundException e1) {
                                e1.printStackTrace();
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Voc� ja encerrou o expediente hoje!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Campo para adicionar o total de refei��es servidas se encontra vazio!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Senha de administrador n�o confere!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        btnNewButton_5.setBounds(625, 44, 160, 21);
        panel_4.add(btnNewButton_5);

        JPanel panel_6 = new JPanel();
        tabbedPane.addTab("EDITAR", null, panel_6, null);
        panel_6.setLayout(null);

        nomeNX_novoEditar = new JTextField();
        nomeNX_novoEditar.setEditable(false);
        nomeNX_novoEditar.setBounds(391, 155, 394, 20);
        panel_6.add(nomeNX_novoEditar);
        nomeNX_novoEditar.setColumns(10);

        nome_novoEditar = new JTextField();
        nome_novoEditar.setBounds(510, 236, 275, 20);
        panel_6.add(nome_novoEditar);
        nome_novoEditar.setColumns(10);

        rua_novoEditar = new JTextField();
        rua_novoEditar.setBounds(510, 360, 275, 20);
        panel_6.add(rua_novoEditar);
        rua_novoEditar.setColumns(10);

        bairro_novoEditar = new JTextField();
        bairro_novoEditar.setBounds(510, 391, 275, 20);
        panel_6.add(bairro_novoEditar);
        bairro_novoEditar.setColumns(10);

        cidade_novoEditar = new JTextField();
        cidade_novoEditar.setBounds(510, 422, 275, 20);
        panel_6.add(cidade_novoEditar);
        cidade_novoEditar.setColumns(10);

        JFormattedTextField cpf_novoEditar = new JFormattedTextField(cpf);
        cpf_novoEditar.setBounds(510, 267, 275, 20);
        panel_6.add(cpf_novoEditar);

        JFormattedTextField dataNascimento_novoEditar = new JFormattedTextField(dataNascimento);
        dataNascimento_novoEditar.setBounds(510, 298, 275, 20);
        panel_6.add(dataNascimento_novoEditar);

        JFormattedTextField telefone_novoEditar = new JFormattedTextField(telefone);
        telefone_novoEditar.setBounds(510, 329, 275, 20);
        panel_6.add(telefone_novoEditar);

        JScrollPane scrollPane_6 = new JScrollPane();
        scrollPane_6.setBounds(10, 11, 371, 600);
        panel_6.add(scrollPane_6);

        table_7 = new JTable();
        table_7.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                nome_novoEditar.setText("");
                cpf_novoEditar.setText("");
                dataNascimento_novoEditar.setText("");
                telefone_novoEditar.setText("");
                rua_novoEditar.setText("");
                bairro_novoEditar.setText("");
                cidade_novoEditar.setText("");
                nomeNX_novoEditar.setText("");

                AdminsDAO adminsDAO = new AdminsDAO();

                nomeNX_novoEditar.setText(table_7.getValueAt(table_7.getSelectedRow(), 0).toString());

                Clientes c = new Clientes();

                c = adminsDAO.retornarUmClienteEditar(nomeNX_novoEditar.getText().toString());

                nome_novoEditar.setText(c.getNomeSocial_cliente());
                cpf_novoEditar.setText(c.getCpf_cliente());
                dataNascimento_novoEditar.setText(c.getDataNascimento_cliente());
                telefone_novoEditar.setText(c.getTelefone_cliente());
                rua_novoEditar.setText(c.getRua_cliente());
                bairro_novoEditar.setText(c.getBairro_cliente());
                cidade_novoEditar.setText(c.getNacionalidade_cliente());

            }
        });
        table_7.setModel(new DefaultTableModel(
                new Object[][]{
                    {null, null},},
                new String[]{
                    "NOME COMPLETO", "IDADE"
                }
        ) {
            boolean[] columnEditables = new boolean[]{
                false, true
            };

            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });
        table_7.getColumnModel().getColumn(0).setPreferredWidth(300);
        scrollPane_6.setViewportView(table_7);

        JButton btnNewButton_9 = new JButton("ATUALIZAR");
        btnNewButton_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                AdminsDAO adminsDAO = new AdminsDAO();

                adminsDAO.deleteDependentes();

                readTable7();

                nome_novoEditar.setText("");
                cpf_novoEditar.setText("");
                dataNascimento_novoEditar.setText("");
                telefone_novoEditar.setText("");
                rua_novoEditar.setText("");
                bairro_novoEditar.setText("");
                cidade_novoEditar.setText("");
                nomeNX_novoEditar.setText("");
            }
        });
        btnNewButton_9.setBounds(391, 14, 140, 23);
        panel_6.add(btnNewButton_9);

        JButton btnNewButton_11 = new JButton("EXCLUIR");
        btnNewButton_11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                AdminsDAO adminsDAO = new AdminsDAO();

                adminsDAO.deleteClientePorNome(nomeNX_novoEditar.getText());

                readTable7();

                nomeNX_novoEditar.setText("");
            }
        });
        btnNewButton_11.setBounds(480, 506, 89, 23);
        panel_6.add(btnNewButton_11);

        JButton btnNewButton_12 = new JButton("EDITAR");
        btnNewButton_12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (nomeNX_novoEditar.getText().toString().equalsIgnoreCase("")) {

                    JOptionPane.showMessageDialog(null, "Algum campo se encontra vazio.", "Mensagem", JOptionPane.PLAIN_MESSAGE);

                } else {
                    if (nome_novoEditar.getText().toString().equalsIgnoreCase("")
                            || cpf_novoEditar.getText().toString().equalsIgnoreCase("   .   .   -  ")
                            || dataNascimento_novoEditar.getText().toString().equalsIgnoreCase("  /  /    ")
                            || telefone_novoEditar.getText().toString().equalsIgnoreCase("(  )     -    ")
                            || rua_novoEditar.getText().toString().equalsIgnoreCase("")
                            || bairro_novoEditar.getText().toString().equalsIgnoreCase("")
                            || cidade_novoEditar.getText().toString().equalsIgnoreCase("")) {

                        JOptionPane.showMessageDialog(null, "Algum campo se encontra vazio.", "Mensagem", JOptionPane.PLAIN_MESSAGE);

                    } else {

                        Integer idade = ((2022) - (Integer.parseInt(dataNascimento_novoEditar.getText().substring(6, 10))));

                        AdminsDAO adminsDAO = new AdminsDAO();

                        adminsDAO.deleteClientePorNome(nomeNX_novoEditar.getText().toString());

                        Clientes c = new Clientes();

                        c.setNomeSocial_cliente(nome_novoEditar.getText().toString().toUpperCase());

                        if (cpf_novoEditar.getText().toString().equalsIgnoreCase("000.000.000-00")) {

                            c.setCpf_cliente("DEPENDENTE");
                        }

                        c.setDataNascimento_cliente(dataNascimento_novoEditar.getText().toString().toUpperCase());
                        c.setIdade_cliente("" + idade + "");
                        c.setTelefone_cliente(telefone_novoEditar.getText().toString().toUpperCase());
                        c.setRua_cliente(rua_novoEditar.getText().toString().toUpperCase());
                        c.setBairro_cliente(bairro_novoEditar.getText().toString().toUpperCase());
                        c.setNacionalidade_cliente(cidade_novoEditar.getText().toString().toUpperCase());
                        c.setCpf_cliente(cpf_novoEditar.getText().toString());

                        adminsDAO.adicionarCliente(c);

                        JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!", "Mensagem", JOptionPane.PLAIN_MESSAGE);

                        nome_novoEditar.setText("");
                        cpf_novoEditar.setText("");
                        dataNascimento_novoEditar.setText("");
                        telefone_novoEditar.setText("");
                        rua_novoEditar.setText("");
                        bairro_novoEditar.setText("");
                        cidade_novoEditar.setText("");
                        nomeNX_novoEditar.setText("");

                        readTable7();
                    }
                }
            }
        });
        btnNewButton_12.setBounds(579, 506, 89, 23);
        panel_6.add(btnNewButton_12);

        JLabel lblNewLabel_60 = new JLabel("NOME");
        lblNewLabel_60.setBounds(391, 239, 71, 14);
        panel_6.add(lblNewLabel_60);

        JLabel lblNewLabel_61 = new JLabel("CPF");
        lblNewLabel_61.setBounds(391, 270, 71, 14);
        panel_6.add(lblNewLabel_61);

        JLabel lblNewLabel_62 = new JLabel("DATA DE NASC.");
        lblNewLabel_62.setBounds(391, 301, 104, 14);
        panel_6.add(lblNewLabel_62);

        JLabel lblNewLabel_63 = new JLabel("TELEFONE");
        lblNewLabel_63.setBounds(391, 332, 104, 14);
        panel_6.add(lblNewLabel_63);

        JLabel lblNewLabel_64 = new JLabel("RUA");
        lblNewLabel_64.setBounds(391, 363, 71, 14);
        panel_6.add(lblNewLabel_64);

        JLabel lblNewLabel_65 = new JLabel("BAIRRO");
        lblNewLabel_65.setBounds(391, 394, 71, 14);
        panel_6.add(lblNewLabel_65);

        JLabel lblNewLabel_66 = new JLabel("CIDADE");
        lblNewLabel_66.setBounds(391, 425, 71, 14);
        panel_6.add(lblNewLabel_66);

        /*JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		tabbedPane.addTab("UNIFICA��O", null, panel_5, null);
		panel_5.setLayout(null);
		
		JFormattedTextField cpfUniao = new JFormattedTextField(cpf);
		cpfUniao.setBounds(10, 216, 149, 20);
		panel_5.add(cpfUniao);
		
		JFormattedTextField telefoneUniao = new JFormattedTextField(telefone);
		telefoneUniao.setBounds(10, 328, 149, 20);
		panel_5.add(telefoneUniao);
		
		JFormattedTextField cpfUniaoPesquisar = new JFormattedTextField(cpf);
		cpfUniaoPesquisar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				
					AdminsDAO adminsDAO = new AdminsDAO();
				
					if(adminsDAO.checarUniao(cpfUniaoPesquisar.getText().toString())==true) {
					
						JOptionPane.showMessageDialog(null, "Dados j� atualizados!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
					}
				
					else {
						
						Clientes cli = new Clientes();
					
						cli = adminsDAO.voltarCliente(cpfUniaoPesquisar.getText().toString());
					
						nomeCompletoUniao.setText(cli.getNome_cliente());
						cpfUniao.setText(cli.getCpf_cliente());
						telefoneUniao.setText(cli.getTelefone_cliente());
					}
				}
			}
		});
		cpfUniaoPesquisar.setBounds(10, 54, 149, 20);
		panel_5.add(cpfUniaoPesquisar);
		
		nomeCompletoUniao = new JTextField();
		nomeCompletoUniao.setBounds(10, 160, 327, 20);
		panel_5.add(nomeCompletoUniao);
		nomeCompletoUniao.setColumns(10);
		
		ruaUniao = new JTextField();
		ruaUniao.setBounds(10, 272, 337, 20);
		panel_5.add(ruaUniao);
		ruaUniao.setColumns(10);
		
		bairroUniao = new JTextField();
		bairroUniao.setBounds(357, 272, 130, 20);
		panel_5.add(bairroUniao);
		bairroUniao.setColumns(10);
		
		cidadeUniao = new JTextField();
		cidadeUniao.setBounds(497, 272, 130, 20);
		panel_5.add(cidadeUniao);
		cidadeUniao.setColumns(10);
		
		JLabel lblNewLabel_37 = new JLabel("NOME COMPLETO");
		lblNewLabel_37.setBounds(10, 135, 149, 14);
		panel_5.add(lblNewLabel_37);
		
		JLabel lblNewLabel_52 = new JLabel("CPF");
		lblNewLabel_52.setBounds(10, 191, 211, 14);
		panel_5.add(lblNewLabel_52);
		
		JLabel lblNewLabel_53 = new JLabel("RUA");
		lblNewLabel_53.setBounds(10, 247, 211, 14);
		panel_5.add(lblNewLabel_53);
		
		JLabel lblNewLabel_54 = new JLabel("BAIRRO");
		lblNewLabel_54.setBounds(357, 247, 130, 14);
		panel_5.add(lblNewLabel_54);
		
		JLabel lblNewLabel_55 = new JLabel("CIDADE");
		lblNewLabel_55.setBounds(497, 247, 149, 14);
		panel_5.add(lblNewLabel_55);
		
		JLabel lblNewLabel_56 = new JLabel("TELEFONE");
		lblNewLabel_56.setBounds(10, 303, 149, 14);
		panel_5.add(lblNewLabel_56);
		
		JButton btnNewButton_7 = new JButton("PESQUISAR");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdminsDAO adminsDAO = new AdminsDAO();
				
				if(adminsDAO.checarUniao(cpfUniaoPesquisar.getText().toString())==true) {
					
					JOptionPane.showMessageDialog(null, "Dados j� atualizados!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
				}
				
				else {
					
					Clientes cli = new Clientes();
					
					cli = adminsDAO.voltarCliente(cpfUniaoPesquisar.getText().toString());
					
					nomeCompletoUniao.setText(cli.getNome_cliente());
					cpfUniao.setText(cli.getCpf_cliente());
					telefoneUniao.setText(cli.getTelefone_cliente());
				}
			}
		});
		btnNewButton_7.setBounds(169, 53, 168, 23);
		panel_5.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("CADASTRAR");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdminsDAO adminsDAO = new AdminsDAO();
				
				if(cpfUniao.getText().toString().equalsIgnoreCase("   .   .   -  ") || nomeCompletoUniao.getText().toString().equalsIgnoreCase("") || ruaUniao.getText().toString().equalsIgnoreCase("") || bairroUniao.getText().toString().equalsIgnoreCase("") || cidadeUniao.getText().toString().equalsIgnoreCase("")) {
					
					JOptionPane.showMessageDialog(null, "Alguns campos se encontram vazios!", "Mensagem", JOptionPane.PLAIN_MESSAGE);

				}
				
				else {
					
					Uniao uni = new Uniao();
					
					uni.setNomeCompletoUniao(nomeCompletoUniao.getText().toString().toUpperCase());
					uni.setCpfUniao(cpfUniao.getText().toString());
					uni.setRua(ruaUniao.getText().toString().toUpperCase());
					uni.setBairro(bairroUniao.getText().toString().toUpperCase());
					uni.setCidade(cidadeUniao.getText().toString().toUpperCase());
					uni.setTelefone(telefoneUniao.getText().toString());
					
					if(adminsDAO.inserirNaUniao(uni)==true) {
						
						JOptionPane.showMessageDialog(null, "Os dados foram atualizados!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
						
						nomeCompletoUniao.setText("");
						cpfUniao.setText("");
						ruaUniao.setText("");
						bairroUniao.setText("");
						cidadeUniao.setText("");
						telefoneUniao.setText("");
						
					}

					else {
						JOptionPane.showMessageDialog(null, "Cliente j� cadastrado!", "Mensagem", JOptionPane.PLAIN_MESSAGE);

					}
					
				}
				
			}
		});
		btnNewButton_8.setBounds(10, 410, 149, 23);
		panel_5.add(btnNewButton_8);
		
		JLabel lblNewLabel_57 = new JLabel("PESQUISE O CPF DO CLIENTE");
		lblNewLabel_57.setBounds(10, 29, 337, 14);
		panel_5.add(lblNewLabel_57);
		
		JLabel lblNewLabel_51_1 = new JLabel("");
		lblNewLabel_51_1.setBounds(338, 281, 447, 330);
		panel_5.add(lblNewLabel_51_1);
         */
        ///////////////////////////////////////////////////////////////////////////////////////////
        /*JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(20, 50, 93));
		tabbedPane.addTab("CLIENTES", null, panel_5, null);
		panel_5.setLayout(null);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(10, 10, 589, 601);
		panel_5.add(scrollPane_6);
		
		table_5 = new JTable();
		table_5.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"ID", "CPF", "NOME COMPLETO", "IDADE", "TELEFONE"
			}
		));
		table_5.getColumnModel().getColumn(0).setPreferredWidth(39);
		table_5.getColumnModel().getColumn(1).setPreferredWidth(130);
		table_5.getColumnModel().getColumn(2).setPreferredWidth(270);
		table_5.getColumnModel().getColumn(3).setPreferredWidth(45);
		table_5.getColumnModel().getColumn(4).setPreferredWidth(139);
		scrollPane_6.setViewportView(table_5);
		
		JButton btnNewButton_7 = new JButton("MOSTRAR LISTA");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				readTableClientes();
			}
		});
		btnNewButton_7.setBounds(609, 13, 176, 21);
		panel_5.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("ATUALIZAR O BANCO");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminsDAO adminsDAO = new AdminsDAO();
				for(int contador = 1; contador<=adminsDAO.retornarQtdClientes(); contador++) {
					adminsDAO.inserirNoBancoUnificado(adminsDAO.retornarUmCliente(contador));
				}
			}
		});
		btnNewButton_8.setBounds(609, 45, 176, 23);
		panel_5.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("GERAR PDF");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminsDAO adminsDAO = new AdminsDAO();
				try {
					adminsDAO.escreverNoRELATORIOTXT(adminsDAO.lerPDF());
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_9.setBounds(609, 79, 176, 23);
		panel_5.add(btnNewButton_9);*/
    }

    public void readTable7() {
        DefaultTableModel modelo = (DefaultTableModel) table_7.getModel();
        modelo.setNumRows(0);
        AdminsDAO adminsDAO = new AdminsDAO();

        for (Clientes c : adminsDAO.listarTodosClientes()) {
            modelo.addRow(new Object[]{
                c.getNomeSocial_cliente(),
                c.getIdade_cliente()
            });
        }
    }

    public void readTable(String nomeCliente) {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setNumRows(0);
        AdminsDAO adminsDAO = new AdminsDAO();

        for (Clientes c : adminsDAO.listarClientesDep(nomeCliente)) {
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

        for (Dependentes d : adminsDAO.listarDependentes(idClienteDep)) {
            System.out.println(d.getIdDependente());
            modelo.addRow(new Object[]{
                d.getIdDependente(),
                d.getNomeCompletoDependente()
            });
        }
    }

    public void readTableSenha(String nomeClienteSenha) {
        DefaultTableModel modelo = (DefaultTableModel) table_2.getModel();
        modelo.setNumRows(0);
        AdminsDAO adminsDAO = new AdminsDAO();

        for (Clientes c : adminsDAO.listarClientesDep(nomeClienteSenha)) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome_cliente(),
                c.getIdade_cliente()
            });
        }

        for (Dependentes d : adminsDAO.listarDependentes("" + adminsDAO.listarIDClientes(nomeClienteSenha) + "")) {
            modelo.addRow(new Object[]{
                d.getIdDependente(),
                d.getNomeCompletoDependente(),
                d.getIdadeDependente()
            });
        }
    }

    public void readTableEdicao(String nomeCliente) {
        DefaultTableModel modelo = (DefaultTableModel) table_6.getModel();
        modelo.setNumRows(0);
        AdminsDAO adminsDAO = new AdminsDAO();

        for (Clientes c : adminsDAO.listCLIENTESporNome(nomeCliente)) {
            modelo.addRow(new Object[]{
                c.getNomeSocial_cliente(),});
        }
    }

    public void readTableCED(String nome) {
        DefaultTableModel modelo = (DefaultTableModel) table_3.getModel();
        AdminsDAO adminsDAO = new AdminsDAO();

        for (ClientesEDependentes cli : adminsDAO.listCED(nome)) {
            modelo.addRow(new Object[]{
                cli.getId(),
                cli.getNomeCompleto(),
                cli.getIdade()
            });
        }
    }

    public void readTableBLACK() {
        DefaultTableModel modelo = (DefaultTableModel) table_4.getModel();
        modelo.setNumRows(0);
        AdminsDAO adminsDAO = new AdminsDAO();

        for (ClientesEDependentes cli : adminsDAO.listBLACK()) {
            modelo.addRow(new Object[]{
                cli.getId(),
                cli.getNomeCompleto(),
                cli.getGenero(),
                cli.getIdade()
            });
        }
    }

    public void readTableClientes() {
        DefaultTableModel modelo = (DefaultTableModel) table_5.getModel();
        modelo.setNumRows(0);
        AdminsDAO adminsDAO = new AdminsDAO();

        int contador = 1;

        for (Clientes cli : adminsDAO.listCLIENTES()) {

            if (cli.getCpf_cliente().equalsIgnoreCase("null")) {
                cli.setCpf_cliente("DEPENDENTE");
            }

            modelo.addRow(new Object[]{
                contador,
                cli.getCpf_cliente(),
                cli.getNome_cliente(),
                cli.getIdade_cliente(),
                ""
            });
            contador++;
        }
    }
}
