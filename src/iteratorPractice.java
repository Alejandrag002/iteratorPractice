import java.util.Scanner;

public class iteratorPractice
{
    public static void main (String arg[])
    {
        /*-----------------Program to find average of a set of scores------------------*/

        //instance variables
        int score = 0, sum = 0;
        int count = 0;
        double average = 0;


        //Get user input
        Scanner keyboard = new Scanner (System.in);
        System.out.println ("Enter a score(-1 to end): ");
        score = keyboard.nextInt();

        //loop to add scores smf count how many
        while(score != -1)
        {
            sum += score;
            count++;
            System.out.println("now score is:" + score);
            score = keyboard.nextInt();
        }//end while loop adding scores

        //divide the sum by count and output
        if(count > 0) {
            average = (double) sum / count;
            System.out.println("Sum is: " + sum);
            System.out.printf("The Average is: %.2f%n", average);
        }//end if there are score
        else
        {
            System.out.println("You didnt enter scores!");
        }








        /*-----------------Program disect url----------------*/
        /*
        //instance variables
        String url;

        //set up to get user input
        Scanner keyboard = new Scanner (System.in);
        System.out.println ("Enter a URL: ");
        url = keyboard.nextLine();

        //create a scanner object so can define a delimiter
        Scanner myURL = new Scanner(url);

        //loop to break into pieces and print each on a new line
        while (myURL.hasNext())
        {
            myURL.useDelimiter("/");
            System.out.println("\t" + myURL.next());
        }// end while loop

        //output when done
        System.out.println("The URL is: " + url);
*/
    }//end main method
}//end class to practice iterators

