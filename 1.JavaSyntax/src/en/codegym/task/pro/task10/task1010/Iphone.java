package en.codegym.task.pro.task10.task1010;

import java.util.Objects;

/* 
Two iPhones
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //write your code here
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        if(!(obj instanceof Iphone)) {
            return false;
        }
        Iphone other = (Iphone)obj;


        
        return this.price == other.price
                && Objects.equals(this.color, other.color)
                && Objects.equals(this.model, other.model);

    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));

    }

}
