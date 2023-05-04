import java.util.Scanner;

public class Caixa {
  private ContaBancaria c1;

  public Caixa(){
    this.c1=null;
  }

  public void criarConta(){
    this.c1=new ContaBancaria();
  }

  public double consultarSaldo(){
    return this.c1.getSaldo();
  }

  public void depositar(double valor){
    this.c1.depositar(valor);
  }

  public void sacar(double valor){
    if(this.c1.sacar(valor)==true){
      this.c1.sacar(valor);
    }else{
      System.out.println("Limite de valor da conta atingido!");
    }
  }

  public void menu(){
    System.out.println(
    "1. Criar Conta /n"+
    "2. Consultar Saldo /n"+
    "3. Depositar /n"+
    "4. Sacar /n"+
    "5. Sair"
    );

    Scanner entrada=new Scanner(System.in);
    String opc=entrada.nextLine();
    int valor;

    while(!opc.equals("5")){
      if(opc.equals("1")){
        criarConta();
      }else if(opc.equals("2")){
        consultarSaldo();
      }else if(opc.equals("3")){
        valor=Integer.parseInt(entrada.nextLine());
        depositar(valor);
      }else if(opc.equals("4")){
        valor=Integer.parseInt(entrada.nextLine());
        sacar(valor);
      }else{
        System.out.println("Opcao invalida!");
      }
    }
    entrada.close();
  }
}