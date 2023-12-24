package com.example;
import java.util.Scanner;
public class Main {
    static boolean flag=false;
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int decision = 1, remador;
        System.out.println("Utilize Solamente Numeros");
        while (decision == 1) {
            mostrarOpciones();
            remador = leer.nextInt();
            switch (remador) {
                case 1:mostrarGameover("Caperucita no Sabe Remar");break;
                case 2:mostrarGameover("Las Uvas no Saben Remar");break;
                case 3:mostrarGameover("El Lobo no Sabe Remar");break;
                case 4:seleccionarAcompañante(leer);break;
            }
        }
    }
    public static void mostrarOpciones() {
        System.out.println("\u001B[36m****************************************");
        System.out.println("|           *** Opciones ***           |");
        System.out.println("****************************************\u001B[0m");
        System.out.println("Tenemos:\n1- \u001B[33mA Caperucita\u001B[0m \n2- \u001B[33mA las Uvas\u001B[0m \n3- \u001B[33mAl Lobo\u001B[0m \n4- \u001B[33mAl Hombre\u001B[0m");
        System.out.print("A cuál desea pasar en el espacio de remador: ");
    }
    public static void mostrarGameover(String mensaje) {
        Scanner leer = new Scanner(System.in);
        System.err.println("\u001B[31m****************************************");
        System.err.println("|          *** Game Over ***           |");
        System.err.println("****************************************\u001B[0m");
        System.err.println("\n" + mensaje + "\n");
        System.out.println("¿Desea voler a jugar?");
        System.out.print("1- Sí\n2- No\n-----> ");
        int decision = leer.nextInt();
        switch (decision) {
            case 1:mostrarOpciones();break;
            case 2:System.exit(0);;break;
        }
    }
    public static void seleccionarAcompañante(Scanner leer) {
        int sujeto1;
        Animations.barcoImagen0();
        System.out.println("[L][C][U]");
        System.out.println("\u001B[36m****************************************");
        System.out.println("|          *** Acompañante ***         |");
        System.out.println("****************************************\u001B[0m");
        System.out.println("Usted ha elegido al Hombre, ¿Quién acompaña al Hombre?");
        System.out.print("1- \u001B[33mEl Lobo\u001B[0m  \n2- \u001B[33mLas Uvas\u001B[0m \n3- \u001B[33mCaperucita\u001B[0m\n----->");
        sujeto1 = leer.nextInt();
        switch (sujeto1) {
            case 1:mostrarGameover("Caperucita se Comio a las Uvas");break;
            case 2:mostrarGameover("El Lobo se Comio a Caperucita");break;
            case 3:acompañanteCaperucita(leer);break;
        }
    }
    public static void acompañanteCaperucita(Scanner leer) {
        int sujeto2;
        if (flag) {Animations.Barco3(1); flag = false;}else{Animations.Barco1(1);}
        Animations.barcoImagen1();
        System.out.println("[L][U]                                      [C]");
        System.out.print("\n1- \u001B[33mEl Lobo \u001B[0m\n2- \u001B[33mLas Uvas\u001B[0m\n-----> ");
        sujeto2 = leer.nextInt();
        switch (sujeto2) {
            case 1:llevarLoboConCaperucita(leer);break;
            case 2:llevarUvasACaperucita(leer);break;
        }
    }
    public static void llevarLoboConCaperucita(Scanner leer) {
        int devolver ;
        Animations.Barco2(1);
        Animations.barcoImagen2();
        System.out.println("[U]                                      \u001B[31m[L][C]\u001B[0m");
        System.out.print("\n1- Ninguno\n2- El Lobo\n3- Caperucita\n-----> ");
        devolver= leer.nextInt();
        switch (devolver) {
            case 1:mostrarGameover("El Lobo se Comio a Caperucita");break;
            case 2:flag = true;acompañanteCaperucita(leer);break;
            case 3:llevarCaperucitaConUvas(leer);break;
        }
    }
    public static void llevarUvasACaperucita(Scanner leer) {
        int sujeto3;
        Animations.Barco2(1);
        Animations.barcoImagen2();
        System.out.println("[L]                                      \u001B[31m[U][C]\u001B[0m");
        System.out.print("\n1- Ninguno\n2- Uvas\n3- Caperucita\n-----> ");
        sujeto3 = leer.nextInt();
        switch (sujeto3) {
            case 1:mostrarGameover("Caperucita se Comio a las Uvas");break;
            case 2:flag = true;acompañanteCaperucita(leer); ;break;
            case 3:llevarCaperucitaAlLobo(leer);break;
        }
    }
    public static void llevarCaperucitaAlLobo(Scanner leer){
         int sujeto3;
        Animations.Barco3(1);
        Animations.barcoImagen1();
        System.out.println("\u001B[31m[L][C]\u001B[0m                                      [U]");
        System.out.print("\n1- Ninguno\n2- Caperucita\n3- Lobo\n-----> ");
        sujeto3 = leer.nextInt();
        switch (sujeto3) {
            case 1:mostrarGameover("Caperucita se Comio a las Uvas");break;
            case 2:llevarUvasACaperucita(leer);break;
            case 3:llevarUvasConLobo(leer);break;
        }
    }
    public static void llevarCaperucitaConUvas(Scanner leer) {
        int sujeto3;
        Animations.Barco3(1);
        Animations.barcoImagen1();
        System.out.println("\u001B[31m[U][C]\u001B[0m                                      [L]");
        System.out.print("\n1- Ninguno\n2- Caperucita\n3- Uvas\n-----> ");
        sujeto3 = leer.nextInt();
        switch (sujeto3) {
            case 1:mostrarGameover("Caperucita se Comio a las Uvas");break;
            case 2:llevarLoboConCaperucita(leer);break;
            case 3:llevarUvasConLobo(leer);break;
        }
    }
    public static void llevarUvasConLobo(Scanner leer) {
        int devolver2;
        Animations.Barco2(1);
        Animations.barcoImagen2();
        System.out.println("[C]                                      [L][U]");
        System.out.print("\n1- Ninguno\n2- Las Uvas\n3- El Lobo\n-----> ");
        devolver2 = leer.nextInt();
        switch (devolver2) {
            case 1:mostrarFinal();break;
            case 2:llevarCaperucitaConUvas(leer);break;
            case 3:llevarCaperucitaAlLobo(leer);break;
        }
    }
    public static void mostrarFinal() {
        Scanner scanner = new Scanner(System.in);
        Animations.Barco5(1);
        Animations.barcoImagen3();
        System.out.println("[C]                                      [L][U]");
        System.out.println("El Hombre Volvio Solo");
        System.out.println("Ahora Caperucita se Monto en la Barca Para Llegar al Otro Lado del Rio");
        System.out.println("Presione \u001B[36mEnter\u001B[0m Para Continuar");
        scanner.nextLine();
        Animations.Barco4(1);
        Animations.barcoImagen4();
        System.out.println("                                          [C][L][U]");
        System.out.println("Todos los Participantes Están en el Otro Lado del Rio");
        scanner.close();
        System.exit(0);
    }
}