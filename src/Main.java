public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
    }


    private static void task2() {
        System.out.println("Задача 2");
        int temperatureStreet = 7;
        if (temperatureStreet < 5) {
            System.out.println("На улице " + temperatureStreet + " градусов, нужно надеть шапку");
        }
        if (temperatureStreet >= 5) {
            System.out.println("На улице " + temperatureStreet + " градусов, можно идти без шапки");
        }
    }

    private static void task3() {
        System.out.println("Задача 3");
        int carSpeed = 70;
        if (carSpeed <= 60) {
            System.out.println("Если скорость " + carSpeed + " то можно ездить спокойно");
        }
        if (carSpeed > 60) {
            System.out.println("Если скорость " + carSpeed + " ,то придется заплатить штраф");
        }

    }

    private static void task4() {
        System.out.println("Задача 4");
        int age = 56;
        if (age >=2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить детский сад ");
        }
        if (age >=7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу ");
        }
        if (age >=19 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить университет ");
        }
        else {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу ");
        }
    }

    private static void task5() {
        System.out.println("Задача 5");
        int childAge = 7;
        if (childAge <5) {
            System.out.println("Если возраст ребенка равен " + childAge + " то ему нельзя кататься на аттракционе");
        }
        if (childAge >=5 && childAge <14) {
            System.out.println("Если возраст ребенка равен " + childAge + " то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else {
            System.out.println("Если возраст ребенка равен " + childAge + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }

    }

    private static void task6() {
        System.out.println("Задача 6");
        int cabinCapacity = 102;
        int sittingSeats = 60;
        int passengers = 102;
        if (passengers < sittingSeats) {
            int freeSittingSeats = sittingSeats - passengers;
            System.out.println("В вагоне свободных мест: " + freeSittingSeats + " сидячих");
        }
        else {
            if (passengers >= sittingSeats && passengers < cabinCapacity) {
                int freeStayingSeats = cabinCapacity - passengers;
                System.out.println("В вагоне свободных мест: " + freeStayingSeats + " стоячих");
            } else {
                System.out.println("Вагон полностью забит");
            }
        }

    }

    private static void task7() {
        System.out.println("Задача 7");
        int one = 20;
        int two = 4;
        int three = 42;
        if (one >= two) {
            if (one >= three) {
                System.out.println("Наибольшее число " + one);
            }
            else {
                System.out.println("Наибольшее число " + three);
            }
        }
        else {
            if (two >= three) {
                System.out.println("Наибольшее число " + two);
            }
            else {
                System.out.println("Наибольшее число " + three);
            }
        }

    }
}
