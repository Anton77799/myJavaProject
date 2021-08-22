package andersen.anton.lesson_8;

import java.util.ArrayList;

class Phonebook{
    public ArrayList<String> family = new ArrayList<String>();
    public ArrayList<Integer> number = new ArrayList<Integer>();



    public void get(String famil){
        System.out.print("Все телефонные номера абонента " + famil + ": ");
        for (int i = 0; i< family.size(); i++){
            if (famil==family.get(i))
                System.out.print(number.get(i) + "; ");
        }
        System.out.println();
    }

    public boolean add(String fam, int num){
        family.add(fam);
        number.add(num);
        return false;
    }
}

public class HWEight {

    public static void main (String[] args) {
        ArrayList<String> uniq= new ArrayList<String>(20);
        uniq.add("Чебурашка");
        uniq.add("Гена");
        uniq.add("Сойка");
        uniq.add("Чебурашка");
        uniq.add("Чеканная");
        uniq.add("Монета");
        uniq.add("Монета");
        uniq.add("Ларь");
        uniq.add("Контейнер");
        uniq.add("Проверка");
        uniq.add("Тонна");
        uniq.add("Лекция");
        uniq.add("Монета");
        uniq.add("Чебурашка");
        uniq.add("Ларь");
        uniq.add("Сойка");
        uniq.add("Проверка");
        uniq.add("Проверка");
        String ghost = null;
        int k=0;
        int score=0;
        System.out.println("Список уникальных слов:");
        for (int i=0; i< uniq.size();i++){
            ghost = uniq.get(i);
            for (int j=0; j< uniq.size();j++){
                if (ghost==uniq.get(j)){
                    score++;
                }
            }
            if (score==1){
                k++;
                System.out.println(k+ ")" + ghost);
            }
            score=0;
        }

        System.out.println();

        for (int i=0; i< uniq.size();i++){
            ghost = uniq.get(i);
            for (int j=0; j< uniq.size();j++){
                if (ghost==null){
                    System.out.print("");
                }else {
                    if (ghost==uniq.get(j)) {
                    score++;
                    uniq.set(j, null);
                    }
                }
            }
            if (ghost==null){
                System.out.print("");
            } else {
                if (score == 1)
                    System.out.println("Слово " + ghost + " встречается " + score + " раз");
                else
                    System.out.println("Слово " + ghost + " встречается " + score + " раза");
                score = 0;
            }
        }
        System.out.println();
        Phonebook phonebook = new Phonebook();
        phonebook.add("Иванов",39999);
        phonebook.add("Иванов",7777);
        phonebook.add("Иванов",7333);
        phonebook.add("Иванов",771111);
        phonebook.add("Иванов",7232);
        phonebook.add("Иванов",4554);
        phonebook.add("Иванов",98868);
        phonebook.add("Шерямкин",88666);
        phonebook.get("Иванов");
        phonebook.get("Шерямкин");
        phonebook.get("Кошкин");
    }
}
