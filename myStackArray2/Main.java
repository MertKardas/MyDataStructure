package myStackArray2;



public class Main {


    public static void main(String[] args) {
        StackArray<Character> threeChars = new StackArray<>(3,3);

        System.out.println(threeChars.getTotalCapacity());
        threeChars.push('a',0);
        threeChars.push('b',1);
        threeChars.push('c',2);
        threeChars.push('d',2);
        threeChars.push('f',2);
        threeChars.push('g',1);
        System.out.println(threeChars.toString());
        threeChars.pop(0);
        System.out.println(threeChars.toString());
    }
}
