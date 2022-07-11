package Herança;

public class Pessoa {
    private String nome = new String();
    private int idade;
    private String sexo = new String();

    public void fazerAniversario(){
        setIdade(getIdade() + 1);
    }

    private String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private String getSexo() {
        return sexo;
    }

    private void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
