import java.util.Scanner;
public class GeovaneSilvaRamirez_Ag4_DSI {
public static void main(String args[]) {

    String nome_regiao;  
    float casos_brasil;
    float casos_regiao;
    float percentual_regiao;

    
Scanner leitor = new Scanner(System.in); 

System.out.println("Vamos calcular o percentual de casos de Covid-19 em uma determinada região do Brasil.");
System.out.print("Primeiramente, digite o nome da Região: ");

    nome_regiao = leitor.next();

System.out.print ("Agora, digite o número de casos de Covid-19 no Brasil: ");

    casos_brasil = leitor.nextFloat();
    
System.out.print ("Digite aqui o número de casos de Covid-19 na Região: ");

    casos_regiao = leitor.nextFloat ();
        
            percentual_regiao = casos_regiao * 100 / casos_brasil;

System.out.println("Com base nos dados fornecidos, na Região " + nome_regiao + " o percentual de casos de Covid-19, em relação ao Brasil, é " + percentual_regiao + " %.");



    }   }

