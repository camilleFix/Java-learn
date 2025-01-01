/**
public class CleanHello {

   /**Le programme commence ici*/
    public static void main(String[] args) {

        int[] myArray = new int []{7,2,4};
        sayHelloTo("world");
        printClapYourHands(4);
        printArray(myArray);


    }

    /** affiche le message "hello" au destinataire fourni
     * @param recipient
     */

    private static void sayHelloTo(String recipient) {
        System.out.println("Hello " + recipient);
    }

    private static void printClapYourHands(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Clap your hands!");
        }
    }
    private static void printArray(int[] array){
            for (int i=0; i<array.length;i++){
                System.out.println(array[i]);
            }
        }
    /** }
