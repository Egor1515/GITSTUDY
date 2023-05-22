package CODEWARS;

public class ThinkfulLogicDrillsTrafficLight {
    public static void main(String[] args) {
        System.out.println(updateLight("red"));
    }

    public static String updateLight(String current) {
        return current.equals("red") ? "yellow" : current.equals("yellow") ? "green" : "red";
    }
}
