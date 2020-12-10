import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter another number for a card [1;52]: ");
        int a = sc1.nextInt();
        int counterColor =0;
        int counterCard = 2;
        int counter = 1;
        for (int i = 1; i <=52 ; i++) {

            counterColor++;
            if(counterColor > 4)
            {
                counterColor = 1;
                counterCard++;
            }

            if(i>=a)
            {
                switch (counterColor)
                {
                    case 1 :

                            switch(counterCard){
                                case 11 :
                                    System.out.print("Vale" + " spatiq ");
                                    break;
                                case 12:
                                    System.out.print("Dama" + " spatiq ");
                                    break;
                                case 13 :
                                    System.out.print("Pop" + " spatiq ");
                                        break;
                                case 14:
                                    System.out.print("Aso" + " spatiq ");
                                    break;
                                default:
                                    System.out.print(counterCard + " spatiq ");
                                    break;

                            }
                    break;
                    case 2 :
                        switch(counterCard){
                            case 11 :
                                System.out.print("Vale" + " karo ");
                                break;
                            case 12:
                                System.out.print("Dama" + " karo ");
                                break;
                            case 13 :
                                System.out.print("Pop" + " karo ");
                                break;
                            case 14:
                                System.out.print("Aso" + " karo ");
                                break;
                            default:
                                System.out.print(counterCard + " karo ");
                                break;

                        }
                        break;
                    case 3 :
                        switch(counterCard){
                            case 11 :
                                System.out.print("Vale" + " kupa ");
                                break;
                            case 12:
                                System.out.print("Dama" + " kupa ");
                                break;
                            case 13 :
                                System.out.print("Pop" + " kupa ");
                                break;
                            case 14:
                                System.out.print("Aso" + " kupa ");
                                break;
                            default:
                                System.out.print(counterCard + " kupa ");
                                break;

                        }
                        break;
                    case 4:
                        switch(counterCard){
                            case 11 :
                                System.out.print("Vale" + " pika ");
                                break;
                            case 12:
                                System.out.print("Dama" + " pika ");
                                break;
                            case 13 :
                                System.out.print("Pop" + " pika ");
                                break;
                            case 14:
                                System.out.print("Aso" + " pika ");
                                break;
                            default:
                                System.out.print(counterCard + " pika ");
                                break;

                        }
                        break;
                }

            }


        }

    }
}
