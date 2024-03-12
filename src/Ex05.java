import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a palavra que deseja inverter: ");
        String palavra = scan.nextLine();
        String invertida = "";

        for (int i = palavra.length()-1; i >= 0; i--) {
            invertida += palavra.charAt(i); //método charAt(i) obtém o caractere na posição [i] da palavra original e concatena à variável 'invertida
        }

        System.out.printf("Palavra invertida: %s\n", invertida);
   
        scan.close();
    }
		    
	}
		


