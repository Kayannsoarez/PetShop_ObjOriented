public class Cachorro extends Animal{

    // Declaração das variavies(atributos) respeitando o encapsulamento.
    private String cod_dog;
    private String raca_dog;
    private String origem_dog;
    private int tamanho_dog;
    private String cor_dog;

    // Metodo Construtor, Respeitando a Herança
    public Cachorro(String especie, int idade, String sexo,
                    String cod_dog, String raca_dog, String origem_dog,
                    int tamanho_dog, String cor_dog) {
        super(especie, idade, sexo);
        this.cod_dog=cod_dog;
        this.raca_dog = raca_dog;
        this.origem_dog = origem_dog;
        this.tamanho_dog = tamanho_dog;
        this.cor_dog = cor_dog;

    }
    //Metodos Getters e Setters
    public String getCod_dog() {
        return cod_dog;
    }

    public void setCod_dog(String cod_dog) {
        this.cod_dog = cod_dog;
    }

    public String getRaca_dog() {
        return raca_dog;
    }

    public void setRaca_dog(String raca_dog) {
        this.raca_dog = raca_dog;
    }

    public String getOrigem_dog() {
        return origem_dog;
    }

    public void setOrigem_dog(String origem_dog) {
        this.origem_dog = origem_dog;
    }

    public int getTamanho_dog() {
        return tamanho_dog;
    }

    public void setTamanho_dog(int tamanho_dog) {
        this.tamanho_dog = tamanho_dog;
    }

    public String getCor_dog() {
        return cor_dog;
    }

    public void setCor_dog(String cor_dog) {
        this.cor_dog = cor_dog;
    }

    //Metodo ToString para mostrar uma representação textual de uma instância de um objeto.
    @Override
    public String toString() {
        return "Cachorro{" +
                "cod_dog='" + cod_dog + '\'' +
                ", raca_dog='" + raca_dog + '\'' +
                ", origem_dog='" + origem_dog + '\'' +
                ", tamanho_dog=" + tamanho_dog +
                ", cor_dog='" + cor_dog + '\'' +
                '}';
    }
}
