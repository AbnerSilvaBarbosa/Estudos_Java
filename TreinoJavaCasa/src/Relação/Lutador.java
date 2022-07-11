package Relação;

public class Lutador implements MetodosLutador{


    private String nome = new String();
    private String nacionalidade = new String();
    private int idade;
    private float altura;
    private float peso;
    private String categoria = new String();
    private int vitorias;
    private int derrotas;
    private int empates;


    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }



    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private float getAltura() {
        return altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    private float getPeso() {
        return peso;
    }

    private float setPeso(float peso) {
        setCategoria(peso);
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(float prop) {

        if(prop<52.2){
            categoria = "Invalido";
        }else if(prop <= 70.3){
            categoria = "Leve";
        }else if(prop<=83.9){
            categoria = "Médio";
        }else if(prop<=120.2){
            categoria = "Pesado";
        }else{
            categoria = "Invalido";
        }

    }

    private int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }




    @Override
    public void apresentar() {
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + " m de altura");
        System.out.println("Pesando: " + getPeso() + "KG");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());


    }

    @Override
    public void status() {
        System.out.println(getNome());
        System.out.println("é um peso: " + getCategoria());
        System.out.println(getVitorias() + "vitorias");
        System.out.println(getDerrotas() + "derrotas");
        System.out.println(getEmpates() + "empates");

    }

    @Override
    public void ganharLuta() {
        setVitorias(getVitorias()+1);

    }

    @Override
    public void perdeLuta() {
        setDerrotas(getDerrotas()+1);

    }

    @Override
    public void empatarLuta() {
        setEmpates(getEmpates()+1);

    }
}
