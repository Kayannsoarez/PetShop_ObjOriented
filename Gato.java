public class Gato extends Animal {

    // Declaração das variavies(atributos) respeitando o encapsulamento.
    private String cod_cat;
    private String raca_cat;
    private String origem_cat;
    private int tamanho_cat;
    private String cor_cat;

    // Metodo Construtor, Respeitando a Herança
    public Gato(String especie, int idade, String sexo,
                    String cod_dog, String raca_dog, String origem_dog,
                    int tamanho_dog, String cor_cat) {
        super(especie, idade, sexo);
        this.cod_cat =cod_dog;
        this.raca_cat = raca_dog;
        this.origem_cat = origem_dog;
        this.tamanho_cat = tamanho_dog;
        this.cor_cat = cor_cat;

    }
    //Metodos Getters e Setters
    public String getCod_cat() {
        return cod_cat;
    }

    public void setCod_cat(String cod_cat) {
        this.cod_cat = cod_cat;
    }

    public String getRaca_cat() {
        return raca_cat;
    }

    public void setRaca_cat(String raca_cat) {
        this.raca_cat = raca_cat;
    }

    public String getOrigem_cat() {
        return origem_cat;
    }

    public void setOrigem_cat(String origem_cat) {
        this.origem_cat = origem_cat;
    }

    public int getTamanho_cat() {
        return tamanho_cat;
    }

    public void setTamanho_cat(int tamanho_cat) {
        this.tamanho_cat = tamanho_cat;
    }

    public String getCor_cat() {
        return cor_cat;
    }

    public void setCor_cat(String cor_cat) {
        this.cor_cat = cor_cat;
    }

    //Metodo ToString para mostrar uma representação textual de uma instância de um objeto.
    @Override
    public String toString() {
        return "Gato{" +
                "cod_cat='" + cod_cat + '\'' +
                ", raca_cat='" + raca_cat + '\'' +
                ", origem_cat='" + origem_cat + '\'' +
                ", tamanho_cat=" + tamanho_cat +
                ", cor_cat='" + cor_cat + '\'' +
                '}';
    }
}
