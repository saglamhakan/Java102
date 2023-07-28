package adventureGame;

import java.util.Random;

public class Oyun {
    private boolean canavarIlkHamleyiYapar;
    private boolean oyuncuKazandi;
    private boolean madenBolgesiAcik;
    private int para;
    private int silah;
    private int zirh;

    public Oyun() {
        this.canavarIlkHamleyiYapar = new Random().nextBoolean();
        this.oyuncuKazandi = false;
        this.madenBolgesiAcik = false;
        this.para = 0;
        this.silah = 0;
        this.zirh = 0;
    }

    public void savasBolgesineGir(String bolgeAdi) {
        if (bolgeAdi.equals("Maden")) {
            this.madenBolgesiAcik = true;
            System.out.println("Maden bölgesine girdiniz. Yılanlarla savaşmak için hazırlanın!");
        } else {
            System.out.println("Girilecek bölge bulunamadı.");
        }
    }

    public void savasaBasla() {
        if (!this.madenBolgesiAcik) {
            System.out.println("Ödül kazanılacak bir bölgeye girilmedi.");
            return;
        }

        Canavar yilan = new Canavar(4, new Random().nextInt(4) + 3, 12);
        System.out.println("Yılanla karşılaştınız. Yılanın sağlığı: " + yilan.getCan());

        if (this.canavarIlkHamleyiYapar) {
            yilanVur(yilan);
        }

        while (yilan.getCan() > 0) {
            oyuncuVur(yilan);

            if (yilan.getCan() <= 0) {
                System.out.println("Yılanı yendiniz!");
                ganimetDusur();
                break;
            }

            yilanVur(yilan);

            if (yilan.getCan() <= 0) {
                System.out.println("Üzgünüm, yılan tarafından yenildiniz.");
                break;
            }
        }
    }

    private void oyuncuVur(Canavar yilan) {
        if (new Random().nextInt(2) == 0) {
            int hasar = new Random().nextInt(3) + 3;
            System.out.println("Oyuncu yılanı vurdu! Yılanın sağlığı: " + yilan.vur(hasar));
        } else {
            System.out.println("Oyuncu yılanı kaçırdı!");
        }
    }

    private void yilanVur(Canavar yilan) {
        int hasar = new Random().nextInt(3) + 3;
        System.out.println("Yılan oyuncuyu vurdu! Oyuncunun sağlığı: " + vur(hasar));
    }

    private int vur(int hasar) {
        this.zirh -= hasar;
        if (this.zirh < 0) {
            this.zirh = 0;
        }
        return this.zirh;
    }

    private void ganimetDusur() {
        int rastgele = new Random().nextInt(100) + 1;

        if (rastgele <= 15) {
            this.silahKazan();
        } else if (rastgele <= 35) {
            this.zirhKazan();
        } else if (rastgele <= 60) {
            this.paraKazan(10);
        } else if (rastgele <= 90) {
            this.paraKazan(5);
        } else if (rastgele <= 100) {
            this.paraKazan(1);
        }
    }

    private void silahKazan() {
        int rastgele = new Random().nextInt(100) + 1;

        if (rastgele <= 15) {
            this.silah = Math.max(this.silah, 1);
            System.out.println("Silah kazandınız! Silah: 1");
        } else if (rastgele <= 35) {
            this.silah = Math.max(this.silah, 2);
            System.out.println("Tüfek kazandınız! Silah: 2");
        } else if (rastgele <= 65) {
            this.silah = Math.max(this.silah, 3);
            System.out.println("Kılıç kazandınız! Silah: 3");
        } else if (rastgele <= 100) {
            this.silah = Math.max(this.silah, 4);
            System.out.println("Tabanca kazandınız! Silah: 4");
        }
    }

    private void zirhKazan() {
        int rastgele = new Random().nextInt(100) + 1;

        if (rastgele <= 15) {
            this.zirh = Math.max(this.zirh, 1);
            System.out.println("Zırh kazandınız! Zırh: 1");
        } else if (rastgele <= 35) {
            this.zirh = Math.max(this.zirh, 2);
            System.out.println("Ağır Zırh kazandınız! Zırh: 2");
        } else if (rastgele <= 65) {
            this.zirh = Math.max(this.zirh, 3);
            System.out.println("Orta Zırh kazandınız! Zırh: 3");
        } else if (rastgele <= 100) {
            this.zirh = Math.max(this.zirh, 4);
            System.out.println("Hafif Zırh kazandınız! Zırh: 4");
        }
    }

    private void paraKazan(int paraMiktari) {
        this.para += paraMiktari;
        System.out.println(paraMiktari + " para kazandınız! Toplam para: " + this.para);
    }

    public void evEgitimi() {
        if (this.para >= 10 && this.silah >= 1 && this.zirh >= 1) {
            System.out.println("Tebrikler! Tüm ödülleri toplayarak güvenli eve döndünüz. Oyunu kazandınız!");
            this.oyuncuKazandi = true;
        } else {
            System.out.println("Eviniz için yeterli ödüle sahip değilsiniz.");
        }
    }


}
