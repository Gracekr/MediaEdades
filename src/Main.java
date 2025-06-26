import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("EJERCICIO CONDICIONALES JAVA");
        Scanner scanner=new Scanner(System.in);
        System.out.println("¿Cuál es tu edad?");

        int age;
        age= scanner.nextInt();
        if (6<age &&age <=12){
        System.out.println("Estás en primaria");} else if (12<age &&age<=18) {
            System.out.println("Estás en secundaria");} else if (age>18&&age<26) {
            System.out.println("Estás en la universidad");} else if (age>26) {
            System.out.println("Estás trabajando");}else {
            System.out.println("Eres un bebé");}

        scanner.close();

        System.out.println("\n");
        System.out.println("BUCLE EN JAVA");

        for (int i=20;i>=10;i--){
        System.out.println(i*i);}

// 3- MEDIA EDADES DE TUS PADRES
        System.out.println("\n");
        System.out.println("MEDIA EDADES DE TUS PADRES");

        Scanner mother=new Scanner(System.in);
        System.out.println("¿Cuál es el nombre y la edad de tu madre?");


        String motherName=mother.nextLine();

        int motherAge =mother.nextInt();

        Scanner father=new Scanner(System.in);
        System.out.println("¿Cuál es el nombre y la edad de tu padre?");



        String fatherName=father.nextLine();

        int fatherAge =father.nextInt();


        System.out.println("Tu madre se llama "+motherName+" y tiene "+motherAge+ " años, y tu padre se llama "+fatherName+" y tiene "+ fatherAge+" años, y la media de sus edades es "+ ((motherAge+fatherAge)/2));
        mother.close();
        father.close();



        System.out.println(motherAge);


    }
}