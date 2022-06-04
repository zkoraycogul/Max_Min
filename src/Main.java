import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] dizi = {15,12,788,1,3,41,10,-1,-778,2,0};
        System.out.print("Bir Sayı Giriniz : ");
        int number = input.nextInt();
        int [] copyOfDizi = Arrays.copyOf(dizi,dizi.length);
        Arrays.sort(copyOfDizi);
        int closeLarger = copyOfDizi[dizi.length-1];
        int closeSmaller = copyOfDizi[0];
        System.out.println(closeSmaller);
        for(int i : dizi) {
            if(number < i && closeLarger > i) {closeLarger = i;}
            if(number > i && i > closeSmaller) {closeSmaller = i;}
        }

        System.out.println("Girilen sayıdan büyük en küçük sayı = " + closeLarger);
        System.out.println("Gİrilen sayıdan küçük en büyük sayı = " + closeSmaller);
    }
}
