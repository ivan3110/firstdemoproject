package firstproject;

public class Student { //
    //У студента должно быть Фамилия, Имя, Отчество и номер студенческого
    //А также метод, который бы выводил на экран эти данные, как в предыдущем примере
    //Для строк используйте String
    //Для номера студ билета int. int - целое число
    String name;
    String surname;
    String fathername;
    int studentNumber;

    public void getInformation () {
        System.out.println("Студент: Имя " + name + " Фамилия " + surname + " Отчество  "+fathername+" номер  студента  "+ studentNumber);
    }

    public static void main(String [] args) {
        Student student = new Student();
        student.name ="Вася";
        student.surname = "Петров";
        student.fathername = "Васильевич";
        student.studentNumber = 4;

        student.getInformation();


    }
}
