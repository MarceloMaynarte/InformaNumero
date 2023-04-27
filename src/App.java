import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int num;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número desejado");
        num = input.nextInt();

        while(num < 100){
            num++;

            if(num %2 == 0){
                System.out.println("Os números pares de 0 a 100 são " + num);
            }else{
                System.out.println("Os números ímpares são "+ num);
            }
        }
    }
}
