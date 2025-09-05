import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;
        String lasku = "";


        System.out.println("Anna mulle yksi numero");
            n1 = Integer.parseInt(in.nextLine());        
        System.out.println("Anna mulle toine numero");
            n2 = Integer.parseInt(in.nextLine());
        System.out.println("Haluatko plus vai miinus");
            lasku = in.nextLine();
        if (lasku.equals("plus")){
            int vastaus = n1 + n2;
            System.out.println("Summa on " + vastaus);
        }
        else {
            int vastaus = n1 - n2;
            System.out.println("Tulo on " + vastaus);
        }
        // if (vastaus > 10){
        // System.out.println("tulos yli 10. JOka on " + vastaus);
        // }
        // else{
        //     System.out.println("Tulos on " + vastaus);
        // }
    }   
}
