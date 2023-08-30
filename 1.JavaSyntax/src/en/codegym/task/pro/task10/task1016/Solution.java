package en.codegym.task.pro.task10.task1016;

/* 
Weather forecast
*/

public class Solution {

    public static void showWeather(City city) {
        //write your code here
        System.out.printf("Today's temperature in %s is %d\n", city.getName(), city.getTemperature());
    }

    public static void main(String[] args) {
        //write your code here
        City city = new City("Cedar Rapids", 86);
        Solution.showWeather(city);
    }
}
