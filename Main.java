import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Criando instancias dos Objetos
        PetShop petshop = new PetShop();
        Animal animal = new Animal(null, 0, null);
        Cachorro cachorro = null;
        Gato gato = null;
        Peixe peixe = null;
        Passaro passaro = null;
        Tartaruga tartaruga = null;

        int op = 0, opc = 0, buscar = 0, remover = 0;

        while (op != 4) {
            try {
                System.out.println(
                        "|--------------------------------------------|\n" +
                                "==============(Controle PetShop)==============\n" +
                                "|--------------------------------------------|\n" +
                                "[1]Cadastra Animal.                          |\n" +
                                "[2]Buscar Animal.                            | \n" +
                                "[3]Remover Animal.                           |\n" +
                                "[4]Sair.                                     |\n" +
                                "|--------------------------------------------|");
                op = ler.nextInt();

                switch (op) {

                    //Cadastrar Animal
                    case 1:

                        System.out.println("Cadastrando Animal...");
                        System.out.println("Cachorro[1], Gato[2], Peixe[3], Passaro[4], Tartaruga[5]?");
                        opc = ler.nextInt();
                        switch (opc) {
                            case 1:
                                System.out.println("Especie: ");
                                String especie = ler.next();
                                System.out.println("Idade: ");
                                int idade = ler.nextInt();
                                System.out.println("Sexo: ");
                                String sexo = ler.next();
                                System.out.println("Codigo do Cachorro: ");
                                String cod_dog = ler.next();
                                System.out.println("Raça: ");
                                String raca = ler.next();
                                System.out.println("Origem: ");
                                String origem = ler.next();
                                System.out.println("Tamanho: ");
                                int tamanho = ler.nextInt();
                                System.out.println("Cor: ");
                                String cor = ler.next();
                                animal = new Cachorro(especie, idade, sexo, cod_dog,
                                        raca, origem, tamanho, cor);

                                try {
                                    petshop.cadastrarAnimal(animal);
                                    System.out.println("Animal Cadastrado com Sucesso!");
                                } catch (AJCException e) {
                                    System.out.println(e.getMessage());
                                }
                                break;

                            case 2:
                                System.out.println("Especie: ");
                                String especie1 = ler.next();
                                System.out.println("Idade: ");
                                int idade1 = ler.nextInt();
                                System.out.println("Sexo: ");
                                String sexo1 = ler.next();
                                System.out.println("Codigo do Cachorro: ");
                                String cod_cat = ler.next();
                                System.out.println("Raça: ");
                                String raca1 = ler.next();
                                System.out.println("Origem: ");
                                String origem1 = ler.next();
                                System.out.println("Tamanho: ");
                                int tamanho1 = ler.nextInt();
                                System.out.println("Cor: ");
                                String cor1 = ler.next();
                                animal = new Gato(especie1, idade1, sexo1, cod_cat,
                                        raca1, origem1, tamanho1, cor1);

                                try {
                                    petshop.cadastrarAnimal(animal);
                                    System.out.println("Animal Cadastrado com Sucesso!");
                                } catch (AJCException e) {
                                    System.out.println(e.getMessage());
                                }
                                break;

                            case 3:
                                System.out.println("Especie: ");
                                String especie2 = ler.next();
                                System.out.println("Idade: ");
                                int idade2 = ler.nextInt();
                                System.out.println("Sexo: ");
                                String sexo2 = ler.next();
                                System.out.println("Codigo do Cachorro: ");
                                String cod_fish = ler.next();
                                System.out.println("Raça: ");
                                String raca2 = ler.next();
                                System.out.println("Origem: ");
                                String origem2 = ler.next();
                                System.out.println("Tamanho: ");
                                int tamanho2 = ler.nextInt();
                                System.out.println("Cor: ");
                                String cor2 = ler.next();
                                animal = new Peixe(especie2, idade2, sexo2, cod_fish,
                                        raca2, origem2, tamanho2, cor2);

                                try {
                                    petshop.cadastrarAnimal(animal);
                                    System.out.println("Animal Cadastrado com Sucesso!");
                                } catch (AJCException e) {
                                    System.out.println(e.getMessage());
                                }
                                break;

                            case 4:
                                System.out.println("Especie: ");
                                String especie3 = ler.next();
                                System.out.println("Idade: ");
                                int idade3 = ler.nextInt();
                                System.out.println("Sexo: ");
                                String sexo3 = ler.next();
                                System.out.println("Codigo do Cachorro: ");
                                String cod_bird = ler.next();
                                System.out.println("Raça: ");
                                String raca3 = ler.next();
                                System.out.println("Origem: ");
                                String origem3 = ler.next();
                                System.out.println("Tamanho: ");
                                int tamanho3 = ler.nextInt();
                                System.out.println("Cor: ");
                                String cor3 = ler.next();
                                animal = new Passaro(especie3, idade3, sexo3, cod_bird,
                                        raca3, origem3, tamanho3, cor3);

                                try {
                                    petshop.cadastrarAnimal(animal);
                                    System.out.println("Animal Cadastrado com Sucesso!");
                                } catch (AJCException e) {
                                    System.out.println(e.getMessage());
                                }
                                break;

                            case 5:
                                System.out.println("Especie: ");
                                String especie4 = ler.next();
                                System.out.println("Idade: ");
                                int idade4 = ler.nextInt();
                                System.out.println("Sexo: ");
                                String sexo4 = ler.next();
                                System.out.println("Codigo do Cachorro: ");
                                String cod_turtle = ler.next();
                                System.out.println("Raça: ");
                                String raca4 = ler.next();
                                System.out.println("Origem: ");
                                String origem4 = ler.next();
                                System.out.println("Tamanho: ");
                                int tamanho4 = ler.nextInt();
                                System.out.println("Cor: ");
                                String cor4 = ler.next();
                                animal = new Tartaruga(especie4, idade4, sexo4, cod_turtle,
                                        raca4, origem4, tamanho4, cor4);

                                try {
                                    petshop.cadastrarAnimal(animal);
                                    System.out.println("Animal Cadastrado com Sucesso!");
                                } catch (AJCException e) {
                                    System.out.println(e.getMessage());
                                }
                                break;
                        }
                        break;

                    //Buscar Animal
                    case 2:
                        System.out.println("Buscando Animal...");
                        System.out.println("Cachorro[1], Gato[2], Peixe[3], Passaro[4], Tartaruga[5]?");
                        buscar = ler.nextInt();

                        switch (buscar) {
                            case 1:

                                System.out.println("Buscando Cachorro...");
                                System.out.println("Digite o Codigo do Cachorro.");
                                String codg_dog = ler.next();
                                try {

                                    Animal aux = petshop.buscarCachorro(codg_dog);

                                    System.out.println("#************************#");
                                    System.out.println("|Especie:  " + aux.getEspecie());
                                    System.out.println("|Idade: " + aux.getIdade() + " Anos");
                                    System.out.println("|Sexo:  " + aux.getSexo());
                                    System.out.println("|Codigo: " + ((Cachorro) aux).getCod_dog());
                                    System.out.println("|Raça: " + ((Cachorro) aux).getRaca_dog());
                                    System.out.println("|Origem: " + ((Cachorro) aux).getOrigem_dog());
                                    System.out.println("|Tamanho: " + ((Cachorro) aux).getTamanho_dog() + " Metros");
                                    System.out.println("|Cor: " + ((Cachorro) aux).getCor_dog());
                                    System.out.println("#************************#");

                                } catch (ANEException e) {
                                    System.out.println(e.getMessage());
                                }
                                break;

                            case 2:

                                System.out.println("Buscando Gato...");
                                System.out.println("Digite o Codigo do Gato.");
                                String codc_cat = ler.next();
                                try {

                                    Animal aux = petshop.buscarGato(codc_cat);

                                    System.out.println("#************************#");
                                    System.out.println("|Especie:  " + aux.getEspecie());
                                    System.out.println("|Idade: " + aux.getIdade() + " Anos");
                                    System.out.println("|Sexo:  " + aux.getSexo());
                                    System.out.println("|Codigo: " + ((Gato) aux).getCod_cat());
                                    System.out.println("|Raça: " + ((Gato) aux).getRaca_cat());
                                    System.out.println("|Origem: " + ((Gato) aux).getOrigem_cat());
                                    System.out.println("|Tamanho: " + ((Gato) aux).getTamanho_cat() + " Metros");
                                    System.out.println("|Cor: " + ((Gato) aux).getCor_cat());
                                    System.out.println("#************************#");

                                } catch (ANEException e) {
                                    System.out.println(e.getMessage());
                                }
                                break;

                            case 3:

                                System.out.println("Buscando Peixe...");
                                System.out.println("Digite o Codigo do Peixe.");
                                String codp_fish = ler.next();
                                try {

                                    Animal aux = petshop.buscarPeixe(codp_fish);

                                    System.out.println("#************************#");
                                    System.out.println("|Especie:  " + aux.getEspecie());
                                    System.out.println("|Idade: " + aux.getIdade() + " Anos");
                                    System.out.println("|Sexo:  " + aux.getSexo());
                                    System.out.println("|Codigo: " + ((Peixe) aux).getCod_fish());
                                    System.out.println("|Raça: " + ((Peixe) aux).getRaca_fish());
                                    System.out.println("|Origem: " + ((Peixe) aux).getOrigem_fish());
                                    System.out.println("|Tamanho: " + ((Peixe) aux).getTamanho_fish() + "Centimetros");
                                    System.out.println("|Cor: " + ((Peixe) aux).getCor_fish());
                                    System.out.println("#************************#");

                                } catch (ANEException e) {
                                    System.out.println(e.getMessage());
                                }
                                break;

                            case 4:

                                System.out.println("Buscando Passaro...");
                                System.out.println("Digite o Codigo do Passaro.");
                                String codp_bird = ler.next();
                                try {

                                    Animal aux = petshop.buscarPassaro(codp_bird);

                                    System.out.println("#************************#");
                                    System.out.println("|Especie:  " + aux.getEspecie());
                                    System.out.println("|Idade: " + aux.getIdade() + " Anos");
                                    System.out.println("|Sexo:  " + aux.getSexo());
                                    System.out.println("|Codigo: " + ((Passaro) aux).getCod_bird());
                                    System.out.println("|Raça: " + ((Passaro) aux).getRaca_bird());
                                    System.out.println("|Origem: " + ((Passaro) aux).getOrigem_bird());
                                    System.out.println("|Tamanho: " + ((Passaro) aux).getTamanho_bird() + "Centimetros");
                                    System.out.println("|Cor: " + ((Passaro) aux).getCor_bird());
                                    System.out.println("#************************#");

                                } catch (ANEException e) {
                                    System.out.println(e.getMessage());
                                }
                                break;

                            case 5:

                                System.out.println("Buscando Tartaruga...");
                                System.out.println("Digite o Codigo do Tartaruga.");
                                String codt_turtle = ler.next();
                                try {

                                    Animal aux = petshop.buscarTartaruga(codt_turtle);

                                    System.out.println("#************************#");
                                    System.out.println("|Especie:  " + aux.getEspecie());
                                    System.out.println("|Idade: " + aux.getIdade() + " Anos");
                                    System.out.println("|Sexo:  " + aux.getSexo());
                                    System.out.println("|Codigo: " + ((Tartaruga) aux).getCod_turtle());
                                    System.out.println("|Raça: " + ((Tartaruga) aux).getRaca_turtle());
                                    System.out.println("|Origem: " + ((Tartaruga) aux).getOrigem_turtle());
                                    System.out.println("|Tamanho: " + ((Tartaruga) aux).getTamanho_turtle() + "Centimetros");
                                    System.out.println("|Cor: " + ((Tartaruga) aux).getCor_turtle());
                                    System.out.println("#************************#");

                                } catch (ANEException e) {
                                    System.out.println(e.getMessage());
                                }
                                break;

                        }
                        break;

                    //Remover Animal
                    case 3:

                        System.out.println("Removendo Animal...");
                        System.out.println("Cachorro[1], Gato[2], Peixe[3], Passaro[4], Tartaruga[5]?");
                        remover=ler.nextInt();
                        switch(remover){

                            case 1:

                                System.out.println("Digite o codigo do Cachorro!");
                                System.out.println("Codigo: ");
                                String cod_dog = ler.next();

                                try{

                                    Animal aux = petshop.buscarCachorro(cod_dog);
                                    petshop.removerAnimal(aux);
                                    System.out.println("Animal Removido com Sucesso!");

                                }
                                catch(ANEException ex){
                                    System.out.println(ex.getMessage());
                                }

                                break;

                            case 2:

                                System.out.println("Digite o codigo do Gato!");
                                System.out.println("Codigo: ");
                                String cod_cat = ler.next();

                                try{

                                    Animal aux = petshop.buscarGato(cod_cat);
                                    petshop.removerAnimal(aux);
                                    System.out.println("Animal Removido com Sucesso!");

                                }
                                catch(ANEException ex){
                                    System.out.println(ex.getMessage());
                                }

                                break;

                            case 3:

                                System.out.println("Digite o codigo do Peixe!");
                                System.out.println("Codigo: ");
                                String cod_fish = ler.next();

                                try{

                                    Animal aux = petshop.buscarPeixe(cod_fish);
                                    petshop.removerAnimal(aux);
                                    System.out.println("Animal Removido com Sucesso!");

                                }
                                catch(ANEException ex){
                                    System.out.println(ex.getMessage());
                                }

                                break;

                            case 4:

                                System.out.println("Digite o codigo do Passaro!");
                                System.out.println("Codigo: ");
                                String cod_bird = ler.next();

                                try{

                                    Animal aux = petshop.buscarPassaro(cod_bird);
                                    petshop.removerAnimal(aux);
                                    System.out.println("Animal Removido com Sucesso!");

                                }
                                catch(ANEException ex){
                                    System.out.println(ex.getMessage());
                                }

                                break;

                            case 5:

                                System.out.println("Digite o codigo da Tartaruga!");
                                System.out.println("Codigo: ");
                                String cod_turtle = ler.next();

                                try{

                                    Animal aux = petshop.buscarTartaruga(cod_turtle);
                                    petshop.removerAnimal(aux);
                                    System.out.println("Animal Removido com Sucesso!");

                                }
                                catch(ANEException ex){
                                    System.out.println(ex.getMessage());
                                }

                                break;



                        }

                        break;

                    // Sair do Programa
                    case 4:
                        System.out.println("Finalizando...");
                        System.out.println("Finalizado!");

                        break;

                    //Default para eventuais opções invalidas
                    default:
                        System.out.println("Opção Invalida.");

                        break;

                }
            // Opção para caso de Erro
            } catch (Exception err) {
                op = 4;
                System.out.println("Bazinga! 404: Erro Not Found!");

            }
        }
    }
}
