import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AtividadeLista {

    Scanner scanner = new Scanner(System.in);

    ArrayList array = new ArrayList();

    public static void main(String[] args) {
        AtividadeLista atividadeLista = new AtividadeLista();
        atividadeLista.criarArray();
        atividadeLista.mostrarArray();
    }

    private ArrayList criarArray(){

        int tamanho;
        int numero;

        System.out.println("Informe o tamanho da lista a ser criada:");
        tamanho = scanner.nextInt();

        for(int i = 0; i < tamanho; i++) {
            System.out.println("Informe um número para inseir na lista: ");
            numero = scanner.nextInt();;
            array.add(numero);
        }

        return array;

    }

    private void mostrarArray() {

        int op = 0;
        while(op != 4) {

            System.out.println("Escolha uma das opções: ");
            System.out.println("1 - Crescnete");
            System.out.println("2 - Aleatória");
            System.out.println("3 - Decrescente");
            System.out.println("4 - Sair");
            op = scanner.nextInt();

            if(op == 1 ){
                arrayCrescente();
            } else if ( op == 2 ) {
                arrayAleatoria();
            } else if ( op == 3 ) {
                arrayDecrescente();
            } else if ( op == 4) {
                break;
            } else {
                System.out.println("Opção inválida");
            }
        }
    }

    private void arrayCrescente(){

        Collections.sort(array);

        System.out.println(array);

    }

    private void arrayDecrescente(){

        Collections.sort(array, Collections.reverseOrder());

        System.out.println(array);

    }

    private void arrayAleatoria(){

        Collections.shuffle(array);

        System.out.println(array);

    }

}
