import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        String partyAffiliation = "";
        String R = "";
        String Other;
        String D;
        String I;
        Scanner in = new Scanner(System.in);
        System.out.print("Please choose your political affiliation by inputting an R for republican, a D for democrat, I for independent, or input another party. ");
        if(in.hasNext()) {
            partyAffiliation = in.next();
            in.nextLine();
        }
        if (Objects.equals(partyAffiliation, "R")) {
            System.out.println("You get a Republican Elephant");
        }else if (Objects.equals(partyAffiliation,  "D" )){
                System.out.println("You get a Democratic Donkey");
        }else if (Objects.equals(partyAffiliation,  "I" )){
            System.out.println("You get an Independent Person");
        }
        else System.out.println("You chose Other party: " + partyAffiliation);
    }
}