public class ContaBancaria {
  private double saldo;
  private double limite;

  public ContaBancaria(){
    this.saldo=0;
    this.limite=500;
  }

  public double getSaldo(){
    return saldo;
  }

  public boolean sacar(double valor){
    if(valor<=this.limite){
      this.saldo-=valor;
      return true;
    }
    return false;
  }

  public void depositar(double valor){
    this.saldo+=valor;
  }
}
