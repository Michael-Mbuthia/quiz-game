/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizapp;

import java.util.Scanner;
public class QuizApp {

    public static void main(String[] args) {
        Scanner bucky = new Scanner(System.in);
        
        String[] answer = {"d", "a", "d", "b"};
        String[] response = {"", "", "", ""};
        
        System.out.println("Which one is not a frontend language?");
         System.out.println("a) HTML ");
         System.out.println("b) JavaScript ");
         System.out.println("c) CSS ");
         System.out.println("d) Java ");  
         
        System.out.println("which year was Java released?");
         System.out.println("a) 1995 ");
         System.out.println("b) 1963 ");
         System.out.println("c) 1910 ");
         System.out.println("d) 2004 ");  
         
        System.out.println("The capital city of Kenya?");
         System.out.println("a) Kisumu ");
         System.out.println("b) Mombasa ");
         System.out.println("c) Nakuru ");
         System.out.println("d) Nairobi ");
         
        System.out.println("Which of the following is the best anime  of all time?");
         System.out.println("a) Naruto ");
         System.out.println("b) One Piece ");
         System.out.println("c) Bleach ");
         System.out.println("d) Solo levelig "); 
         
         
           response[0] = bucky.next();
           response[1] = bucky.next();
           response[2] = bucky.next();
           response[3] = bucky.next();
          
         
           int score = 0;
           
           for(int i = 0; i < 4; i++){
               if(response[i].equalsIgnoreCase(answer[i])){
                   score++;
               }
           }
         System.out.println("Total score: " + score + "/4");
    }
    
}


//import java.util.Scanner;     
//public class StudentManagementSystem {
//     String name;
//    int Marks1;
//    int Marks2;
//    int Marks3;
//   double Average;
//   String grade;
//   
//    
//    public double getAverage(){
//        Average = (Marks1 + Marks2 +Marks3) /3;
//        return Average;
//    }
//   public void getGrade(){
//    
// if (Average >= 80 ){
//    grade = "A";       
//   }else if (Average >=60){
//       grade = "B";
//   }else if (Average >=40){
//       grade = "C";
//   }else {
//       grade ="fail";
//   }
//}
//    public static void main(String[] args) {
//        // TODO code application logic here
//        
//            
//        }
//        }
//    