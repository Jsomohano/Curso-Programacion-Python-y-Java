package javafolder.Sesion5;

import java.util.ArrayList;

public class Listas
{
    public static void main(String[] args) 
    {
        int[] numArray = {4,6,10,14,66}; //Array

        ArrayList<Integer> numList = new ArrayList<>();// List
        numList.add(4);
        numList.add(8);
        numList.add(42);
        numList.add(3);
        numList.add(11);

        // for(int i = 0;i<numArray.length;i++)
        // {
        //     System.out.println(numArray[i]);
        // }

        for(int i = 4;i>=0;i--)
        {
            System.out.println(numList.get(i));
        }
    }
}