class Cat {
    //змінні
    String name;
    short age;
    float weight;
    boolean isHugry;


    //Визначаємо метод meow
    /*Якщо котик скаже "Мяу" - то виводиться повідомлення Meow*/
    void meow(){

        System.out.println("Котик звуть "+ name +" і він нявкнув 'Meow'");
    }

    //Визначаємо метод eat
    void eat(){

        System.out.print("Кіт "+name+" важить " +weight+"кг. ");

        if (weight>(float) 5.5){
        isHugry = true;
            System.out.println("Кіт "+name+" ситий.");
        }
        else
            System.out.println("Кота "+name+" потрібно покормити");
    }
}

public class ActionCat extends Cat {
    public static void main(String[] args) {

        //об'являємо масив імен котів
        String name []= {"Фунтік", "Шпунтік", "Барсік", "Том", "Ям"};
        //об'являємо масив ваги котів
        float weight [] = {(float) 5.8, (float) 5.7, (float) 4.4, (float) 5.501, (float) 5.49,};

        ActionCat[] cat = new ActionCat[5];
        for (int i=1; i==5; i++){

            cat[i] = new ActionCat();

            cat[i].name = name[i];
            cat[i].weight = weight[i];

            cat[i].meow();
            cat[i].eat();
        }
    }

 /*       Cat cat1 = new Cat();
        cat1.name = "Фунтік";
        cat1.weight = (float) 5.8;

        Cat cat2 = new Cat();
        cat2.name = "Шпунтік";
        cat2.weight = (float) 5.7;

        Cat cat3 = new Cat();
        cat3.name = "Барсік";
        cat3.weight = (float) 4.4;

        Cat cat4 = new Cat();
        cat4.name = "Том";
        cat4.weight = (float) 5.501;

        Cat cat5 = new Cat();
        cat5.name = "Ям";
        cat5.weight = (float) 5.49;

        cat1.meow();
        cat1.eat();
        cat2.meow();
        cat2.eat();
        cat3.meow();
        cat3.eat();
        cat4.meow();
        cat4.eat();
        cat5.meow();
        cat5.eat(); */
    }