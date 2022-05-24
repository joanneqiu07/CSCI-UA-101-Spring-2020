public class HW1 {

    public static void main(String[] args) {
        
        /* Problem 1 */
        
        //initialize coodinates
        double bx = 10; //the x of base
        double by = 10; //the y of base
        double dx = 30; //the x of destination
        double dy = 30; //the y of destination
        
        //calculate the total distance
        double distance;
        double a = Math.pow(dx - bx, 2);
        double b = Math.pow(dy - by, 2);
        distance = Math.sqrt(a + b);
        
        //declare and initialize valuables
        int h;//declare hour
        double cx = 10;//the x of current location
        double cy;//the y of current location
        double cs = 0;//the value of current speed
        double wc;//the value of water consumered
        double wr;//the value of water remaining
        double dt = 0;//the value of distance traveled
        double dr;//the value of distance remaining
        double wt = 18;//the total value of water
        
        //print the titles in the center
        String s1 = "STORMTROOPER MOVEMENT CALCULATION CHART";
        String s3 = "Created By: Joanne Qiu";
        String s2 = "Total Distance of Movement: " + "******" + " KM";
        int l1 = s1.length()/2;
        int l2 = (s1.length() - s2.length())/2 + l1;
        int l3 = (s1.length() - s3.length())/2 + l1;
        String s1f = "%" + l1 + "s%-" + l1 + "s %n";
        String s2f = "%" + l2 + "s %s%.2f %-" + l2 + "s %n";
        String s3f = "%" + l3 + "s%-" + l3 + "s %n";
        System.out.printf(s1f , ' ' , s1);
        System.out.printf(s2f , ' ', "Total Distance of Movement: ", distance, "KM");
        System.out.printf(s3f , ' ' , s3);
        
        //print the categories
        System.out.printf("%-7s %-13s %-13s %-13s %-13s %-13s %-13s %n", "Hour", "Current", "Current",
                "Water", "Water", "Distance", "Distance");
        System.out.printf("%-7s %-13s %-13s %-13s %-13s %-13s %-13s %n", " ", "Location",
                "Speed", "Consumed", "Remaining", "Traveled", "Remaining");
        System.out.println("_______________________________________"
                + "_______________________________________"
                + "__________");
        
        
        int i = 0;//the number of rows
        while (i >= 0)
        {
            //hours
            h = i;
            
            //current locations
            if (i == 0) cs = 0;
            double y = Math.sqrt (cs * cs / 2) % 1;
            double x = Math.sqrt(cs * cs / 2) - y;
            if (y > 0.5) x++;
            cx = cx + x ;
            cy = cx;
            
            //current speed
            if (i <= 3) cs = 3;
            else if (i > 3 && i <= 7) cs = 2.2;
            else if (i > 7) cs = 1.7;
            
            //water consumed
            wc = h * 1.5;
            
            //water remaining
            wr = wt - wc;
            
            //distance travelled
            if (i == 0) dt = 0;
            else
            {
                if (h < 4) dt = cs * h;
                else if (h >= 4 && h < 8 ) dt = 3 * 4 + cs * (h - 4);
                else if (h >= 8) dt = 3 * 4 + 2.2 * 4 + cs * (h - 8); 
            }
            
            //distance remaining
            dr = distance - dt;
            
            //print the chart
            if (cx >= 30 || cy >= 30)
            {
                cx = 30;
                cy = 30;
            }
            if (dr <= 0)
            {
                dr = 0;
                System.out.printf("%-7d %.0f,%-10.0f %-13.1f %-13.1f %-13.1f %-13.0f %-13.0f %n", 
                        h, cx, cy, cs, wc, wr, dt, dr );
            }
            else
            {
                if (dt % 1 == 0)
                {
                    System.out.printf("%-7d %.0f,%-10.0f %-13.1f %-13.1f %-13.1f %-13.0f %-13.2f %n", 
                            h, cx, cy, cs, wc, wr, dt, dr );
                }
                else
                {
                    System.out.printf("%-7d %.0f,%-10.0f %-13.1f %-13.1f %-13.1f %-13.1f %-13.2f %n", 
                            h, cx, cy, cs, wc, wr, dt, dr );
                }
            }
            i++;
            //the loop will break when the distance remaining equals to zero
            if (dr <= 0) break;
        }
        System.out.println("_______________________________________"
                + "_______________________________________"
                + "__________");
        System.out.println();
        System.out.println();
        System.out.println();
        //The end of problem 1
        
        
        /* Problem 2 */
        
        //print the titles
        String title = "REPAIR CREW TRAVEL DISTANCE-TIME CHART";
        int tl = title.length()/2;
        String tf = "%" + tl*1.8 + "s%-" + tl + "s %n";
        System.out.printf(tf , ' ' , title);
        System.out.printf("%-24s %-24s %-24s %-24s %s %n", 
                "SENSOR 1:[25,15]","SENSOR 2:[20,15]","SENSOR 3:[15,15]",
                        "SENSOR 4:[10,15]","SENSOR 5:[5,15]");
        System.out.println();
        System.out.printf("%-13s %-10s %-18s %-18s %-18s %-18s %s %n",
                "Transport","Select","Distance-Time","Distance-Time",
                "Distance-Time","Distance-Time","Distance-Time");
        System.out.printf("%-13s %-15s %-18s %-18s %-18s %-18s %s %n",
                "Type","Speed","To","To","To","To","To");
        System.out.printf("%-13s %-13s %-18s %-18s %-18s %-18s %s %n",
                " "," ","Sensor 1","Sensor 2","Sensor 3","Sensor 4","Sensor 5");
        System.out.println("_______________________________________"
                + "_______________________________________"
                + "______________________________________");
        
        //declare all variables
        double dt1,dt2,dt3,dt4,dt5;
        double ss = 0;
        
        //declare the distances from sensors
        double d1,d2,d3,d4,d5;
        
        //declare the coordinates
        double yc = 15;
        double x1 = 25;
        double x2 = 20;
        double x3 = 15;
        double x4 = 10;
        double x5 = 5;
        
        //calculate the distances
        double s1x = Math.pow(dx - x1 , 2);
        double s2x = Math.pow(dx - x2 , 2);
        double s3x = Math.pow(dx - x3 , 2);
        double s4x = Math.pow(dx - x4 , 2);
        double s5x = Math.pow(dx - x5 , 2);
        double sy = Math.pow(dy - yc, 2);
        
        x1 = Math.sqrt(s1x + sy);
        x2 = Math.sqrt(s2x + sy);
        x3 = Math.sqrt(s3x + sy);
        x4 = Math.sqrt(s4x + sy);
        x5 = Math.sqrt(s5x + sy);
        
        //use a for loop to calculate and print the chart
        for (int x = 0; x < 4 ; x++)
        {
            //current speed
            switch (x) {
                case 0:
                    ss = 35;
                    break;
                case 1:
                    ss = 30;
                    break;
                case 2:
                    ss = 25;
                    break;
                case 3:
                    ss = 20;
                    break;
                default:
                    break;
            }
            
            //transform hours to minutes
            dt1 = x1 / ss * 60;
            dt2 = x2 / ss * 60;
            dt3 = x3 / ss * 60;
            dt4 = x4 / ss * 60;
            dt5 = x5 / ss * 60;
            
            //print the chart
            if (x <= 1)
            {
                if (dt4 % 1 == 0)
                {
                    System.out.printf("%-13s %-10.1f %.1fkm-%.1f%-7s %.0fkm-%.1f%-9s %.1fkm-%.1f%-7s "
                        + "%.0fkm-%.0f%-11s %.1fkm-%.1f%s %n",
                        "Speeder Bike",ss,x1,dt1,"min",x2,dt2,"min",x3,dt3,
                        "min",x4,dt4,"min",x5,dt5,"min");
                }
                else 
                {
                    System.out.printf("%-13s %-10.1f %.1fkm-%.1f%-7s %.0fkm-%.1f%-9s %.1fkm-%.1f%-7s "
                        + "%.0fkm-%.1f%-9s %.1fkm-%.0f%s %n",
                        "Speeder Bike",ss,x1,dt1,"min",x2,dt2,"min",x3,dt3,
                        "min",x4,dt4,"min",x5,dt5,"min");
                }
            }
            else if(x > 1)
            {
                if (dt4 % 1 == 0)
                {
                    if (x != 2) 
                    {
                        System.out.printf("%-13s %-10.1f %.1fkm-%.1f%-7s %.0fkm-%.1f%-9s %.1fkm-%.1f%-7s "
                            + "%.0fkm-%.0f%-11s %.1fkm-%.1f%s %n",
                            "Land Speeder",ss,x1,dt1,"min",x2,dt2,"min",x3,dt3,
                            "min",x4,dt4,"min",x5,dt5,"min");
                    }
                    else if (x == 2)
                    {
                        System.out.printf("%-13s %-10.1f %.1fkm-%.1f%-7s %.0fkm-%.1f%-9s %.1fkm-%.1f%-7s "
                            + "%.0fkm-%.0f%-11s %.1fkm-%.0f%s %n",
                            "Land Speeder",ss,x1,dt1,"min",x2,dt2,"min",x3,dt3,
                            "min",x4,dt4,"min",x5,dt5,"min");
                    }
                }
            }
        }
        System.out.println();
        System.out.println("_______________________________________"
                + "_______________________________________"
                + "________________Created By: Joanne Qiu");
        //The end of problem 2
   
    }

}
