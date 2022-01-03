package lesson_one;

public class VariableApp {
    public static void main(String[] args) {
        int a = 10;
        int b =42;
        int c = a + b;
        c++; //c = c + 1
        c +=10; // c = c+10
        String value = "Строка";
        System.out.println(value);
        value = value + "Новая";
        System.out.println(value);

        System.out.println("Наше число " + c);
        myMethod();
       booleanCheck();
    }
    public static void myMethod(){
        System.out.println("word");
    }
    public static void booleanCheck(){
        int a = 10;
        int b = 11;
        boolean check = (a==b);
        if (check){
            System.out.println("The same");

        }else{
            System.out.println("Not the same");

        }

    }
}
