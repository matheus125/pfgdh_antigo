import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class AdminsDAO extends BancoDeDados {

    public void listarAdmins() {
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from admins");
            while (rs.next()) {
                System.out.println("Admin " + rs.getString(6));
            }
        } catch (SQLException e) {

        }
    }

    public int listarIDClientes(String nomeCliente) {

        int id = 0;

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from clientes where nomeCompletoSocial like '%" + nomeCliente + "%'");
            while (rs.next()) {
                id = Integer.parseInt(rs.getString(1));
            }
        } catch (SQLException e) {
        }
        return id;
    }

    public boolean verificarClienteExistente(String cpf) {

        int contador = 0;

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from clientes where cpf_cliente='" + cpf + "'");

            while (rs.next()) {
                contador = 1;
            }

            if (contador == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            return false;
        }
    }

    public boolean adicionarAdmin(Admins admin) {
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("insert into admins values('" + admin.getNome_admin().toString() + "', '" + admin.getCpf_admin().toString() + "', '" + admin.getNome_admin().toString() + "', '" + admin.getSenha_admin().toString() + "', '" + admin.getTelefone_admin().toString() + "' , '" + admin.getCargo_admin() + "');");
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean adicionarDependentes(Dependentes dependente) {
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("insert into dependentes values(" + dependente.getIdDependente() + ", '" + dependente.getNomeCompletoDependente() + "', '" + dependente.getIdadeDependente() + "', '" + dependente.getGenero() + "', '" + dependente.getDeficiencia() + "', '" + dependente.getDependencia() + "')");
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public List<Clientes> listarClientesDep(String nomeCliente) {

        List<Clientes> clientes = new ArrayList<>();

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from clientes where nomeCompletoSocial like '%" + nomeCliente + "%' order by nomeCompletoSocial");

            while (rs.next()) {
                Clientes cliente = new Clientes();
                cliente.setId("" + rs.getInt(1) + "");
                cliente.setNome_cliente(rs.getString(3));
                cliente.setIdade_cliente(rs.getString(8));
                //System.out.println(""+rs.getInt(1)+""+rs.getString(2));
                clientes.add(cliente);
            }
        } catch (SQLException e) {

        }
        return clientes;
    }

    public int retornarQtdClientes() {
        int contador = 0;

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select id_cliente from clientes order by id_cliente desc limit 1");

            while (rs.next()) {
                contador = rs.getInt(1);
            }

            return contador;

        } catch (SQLException e) {
            return contador;
        }
    }

    public boolean existeCliente(int id) {

        int contador = 0;

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from clientes where id_cliente=" + id + ";");

            while (rs.next()) {
                contador = 1;
            }

            if (contador == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            return false;
        }
    }

    public Clientes retornarUmCliente(int id) {
        Clientes cliente = new Clientes();

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from clientes where id_cliente=" + id + ";");

            while (rs.next()) {

                cliente.setDeficiencia_cliente(rs.getString(38));
                cliente.setNacionalidade_cliente(rs.getString(18));
                cliente.setBairro_cliente(rs.getString(14));
                cliente.setRua_cliente(rs.getString(15));
                cliente.setGenero_cliente(rs.getString(9));
                cliente.setDataNascimento_cliente(rs.getString(7));
                cliente.setCpf_cliente(rs.getString(12));
                cliente.setNomeSocial_cliente(rs.getString(3));
                cliente.setIdade_cliente(rs.getString(8));
                cliente.setTelefone_cliente(rs.getString(6));
            }
            return cliente;
        } catch (SQLException e) {
            return cliente;
        }
    }

    public boolean inserirNoBancoUnificado(Clientes cliente) {
        try {
            Statement st = conexao.createStatement();

            st.executeUpdate("insert into bancosUnificados values('" + cliente.getCpf_cliente() + "', '" + cliente.getNome_cliente() + "', '" + cliente.getIdade_cliente() + "', '" + cliente.getTelefone_cliente() + "');");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public List<Clientes> listarTodosClientes() {

        List<Clientes> clientes = new ArrayList<>();

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from clientes order by nomeCompletoSocial");

            while (rs.next()) {
                Clientes cliente = new Clientes();
                cliente.setNomeSocial_cliente(rs.getString(3));
                cliente.setIdade_cliente(rs.getString(8));
                clientes.add(cliente);
            }
        } catch (SQLException e) {

        }
        return clientes;
    }

    public List<Dependentes> listarDependentes(String idDependente) {

        List<Dependentes> dependentes = new ArrayList<>();

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from dependentes where id_dependente=" + idDependente + " order by nomeCompleto_dependente");

            while (rs.next()) {
                Dependentes dependente = new Dependentes();
                dependente.setIdDependente("" + rs.getInt(1) + "");
                dependente.setNomeCompletoDependente(rs.getString(2));
                dependente.setIdadeDependente(rs.getString(3));
                dependentes.add(dependente);
            }
        } catch (SQLException e) {

        }
        return dependentes;
    }

    public List<ClientesEDependentes> listCED(String nome) {

        List<ClientesEDependentes> ceds = new ArrayList<>();

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from clientesedependentes where nomeCompleto_ced='" + nome + "'");

            while (rs.next()) {
                ClientesEDependentes ced = new ClientesEDependentes();
                ced.setId("" + rs.getInt(1) + "");
                ced.setNomeCompleto(rs.getString(2));
                ced.setIdade(rs.getString(3));
                ceds.add(ced);
            }
        } catch (SQLException e) {

        }
        return ceds;
    }

    public List<ClientesEDependentes> listBLACK() {

        List<ClientesEDependentes> ceds = new ArrayList<>();

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from blacklist");

            while (rs.next()) {
                ClientesEDependentes ced = new ClientesEDependentes();
                //System.out.print(+rs.getInt(1));
                ced.setId("" + rs.getInt(1) + "");
                ced.setNomeCompleto(rs.getString(2));
                ced.setIdade(rs.getString(3));
                ced.setGenero(rs.getString(4));
                ceds.add(ced);
            }
        } catch (SQLException e) {

        }
        return ceds;
    }

    public List<Clientes> listCLIENTES() {

        List<Clientes> clientes = new ArrayList<>();

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from bancosunificados");

            while (rs.next()) {

                if (rs.getString(4).equalsIgnoreCase("(  )     -    ") || rs.getString(4).equalsIgnoreCase("(00)00000-0000")) {

                } else {
                    Clientes cli = new Clientes();
                    cli.setCpf_cliente(rs.getString(1));
                    cli.setNome_cliente(rs.getString(2));
                    cli.setIdade_cliente(rs.getString(3));
                    cli.setTelefone_cliente(rs.getString(4));
                    clientes.add(cli);
                }
            }
        } catch (SQLException e) {

        }
        return clientes;
    }

    public List<Clientes> listCLIENTESporNome(String nomeCliente) {

        List<Clientes> clientes = new ArrayList<>();

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from clientes where nomeCompletoSocial like '%" + nomeCliente + "%' order by nomeCompletoSocial");

            while (rs.next()) {
                Clientes cli = new Clientes();
                cli.setId(rs.getString(1));
                cli.setNome_cliente(rs.getString(3));
                clientes.add(cli);
            }
        } catch (SQLException e) {

        }
        return clientes;
    }

    public boolean deleteCEDporNome(String nome) {
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("delete from clientesedependentes where nomeCompleto_ced='" + nome + "'");
            return true;

        } catch (SQLException e) {
            return false;
        }
    }

    public Clientes retornarUmClienteEditar(String nome) {

        Clientes cliente = new Clientes();

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from clientes where nomeCompletoSocial='" + nome + "'");

            while (rs.next()) {

                cliente.setNomeSocial_cliente(rs.getString(3));
                cliente.setCpf_cliente(rs.getString(12));
                cliente.setTelefone_cliente(rs.getString(6));
                cliente.setDataNascimento_cliente(rs.getString(7));
                cliente.setRua_cliente(rs.getString(15));
                cliente.setBairro_cliente(rs.getString(14));
                cliente.setNacionalidade_cliente(rs.getString(18));
            }

            return cliente;
        } catch (SQLException e) {

            return cliente;
        }

    }

    public boolean deleteClientePorNome(String nome) {

        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("delete from clientes where nomeCompletoSocial='" + nome + "' limit 1");

            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean deleteDependentes() {

        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("delete from dependentes");

            return true;
        } catch (SQLException e) {

            return false;
        }
    }

    public boolean deleteClientePeloNome(String nome) {

        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("delete from clientes where nomeCompletoSocial='" + nome + "'");
            return true;

        } catch (SQLException e) {
            return false;
        }
    }

    public boolean dropBl() {
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("drop table blacklist");
            return true;

        } catch (SQLException e) {
            return false;
        }
    }

    public boolean dropSenhaGerada() {
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("drop table senhagerada");
            return true;

        } catch (SQLException e) {
            return false;
        }
    }

    public boolean dropResumoDia() {
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("drop table resumodia");
            return true;

        } catch (SQLException e) {
            return false;
        }
    }

    public boolean criarResumoDia() {
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("CREATE TABLE resumodia(\r\n"
                    + "clientesCadastrados INT NOT NULL PRIMARY KEY AUTO_INCREMENT\r\n"
                    + ");");
            return true;

        } catch (SQLException e) {
            return false;
        }
    }

    public boolean criarBL() {
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("CREATE TABLE blacklist(\r\n"
                    + "id_bl INT NOT NULL PRIMARY KEY AUTO_INCREMENT,\r\n"
                    + "nomeCompleto_bl VARCHAR(100) NOT NULL,\r\n"
                    + "idade_bl VARCHAR(20) NOT NULL,\r\n"
                    + "genero_bl VARCHAR(30) NOT NULL,\r\n"
                    + "deficiencia_bl VARCHAR(30) NOT NULL\r\n"
                    + ");");
            return true;

        } catch (SQLException e) {
            return false;
        }
    }

    public boolean criarSenhaGerada() {
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("CREATE TABLE senhagerada(\r\n"
                    + "id_senha INT NOT NULL PRIMARY KEY AUTO_INCREMENT,\r\n"
                    + "nomeCompleto_senha VARCHAR(100) NOT NULL,\r\n"
                    + "idade_senha VARCHAR(20) NOT NULL,\r\n"
                    + "genero_senha VARCHAR(30) NOT NULL,\r\n"
                    + "valor_senha INT NOT NULL\r\n"
                    + ");");
            return true;

        } catch (SQLException e) {
            return false;
        }
    }

    public boolean adicionarCliente(Clientes cliente) {
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("insert into clientes values(" + cliente.getId() + ", '"
                    + cliente.getNome_cliente() + "', '"
                    + cliente.getNomeSocial_cliente() + "', '"
                    + cliente.getCor_cliente() + "', '"
                    + cliente.getNomeDaMae_cliente() + "', '"
                    + cliente.getTelefone_cliente() + "', '"
                    + cliente.getDataNascimento_cliente() + "', '"
                    + cliente.getIdade_cliente() + "', '"
                    + cliente.getGenero_cliente() + "', '"
                    + cliente.getEstadoCivil_cliente() + "', '"
                    + cliente.getRg_cliente() + "', '"
                    + cliente.getCpf_cliente() + "', '"
                    + cliente.getCep_cliente() + "', '"
                    + cliente.getBairro_cliente() + "', '"
                    + cliente.getRua_cliente() + "', '"
                    + cliente.getNumeroCasa_cliente() + "', '"
                    + cliente.getReferencia_cliente() + "', '"
                    + cliente.getNacionalidade_cliente() + "', '"
                    + cliente.getNaturalidade_cliente() + "', '"
                    + cliente.getTempoDeMoradia_cliente() + "', '"
                    + cliente.getNis_cliente() + "', '"
                    + cliente.getEscolaridade_cliente() + "', '"
                    + cliente.getRenda_cliente() + "', '"
                    + cliente.getProgramasSoc_cliente() + "', '"
                    + cliente.getEmprego_cliente() + "', '"
                    + cliente.getQtdPessoasTrab_cliente() + "', '"
                    + cliente.getProfissaoResponsavel_cliente() + "', '"
                    + cliente.getComposicaoFamiliar_cliente() + "', '"
                    + cliente.getMoradia_cliente() + "', '"
                    + cliente.getEstruturaMoradia_cliente() + "', '"
                    + cliente.getLixocoleta_cliente() + "', '"
                    + cliente.getAguaEncanada_cliente() + "', '"
                    + cliente.getEnergiaEletrica_cliente() + "', '"
                    + cliente.getEscoamento_cliente() + "', '"
                    + cliente.getCentro_cliente() + "', '"
                    + cliente.getDoenca_cliente() + "', '"
                    + cliente.getOutrasDoencas_cliente() + "', '"
                    + cliente.getDeficiencia_cliente() + "', '"
                    + cliente.getLaudo_cliente() + "', '"
                    + cliente.getJustificativa_cliente() + "', '"
                    + cliente.getObs_cliente() + "');");
            return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public String entrarNoSistema(String cpf, String senha) {
        String cargo = null;

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from admins where cpf_admin='" + cpf + "' and senha_admin='" + senha + "'");
            while (rs.next()) {
                cargo = rs.getString(6);
            }
            return cargo;
        } catch (SQLException e) {
            return cargo;
        }
    }

    public boolean entrarNoSistemaVERDADEIRO(String cpf, String senha) {

        int contador = 0;

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from admins where cpf_admin='" + cpf + "' and senha_admin='" + senha + "'");
            while (rs.next()) {
                contador = 1;
            }

            if (contador == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            return false;
        }
    }

    public int checarCliente(String nome) {
        int resultado = 0;

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from clientes where nomeCompletoSocial='" + nome + "'");

            while (rs.next()) {
                resultado = 1;
            }

            return resultado;

        } catch (SQLException e) {
            return resultado;
        }
    }

    public String retornarUltimoNomeDaBlacklist() {
        String nome = "";

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select nomeCompleto_bl from blacklist order by id_bl desc limit 1");

            while (rs.next()) {
                nome = rs.getString(1);
            }

            return nome;

        } catch (SQLException e) {
            return nome;
        }
    }

    public int checarSenhaAdmin(String senha) {
        int resultado = 0;

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from admins where senha_admin='" + senha + "'");

            while (rs.next()) {
                resultado = 1;
            }

            return resultado;

        } catch (SQLException e) {
            return resultado;
        }
    }

    public boolean inserirClienteCED(String nome) {
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from clientes where nomeCompletoSocial='" + nome + "'");

            while (rs.next()) {
                st.executeUpdate("insert into clientesedependentes values(" + rs.getInt(1) + ", '" + rs.getString(3) + "', '" + rs.getString(8) + "', '" + rs.getString(9) + "', '" + rs.getString(38) + "')");
            }
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean inserirDependenteCED(String nome) {
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from dependentes where nomeCompleto_dependente='" + nome + "'");

            while (rs.next()) {
                st.executeUpdate("insert into clientesedependentes values(" + rs.getInt(1) + ", '" + rs.getString(2) + "', '" + rs.getString(3) + "', '" + rs.getString(4) + "', '" + rs.getString(5) + "')");
            }
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean inserirNaBl(String nome) {

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from clientesedependentes where nomeCompleto_ced='" + nome + "'");

            while (rs.next()) {
                st.executeUpdate("insert into blacklist values(NULL, '" + rs.getString(2) + "', '" + rs.getString(3) + "', '" + rs.getString(4) + "', '" + rs.getString(5) + "')");
            }
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean inserirGenericoNaBL() {
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("insert into blacklist values(NULL, 'GENERICO', '1', '1', '1')");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean inserirGenericoNaSenhaGerada() {
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("insert into senhagerada values(NULL, 'GENERICO', '1', '1', 1)");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean inserirNaSenhaGerada(String nome) {
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from clientesedependentes where nomeCompleto_ced='" + nome + "'");

            while (rs.next()) {
                st.executeUpdate("insert into senhagerada values(NULL, '" + rs.getString(2) + "', '" + rs.getString(3) + "', '" + rs.getString(4) + "', 1)");
            }
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean inserirUltimoLogin(String cpf) {
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from admins where cpf_admin='" + cpf + "'");

            while (rs.next()) {
                st.executeUpdate("insert into ultimologin values ('" + rs.getString(1) + "', '" + cpf + "')");
            }

            return true;

        } catch (SQLException e) {
            return false;
        }
    }

    public String retornarUltimoLogin() {
        String nome = "";

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from ultimologin");

            while (rs.next()) {
                nome = rs.getString(1) + " " + rs.getString(2);
            }
            return nome;

        } catch (SQLException e) {
            return nome;
        }
    }

    public boolean inserirNasRefeicoesVendidas(int totalServido) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();

        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("insert into refeicoesvendidas values(" + totalServido + ", '" + dateFormat.format(date) + "')");
            return true;

        } catch (SQLException e) {
            return false;
        }
    }

    public String retornarTotalServido() {

        String total = "";

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("Select * from refeicoesvendidas");

            while (rs.next()) {
                total = rs.getInt(1) + "";
            }

            return total;

        } catch (SQLException e) {
            return total;
        }
    }

    /*public String lerBdSenha() {
		String dadosSenha = "";
		
		//DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
		//Date date = new Date();
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		
		String txt = "- GOVERNO DO ESTADO DO AMAZONAS -\n\n"
				+ "                         SENHA: ";
		
		try {
			Statement st = conexao.createStatement();
			ResultSet rs = st.executeQuery("select id_bl from blacklist order by id_bl desc limit 1");
			
			while(rs.next()) {
				dadosSenha = (""+dadosSenha+"00"+(rs.getInt(1))+"  ");
			}
			
			//rs = st.executeQuery("select * from senhagerada");
			
			return txt+dadosSenha+"\n\n                         "+dateFormat.format(date)+    "\n\n            PRATO CHEIO PARINTINS";
			
		} catch(SQLException e) {
			return txt+dadosSenha+"\n\n"+
					 "\n\n-----------------------------------\n\n";
		}
	}*/
    public String lerBdSenha() {
        String dadosSenha = "";

        //DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        //Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();

        String txt = "- GOVERNO DO ESTADO DO AMAZONAS -\n\n"
                + "             SENHA: ";

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select id_bl from blacklist order by id_bl desc limit 1");

            while (rs.next()) {
                dadosSenha = ("" + dadosSenha + "00" + (rs.getInt(1)) + "  ");
            }

            //rs = st.executeQuery("select * from senhagerada");
            return txt + dadosSenha + "\n\n" + dateFormat.format(date) + "\n\nVIVER MELHOR";

        } catch (SQLException e) {
            return txt + dadosSenha + "\n\n"
                    + "\n\n-----------------------------------\n\n";
        }
    }

    public boolean deleteCED() {
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("delete from clientesedependentes");
            return true;

        } catch (SQLException e) {
            return false;
        }
    }

    public boolean deletarSenhaGerada() {
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("delete from senhagerada");
            return true;

        } catch (SQLException e) {
            return false;
        }
    }

    public boolean checarBL(String nome) {
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from blacklist where nomeCompleto_bl='" + nome + "'");

            if (rs.next()) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            return false;
        }
    }

    public boolean inserirNosRelatorios(Relatorios relatorio) {

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();

        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("insert into relatorios values(" + relatorio.get_0a16Masculino() + ", " + relatorio.get_0a16Feminino() + ", " + relatorio.get_16a60Masculino() + ", " + relatorio.get_16a60Feminino() + ", " + relatorio.get_60Masculino() + ", " + relatorio.get_60Feminino() + ", " + relatorio.get_semDN() + ", " + relatorio.get_deficientes() + ", " + relatorio.get_genericos() + ", " + relatorio.get_totalDePessoasAtendidas() + ", '" + dateFormat.format(date) + "');");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean inserirClientesCadastrados() {

        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("insert into resumodia values(NULL)");

            return true;

        } catch (SQLException e) {
            return false;
        }
    }

    public int checarClientesCadastrados() {
        int contador = 0;

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from resumodia order by clientesCadastrados desc limit 1");

            while (rs.next()) {
                contador = rs.getInt(1);
            }

            return contador;

        } catch (SQLException e) {
            return contador;
        }
    }

    public int checarGenericos() {
        int contador = 0;

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from blacklist where nomeCompleto_bl='GENERICO'");

            while (rs.next()) {
                contador = contador + 1;
            }

            return contador;

        } catch (SQLException e) {
            return contador;
        }
    }

    public Relatorios lerParaOBl(Relatorios relatorio) {
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        int contador6 = 0;
        int contador7 = 0;
        int contador8 = 0;
        int contador9 = 0;
        int contador10 = 0;

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from blacklist");

            while (rs.next()) {

                contador10++;

                if (Integer.parseInt(rs.getString(3)) >= 0 && Integer.parseInt(rs.getString(3)) < 16 && rs.getString(4).equalsIgnoreCase("Masculino")) {
                    contador1++;
                    if (rs.getString(5).equalsIgnoreCase("SIM")) {
                        contador8++;
                    }
                } else if (Integer.parseInt(rs.getString(3)) >= 0 && Integer.parseInt(rs.getString(3)) < 16 && rs.getString(4).equalsIgnoreCase("Feminino")) {
                    contador2++;
                    if (rs.getString(5).equalsIgnoreCase("SIM")) {
                        contador8++;
                    }
                } else if (Integer.parseInt(rs.getString(3)) >= 16 && Integer.parseInt(rs.getString(3)) < 60 && rs.getString(4).equalsIgnoreCase("Masculino")) {
                    contador3++;
                    if (rs.getString(5).equalsIgnoreCase("SIM")) {
                        contador8++;
                    }
                } else if (Integer.parseInt(rs.getString(3)) >= 16 && Integer.parseInt(rs.getString(3)) < 60 && rs.getString(4).equalsIgnoreCase("Feminino")) {
                    contador4++;
                    if (rs.getString(5).equalsIgnoreCase("SIM")) {
                        contador8++;
                    }
                } else if (Integer.parseInt(rs.getString(3)) >= 60 && rs.getString(4).equalsIgnoreCase("Masculino")) {
                    contador5++;
                    if (rs.getString(5).equalsIgnoreCase("SIM")) {
                        contador8++;
                    }
                } else if (Integer.parseInt(rs.getString(3)) >= 60 && rs.getString(4).equalsIgnoreCase("Feminino")) {
                    contador6++;
                    if (rs.getString(5).equalsIgnoreCase("SIM")) {
                        contador8++;
                    }
                } else if (rs.getString(4).equalsIgnoreCase("1")) {
                    contador9++;
                } else {
                    contador3++;
                }
            }
            relatorio.set_0a16Masculino(contador1);
            relatorio.set_0a16Feminino(contador2);
            relatorio.set_16a60Masculino(contador3);
            relatorio.set_16a60Feminino(contador4);
            relatorio.set_60Masculino(contador5);
            relatorio.set_60Feminino(contador6);
            relatorio.set_semDN(contador7);
            relatorio.set_deficientes(contador8);
            relatorio.set_genericos(contador9);
            relatorio.set_totalDePessoasAtendidas(contador10);

            return relatorio;

        } catch (SQLException e) {
            return relatorio;
        }
    }

    public String lerRelatorios(String data, String ocorrencias) {
        String dados = "";

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from relatorios where data='" + data + "'");

            Relatorios relatorios = new Relatorios();
            relatorios = lerParaOBl(relatorios);

            while (rs.next()) {

                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
                Date date = new Date();

                dados = "------------RELATÓRIO DIÁRIO-------------\n"
                        + //"---------Data: "+dateFormat.format(date)+"---------\n\n"+
                        "1 - REFEIÇÕES VENDIDAS: " + retornarUltimaSenha() + "\n"
                        + "2 - CLIENTES CADASTRADOS: " + checarClientesCadastrados() + "\n\n"
                        + "3 - Clientes de até 16 anos Masculino: " + rs.getInt(1) + "\n"
                        + "4 - Clientes de até 16 anos Feminino: " + rs.getInt(2) + "\n"
                        + "5 - Clientes de 16 até 60 anos Masculino: " + rs.getInt(3) + "\n"
                        + "6 - Clientes de 16 até 60 anos Feminino: " + rs.getInt(4) + "\n"
                        + "7 - Clientes acima de 60 Masculino: " + rs.getInt(5) + "\n"
                        + "8 - Clientes acima de 60 anos Feminino: " + rs.getInt(6) + "\n"
                        + "9 - Clientes com deficiência: " + rs.getString(8) + "\n"
                        + "10 - Refeições Servidas: " + retornarTotalServido() + "\n"
                        + "11 - Senhas Genéricas: " + relatorios.get_genericos() + "\n\n"
                        + ocorrencias + "\n\n"
                        + "EXPEDIENTE FECHADO POR: " + retornarUltimoLogin() + "\n DATA: " + dateFormat.format(date) + "\n\nVIVER MELHOR";
            }
        } catch (SQLException e) {

        }

        return dados;
    }

    public boolean atualizarTelefone(String nome, String telefone) {
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("update clientes set telefone_cliente='" + telefone + "' where nomeCompletoSocial='" + nome + "'");

            return true;

        } catch (SQLException e) {
            return false;
        }
    }

    public String retornarNumeroDeTelefone(String nome) {
        String telefone = "";

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from clientes where nomeCompletoSocial='" + nome + "'");

            while (rs.next()) {
                telefone += rs.getString(6);
                System.out.print("telefone");
            }
            return telefone;

        } catch (SQLException e) {
            return telefone;
        }
    }

    public String lerPDF() {
        String dados = "LISTA DE CONVIDADOS\n\n";

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from bancosunificados order by nomeCompleto_cliente");

            int contador = 1;

            while (rs.next()) {
                if (rs.getString(1).equalsIgnoreCase("   .   .   -  ") || rs.getString(1).equalsIgnoreCase("null") || (rs.getString(4).equalsIgnoreCase("(  )     -    "))) {
                    dados += rs.getString(3) + "   " + rs.getString(2) + "\n";
                } else {
                    //dados += rs.getString(1)+"   "+rs.getString(4)+"   "+rs.getString(3)+"   "+rs.getString(2)+"\n";
                    dados += rs.getString(3) + "   " + rs.getString(2) + "\n";
                }
                contador = contador + 1;
            }
            return dados;
        } catch (SQLException e) {
            return dados;
        }
    }

    public int retornarUltimaSenha() {

        int contador = 0;

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from blacklist order by id_bl desc limit 1");

            while (rs.next()) {
                contador = rs.getInt(1);
            }

            return contador;

        } catch (SQLException e) {
            return contador;
        }
    }

    public boolean checarRelatorios(String data) {
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from relatorios where data='" + data + "'");

            if (rs.next()) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            return false;
        }
    }

    public void escreverNoTXT(String texto) {
        File file = new File("SENHA.txt");
        Path caminho = Paths.get("SENHA.txt");
        byte[] textpEmByte = texto.getBytes();

        try {
            Files.write(caminho, textpEmByte);
            //java.awt.Desktop.getDesktop().open(file);
            java.awt.Desktop.getDesktop().print(file);
        } catch (Exception e) {

        }
    }

    public void escreverNoRELATORIOTXT(String texto) throws FileNotFoundException {
  
        Document document = new Document();

        try {

            DateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy");
            Date date = new Date();

            PdfWriter.getInstance(document, new FileOutputStream("RELATORIO_" + dateFormat.format(date) + "_VIVER MELHOR.pdf"));
            document.open();
            document.add(new Paragraph(texto));

        } catch (DocumentException ex) {

        } finally {
            document.close();

            try {

                DateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy");
                Date date = new Date();

                java.awt.Desktop.getDesktop().open(new File("RELATORIO_" + dateFormat.format(date) + ".pdf"));

            } catch (Exception e) {

            }
        }
    }

    public boolean checarUniao(String cpf) {

        int contador = 0;

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from uniao where cpfUniao='" + cpf + "'");

            while (rs.next()) {

                if (rs.getString(2).toString().equalsIgnoreCase(cpf)) {
                    contador = 1;
                }

            }

            if (contador == 0) {
                return false;
            } else {
                return true;
            }
        } catch (SQLException e) {
            return false;
        }
    }

    public Clientes voltarCliente(String cpf) {

        Clientes cli = new Clientes();

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from clientes where cpf_cliente='" + cpf + "'");

            while (rs.next()) {
                cli.setNome_cliente(rs.getString(3));
                cli.setCpf_cliente(rs.getString(12));
                cli.setTelefone_cliente(rs.getString(6));
            }

            return cli;

        } catch (SQLException e) {

            return cli;
        }
    }

    public boolean inserirNaUniao(Uniao uni) {

        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("insert into uniao values('" + uni.getNomeCompletoUniao() + "', '" + uni.getCpfUniao() + "', '" + uni.getRua() + "', '" + uni.getBairro() + "', '" + uni.getCidade() + "', '" + uni.getTelefone() + "')");

            return true;

        } catch (SQLException e) {

            return false;
        }
    }
}
