//excercise1
// public class excercise1 {
//     public static void main(String args[]){
//         checkNumber(1);
//     }
    
//         public static void checkNumber(int number){
//             if(number>0){
//                 System.out.println("positive");
//             }else if (number<0){
//                 System.out.println("negative");
//             }
//             else{
//                 System.out.println("zero");
//             }
//         }
//     }

// excercise 2

// public class excercise {
//     public static void main (String args[]){
//         printMegaBytesAndKiloBytes(2500);
//     }
//     public static void printMegaBytesAndKiloBytes(int kiloBytes){
//         if (kiloBytes<0){
//             System.out.println("Invalid Value");
//         }
//         else{
//             int a = Math.round(kiloBytes/1024);
//             int b = kiloBytes%1024;
//             System.out.println(kiloBytes +" KB = " + a + " MB and "+ b +" KB");
//         }
//     }
// }

// excercise 3
// public class excercise{
//     public static void main(String args[]){
//       shouldWakeUp(true,6);
//     }
//     public static boolean shouldWakeUp(boolean barking,int hourOfDay){
//         boolean result = false;
//         if (hourOfDay<0 ||hourOfDay>23){
//             result = false;
//         }
//         else if(hourOfDay>=8 && hourOfDay<=22){
//             result = false;
//         }
//         else if (hourOfDay>=1 ||hourOfDay<=7||hourOfDay>=23){
//             if (barking == true){
//             result = true;
//             }
//             else{
//                 result = false;
//             }
//         }
//         return result;
//     }
// }

// excercise 4
// public class excercise{
//     public static void main (String args[]){

//     }
//     public static boolean isLeapYear(int year){
//         boolean result = false;
//         if(year <=0 ||year>=10000){
//             result = false;
//         }
//         else if (year >=1 || year <=9999){
//             if (year%4 ==0){
//                  if(year%100 ==0){
//                     if(year%400 == 0){
//                         result = true;
//                     }else{
//                         result = false;
//                     }
//                 }else{
//                     result = true;
//                 }
//             }else{
//                 result =false;
//             }
//         }
//         return result;
//     }

// }

// excerciese 4
// public class excercise{
//     public static void main (String args[]){
//       areEqualByThreeDecimalPlaces(3.455555,3.4555567 );
//     }
//     public static boolean areEqualByThreeDecimalPlaces(double a,double b){
//         boolean result = false;
       
//         if ((int)(a*1000)== (int)(b*1000)){
//             result = true;
//         }else {
//             result = false;
//         }
//         return result;
//     }
// }