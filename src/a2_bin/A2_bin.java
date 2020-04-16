
package a2_bin;

import java.util.*;

public class A2_bin {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

                
        while (true){
        String select = " ";
        System.out.println("+-----------------------------------------------------+"); //menu for selection
        System.out.println("|                        Welcome                      |");
        System.out.println("| For decimal to binary number conversion, enter \"A\". |");
        System.out.println("| For binary to decimal number conversion, enter \"B\". |");
        System.out.println("|                 To QUIT, enter \"C\".                 |");
        System.out.println("+-----------------------------------------------------+");
        
        System.out.print("Input: "); // asks user input
        select = x.nextLine();
        
            //exits if user inputs C or c
            if (select.equals("c")||select.equals("c")){
                break;
            }
            else if (select.equals("A") || select.equals("a")){ // runs decimal to binary program if A or a is entered
                System.out.println("+-----------------------------------------------------+");
                System.out.print("Enter decimal number: ");
                int input = x.nextInt(); // stores decimal number
                String D = DtoB(input); // sents decimal number to method for converting
                System.out.println(D); // prints out binary
                System.out.println("+-----------------------------------------------------+");
                System.out.println("");
            }
            else if (select.equals("B") || select.equals("b")){ // runs decimal to binary program if B or b is entered
                System.out.println("+-----------------------------------------------------+");
                System.out.print("Enter binary number: ");
                String input = x.nextLine(); //stores binary
                int B = BtoD(input); //stores binary to method for converting
                System.out.println(B); // prints decimal number
                System.out.println("+-----------------------------------------------------+");
                System.out.println("");
            }
            else{
                System.out.println("+-----------------------------------------------------+");
                System.out.println("Enter valid option... ");
                System.out.println("+-----------------------------------------------------+");
                
            }
        }   
    }

    //converts decimal to binary
    static String DtoB(int D) {
        String answer = "";
        while (D > 0) { //keeps lopping until it reaches 0
            int r = D % 2; //calculates remainder of decimal
            answer = r + answer; //adds remainder to final answer
            D = D / 2; // divides number by 2 
        }
        return answer; // returns final answer of binary to problem
    }
    //converts binary to decimal
    static int BtoD(String B) {
        int answer = 0;
        int length = B.length(); //finds length of binanry
        for (int i = 0; i < B.length(); i++) { // i is equal to 0, when i is less then the length of binanry, adds 1
            char c = B.charAt(i); // current position
            if (c == '1') { // only starts with 1 in the beginning 
                answer = answer + (int) Math.pow(2,length-1-i); // calculates power to get answer
            }
        }
        return answer; //returns final decimal answer
    }
}