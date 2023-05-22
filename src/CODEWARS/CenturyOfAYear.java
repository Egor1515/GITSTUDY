package CODEWARS;

public class CenturyOfAYear {
    public static void main(String[] args) {
        System.out.println(centuryFroMYear(125));
    }

    public static int centuryFroMYear(int number) {

       return number%100==0?number/100:number/100+1;

    }
}
