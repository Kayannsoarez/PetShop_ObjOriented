import java.util.ArrayList;
import java.util.List;

public class CadastrarAnimal implements IRepositorioAnimal{
    ArrayList<Animal> animais = new ArrayList<>();

    //Estrutura de Cadastro --------------------------------------------------
    /**
     * Metodo criado para cadastro de animais com Exceção e Herança.
     * O instancepf compara o tipo de uma variável a uma classe
     * para verificar qual classe eu vou trabalhar.
     * o try para fazer a buscar de cada classe e ver se o animal que
     * quero cadastrar já foi cadastrado.
     * Catch para lançar a Exceção de Animal não encontrado na busca
     * de verificação então cria um novo animal da classe herdada especifica
     */
    public void cadastrarAnimal(Animal animal) throws AJCException{
        try{
            if(animal instanceof Cachorro){
                this.buscarCachorro(((Cachorro) animal).getCod_dog());
                throw new AJCException();
            }
            if(animal instanceof Gato){
                this.buscarGato(((Gato) animal).getCod_cat());
                throw new AJCException();
            }
            if(animal instanceof Peixe) {
                this.buscarPeixe(((Peixe) animal).getCod_fish());
                throw new AJCException();
            }
            if(animal instanceof Passaro) {
                this.buscarPassaro(((Passaro) animal).getCod_bird());
                throw new AJCException();
            }
            if(animal instanceof Tartaruga) {
                this.buscarTartaruga(((Tartaruga) animal).getCod_turtle());
                throw new AJCException();
            }

        }catch(ANEException e){
            animais.add(animal);
        }
        }
    // ----------------------------------------------------------------------


    // Estrutura de Buscas --------------------------------------------------
    /**
     * Metodo criado para buscar cada Classe herdada de Animal
     * Passe-se como parametro o codigo do animal a ser buscado
     * o for each percorre todos os valores do array animais
     * o istanceof verifica o tipo da classe do animal
     * então se o codigo digitado for igual o codigo do animal salvo
     * retorno o animal buscado, se não lanço a exceção.
     */
    public Animal buscarCachorro(String cod_dog) throws ANEException{
        for(Animal animal:animais){
            if(animal instanceof Cachorro)
                if(((Cachorro) animal).getCod_dog().equals(cod_dog)){
                    return animal;
                }
        }
        throw new ANEException();
    }
    public Animal buscarGato(String cod_cat) throws ANEException{
        for(Animal animal:animais){
            if(animal instanceof Gato)
                if(((Gato) animal).getCod_cat().equals(cod_cat)){
                    return animal;
                }
        }
        throw new ANEException();
    }

    public Animal buscarPeixe(String cod_fish) throws ANEException{
        for(Animal animal:animais){
            if(animal instanceof Peixe)
                if(((Peixe) animal).getCod_fish().equals(cod_fish)){
                    return animal;
                }
        }
        throw new ANEException();
    }

    public Animal buscarPassaro(String cod_bird) throws ANEException{
        for(Animal animal:animais){
            if(animal instanceof Passaro)
                if(((Passaro) animal).getCod_bird().equals(cod_bird)){
                    return animal;
                }
        }
        throw new ANEException();
    }

    public Animal buscarTartaruga(String cod_turtle) throws ANEException{
        for(Animal animal:animais){
            if(animal instanceof Tartaruga)
                if(((Tartaruga) animal).getCod_turtle().equals(cod_turtle)){
                    return animal;
                }
        }
        throw new ANEException();
    }
    // ----------------------------------------------------------------------


    //Estrutura de Remoção --------------------------------------------------
    /**
     * Metodo criado para remoção de Animal cadastrado
     * O Try verifica e compara o tipo especifico de cada animal
     * em seguida faz uma busca da classe especifica do aniaml via seu
     * codigo, quando ele encontra, pega a lista de animais e remove
     * o animal especifico.
     * Caso contrario lança a exceção
     */
    public void removerAnimal(Animal animal)throws ANEException{
        try{
            if(animal instanceof Cachorro ){
                this.buscarCachorro(((Cachorro) animal).getCod_dog());
                animais.remove(animal);
                throw new ANEException();
            }
            if(animal instanceof Gato){
                this.buscarGato(((Gato) animal).getCod_cat());
                animais.remove(animal);
                throw new ANEException();
            }
            if(animal instanceof Peixe){
                this.buscarPeixe(((Peixe) animal).getCod_fish());
                animais.remove(animal);
                throw new ANEException();
            }
            if(animal instanceof Passaro){
                this.buscarPassaro(((Passaro) animal).getCod_bird());
                animais.remove(animal);
                throw new ANEException();
            }
            if(animal instanceof Tartaruga){
                this.buscarTartaruga(((Tartaruga) animal).getCod_turtle());
                animais.remove(animal);
                throw new ANEException();
            }

        }catch(ANEException e){

        }
    }
    // ----------------------------------------------------------------------

}
