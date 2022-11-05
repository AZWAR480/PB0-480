public class Billing {
    private int biaya,penggunaan,total,tambahan;


    public Billing (){
        biaya = 3000;


    }
    public void setPenggunaan(int penggunaan){
        this.penggunaan = penggunaan;
    }
    public void hitungBiaya(){
        if(penggunaan > 2){
            tambahan = 4000;
            int total = biaya + tambahan;
            System.out.println("Biaya = "+biaya);
        }else if (penggunaan > 5){
            tambahan = 8000;
            int total = biaya + tambahan;
            System.out.println("Biaya = "+total);
        } else {
            tambahan =0;
            int total = biaya;
            System.out.println("Biaya = "+biaya);
        }
    }
}
