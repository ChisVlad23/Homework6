import java.util.Scanner;

public class Bottle {
    private Integer  totalCapacity;
    private Integer  availableLiquid;
    private boolean open;



    public Bottle(Integer totalCapacity, Integer availableLiquid, boolean open ){
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }


    boolean hasLiquid(){
        if (availableLiquid > 0) return true;
        else return false;
    }

    Integer howMuchLiquid(){
return  totalCapacity - availableLiquid;
    }

    String openBottle(){
        String proAnswer = "Botle is open";
        String contrarAnswer = "Bro, e deja deschisa, ai luat speis?";

        if (open = false){
            open = true;
           return proAnswer;
        }
        else return contrarAnswer;
    }

    String closeBottle(){
        String closeAnswer = "Ai inchis sticla";
        String existentAcvtionAnswer = "e deja inchisa bro";
        if (open = true){
            open = false;
            return closeAnswer; }
        else return existentAcvtionAnswer;
        }

    String drink(){
        System.out.println("cat vrei sa bei?");
        Scanner scanner = new Scanner(System.in);
        int amountToDrink = scanner.nextInt();
        String anouncementCapac = "Dude, stricla e inchisa";
        String anouncementLichid = "nu poti bea atat de mult din aceea sticla";
        String Passed = "Drink boy, all good";
        if (open = false) return anouncementCapac;
        if (amountToDrink > availableLiquid) return anouncementLichid;
        else return Passed;
        }

}

