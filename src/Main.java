public class Main {
    public static void main(String[] args) {

        //task-1
        int age = (int) (Math.random() * 99) + 1;
        boolean isAdult = age >= 18;
        if(isAdult) {
            System.out.println("Если возраст человека равен " + age
                    + ", то он совершеннолетний.\n");
        } else {
            System.out.println("Если возраст человека равен " + age
                    + ", то он не достиг совершеннолетия, нужно немного подождать.\n");

        }

        //task-2
        int temperature = (int) (Math.random() * 30) - 15;
        if(temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно одеть шапку\n");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки\n");
        }

        //task-3
        int speed = (int) (Math.random() * 160) + 20;
        boolean overSpeed = speed > 60;
        if(!overSpeed) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно\n");
        } else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф\n");
        }

        //task-4
        int ageOfPeople = (int) (Math.random() * 64) + 2;
        if(ageOfPeople >= 2  && ageOfPeople <= 6) {
            System.out.println("Если возраст человека равен " + ageOfPeople +
                    ", то ему нужно ходить в детский сад\n");
        } else if(ageOfPeople >= 7  && ageOfPeople <= 17) {
            System.out.println("Если возраст человека равен " + ageOfPeople +
                    ", то ему нужно ходить в школу\n");
        } else if(ageOfPeople >= 18  && ageOfPeople <= 24) {
            System.out.println("Если возраст человека равен " + ageOfPeople +
                    ", то ему нужно ходить в институт\n");
        } else {
            System.out.println("Если возраст человека равен " + ageOfPeople +
                    ", то ему нужно ходить на работу\n");
        }

        //task-5
        int ageOfChild = (int) (Math.random() * 18) + 1;
        if(ageOfChild <= 5) {
            System.out.println("Если возраст ребенка равен " + ageOfChild +
                    ", то ему нельзя катася на аттракционе\n");
        } else if(ageOfChild <= 14) {
            System.out.println("Если возраст ребенка равен " + ageOfChild +
                    ", то ему можно катася на аттракционе в сопровождении взрослого\n");
        } else {
            System.out.println("Если возраст ребенка равен " + ageOfChild +
                    ", то ему можно катася на аттракционе без сопровождения взрослого\n");
        }

        //task-6
        int capacity = 102;
        int sittingPlaces = 60;
        int standingPlaces = capacity - sittingPlaces;
        int occupiedPlaces = (int) (Math.random() * capacity);


        if(occupiedPlaces == capacity) {
            System.out.println("В вагоне " + occupiedPlaces + " человек.\n" +
                    "Свободных мест нет.\n");
        } else if (occupiedPlaces <= sittingPlaces) {
            System.out.println("В вагоне " + occupiedPlaces + " человек.\n" +
                    "Есть свободные сидячие места - " + (sittingPlaces - occupiedPlaces) + "\n" +
                    "Есть свободные стоячие места - " + standingPlaces + "\n");
        } else {
            System.out.println("В вагоне " + occupiedPlaces + " человек.\n" +
                    "Все сидячие места заняты" +
                    ", но есть свободные стоячие места - "
                    + (standingPlaces - (occupiedPlaces - sittingPlaces)) + "\n");
        }

        //task-7
        int one = (int) (Math.random() * 6);
        int two = (int) (Math.random() * 6);
        int three = (int) (Math.random() * 6);

        System.out.printf("one = %d, two = %d, three = %d%n", one, two, three);
        if(one > two && one > three) {
            System.out.println("Число one равное " + one + " больше других.");
        } else if(two > one && two > three) {
            System.out.println("Число two равное " + two + " больше других.");
        } else if(three > one && three > two) {
            System.out.println("Число three равное " + three + " больше других.");
        } else {
            System.out.println("Наибольшее не определено.");
        }
    }
}