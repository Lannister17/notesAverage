import java.util.Scanner;

public class notes {
    public static void main(String[] args) {
        int math,physics,biology,chemistry,music;
        float average;
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notunu Giriniz : ");
        math = inp.nextInt();
        System.out.print("Fizik Notunu Giriniz : ");
        physics = inp.nextInt();
        System.out.print("Biyoloji Notunu Giriniz : ");
        biology = inp.nextInt();
        System.out.print("Kimya Notunu Giriniz : ");
        chemistry = inp.nextInt();
        System.out.print("Müzik Notunu Giriniz : ");
        music = inp.nextInt();

        average = (math + physics + biology + chemistry + music)/5f;

        if (average <=55){
            System.out.println("Sınıfta Kaldınız \n Not ortalamanız : " + average);
        }else {
            System.out.println("Sınıfı gectiniz \n Not ortalamanız : " + average);
        }
    }
}
