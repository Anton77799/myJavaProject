package andersen.anton.lesson_5;

class MyMassivik<j> {
    private j[] elem;

    public MyMassivik(j... elem) {
        this.elem = elem;
    }

    public void change(int i, int k){
        j temporary=elem[i-1];
        elem[i-1]=elem[k-1];
        elem[k-1]=temporary;
    }

    public void link(){
        for (int i=0;i< elem.length;i++){
            System.out.print(elem[i]+" ");
        }
        System.out.println();
    }

}

public class Massiv {
    public static void main (String[] args) {
        MyMassivik<Integer> massivik = new MyMassivik<Integer>(2, 33, 44, 123, 76, 23);
        massivik.link();
        massivik.change(2,4);
        massivik.link();
        massivik.change(2,6);
        massivik.link();
        MyMassivik<String> strmass = new MyMassivik<String>("he", "le", "mi", "op");
        strmass.link();
        strmass.change(2,4);
        strmass.link();
    }
}
