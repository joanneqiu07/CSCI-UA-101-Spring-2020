
public class HW2 {
    
    public static void main(String[] args) {
        
        /* Task 1 */
        double[] A = {1,2,3,4,5,6,7,8,9,10};
        
        /* 1A */
        //Utilize a for loop to display all the values on a single line.
        System.out.println("TASK 1A");
        for (int i = 0; i < 10; i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.println();
        
        /* 1B */
        //Utilize a while loop to display only the even values on a single line.
        System.out.println("TASK 1B");
        int j = 0;
        while(j < A.length)
        {
            if (A[j] % 2 == 0) System.out.print(A[j]+" ");
            j++;
        }
        System.out.println();
        System.out.println();
        
        /* 1C */
        //Utilize a for-each loop to display the odd values between 1 and 5 on a single line 
        //and the even values between 6 and 10 on a single line.
        System.out.println("TASK 1C");
        for (double item:A)
        {
            if (item >= 1 && item <= 5 && item % 2 != 0)
                System.out.print(item+" ");
            if (item == 5) System.out.println();
            if (item >= 6 && item <= 10 && item % 2 == 0)
                System.out.print(item+" ");
            if (item == 10) System.out.println();
        }
        System.out.println();
        
        /* Task 2 */
        double[] B = {11,21,33,49,52,63,71,81,93,101};
        
        /* 2A */
        //Utilize a for loop to sum all the numbers evenly divisible by 7 or 9 and display the sum.
        //You must utilize a switch statement in the process to determine if a value is evenly divisible by 7 or 9.
        System.out.println("TASK 2A");
        double sum2A = 0;
        for (int l = 0; l < B.length ; l++)
        {
            int a1 = (int)B[l] % 7;
            int a2 = (int)B[l] % 9;

            switch(a1)
            {
                case 0: 
                    sum2A = sum2A + B[l];
                    break;
                default:
                    switch(a2)
                    {
                        case 0: 
                            sum2A = sum2A + B[l];
                            break;
                        default:
                            break;
                    }
            }    
        }
        System.out.printf("%.0f",sum2A);
        System.out.println();
        System.out.println();
        
        /* 2B */
        //Utilize a while loop to display all values
        //that when multiplied by 4 and divided by 3 is an even number on a single line.
        System.out.println("TASK 2B");
        int m = 0;
        while (m < B.length)
        {
            double b1 = B[m] * 4;
            double b2 = b1 / 3;
            if (b2 % 2 == 0) System.out.print(B[m]+" ");
            m++;
        }
        System.out.println();
        System.out.println();
        
        /* 2C */
        //Utilize a for-each loop to display the difference between the sum of 
        //all the odd-valued numbers and the product of all the even-valued numbers.
        System.out.println("TASK 2C");
        double sum2C = 0;
        double prod2C = 1;
        for (double item:B)
        {
            if (item % 2 != 0) sum2C = sum2C + item;
            else if (item % 2 == 0) prod2C = prod2C * item;
        }
        double diff2C = sum2C - prod2C;
        System.out.println(diff2C);
        System.out.println();
        
        /* Task 3 */
        double[] C = {71,61,53,40,50,60,72,82,92,100};
        
        /* 3A */
        //Utilize a for loop to display the smallest value of the numbers in the array.
        System.out.println("TASK 3A");
        double min3A = C[0];
        for (int n = 0; n < C.length; n++)
        {
            if (min3A > C[n]) min3A = C[n];
        }
        System.out.println(min3A);
        System.out.println();
        
        /* 3B */
        //Utilize a for loop to display the largest value of the numbers in the array.
        System.out.println("TASK 3B");
        double max3B = C[0];
        for (int o = 0; o < C.length; o++)
        {
            if (max3B < C[o]) max3B = C[o];
        }
        System.out.println(max3B);
        System.out.println();
        
        /* 3C */
        //Utilize a while loop to display the average value of the numbers in the array.
        System.out.println("TASK 3C");
        int p = 0;
        double sum3C = 0;
        while (p < C.length)
        {
            sum3C = sum3C + C[p];
            p++;
        }
        double ave3C = sum3C / C.length;
        System.out.println(ave3C);
        System.out.println();
        
        /* 3D */
        //Utilize a for-each loop to display the variance of the numbers in the array.
        System.out.println("TASK 3D");
        double diff3D;
        double sum3D = 0;
        for (double item:C)
        {
            diff3D = Math.pow((item - ave3C), 2);
            sum3D = sum3D + diff3D;
        }
        double var3D = sum3D / C.length;
        System.out.println(var3D);
        System.out.println();
        
        /* 3E */
        //Display the standard deviation of the numbers in the array.
        System.out.println("TASK 3E");
        double sd3E = Math.sqrt(var3D);
        System.out.println(sd3E);
        System.out.println();
        
        /* 3F */
        //Display the range of the numbers in the array.
        System.out.println("TASK 3F");
        double range3E = Math.abs(max3B - min3A);
        System.out.println(range3E);
        System.out.println();
        
        /* Task 4*/
        String[] D = {"Luke","Han","Chewbacca","Leia","Yoda"};
        
        /* 4A */
        //Utilize a for loop to display any string containing an ‘a’  on a  single line.
        System.out.println("TASK 4A");
        for (int q = 0; q < D.length; q++)
        {
            int l4A = D[q].length();
            int r = 0;
            while (r < l4A)
            {
                char ch4A = D[q].charAt(r);
                char a4A = 'a';
                if (ch4A == a4A)
                {
                    System.out.print(D[q] + " ");
                    break;
                }
                r++;
            }
        }
        System.out.println();
        System.out.println();
        
        /* 4B */
        //Utilize a for loop to display any string
        //containing the character sequence ‘ba’ or ‘da’ on a single line.
        System.out.println("TASK 4B");
        for (int s = 0; s < D.length; s++)
        {
            int l4B = D[s].length();
            int t = 0;
            while (t < l4B)
            {
                char ch4B1 = D[s].charAt(t);
                char ch4B2 = D[s].charAt(t);
                if (t+1 < l4B) 
                {
                    ch4B2 = D[s].charAt(t+1);
                }
                char b4B = 'b';
                char a4B = 'a';
                char d4B = 'd';
                if (ch4B1 == b4B || ch4B1 == d4B && ch4B2 == a4B)
                {
                    System.out.print(D[s] + " ");
                    break;
                }
                t++;
            }
        }
        System.out.println();
        System.out.println();
        
        /* 4C */
        //Utilize a nested loop to display the total number of vowels found in all strings. 
        //You must utilize a switch statement in the process to determine the total number of vowels. 
        //(hint: convert the strings to characters…see toCharArray() in the String class).
        System.out.println("TASK 4C");
        int sum4C = 0;
        for (int u = 0; u < D.length; u++)
        {
            int l4C = D[u].length();
            int v = 0;
            char[] vo = D[u].toCharArray();
            while (v < vo.length)
            {
                switch(vo[v])
                {
                    case 'a': 
                        sum4C++;
                        v++;
                        continue;
                    case 'e': 
                        sum4C++;
                        v++;
                        continue;
                    case 'i':
                        sum4C++;
                        v++;
                        continue;
                    case 'o':
                        sum4C++;
                        v++;
                        continue;
                    case 'u':
                        sum4C++;
                        v++;
                        continue;
                    default:
                        v++;
                }
            }  
        }
        System.out.println(sum4C);
        System.out.println();
        
        /* Task 5 */
        String[] E = {"C3PO","R2D2","K-2SO","BB-8","N1-G3L","DN-LD"};
        String[] F = {"C3PO","R2D2","K-2SO","BB-8","N1-G3L","DN-LD"};
        String[] G = {"C3PO","R2D2","K-2SO","BB-8","N1-G3L","DN-LD"};
        String[] H = {"C3PO","R2D2","K-2SO","BB-8","N1-G3L","DN-LD"};
        
        /* 5A */
        //Utilize a for loop to remove any string which contains a number and then displays the strings in the modified array. 
        //Making a value Null is equivalent to removing it.
        System.out.println("TASK 5A");
        for (int w = 0; w < E.length; w++)
        {
            int l5A = E[w].length();
            int a5 = 0;
            while (a5 < l5A)
            {
                char ch5A = E[w].charAt(a5);
                if (Character.isDigit(ch5A))
                {
                    E[w] = "Null";
                    break;
                }
                a5++;
            }
            if (E[w] != "Null") System.out.print(E[w]);
        }
        System.out.println();
        System.out.println();

        /* 5B */
        //Utilize a for loop to remove any string which contains an ‘O’ or ‘-’ 
        //and then displays the strings in the modified array. 
        //You must utilize a switch statement in the process of removing the specified string(s).
        System.out.println("TASK 5B");
        for (int b5 = 0; b5 < F.length; b5++)
        {
            int l5B = F[b5].length();
            int b5b = 0;
            while (b5b < l5B)
            {
                char ch5B = F[b5].charAt(b5b);
                switch(ch5B)
                {
                	case 'O': 
                	    F[b5] = "Null";
                            b5b++;
                	    break;
                	case '-': 
                	    F[b5] = "Null";
                            b5b++;
                	    break;
                	default:
                            b5b++;
                }
                if (F[b5] == "Null") break;
                
            }
            if (F[b5] != "Null") System.out.print(F[b5]);
        }
        System.out.println();
        System.out.println();

        /* 5C */
        //Utilize a while loop to modify the strings by substituting an ‘X’ at the end of each string 
        //that contains a number as the last character of the string 
        //and then displays the strings in the modified array. 
        System.out.println("TASK 5C");
        int c5 = 0;
        while (c5 < G.length)
        {
            int l5C = G[c5].length();
            char ch5C = G[c5].charAt(l5C - 1);
            if (Character.isDigit(ch5C)) 
            {
            	G[c5] = G[c5] + 'X';
            } 
            else G[c5] = "Null";
            if (G[c5] != "Null") System.out.print(G[c5] + " ");
            c5++;
        }
        System.out.println();
        System.out.println();

        /* 5D */
        //Utilize a for-each loop to modify the strings by replacing the first three characters in the String 
        //with a their lowercase equivalent them and removing all other characters 
        //and then display all the strings in the modified array.
        System.out.println("TASK 5D");
        for (String item:H)
        {
            int l5D = item.length();
            char[] D5 = new char[3];
            for (int d5 = 0; d5 < 3; d5++)
            {
                char ch5D = item.charAt(d5);
                D5[d5] = ch5D;
            }
            item = String.valueOf(D5);
            System.out.print(item.toLowerCase()+" ");
        }
        System.out.println();
        System.out.println();

    }
    
}
