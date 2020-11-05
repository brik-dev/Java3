package lesson_1.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {

    ArrayList<T> listOfFruits;

    public Box(T... items) {
        this.listOfFruits = new ArrayList<>(Arrays.asList(items));
    }

    public void addFruit(T... items){
        this.listOfFruits.addAll(Arrays.asList(items));
    }

    public void info(){
        System.out.println(this.listOfFruits);
    }

    public float getWeight(){
        if(listOfFruits.size() == 0) return 0.0f;
        return listOfFruits.get(0).getWeight() * listOfFruits.size();
    }

    public boolean compare(Box box){
            return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }

    public void clear(){
        listOfFruits.clear();
    }

    public void transferToAnotherBox(Box<T> box){
        System.out.println(box.listOfFruits);
        System.out.println(this.listOfFruits);
        box.listOfFruits.addAll(this.listOfFruits);
        clear();
        System.out.println(box.listOfFruits);
        System.out.println(this.listOfFruits);
    }
}
