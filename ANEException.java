/**
 * Exeção criada para tratamento de erro
 * Para informar o sistema que o Animal não foi Encontrado
 */
public class ANEException extends Exception{
    public ANEException(){
        super("Animal não encontrado");
    }
}
