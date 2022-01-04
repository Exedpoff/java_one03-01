package HomeWork01;

public class HW01 {
    public static void main(String[] args) {
        int a = 12;
        int b = 8;
        //boolean check = 0 <= (a+b);
        if (0 <= (a + b)) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        printColor();
        compareNumbers();
    }

    public static void printColor(){
        int value = 101;
        if(value<=0) {
            System.out.println("Красный");
        }else if (value<=100){
            System.out.println("Желтый");
        }else{
            System.out.println("Зеленый");
        }

    }
    public static void compareNumbers(){
        int a = 101;
        int b= 66;
        if (a>=b){
            System.out.println("a>=b");
        }else{
            System.out.println("a<b");
        }

    }
}
