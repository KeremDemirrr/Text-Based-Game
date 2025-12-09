import java.util.Random;
import java.util.Scanner;

public class Refik {
    public static void main(String[] args) {
        int memurHealth = 5;
        int tevfikDamage = 2;
        int refikDamage = 7;
        int tevfikHealth = 10;
        int refikHealth = 8;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz: ");

        String name = scanner.nextLine();

        name = "Şanzuman Tevfik";

        System.out.println("");
        System.out.println("Merhaba " + name);
        System.out.println("Oyuna başlamak için 'başla' yazınız");
        System.out.println("Ayarlara girmek için 'ayarlar' yazınız");

        while (true) {
            String startup = scanner.nextLine();
            if (startup.equalsIgnoreCase("ayarlar")) {
                while (true) {
                    System.out.println("Yapım Aşamasında çıkmak için geri yazın");

                    String ayarGeri = scanner.nextLine();
                    if (ayarGeri.equalsIgnoreCase("geri")) {
                        System.out.println("Ana menüye dönülüyor.");
                        break;
                    } else {
                        System.out.println("Geçersiz komut tekrar deneyiniz");
                    }

                }

            } else if (startup.equalsIgnoreCase("başla")) {
                System.out.println("");
                System.out.println("Fare Refik Japonya'da satılan bir fare samuray robottur.");
                System.out.println( "Birgün Japonya'daki oyuncak rafında yaşarken bir Hacker Doğan ikinizden birini almaya karar verir");
                System.out.println("Bir karar ver refik'i mi kendini mi seçiyorsun");
                System.out.println("Refik'i seçmek için 'refik' yaz");
                System.out.println("Kendini seçmek için 'şanzuman tevfik' yaz ");

                String chose = scanner.nextLine();
                System.out.println("");
                if (chose.equalsIgnoreCase("refik")) {
                    System.out.println("Refiki seçtin fakat Hacker Doğan ikinizi satın aldı");
                } else if (chose.equalsIgnoreCase("şanzuman tevfik")) {
                    System.out.println("Kendini seçtin fakat Hacker Doğan ikinizide satın aldı");
                } else {
                    System.out.println("Kararsız kaldığı için Hacker Doğan ikinizde aldı");
                }
                System.out.println("Japonya Havalimanına geldiniz Refik ile kaçacak mısınız yoksa devam mı edeceksiniz");
                System.out.println("Kaçmak için 'kaç' yaz");
                System.out.println("Devam etmek için 'devam' yaz");
                String escape = scanner.nextLine();
                if(escape.equalsIgnoreCase("kaç")){
                    System.out.println("Diyarbakıra gitmek yerine havaalanında kayboldunuz");
                    System.out.println("--OYUNU KAYBETTİN--");
                    break;
                }else if(escape.equalsIgnoreCase("devam")){
                    System.out.println("Uçağa bindiniz ve uçak diyarbakıra indi");
                }else{
                    System.out.println("Geçersiz komut");
                    break;
                }
                System.out.println("");
                System.out.println("Havaalanında gümrük memuru ile karşılaştınız gümrükten çıkmak için gümrük memuru ile savaş");
                System.out.println("Yapmak istediğinizi seçin");
                System.out.println("'tevfik saldırı'");
                System.out.println("'refik saldırı'");
                System.out.println("'memurdan kaç'(yanlızca %1 şans ile)");
                    String gumruk = scanner.nextLine();
                    if(gumruk.equalsIgnoreCase("tevfik saldırı")){
                        memurHealth -= tevfikDamage;
                        System.out.println("Gümrüğe saldırdın gümrüğün canı " + memurHealth );
                        if(memurHealth<=0){
                            System.out.println("Tebrikler Gümrüğü yendin");
                        }else
                        System.out.println("Gümrük tarafından yakalandın");
                        System.out.println("--OYUNU KAYBETTİN--");
                        break;
                    }else if(gumruk.equalsIgnoreCase("refik saldırı")){
                        memurHealth -= refikDamage;
                        System.out.println("Gümrüğe saldırdın gümrüğün canı " + memurHealth);
                        if(memurHealth <= 0){
                            System.out.println("Tebrikler Gümrüğü yendin");
                            System.out.println("Artık Diyarbakırdasın Happy Hacking Space'e gitmek için hangi yolu seçiyorsun");
                            System.out.println("'Site girişinden gir'");
                            System.out.println("'Kapısı açık dükkandan gir'");
                            String road = scanner.nextLine();
                            if(road.equalsIgnoreCase("Kapısı açık dükkandan gir"))
                            {
                                System.out.println("Kapısı açık dükkana girdin");
                                System.out.println("Tebrikler HHS'ye ulaştın");
                            }else if(road.equalsIgnoreCase("Site girişinden gir")){
                            System.out.println("Site girişinden giriyorsun");
                            int i = 1;
                            while(i<1000){
                            System.out.println("Refiği köpek yedi");
                            }

                            }else{
                                System.out.println("Hatalı komut");
                                break;
                            }
                        }
                    }else if(gumruk.equalsIgnoreCase("memurdan kaç")){
                        Random rnd = new Random();
                        int sans = rnd.nextInt(100);
                        if(sans == 0){
                            System.out.println("Tebrikler yüzde 1 ihtimal ile kaçtınız artık özgürsün");

                        }else{
                            System.out.println("Kaçarken Yakalandınız Oyunu Kaybettiniz");
                        }

                    }else{
                        System.out.println("YANLIŞ YAZMA");
                    }




                break;
            } else {
                System.out.println("Hatalı Yazım Yaptınız");

            }
        }
        System.out.println("out");
    }
}
