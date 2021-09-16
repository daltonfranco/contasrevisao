public class Conta {
    
    private String titular;
    private int numero;
    private double saldo;

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }


    public String getTitular(){
        return this.titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

}
