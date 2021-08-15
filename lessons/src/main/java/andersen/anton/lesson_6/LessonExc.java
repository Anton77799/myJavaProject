package andersen.anton.lesson_6;

class MyArraySizeException extends Exception{

}

class MyArrayDataException extends Exception {
    public int a1;
    public int a2;

    MyArrayDataException(int a1, int a2) {
        this.a1 = a1;
        this.a2 = a2;

    }

}

public class LessonExc {
    public static void main (String[] args){
        String masi [][] = new String[][]{{"1","6","12","66"},{"44","15","72","3"},{"12","1","32","14"},
                {"12","54","99","101"}};
        try {
            try {
                System.out.println(massivia(masi));
            } catch (MyArraySizeException e) {
                System.out.println("Массив другого размера");
            }
        } catch (MyArrayDataException e) {System.out.println("В массиве неверные данные. Ошибка в ячейке "+
                (e.a1+1) + "x" + (e.a2+1));}
    }
    public static int massivia (String masi [][]) throws MyArraySizeException, MyArrayDataException{
        int suma=0;
        if (masi.length!=4) throw new MyArraySizeException();
            for (int i = 0; i < masi.length; i++) {
                if (masi[i].length!=4) throw new MyArraySizeException();
                for (int j = 0; j < masi.length; j++) {
                    try {
                        suma = suma + Integer.parseInt(masi[i][j]);
                    } catch (NumberFormatException e) {throw new MyArrayDataException(i, j);}
                }

            }
        return suma;
    }
}
