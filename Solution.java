package com.javarush.test.level03.lesson08.task05;

/* Чистая любовь
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!
Пример: Вася + Ева + Анжелика = Чистая любовь, да-да!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();

        */

        System.out.println("Input age:");
        int age = Integer.parseInt(reader.readLine());

        System.out.println("Input name:");
        String name = reader.readLine();

        System.out.print(name + " захватит мир через " + age + " лет. Му-ха-ха!");

        // multiples table
        int sum =0;
        for (int i =1; i<=10; i++){
            for (int j = 1; j <= 10; j++){
                sum = i*j;
                System.out.print(sum+" ");
            }
            System.out.println();

        }



    }
}