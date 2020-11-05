package lesson_1.lesson;

public class Box {
    private Object obj;

    public Box(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj){
        this.obj = obj;
    }

    public void info(){
        System.out.println("type " + obj.getClass() + " " + obj);
    }
}

class Main{
    public static void main(String[] args) {
//        workWithBoxAndObject();

        BoxInt box1 = new BoxInt(1);
        int x = 10;

        x += box1.getObj();
        System.out.println(x);

        //для box2 нужно создавать свой класс BoxString и вкладывать туда String
        // либо использовать обобщения Generics, что будет показано в классе BoxUltimate

        BoxUltimate<Integer> boxInt = new BoxUltimate<>(1); //объявляем тот тип данных, который нужен. В этом случае Integer
        BoxUltimate<String> boxString = new BoxUltimate<>("str"); // теперь это у нас хранилище для String

        x += boxInt.getObj();
        System.out.println(x);

//        x += boxString.getObj(); //на этапе компиляции говорит, что число и строку сложить нельзя
//        System.out.println(x);*/

        // можно использовать два обобщения

        BoxTwoGen<Integer, String> twoGen = new BoxTwoGen<>(555, "str");
        twoGen.info();

        //метод doubleValue усть у каждого числа
        Integer a = 10;
        System.out.println(a.doubleValue());

        //Пример использования класса Stats

        Integer[] inums = {1,2,3,4,5};
        Stats<Integer> iob = new Stats<>(inums);
        double iresult = iob.avg();

        System.out.println("avg = " + iresult);

        Double[] dnums = {1.0,2.0,3.0,4.0,5.0};
        Stats<Double> dob = new Stats<Double>(dnums);
        double dresult = dob.avg();

        System.out.println("avg = " + dresult);

        if(iob.sameAvg(dob)){
            System.out.println("равны");
        } else {
            System.out.println("не равны");
        }





    }

    private static void workWithBoxAndObject() {
        Box box1 = new Box(1);
        Box box2 = new Box("str");

        box1.info();
        box2.info();

        int x = 10;

        x += (Integer) box1.getObj();
        System.out.println(x);

        x += (Integer) box2.getObj();
        System.out.println(x);
    }
}
