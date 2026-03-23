package src;

import java.util.Scanner;

public class ControlMenu {
	Scanner entrada;
	public int opcao;
	public int codigo;
	public long CPF;
	public String nome;
	public String telefone;
	public String email;
	Endereco endereco;
	Pessoa pessoa;
	public int codigoEndereco;
	public String Logradouro;
	public int numero;
	public String bairro;
	public String complemento;
	public String cidade;
	public String estado;
	public String uf;
	public long CEP;
	
	
	public ControlMenu() {
		this.entrada = new Scanner(System.in);
		this.opcao   = 0;
		
	}//fim do construtor padrão
	
	public void MostrarMenu() {
		System.out.println("\n\nBem-Vindo(a)\n\n" +
		"Escolha uma das opções abaixo:"           +
	    "\n.0 Sair"                                +
		"\n1. Cadastrar Pessoa"                    +
	    "\n2. consultar Pessoa"                    +
		"\n3. Atualizar Pessoa"                    +
	    "\n4. Excluir Pessoa"
		);
		
		this.opcao =Integer.parseInt(entrada.nextLine());
	} //coleta a opção
	
	

   public void executar() {
	   do {
		   this.MostrarMenu();//mostrar as opcoes disponiveis para o usuario
		   switch(this.opcao) {
		   case 0:
			   System.out.println("Obrigado!");
			   break;
		   case 1:
			   System.out.println("Cadastrar!");
			   
			   this.entrada = new Scanner(System.in);
				
				System.out.println("\nInforme um codigo: ");
				codigo = Integer.parseInt(entrada.nextLine());
				
				System.out.println("\nInformr um CPF: ");
				CPF = Long.parseLong(entrada.nextLine());
				
				System.out.println("\nInforme o telefone: ");
				telefone = entrada.nextLine();
				
				System.out.println("\nInformar o nome:");
				nome = entrada.nextLine();
				
				System.out.println("\nInformar o email");
				email = entrada.nextLine();
				
				System.out.println("\nInforme um codigo de endereco: ");
				codigoEndereco = Integer.parseInt(entrada.nextLine());
				
				System.out.println("\n Informe o logradouro: ");
				Logradouro = entrada.nextLine();
				
				System.out.println("\nInforme o numero: ");
				numero = Integer.parseInt(entrada.nextLine());
				
				System.out.println("\nInformr o bairro: ");
				bairro = entrada.nextLine();
				
				System.out.println("\nInforme o complemento");
				complemento = entrada.nextLine();
				
				System.out.println("\nInforme a cidade: ");
				cidade = entrada.nextLine();
				
				System.out.println("\nInforme o estado:");
				estado = entrada.nextLine();
				
				System.out.println("\nInforme o UF: ");
				uf = entrada.nextLine();
				
				System.out.println("\nInforme o CEP: ");
				CEP = Long.parseLong(entrada.nextLine());
				
				//Criar o objeto endereco:
				this.endereco = new Endereco(codigo, Logradouro, numero, bairro, complemento, cidade, estado, uf, CEP);
				this.pessoa = new Pessoa(codigo, CPF, nome, telefone, email, endereco);
			   break;
		   case 2:
			   System.out.println("Consultar!");
			   
			   //Mostrar o resultado dos dados
			   System.out.println(this.pessoa.imprimir()); //Mostrar dados
				
			   break;
		   case 3:
			   System.out.println("Atualizar!");
			   System.out.println("Escolha abaixo o que deseja atualizar: " +
			                      "\n1. Nome"                                  +
			                      "\n2. CPF"                                   +
			                      "\n3. Telefone"                              +
			                      "\n4. E-mail"                                +
			                      "\n5. logradouro"                            +
			                      "\n6. Numero"                                +
			                      "7\n. Bairro"                                +
			                      "8\n. Complemento"                           +
			                      "9\n. Cidade"                                +
			                      "10\n. Estado"                               +
			                      "11\n. UF"                                   +
			                      "12\n. CEP");                                
			   this.opcao = Integer.parseInt(this.entrada.nextLine());
			   //Escolha caso para atualização
			   switch(this.opcao) {
			   case 1:
				   System.out.println("Qual o novo nome?");
				   String nome = this.entrada.nextLine();//Coletando o novo nome do usuario
				   this.pessoa.setNome(nome);
				   break;
			   case 2:
				   System.out.println("Qual o novo CPF?");
				   String cpf = this.entrada.nextLine();//Coletando o novo CPF 
				   this.pessoa.setCPF(Long.parseLong(cpf));
				   break;
			   case 3:
				   System.out.println("Qual o novo telefone?");
				   String telefone = this.entrada.nextLine();//Coletando o novo telefone
				   this.pessoa.setTelefone(telefone);
				   break;
			   case 4:
				   System.out.println("Qual o novo E-mail?");
				   String email = this.entrada.nextLine();//Coletando o novo E-mail
				   this.pessoa.setEmail(email);
				   break;
			   case 5:
				   System.out.println("Qual o novo Logradouro?");
				   String logradouro = this.entrada.nextLine();//Coletando o novo Logradouro
				   this.endereco.setLogradouro(logradouro);
				   break;
			   case 6:
				   System.out.println("Qual o novo Numero?");
				   int numero = Integer.parseInt(this.entrada.nextLine());//Coletando o novo Numero
				   this.endereco.setNumero(numero);
				   break;
			   case 7:
				   System.out.println("Qual o novo Bairro?");
				   String bairro = this.entrada.nextLine();//Coletando o novo Bairro
				   this.endereco.setBairro(bairro);
				   break;
			   case 8:
				   System.out.println("Qual o novo complemento?");
				   String complemento = this.entrada.nextLine();//Coletando o novo complemento
				   this.endereco.setComplemento(complemento);
				   break;
			   case 9:
				   System.out.println("Qual a nova cidade?");
				   String cidade = this.entrada.nextLine();//Coletando a nova cidade
				   this.endereco.setCidade(cidade);
				   break;
			   case 10:
				   System.out.println("Qual o novo Estado?");
				   String estado = this.entrada.nextLine();//Coletando o novo estado
				   this.endereco.setEstado(estado);
				   break;
			   case 11:
				   System.out.println("Qual o novo UF?");
				   String uf = this.entrada.nextLine();//Coletando o novo UF
				   this.endereco.setUF(uf);
				   break;
			   case 12:
				   System.out.println("Qual o novo CEP?");
				   Long CEP = Long.parseLong(this.entrada.nextLine());//Coletando o novo CEP
				   this.endereco.setCEP(CEP);
				   break;
			   default:
				   System.out.println("Código inválido!");
				   break;
				   }//fim do método
			   
			   break;//fim do case 3
		   case 4:
			   System.out.println("Deletar!");
			   this.endereco = new Endereco();//Chamando o construtor vazio
			   this.pessoa = new Pessoa();//Chamando o construtor vazio
			   break;
		   default:
			   System.out.println("Codigo informado inválido!");
			   break;
		   }//fim do switch
		   }while(this.opcao != 0);
   }//fim do método que executa a ação escolhida
   
}//fim da controle
