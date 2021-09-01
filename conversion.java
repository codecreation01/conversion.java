import java.util.scanner;
public class Exercise
{
  public static void main(String[] args)
  {
    double minutesInyear= 60*24*365;
    Scanner input= new Scanner(System.in);
    System.out.print("input the number of minutes:");
    double min= input.nextDouble();
    long years= (long)(min/minutesInyear);
    int days=(int)(min/60/24)%365;
    System.out.println((int)min+"minutes is approximately"+ years + "years and" + "days");
  }
}
