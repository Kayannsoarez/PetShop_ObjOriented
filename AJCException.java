/**
 * Exeção criada para tratamento de erro
 * Para informar o sistema que já existe uma Animal Cadastrado.
 */
public class AJCException extends Exception{
    public AJCException(){
        super("Animal já Cadastrada!");
        }

}
