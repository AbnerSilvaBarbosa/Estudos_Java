package ClasseBasica;

import java.util.UUID;

public class Banco {

    public UUID numConta = UUID.randomUUID();

    protected String tipoDaConta = new String();

    private String titular;

    private float saldo;

    private boolean status;

    public Banco() {

        numConta = UUID.randomUUID();
        saldo = 0;
        status = false;
    }

    public UUID getNumConta() {
        return numConta;
    }


    public String getTipoDaConta() {
        return tipoDaConta;
    }

    public void setTipoDaConta(String tipoDaConta) {
        this.tipoDaConta = tipoDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(){

        if(isStatus()){
            System.out.println("Essa conta já está aberta !!!");
        }else{


            if(getTipoDaConta() == "CC"){
                setSaldo(50);
                setStatus(true);
                System.out.println("Conta aberta!!");

            }else if(getTipoDaConta() == "CP"){
                setSaldo(150);
                setStatus(true);
                System.out.println("Conta aberta!!");

            }

        }

    }

    public void fecharConta(){

        if(getSaldo() > 0){
            System.out.println("É necessário a conta estár sem dinheiro!!!");
        }else if(getSaldo() == 0){
            setStatus(false);
            System.out.println("Conta fechada com sucesso");

        }
    }

    public void depositar(float prop){
        if(isStatus()){
           float a = getSaldo() + prop;
           setSaldo(a);
        }else{
            System.out.println("Impossivel depositar saldo nessa conta :(");
        }
    }

    public void sacar(float prop){

        if(isStatus()){
            if(getSaldo() >= prop){
                setSaldo(getSaldo() - prop);
            }else{
                System.out.println("Impossivel sacar");
            }

        }else{
            System.out.println("Impossivel sacar!!");
        }
    }

    public void pagarMensal(){
        float v = 0;
        if(getTipoDaConta() ==  "CC"){
            v = 12;
        }else if(getTipoDaConta() == "CP"){
            v = 20;
        }

        if(isStatus()){
            if(getSaldo() > v){
                setSaldo(getSaldo() - v);
            }else{
                System.out.println("Salfo insuficiente");
            }

        }else{
            System.out.println("Impossivel pagar");
        }
    }

    public void infoConta(){
        System.out.println("IdConta:" + getNumConta());
        System.out.println("Tipo:" + getTipoDaConta());
        System.out.println("Titular:" + getTitular());
        System.out.println("Saldo:" + getSaldo());
    }
}
