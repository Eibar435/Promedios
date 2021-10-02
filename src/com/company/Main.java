package com.company;
import java.io.*;

public class Main {
        public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        public static void main(String[] args) throws IOException {

                System.out.println("¿Cual es tu nombre?");
                String name = (entrada.readLine());
                System.out.println("¿Cual fue tu calificacion en la materia de Español?");
                int[] cal = new int[5];
                cal[0] = Integer.parseInt(entrada.readLine());
                System.out.println("¿Cual fue tu calificacion en la materia de Ingles?");
                cal[1] = Integer.parseInt(entrada.readLine());
                System.out.println("¿Cual fue tu calificacion en la materia de Matematicas?");
                cal[2] = Integer.parseInt(entrada.readLine());
                System.out.println("¿Cual fue tu calificacion en la materia de Artes?");
                cal[3] = Integer.parseInt(entrada.readLine());
                System.out.println("¿Cual fue tu calificacion en la materia de Ciencias?");
                cal[4] = Integer.parseInt(entrada.readLine());
                System.out.println("Nombre del estudiante: " + name);
                int suma = 0;
                int cont = 0;
                for (int i = 0; i < cal.length; i++) {
                        cont = cont+1;
                        System.out.println("Calificaion " +cont+ ": " + cal[i]);
                        suma += cal[i];
                }
                float promedio;
                promedio = (suma/cal.length);
                System.out.println("Promedio: "+promedio);
                if (promedio<=50){
                        System.out.println("Calificacion final: F");
                }
                if (promedio<=60 && promedio>=51){
                        System.out.println("Calificacion final: E");
                }
                if (promedio<=70 && promedio>=61){
                        System.out.println("Calificacion final: D");
                }
                if (promedio<=80 && promedio>=71){
                        System.out.println("Calificacion final: C");
                }
                if (promedio<=90 && promedio>=81){
                        System.out.println("Calificacion final: B");
                }
                if (promedio<=100 && promedio>=91) {
                        System.out.println("Calificacion final: A");
                }
        }
}