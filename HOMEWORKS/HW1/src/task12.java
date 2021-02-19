import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        System.out.println("Въведете ден :");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        System.out.println("Въведете месец :");
        Scanner sc1 = new Scanner(System.in);
        int month = sc1.nextInt();

        System.out.println("Въведете година :");
        Scanner sc2 = new Scanner(System.in);
        int year = sc2.nextInt();

        boolean visokosna;


        if((year%400 == 0) || (year % 4 == 0 && year%100 !=0) )
        {
            if(month ==2)
            {
                day = day +1;
                if(day ==30)
                {
                    day = 0;
                    month = month +1;
                }

            }

          if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12)
          {
              if(day == 31)
              {
                  month = month + 1;
                  if(month == 13){
                      month = 1;
                      year = year + 1;
                  }
                  day = 1;

              }
              else
              {
                  day = day + 1;

              }
          }



          if(month == 4 || month ==6 || month == 9 || month ==11)
          {
              if(day == 30)
              {
                  month = month + 1;
                  if(month == 13){
                      month = 1;
                      year = year + 1;
                  }
                  day = 1;

              }
              else
              {
                  day = day + 1;

              }
          }

        }
        else
        {

            if(month ==2)
            {
                if(day ==28)
                {
                    day = 0;
                    month = month +1;
                }
                else
                {
                    day = day +1;
                }
            }

            if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12)
            {
                if(day == 31)
                {
                    month = month + 1;
                    if(month == 13){
                        month = 1;
                        year = year + 1;
                    }
                    day = 1;

                }
                else
                {
                    day = day + 1;

                }
            }



            if(month == 4 || month ==6 || month == 9 || month ==11)
            {
                if(day == 30)
                {
                    month = month + 1;
                    if(month == 13){
                        month = 1;
                        year = year + 1;
                    }
                    day = 1;

                }
                else
                {
                    day = day + 1;

                }
            }

        }

        System.out.println(day + " , " + month + " , " + year);
    }
}
