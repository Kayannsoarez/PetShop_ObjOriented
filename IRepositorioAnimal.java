public interface IRepositorioAnimal {

    /**
     * Interface criada para ter a assinatura de metodos e propiedades
     * do controle de Cadastro, Busca e Remoção.
     * Fazendo que aclasse que a utilizará realizar a implementação das
     * assinaturas, dando comportamentos práticos aos métodos e de
     * utilizações diferentes.
     */

    public void cadastrarAnimal(Animal animal) throws AJCException;

    public Animal buscarCachorro(String cod_dog) throws ANEException;

    public Animal buscarGato(String cod_cat) throws ANEException;

    public Animal buscarPeixe(String cod_fish) throws ANEException;

    public Animal buscarPassaro(String cod_bird) throws ANEException;

    public Animal buscarTartaruga(String cod_turtle) throws ANEException;

    public void removerAnimal(Animal animal)throws ANEException;
}
