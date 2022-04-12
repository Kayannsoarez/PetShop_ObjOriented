public class Tartaruga extends Animal{

    // Declaração das variavies(atributos) respeitando o encapsulamento.
    private String cod_turtle;
    private String raca_turtle;
    private String origem_turtle;
    private int tamanho_turtle;
    private String cor_turtle;

    // Metodo Construtor, Respeitando a Herança
    public Tartaruga(String especie, int idade, String sexo,
                     String cod_turtle, String raca_turtle, String origem_turtle,
                     int tamanho_turtle, String cor_turtle) {
        super(especie, idade, sexo);
        this.cod_turtle = cod_turtle;
        this.raca_turtle = raca_turtle;
        this.origem_turtle = origem_turtle;
        this.tamanho_turtle = tamanho_turtle;
        this.cor_turtle = cor_turtle;

    }

    //Metodos Getters e Setters
    public String getCod_turtle() {
        return cod_turtle;
    }

    public void setCod_turtle(String cod_turtle) {
        this.cod_turtle = cod_turtle;
    }

    public String getRaca_turtle() {
        return raca_turtle;
    }

    public void setRaca_turtle(String raca_turtle) {
        this.raca_turtle = raca_turtle;
    }

    public String getOrigem_turtle() {
        return origem_turtle;
    }

    public void setOrigem_turtle(String origem_turtle) {
        this.origem_turtle = origem_turtle;
    }

    public int getTamanho_turtle() {
        return tamanho_turtle;
    }

    public void setTamanho_turtle(int tamanho_turtle) {
        this.tamanho_turtle = tamanho_turtle;
    }

    public String getCor_turtle() {
        return cor_turtle;
    }

    public void setCor_turtle(String cor_turtle) {
        this.cor_turtle = cor_turtle;
    }

    //Metodo ToString para mostrar uma representação textual de uma instância de um objeto.
    @Override
    public String toString() {
        return "Tartaruga{" +
                "cod_turtle='" + cod_turtle + '\'' +
                ", raca_turtle='" + raca_turtle + '\'' +
                ", origem_turtle='" + origem_turtle + '\'' +
                ", tamanho_turtle=" + tamanho_turtle +
                ", cor_turtle='" + cor_turtle + '\'' +
                '}';
    }
}
