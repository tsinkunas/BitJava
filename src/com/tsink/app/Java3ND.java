package com.tsink.app;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Java3ND {
    public static void main(String[] args){
        // 1. Sukurkite masyvą ir išspausdinkite visus jo narius 3-jų ciklų pagalba.

        String[] namesArr = {"Klodoaldas", "Adrijonas", "Serapina", "Dionyzas", "Hiacintas", "Gvidas", "Barmantas"};
        // Ciklas for
        System.out.println("Ciklas for");
        for (int i = 0; i < namesArr.length; i++) {
            System.out.println((i + 1) + "vardas for: " + namesArr[i]);
        }
        // Ciklas enhanced for
        System.out.println("Ciklas enhanced for");
        for (String i : namesArr) {
            System.out.println("vardas enhanced for: " + i);
        }
        // Ciklas while
        System.out.println("Ciklas while");
        int i = 0;
        while (i < namesArr.length) {
            System.out.println((i+1) + "vardas while: " + namesArr[i]);
            i++;
        }

        //2. Taip kaip #1, bet masyvo dydis turi būti nurodomas programos naudotojo, konsolėje.
        Scanner scArr = new Scanner(System.in);
        System.out.println("Įveskite masyvo dydį:");
        int [] intArr = new int[scArr.nextInt()];
        Random arr = new Random();
        // Ciklas for
        System.out.println("Ciklas for");
        for (int j = 0; j < intArr.length; j++) {
            intArr[j] = arr.nextInt();
            System.out.println(intArr[j]);
        }
        // Ciklas enhanced for
        System.out.println("Ciklas enhanced for");
        for (int j : intArr) {
            System.out.println(j);
        }
        // Ciklas while
        System.out.println("Ciklas while");
        int j = 0;
        while (j < intArr.length) {
            System.out.println(intArr[j]);
            j++;
        }

        // 3. Taip kaip #2, bet ir dydis ir reikšmės turi būti suvestos vartotojo.
        Scanner scArr2 = new Scanner(System.in);
        System.out.println("Įveskite masyvo dydį:");
        String[] stArr = new String[scArr2.nextInt()];

        // Ciklas for
        for (int k = 0; k < stArr.length; k++) {
            System.out.println("Įveskite elementą:");
            String scString = scArr2.next();
            stArr[k] = scString;
        }
        System.out.println(Arrays.toString(stArr));

        // 4. Suskaičiuokite sumą visų reikšmių įvestų į masyvą (sumos algoritmas)
        int [] sumArr = {5, 4, 3, 2, 1};
        System.out.println("array before: "+ Arrays.toString(sumArr));
        int sum = 0;
        for (int k = 0; k < sumArr.length; k++) {
            sum += sumArr[k];
        }
        System.out.println("sum: " + sum);

        // 5. Suskaičiuokite vidurkį (vidurkio algoritmas).
        int average  = sum / sumArr.length;
        System.out.println("average: " + average);

        // 6. Bubble sort
        int iterations = 0;
        int swaps = 0;
        for (int k = 0; k < sumArr.length - 1; k++) {
            for (int l = 0; l < sumArr.length - k - 1; l++){
                iterations++;
                if (sumArr[l] > sumArr[l+1]);
                {
                    int temp = sumArr[l];
                    sumArr[l] = sumArr[l+1];
                    sumArr[l+1] = temp;
                    swaps++;
                }
            }

        }
        System.out.println("array after: " + Arrays.toString(sumArr));
        System.out.println("iterations: " + iterations);
        System.out.println("swaps: " + swaps);
    }
}
