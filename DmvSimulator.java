import java.security.SecureRandom;
public class DmvSimulator{
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Welcome to the DMV!");
        SecureRandom randomNum = new SecureRandom();
        int ticketNum = randomNum.nextInt(200);
        System.out.println("Your ticket number is " + ticketNum + ". Please wait until your number is called. Thank you.");
        int count = ticketNum + 1;
        while(count != ticketNum){
            System.out.println("Calling Number " + count);
            if(count == 200){
                count = 0;
            }
            Thread.sleep(1000); //Comment out this line before running unless you want a stupid long wait
            count++;
        }
        System.out.println("Calling Number " + count + "to the booth");
        SecureRandom randomNum2 = new SecureRandom();
        int miracleVal = randomNum2.nextInt(100);
        if(miracleVal == 1){
            System.out.println("You have all the required paperwork! Congradulations, you are all set. Have a nice day!");
        }
        else{
            System.out.println("You seriously don't have your paperwork. Idiot! Come back when you have your paperwork. NEXT!");
        }   
    }
}