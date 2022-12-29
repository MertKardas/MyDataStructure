package myStackArray2;

import java.util.Arrays;

public class StackArray <E> {
    private int number;
    private E[] stackArray; //Stack Array
    private int capacities; //the capacity of every array.
    private int sizes[];   // size of every array.Start with 0 size.
    private int totalCapacity; // shows total capacity that is number of stacks * capacities of everry array
    public StackArray(int number, int capacities ){
        this.capacities= capacities;
        sizes = new int[number];
        Arrays.fill(sizes,0);
        totalCapacity = capacities * number;
        stackArray= (E[])new Object [totalCapacity];

    }
    public void push(E e,int kthArray){
        if(sizes[kthArray]== capacities){
            System.out.println("Your " + kthArray + "'s capacity is full.");
        }else {
            int indexNo = 0;

            for (int i = 0; i < kthArray; i++) {
                indexNo += capacities;
            }
            indexNo += sizes[kthArray];
            stackArray[indexNo] = e;
            sizes[kthArray]++;

        }

    }
    public E pop(int kthArray){
        if (sizes[kthArray] == 0){
            System.out.println("This stack is already is empty");
            return null;


        }
        else{
            int indexNo = 0;

            for (int i = 0; i < kthArray; i++) {
                indexNo += capacities;
            }
            indexNo += sizes[kthArray] -1;
            E temp = stackArray[indexNo];
            stackArray[indexNo] =null;
            sizes[kthArray]--;
            return temp;




        }


    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    @Override
    public String toString() {
        return "StackArray{" +
                "stackArray=" + Arrays.toString(stackArray) +
                '}';
    }
}
