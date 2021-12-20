import java.util.Scanner;

public class Quest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wizardCount = 0, elfCounter = 0;
        int raceChoice;


        for (int i = 0; i < 6; i++) {
            System.out.println("Welcome to this epic quest, dear stranger.");
            System.out.println("You will be the " + (i + 1) + "th person who joins this epic quest");
            System.out.println("**********************************************************");
            System.out.println("Please tell me, Which race do you belong?");
            System.out.println("ENTER '1', IF YOU ARE A WIZARD.");
            System.out.println("ENTER '2', IF YOU ARE AN ELF.");
            raceChoice= scanner.nextInt();
            switch(raceChoice){
                case 1:
                    Wizard wizard = new Wizard();
                    System.out.println("Welcome to our quest, dear wizard. What's your name?");
                    String wizardName = scanner.next();
                    wizard .setName(wizardName);
                    System.out.println("Nice to meet you, " + wizard.getName() +" The Wizard. How old are you?");
                    int age = scanner.nextInt();
                    wizard.setAge(age);
                    System.out.println(" How tall is it?");
                    double height = scanner.nextDouble();
                    wizard.setStaffHeight(height);
                    wizard.display(); // Display whole information
                    wizardCount++; // Increment wizard count in the company
                    System.out.println("\nA horde of enemies approaching. Cast a powerful spell:");
                    wizard.castSpell(); // Use cast spell method against the enemies
                    break;
                case 2:
                    elf elf = new elf();
                    System.out.println("Welcome to our quest, dear elf. What's your name?");
                    String elfName = scanner.next();
                    elf.setName(elfName);
                    System.out.println("Nice to meet you, " + elf.getName() +" The Elf. How old are you?");
                    int elfAge = scanner.nextInt();
                    elf.setAge(elfAge);
                    System.out.println("I can see that you carry a very powerful bow. How long is it?");
                    double length = scanner.nextDouble();
                    elf.setBowLength(length);
                    elf.display(); // Display whole information
                    elfCounter++;
                    elf.powerArrow(); // Use shoot arrow method against enemies
                    break;
                default:
                    System.out.println("INVALID RACE SELECTION.");
                    i--; // If you give an invalid number, you need to decrement the loop counter to stay in same step.
                    break;
            }



        }
    }
}



