import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int menu = 0;
    Scanner scan = new Scanner(System.in);
    do {
    System.out.println("menu");
    System.out.println("1- Cadastrar pessoa: ");
    System.out.println("2- Apresentar cadastro da pessoa: ");
    System.out.println("3- Editar cadastro da pessoa: ");
    System.out.println("4- Apagar cadastro da pessoa: ");
    System.out.println("5- Sair: ");
    menu = scan.nextInt();
    Pessoa pessoa = new Pessoa(null, menu, null); // variavel global
    switch (menu) {
      case 1:
        System.out.println("Cadastrar Pessoa: ");
        System.out.println("Digite seu nome:1 ");
        String nome = scan.next();
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Digite seu email: ");
        String Email = scan.next();
        System.out.println("Pessoa cadastrada!!!");
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        pessoa.setEmail(Email);
        break;
      case 2:
        System.out.println("Exibir Pessoa: ");
        System.out.println(pessoa.getnome());
        System.out.println(pessoa.getidade());
        System.out.println(pessoa.getEmail());
        break;
      case 3:
        System.out.println("Editar Pessoa: ");
        System.out.println("Digite seu novo nome: ");
        nome = scan.next();
        System.out.println("Digite sua nova idade: ");
        idade = scan.nextInt();
        System.out.println("Digite seu novo email: ");
        Email = scan.next();
        System.out.println("Dados alterados!!!");
        break;
      case 4:
        System.out.println("Excluir Pessoa: ");
        pessoa = null;
        System.out.println("Pessoa excluida:");
        break;
      case 5:
        System.out.println("Sair");
        System.exit(0);
        break;
      default:
        System.out.println("-------------------------");
      }
    }while (menu != 5);
    {
      
    }
  }
}