package ClasseBasica;

public class UtilizarBanco {

    public static void main(String[] args) {
        Banco c1 = new Banco();

        c1.setTipoDaConta("CC");
        c1.setTitular("Abner Silva Barbosa");
        c1.abrirConta();

        c1.sacar(20);
        c1.depositar(80);
        c1.pagarMensal();

        c1.sacar(100);



        c1.infoConta();

    }
}
