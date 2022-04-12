public class Animal {

    // Declaração das variavies(atributos) respeitando o encapsulamento.
    private String especie;
    private int idade;
    private String sexo;

    // Metodo Construtor
    public Animal (String especie, int idade, String sexo){
        this.especie=especie;
        this.idade=idade;
        this.sexo=sexo;
    }

    //Metodos Getters e Setters
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //Metodo ToString para mostrar uma representação textual de uma instância de um objeto.
    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
