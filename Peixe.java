public class Peixe extends Animal{

    // Declaração das variavies(atributos) respeitando o encapsulamento.
    private String cod_fish;
    private String raca_fish;
    private String origem_fish;
    private int tamanho_fish;
    private String cor_fish;

    // Metodo Construtor, Respeitando a Herança
    public Peixe(String especie, int idade, String sexo,
                 String cod_fish, String raca_fish, String origem_fish,
                 int tamanho_fish, String cor_fish) {
        super(especie, idade, sexo);
        this.cod_fish = cod_fish;
        this.raca_fish = raca_fish;
        this.origem_fish = origem_fish;
        this.tamanho_fish = tamanho_fish;
        this.cor_fish = cor_fish;

    }

    //Metodos Getters e Setters
    public String getCod_fish() {
        return cod_fish;
    }

    public void setCod_fish(String cod_fish) {
        this.cod_fish = cod_fish;
    }

    public String getRaca_fish() {
        return raca_fish;
    }

    public void setRaca_fish(String raca_fish) {
        this.raca_fish = raca_fish;
    }

    public String getOrigem_fish() {
        return origem_fish;
    }

    public void setOrigem_fish(String origem_fish) {
        this.origem_fish = origem_fish;
    }

    public int getTamanho_fish() {
        return tamanho_fish;
    }

    public void setTamanho_fish(int tamanho_fish) {
        this.tamanho_fish = tamanho_fish;
    }

    public String getCor_fish() {
        return cor_fish;
    }

    public void setCor_fish(String cor_fish) {
        this.cor_fish = cor_fish;
    }

    //Metodo ToString para mostrar uma representação textual de uma instância de um objeto.
    @Override
    public String toString() {
        return "Peixe{" +
                "cod_fish='" + cod_fish + '\'' +
                ", raca_fish='" + raca_fish + '\'' +
                ", origem_fish='" + origem_fish + '\'' +
                ", tamanho_fish=" + tamanho_fish +
                ", cor_fish='" + cor_fish + '\'' +
                '}';
    }
}
