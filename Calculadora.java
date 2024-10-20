
package calculadora;
import java.util. Scanner;

public class Calculadora {

    int n1;
    int n2;
    int somar, subtrair, multiplicar, divisao; 
    
    public void entrada(){
        Scanner leia = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        n1 = leia.nextInt();
        
        System.out.println(" digite o segundo numero");
        n2 = leia.nextInt();
    }
    
    public void somar_numeros(){
        somar = n1 + n2;
        System.out.println("\n a soma dos numeros é:" + somar);
    }
    
    public void subtrair_numeros(){
        subtrair = n1 - n2;
        System.out.println("\n a subtração dos numeros é:" + subtrair);
    }
    
    public void multiplicar_numeros(){
        multiplicar = n1 * n2;
        System.out.println("\n a multiplicação é:" + multiplicar);
    }
    
    public void dividir_numeros(){
        divisao = n1 / n2;
        System.out.println("\n a divisão dos numeros é:" + divisao);
    }
            
    public void menu(){
        Scanner leia = new Scanner(System.in);
        int opcao=0;
        System.out.println(" menu");
        System.out.println(" 1.somar");
        System.out.println(" 2.subtrair");
        System.out.println(" 3.multiplicar");
        System.out.println(" 4.divisao");
        System.out.println("\n selecionar operacao");
        opcao = leia.nextInt();
        
        switch (opcao){
            case 1:
                entrada();
                somar_numeros();
                break;
    
            case 2:
                 entrada();
                 subtrair_numeros();
                 break;
                 
            case 3:
                entrada();
                multiplicar_numeros();
                break;
            
            case 4:
                entrada();
                dividir_numeros();
                break;
                
            default:
                System.out.println("\n opcao invalida");
                break;
        }
    }
    
    public void numeros_negativos(){
        if (n1<0 || n2<0){
            System.out.println("\n um dos numeros é negativo");
        }
    }
    
    public void maior_numero(){
     int maior_numero =n1;
     if (n2>maior_numero){
         maior_numero = n2;
     }
     System.out.println("\n o maior numero é" + maior_numero);
    }
}
