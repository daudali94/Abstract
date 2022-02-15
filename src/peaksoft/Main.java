package peaksoft;

public class Main {

    public static void main(String[] args) {
        Cow korova = new Cow((float) 250.1,(byte)2,"M","Sary");
        Cow korova1 = new Cow((float) 260.4,(byte)3,"F","Ala");
        Cow korova2 = new Cow((float) 250.8,(byte)4,"M","Kashka");
        Cow[] korovy =  {korova, korova1, korova2};
        Cow[] korov = {korova2};

        Sheep baran = new Sheep((float) 18.7,(byte)1,"M","Suskok");
        Sheep baran1 = new Sheep((float) 17.8,(byte)1,"F","Ak");
        Sheep baran2 = new Sheep((float) 16.9,(byte)2,"M","Kara");
        Sheep baran3 = new Sheep((float) 15.8,(byte)2,"F","Kok");
        Sheep baran4 = new Sheep((float) 14.7,(byte)1,"M","Joosh");
        Sheep[] barany = {baran,baran1,baran2,baran3,baran4};
        Sheep[] barany1 = {baran3};

        Horse loshad = new Horse((float) 310.5,(byte)3,"M","Jorgo","Ak");
        Horse loshad1 = new Horse((float) 315.4,(byte)2,"M","Konor","Kara");
        Horse[] loshadi = {loshad,loshad1};
        Horse[] loshadi1 = {loshad1};

    Farm farm = new Farm();
        System.out.println("****************************");
    farm.setAddres("Naryn");
    farm.setOwnerName("Ali");
        System.out.println("Адрес фермы "+farm.getAddres()+" Владелец фермы "+farm.getOwnerName());
        System.out.println("Коровы----------------------");
        for (Cow s: korovy) {
            System.out.println("Вес "+s.getWeight()+"кг Возраст "+s.getAge()+" "+s.getGender()+" "+s.getNickName());
        }
        System.out.println("Бараны----------------------");
        for (Sheep a: barany) {
            System.out.println("Вес "+a.getWeight()+"кг Возраст "+a.getAge()+" "+a.getGender()+" "+a.getNickName());
        }
        System.out.println("Лошади----------------------");
        for (Horse w: loshadi) {
            System.out.println("Вес "+w.getWeight()+"кг Возраст "+w.getAge()+" "+w.getGender()+" "+w.getNickName()+" "+w.getColor());
        }
        System.out.println("****************************");
    Farm farm1 = new Farm();
        farm.setAddres("Zardaly");
        farm.setOwnerName("Kurban");
        System.out.println("Адрес фермы "+farm.getAddres()+" Владелец фермы "+farm.getOwnerName());
        System.out.println("Коровы----------------------");
        for (Cow d: korov) {
            System.out.println("Вес "+d.getWeight()+"кг Возраст "+d.getAge()+" "+d.getGender()+" "+d.getNickName());
        }
        System.out.println("Бараны----------------------");
        for (Sheep f: barany1) {
            System.out.println("Вес "+f.getWeight()+"кг Возраст "+f.getAge()+" "+f.getGender()+" "+f.getNickName());
        }
        System.out.println("Лошади----------------------");
        for (Horse g: loshadi1) {
            System.out.println("Вес "+g.getWeight()+"кг Возраст "+g.getAge()+" Пол "+g.getGender()+" Имя "+g.getNickName()+" "+g.getColor());
        }
    }
}
