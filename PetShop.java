public class PetShop {


    IRepositorioAnimal animais = new CadastrarAnimal();

    /**
     * Classe criada para controle das assinatura da Interface
     * Assim dando comportamentos aos métodos
     */

    public void cadastrarAnimal(Animal animal) throws AJCException{
        animais.cadastrarAnimal(animal);
    }

    public Animal buscarCachorro(String cod_dog) throws ANEException{
        return animais.buscarCachorro(cod_dog);
    }

    public Animal buscarGato(String cod_cat) throws ANEException{
        return animais.buscarGato(cod_cat);
    }

    public Animal buscarPeixe(String cod_fish) throws ANEException{
        return animais.buscarPeixe(cod_fish);
    }

    public Animal buscarPassaro(String cod_bird) throws ANEException{
        return animais.buscarPassaro(cod_bird);
    }

    public Animal buscarTartaruga(String cod_turtle) throws ANEException{
        return animais.buscarTartaruga(cod_turtle);
    }

    public void removerAnimal(Animal animal)throws ANEException{
        animais.removerAnimal(animal);
    }

}
