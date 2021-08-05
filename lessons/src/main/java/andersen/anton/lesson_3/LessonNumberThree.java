package andersen.anton.lesson_3;
class Cooperator{
    private String fullname;
    private String position;
    private String email;
    private int number;
    private int salary;
    private int age;

    public Cooperator(String fullname,String position,String email,int number,int salary,int age){
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }
    public void info(){
        System.out.println("Меня зовут " + fullname + ". Моя должность - " + position + ". Мой email: " +
                email + ". Мой номер телефона: " + number + ". Я зарабатываю " + salary + ". Мне " + age);
    }
    public int getAge() {
        return age;
    }
}

public class LessonNumberThree {
    public static void main (String[] args) {
        Cooperator[] cooperators = new Cooperator[5];
        cooperators[0] = new Cooperator("Кузя Рябкин Игнатьевич", "Менеджер",
                "hhootteerr.mail.com", 894378339, 40000, 28);
        cooperators[1] = new Cooperator("Женя Нофим Александрович", "Секретарь",
                "muurt.mail.com", 894374378, 35000, 34);
        cooperators[2] = new Cooperator("Николай Дубин Леонидович", "Директор",
                "denden.mail.com", 894885676, 50000, 46);
        cooperators[3] = new Cooperator("Арина Носова Владимировна", "Менеджер",
                "ploti.mail.com", 893336489, 40000, 41);
        cooperators[4] = new Cooperator("Алиса Пончик Александровна", "Секретарь",
                "cherechek.mail.com", 894947832, 35000, 40);
        for (int i=0; i<5; i++) {
            if(cooperators[i].getAge()>40){
                cooperators[i].info();
            }
        }

    }
}
