import java.util.Scanner;

public class StopWatch {
    public static void main(String args[]) {
        Scanner keybd = new Scanner(System.in);


        System.out.println("Enter a time in minutes.");
        int time = keybd.nextInt();

        for(int i =time-1 ; i >= 0  ; i --)
        {
            for (int k = 59 ; k >=0 ; k--)
            {
                if(k < 10){
                    System.out.println("Current time: " + i + ":0" + k);

                }
                else
                    System.out.println("Current Time: " + i +":" + k);
            }

        }


    }
}