import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Login l= new Login();
       // l.setUsername("azwar");
        l.setPassword("asdf");
        System.out.println();


        System.out.println("Username: ");
        String nama = input.nextLine();
        l.setUsername(nama);
        System.out.println("Password: "+ l.getPassword());


        Billing b = new Billing();

        System.out.println(l.getUsername());
        System.out.println("Penggunaan/jam : ");
        int penggunaan = input.nextInt();
        b.setPenggunaan(penggunaan);

        System.out.println("Nama : "+ l.getUsername());
        System.out.println("Biaya Total :");
        b.hitungBiaya();

    }
}