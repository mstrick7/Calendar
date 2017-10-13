public class Calendar {
    public static void main(String[] args) {

        //months variable
        int Mo = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);

        String Month= new String();
        if (Mo == 1){ Month = "January";}
        else if (Mo == 2){ Month = "February";}
        else if (Mo == 3){ Month = "March";}
        else if (Mo == 4){ Month = "April";}
        else if (Mo == 5){ Month = "May";}
        else if (Mo == 6){ Month = "June";}
        else if (Mo == 7){ Month= "July";}
        else if (Mo == 8){ Month = "August";}
        else if (Mo == 9){ Month = "September";}
        else if (Mo == 10){ Month = "October";}
        else if (Mo == 11){ Month = "November";}
        else if (Mo == 12){ Month = "December";}




        //array of title days

        String[] days = new String[7];
        days[0] = "S";
        days[1] = "M";
        days[2] = "Tu";
        days[3] = "W";
        days[4] = "Thu";
        days[5] = "F";
        days[6] = "S";

        //arrays for each week

        int[] week1 = new int[7];
        int[] week2 = new int[7];
        int[] week3 = new int[7];
        int[] week4 = new int[7];
        int[] week5 = new int[7];
        int i = 0;
        for (int k = 1; k < 8; k++) {
            week1[i] = k;
            week2[i] = k + 7;
            week3[i] = k + 14;
            week4[i] = k + 21;
            week5[i] = k + 28;
            i = i + 1;
        }



        System.out.println(Month +" "+ year);

        System.out.println(" "+week1[0]+"  "+week1[1]+"  "+week1[2]+"  "+week1[3]+"  "+week1[4]+"  "+week1[5]+"  "+week1[6]);
        System.out.println(" "+week2[0]+"  "+week2[1]+" "+week2[2]+" "+week2[3]+" "+week2[4]+" "+week2[5]+" "+week2[6]);
        System.out.println(week3[0]+" "+week3[1]+" "+week3[2]+" "+week3[3]+" "+week3[4]+" "+week3[5]+" "+week3[6]);
        System.out.println(week4[0]+" "+week4[1]+" "+week4[2]+" "+week4[3]+" "+week4[4]+" "+week4[5]+" "+week4[6]);

        if (Mo == 2 && year % 4 == 0){
            System.out.print(week5[0]);
        }

        if (Mo == 9 || Mo == 4 || Mo == 6 || Mo == 11){
            System.out.print(week5[0]+" "+week5[1]);
        }

        if (Mo == 1 || Mo == 3 || Mo == 5 || Mo == 7 || Mo == 8 || Mo == 10 || Mo == 12){
            System.out.print(week5[0]+" "+week5[1]+" "+week5[2]);
        }

    }
}
