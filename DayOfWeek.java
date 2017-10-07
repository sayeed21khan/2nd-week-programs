/***************************************************************************
* Purpose : Day of the week that date falls on.
*
*@author : Sayeed Khan
*@version : 1.8.0
*@since : 09-08-2017
****************************************************************************/
import java.util.*;

class DayOfWeek {

   public static void main(String args[]) {

         //Takes input from user as command Line argument

	Scanner sc=new Scanner(System.in);

         int mMonth = sc.nextInt();
         int mDay = sc.nextInt();
         int mYear = sc.nextInt();

         //Formula to Calculate the date falls on  
         int y = mYear - (14 - mMonth) / 12;
         int x = y + y / 4 - y / 100 + y / 400;
         int m = mMonth + 12 * x * ((14 - mMonth) / 12) - 2;
         int d = (mDay + x + 31 * m / 12) % 7;

	 System.out.println("Enter the month,day&year" "+y+" "+m+" +d);
   } 
}
            

