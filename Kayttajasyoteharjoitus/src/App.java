import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;

        System.out.println("Anna mulle yksi numero");
            n1 = Integer.parseInt(in.nextLine());        
        System.out.println("Anna mulle toine numero");
            n2 = Integer.parseInt(in.nextLine());
        int vastaus = n1 + n2;
        System.out.println("Lukujen summa " + vastaus);
        ;
    }   
}
