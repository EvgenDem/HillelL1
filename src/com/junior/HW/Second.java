package com.junior.HW;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите сколько лет у вас питомец");
        Integer Hyear = in.nextInt();
        if (Hyear==1) {
            System.out.println("С вами питомец: "+Hyear );
            System.out.println("Коту: 15");
            System.out.println("Собаке: 15");
        }else if(Hyear==2){
            System.out.println("С вами питомец: "+Hyear );
            System.out.println("Коту: 24");
            System.out.println("Собаке: 24");}
        else if(Hyear>=3)
        {
            int DogYear, CatYear;
            System.out.println("С вами питомец: "+Hyear );
            DogYear=(Hyear-2)*6+24;
            System.out.println("Собаке: "+DogYear);
            CatYear=(Hyear-2)*4+24;
            System.out.println("Кошке: "+CatYear);

        }


    }
}
