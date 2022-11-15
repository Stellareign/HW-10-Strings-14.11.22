public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 10 -  Строки. Задача 1:");
        String firstName = "Ivan ";
        String middleNAme = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleNAme;
        System.out.println(fullName);
        System.out.println("" +
                "");
        System.out.println("Домашка 10 -  Строки. Задача 2:");
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчёта - " + fullName1);
    }
}