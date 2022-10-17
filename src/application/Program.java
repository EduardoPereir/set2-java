package application;

import entities.Students;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Students st;
        Set<Students> set = new HashSet<>();

        System.out.print("How students for the course A: ");
        int a = sc.nextInt();
        for ( int i = 0; i < a; i++){
            st = new Students(sc.nextInt());
            set.add(st);
        }

        System.out.println("How students for the course B: ");
        int b = sc.nextInt();
        for ( int i = 0; i < b; i++){
            st = new Students(sc.nextInt());
            set.add(st);
        }

        System.out.println("How students for the course C: ");
        int c = sc.nextInt();
        for ( int i = 0; i < c; i++){
            st = new Students(sc.nextInt());
            set.add(st);
        }

        System.out.println("Total students: " + set.size());
        sc.close();
    }
}
