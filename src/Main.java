public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1(){
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф.И.О сотрудника - " +fullName);
    }
    public static void task2(){
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — "+fullName.toUpperCase());
    }
    public static void task3(){
        String fullName = "Иванов Семён Семёнович";
        String fullName2 = fullName.replace("ё", "e");
        System.out.println("Данные Ф. И. О. сотрудника — "+ fullName2);
    }
}