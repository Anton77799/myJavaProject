package andersen.anton.lesson_4;

class Payment {
    public List list;

    class List {
        private String checklist;

        public List(String checklist) {
            this.checklist = checklist;
        }

        public void setChecklist(String point) {
            checklist = checklist + "\n" + "* " + point;
        }
        public String getChecklist (){
            System.out.print(checklist);
            return checklist;
        }

    }
}

public class Shop {
    public static void main (String[] args) {
        Payment.List list = new Payment().new List("Список:");
        list.setChecklist("Йогурт");
        list.setChecklist("Мороженное");
        list.setChecklist("Карандаш");
        list.setChecklist("Квадрацикл");
        list.setChecklist("Мурка");
        list.getChecklist();
    }
}
