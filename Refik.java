import java.util.Scanner;

public class Refik {
    public static void main(String[] args) {
        int mobHealth = 5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz: ");

        String name = scanner.nextLine();

        name = "Şanzuman Tevfik";

        System.out.println("Merhaba " + name);
        System.out.println("Oyuna başlamak için 'başla' yazınız");
        System.out.println("Ayarlara girmek için 'ayarlar' yazınız");

        while (true) {
            String startup = scanner.nextLine();
            if (startup.equalsIgnoreCase("ayarlar")) {
                while(true){
                System.out.println("Yapım Aşamasında çıkmak için geri yazın");

                String ayarGeri = scanner.nextLine();
                if(ayarGeri.equalsIgnoreCase("geri")){
                System.out.println("Ana menüye dönülüyor.");
                break;
                }else{
                    System.out.println("Geçersiz komut tekrar deneyiniz");
                }


                }

            } else if (startup.equalsIgnoreCase("başla")) {
                System.out.println("Fare Refik Japonya'da satılan bir fare robottur.");
                System.out.println("Birgün Japonya'daki oyuncak rafında yaşarken bir Hacker Doğan birinizi almaya karar verir");
                System.out.println("Bir karar ver refik'i mi kendini mi seçiyorsun");
                System.out.println("Refik'i seçmek için 'refik' yaz");
                System.out.println("Kendini seçmek için 'şanzuman tevfik' yaz ");

                String chose = scanner.nextLine();
                if(chose.equalsIgnoreCase("refik")){
                    System.out.println("Refiki seçtin fakat Hacker Doğan ikinizi satın aldı");
                }else if(chose.equalsIgnoreCase("şanzuman tevfik")){
                    System.out.println("Kendini seçtin fakat Hacker Doğan ikinizide satın aldı");
                }else{
                    System.out.println("Kararsız kaldığı için Hacker Doğan ikinizde aldı");
                }









                break;
            } else {
                System.out.println("Hatalı Yazım Yaptınız");

            }
        }
        System.out.println("out");
    }
}
