
package company.condicional;
import java.util.Scanner;
public class Condicional {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        String a="fabio";
        String b="santos"; 
        String re=(a=="fabio"&& b=="santos")? "aprovado!":"reprovado!";
        System.out.println(re);
        System.out.println("Digite sua idade:");
        int idade=sc.nextInt();
        if(idade>=18 && idade<68){
            System.out.println("Maior de idade, vota obrigatorio!");
        }else{
            if(idade<16){
                System.out.println("Não vota!");
            }else{
                System.out.println("Voto opcional!");
            }
        }
        
    }
}
