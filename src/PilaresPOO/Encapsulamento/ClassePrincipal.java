package PilaresPOO.Encapsulamento;

public class ClassePrincipal {

    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();


        c.ligar();

        c.maisVolume();
        c.ligarMudo();
        c.abrirMenu();
    }
}
