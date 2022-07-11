package PilaresPOO.Encapsulamento;

public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Métodos Especiais


    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //Metodos abstratos

    @Override
    public void ligar() {
        if(isLigado()){
            System.out.println("Já está ligado!!");
        }else{
            setLigado(true);
            System.out.println("Controle foi ligado!!!");
        }

    }

    @Override
    public void desligar() {
        if(!isLigado()){
            System.out.println("O controle já está desligado!!");
        }else{
            setLigado(false);
        }

    }

    @Override
    public void abrirMenu() {
        if(isLigado()){
            System.out.println("Esta ligado?: " + isLigado());
            System.out.println("Volume: " + getVolume());

            for (int i = 0; i < getVolume(); i+=10) {
                System.out.println("|");

            }

            System.out.println("Esta tocando?: " + isTocando());

        }else{
            System.out.println("È necessário estár ligado para ver o MENU");
        }


    }

    @Override
    public void fecharMenu() {

        System.out.println("Fechando menu!!");


    }

    @Override
    public void maisVolume() {
        if(isLigado()){
            setVolume(getVolume() + 5);
        }else{
            System.out.println("É necessario ligar para aumentar o volume");
        }

    }

    @Override
    public void menosVolume() {
        if(isLigado()){
            setVolume(getVolume() - 5);
        }else{
            System.out.println("É necessário ligar para diminuir o volume");
        }

    }

    @Override
    public void ligarMudo() {
        if(isLigado() && getVolume() > 0){
            setVolume(0);
        }else{
            System.out.println("É necessário estár ligado!");
        }

    }

    @Override
    public void desligarMudo() {
        if(isLigado() && getVolume() == 0){
            setVolume(50);
        }else{
            System.out.println("È necessário ligar!!!");
        }

    }

    @Override
    public void play() {
        if(isLigado() && !isTocando()){
            setTocando(true);
        }else if(!isLigado()){
            System.out.println("É necessário ligar");
        }else if(isTocando()){
            System.out.println("Já está tocando");
        }

    }

    @Override
    public void pause() {
        if(isTocando() && isLigado()){
            setTocando(false);
        }else if(!isLigado()){
            System.out.println("É necessário ligar");
        }else if(!isTocando()){
            System.out.println("Já está pausado");
        }

    }
}
