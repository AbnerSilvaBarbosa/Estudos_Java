package Relação;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    public Luta(Lutador desafiado, Lutador desafiante) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
    }

    public void marcarLuta(){
        if(getDesafiado().getCategoria() != getDesafiante().getCategoria()){
            System.out.println("Essa luta é invalida");
        }else if(getDesafiado() == getDesafiante()){
            System.out.println("Impossivel de acontecer essa luta");
        }else{
            setAprovado(true);
            setDesafiado(getDesafiado());
            setDesafiante(getDesafiante());
        }

    }

    public void lutar(){
        if(isAprovado()){
            desafiado.apresentar();
            desafiante.apresentar();


            int vencedor = 1 + (int) (Math.random() * 2);
            System.out.println(vencedor);

            switch (vencedor){
                case 0:
                    desafiante.empatarLuta();
                    desafiado.empatarLuta();

                    break;

                case 1:
                    System.out.println(desafiado.getNome() + " WINS ");
                    desafiado.ganharLuta();
                    desafiante.perdeLuta();

                    break;

                case 2:
                    System.out.println(desafiante.getNome() + " WINS ");
                    desafiante.ganharLuta();
                    desafiado.perdeLuta();

                    break;
            }

        }else{
            System.out.println("Essá luta não pode acontecer");
        }

    }

    private Lutador getDesafiado() {
        return desafiado;
    }

    private void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    private Lutador getDesafiante() {
        return desafiante;
    }

    private void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    private int getRounds() {
        return rounds;
    }

    private void setRounds(int rounds) {
        this.rounds = rounds;
    }

    private boolean isAprovado() {
        return aprovado;
    }

    private void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
