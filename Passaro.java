public class Passaro extends Animal{

    // Declaração das variavies(atributos) respeitando o encapsulamento.
    private String cod_bird;
    private String raca_bird;
    private String origem_bird;
    private int tamanho_bird;
    private String cor_bird;

    // Metodo Construtor, Respeitando a Herança
    public Passaro(String especie, int idade, String sexo,
                    String cod_dog, String raca_dog, String origem_dog,
                    int tamanho_dog, String cor_dog) {
        super(especie, idade, sexo);
        this.cod_bird =cod_dog;
        this.raca_bird = raca_dog;
        this.origem_bird = origem_dog;
        this.tamanho_bird = tamanho_dog;
        this.cor_bird = cor_dog;

    }

    //Metodos Getters e Setters
    public String getCod_bird() {
        return cod_bird;
    }

    public void setCod_bird(String cod_bird) {
        this.cod_bird = cod_bird;
    }

    public String getRaca_bird() {
        return raca_bird;
    }

    public void setRaca_bird(String raca_bird) {
        this.raca_bird = raca_bird;
    }

    public String getOrigem_bird() {
        return origem_bird;
    }

    public void setOrigem_bird(String origem_bird) {
        this.origem_bird = origem_bird;
    }

    public int getTamanho_bird() {
        return tamanho_bird;
    }

    public void setTamanho_bird(int tamanho_bird) {
        this.tamanho_bird = tamanho_bird;
    }

    public String getCor_bird() {
        return cor_bird;
    }

    public void setCor_bird(String cor_bird) {
        this.cor_bird = cor_bird;
    }

    //Metodo ToString para mostrar uma representação textual de uma instância de um objeto.
    @Override
    public String toString() {
        return "Passaro{" +
                "cod_bird='" + cod_bird + '\'' +
                ", raca_bird='" + raca_bird + '\'' +
                ", origem_bird='" + origem_bird + '\'' +
                ", tamanho_bird=" + tamanho_bird +
                ", cor_bird='" + cor_bird + '\'' +
                '}';
    }
}
