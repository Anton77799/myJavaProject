package andersen.anton.lesson_4;

class Park{
    public Atr atr;
    class Atr{
        private String infoatr;
        private int timeon;
        private int timeoff;
        private int price;
        public Atr (String infoatr, int timeon, int timeoff, int price){
            this.infoatr = infoatr;
            this.timeon = timeon;
            this.timeoff = timeoff;
            this.price = price;
        }
        public void information(){
            System.out.println("Атракцион: " + infoatr + ". График работы: с " + timeon + " до " + timeoff
            + ". Цена билета: " + price);
        }
    }
}

public class AmusementPark {
    public static void main (String[] args) {
        Park.Atr atr1 = new Park().new Atr("Комната смеха", 12, 20, 300);
        Park.Atr atr2 = new Park().new Atr("Американские горки", 10, 21, 500);
        atr1.information();
        atr2.information();
    }

}
