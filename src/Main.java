public class Main {
    public static void main(String[] args) {

// задание 1-2
        System.out.println("задание 1-2");
        byte clientOS = 1;
        int clientDeviceYear = 2020;
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

// задание 3
        System.out.println("задание 3");
        int year = 400;
        if (year%4==0 && year%100!= 0 && year%400!=0) { System.out.println("високоскный год"); }
        else { System.out.println("невисокосный год");}


// задание 4
        System.out.println("задание 4");
        int deliveryDistance = 15;
        int minDay = 1;
        if (deliveryDistance<20) {System.out.println("Потребуется дней: "+ minDay);}

        if (deliveryDistance>20&&deliveryDistance<60) {minDay++;}
        if ( deliveryDistance>60&&deliveryDistance<100) {minDay++;}

else if ( deliveryDistance>60&&deliveryDistance<100) {minDay++;
        }
System.out.println("Потребуется дней: "+ minDay++);

// задание 5
        System.out.println("задание 5");

        int monthNumber = 14;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("сезон зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("сезон весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("сезон лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("сезон осень");
                break;
            default:
                System.out.println("некорректный месяц");
        }

        //задание 6 Людям старше (или равно) 23 лет мы предоставляем лимит в размере 3 зарплат.
        //Людям младше 23 лет мы предоставляем лимит в размере 2 зарплат.
        //Если заработная плата клиента выше (или равно) 50 тысяч, мы увеличиваем лимит в 1.2 раза.
        //Если заработная плата выше (или равно) 80 тысяч, мы увеличиваем лимит в 1.5 раза.
        //Наша задача: написать программу, которая показывает, какую сумму на кредитке может получить клиент.
        //Вводные данные: переменная age = 19 для обозначения возраста клиента, salary = 58_000 для обозначения зарплаты клиента.
        //Увеличения не могут быть применены одновременно. Необходимо вывести максимальный лимит в консоль в формате:
        // «Мы готовы выдать вам кредитную карту с лимитом *** рублей».
        System.out.println("задание 6 ");
        double age = 19d;
        double salary = 4000d;
        if (age>23&&salary<50000) {System.out.println("Мы готовы выдать вам кредитную карту с лимитом " +salary*2);}
       else if (age<23&&salary<50000 ) {System.out.println("Мы готовы выдать вам кредитную карту с лимитом " +salary*3);}
        else if (salary>=50000) {System.out.println("Мы готовы выдать вам кредитную карту с лимитом " +salary*1.2);}
        else if (salary>=80000) {System.out.println("Мы готовы выдать вам кредитную карту с лимитом " +salary*1.5);}
        else System.out.println("не можем повысить лимит");

        double  wantedSum = 330_000;
        double koaf1=0.5;
        double koaf2=1d;
        double stavka = 10;
        double srok=12;
        double yearmin23=stavka+koaf2;
        double yearmin30=stavka+koaf1;
        double yearmin23zp=stavka+koaf2-0.7;
        double yearmin30zp=stavka+koaf1-0.7;
        if (age<23&&salary<80000) {stavka=yearmin23;}
        else if (age<23&&salary>80000) {stavka=yearmin23zp;}
        else if (age<30&&age>23&&salary>80000) {stavka=yearmin30zp;}
        else if (age<30&&age>23&&salary<80000) {stavka=yearmin30;}
        else System.out.println("отказано");
       double monthPay=(stavka/12)+wantedSum/srok;
       double maxPay=salary/2;
       if (monthPay<maxPay) { System.out.println("Максимальный платеж при ЗП "+salary+ " равен "+maxPay+"рублей. " +
               "Платеж по кредиту " + monthPay+ " рублей. Одобрено"); }
       else if (monthPay>maxPay) { System.out.println("Максимальный платеж при ЗП "+salary+ " равен "+maxPay+"рублей. " +
                "Платеж по кредиту " + monthPay+ " рублей. Отказано"); }
    }

    }
