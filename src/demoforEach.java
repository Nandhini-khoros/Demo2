package com.java8;
import java.util.Arrays;
import java.util.List;
//package com.Lambda;


public class demoforEach {

        public static void main(String args[])
        {
            List<Integer> values=Arrays.asList(4,5,6,7,8);

            //1.External loops


            //forloopoldmethodone
            /*for(int i=0;i<values.size();i++)
            {
                System.out.println(values.get(i));
            }*/
            //inpreviuosversiontwo
            /*for(int i : values)
            {
                System.out.println(i);
            }*/


            //Injava1.8,internal loops
            //forEach is internal so it works fastre than external;
            values.forEach(i -> System.out.println(i));

        }
    }

