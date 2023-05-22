package CODEWARS;

public class Quadrants {
    public static void main(String[] args) {
        System.out.println(quadrants(-1, -9));
    }

    public static int quadrants(int x, int y) {
        return x > 0 ? y > 0 ? 1 : 4 : y > 0 ? 2 : 3;
    }
}
