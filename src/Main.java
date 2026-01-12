import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



//        int max =  Integer.MIN_VALUE;
//        int min  = Integer.MAX_VALUE;
int [] array ={1,2,5,7,8,9,1,4};

        int max = findMax(array); //9
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i]>secondMax  &&  array[i]<max){

            }
        }

        //[1,2,5,7,8,9,1,4]









        String tempName ="1999221";
        System.out.println(tempName);


        String str =" ";
        for (int i = 0; i < tempName.length()-1; i++) {
            if (tempName.charAt(i)==tempName.charAt(i+1)){
                if (str.charAt(str.length()-1)!=tempName.charAt(i+1)){
                    str+=tempName.charAt(i+1);
                }
            }else {
                if (str.charAt(str.length()-1)!=tempName.charAt(i)){
                    str+=tempName.charAt(i);
                }
            }
        }
        if (tempName.charAt(tempName.length()-1)!=str.charAt(str.length()-1)){
            str+=tempName.charAt(tempName.length()-1);
        }
        System.out.println(str);
     int number =16;

     int x= 16/3; //5





        for (int i = 1; i <=number ; i++) {
            if (number%i==0){
                System.out.print((number/i) +" , " + i + "\n");
            }
        }
    }

    public static int gcd(int number1, int number2){
        int higherDivider = 1;
        int smallerNumber = number1;
        if (number2<number1){
           smallerNumber = number2;
        }
        for (int i = 1; i < smallerNumber ; i++) {
            if (number1%i == 0 && number2%i == 0){
                higherDivider = i;
            }
        }
        return higherDivider;
    }

//    תרגיל 21:
//    כתבו פונקציה המבקשת מהמשתמש להכניס מספר שלם כלשהו,
//    ומחזירה את כמות הספרות שיש במספר.

    public static int amountOfDigits(){
        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number  =  scanner.nextInt();
        int count = 0;
        while (number>0){
//            number = number/10;
            number/=10;
            count++;
        }
        return count;
    }

//
//    תרגיל 32:
//    כתבו פונקציה שמקבלת שני מערכים של מספרים שלמים כפרמטרים. הפונקציה תחזיר 1 אם סכום איברי המערך הראשון גדול יותר מסכום איברי המערך השני,
//    2 אם סכום איברי המערך השני גדול יותר, ו-0 אם הסכום שווה.
public static int sumOfArray(int [] array){
       int sum = 0;
    for (int i = 0; i < array.length; i++) {
        sum+=array[i];
    }
    return sum;
}


    public static int sumIsBigger(int [] array1 ,int [] array2){
        int sumArray1 = sumOfArray(array1);
        int sumArray2 = sumOfArray(array2);
        int result;
        if (sumArray1 > sumArray2){
            result = 1;
        } else if (sumArray1 < sumArray2) {
            result = 2;
        }else {
            result = 0;
        }
        return result;
    }

//
//    תרגיל 39:
//    כתבו פונקציה המקבלת מערך של מספרים array ומספר שלם נוסף number.
//    הפונקציה תחזיר מערך בגודל 3:
//    כאשר הערך של האיבר באינדקס ה-0 הוא כמות המספרים בתוך array הקטנים מ-number;
//    הערך של האיבר באינדקס ה-1 הוא כמות המספרים בתוך array השווים ל-number;
//    הערך של האיבר באינדקס ה-2 הוא כמות המספרים בתוך array הגדולים מ-number.
//            לדוגמה, אם array הוא:
//    {54,52,87,1,83,76,12,76,12,98,12,6}
//    ו-number הוא 50,
//    המערך שיוחזר הוא:
//    {5,0,7}


    public static int [] function(int [] array , int number){
        int [] resultArray = new int[3]; // [0,0,0]
        int countBigger = 0; //גדולים מהמספר
        int countSmaller = 0; //קטנים מהמספר
        int countEquals = 0;//שווים מהמספר
        //{54,52,87,1,83,76,12,76,12,98,12,6}
        for (int i = 0; i < array.length; i++) {
            if (array[i]<number){
                countSmaller++;
            }
            else if (array[i]>number) {
              countBigger++;
            }
            else {
              countEquals++;
            }
        }
        resultArray[0] = countSmaller ;
        resultArray[1] = countEquals ;
        resultArray[2] = countBigger;
        return resultArray;
    }

    public static int [] function1(int [] array , int number){
        int [] resultArray = new int[3]; // [2,0,0]
        for (int i = 0; i < array.length; i++) {
            if (array[i]<number){
               resultArray[0]++;
            }
            else if (array[i]>number) {
              resultArray[2]++;
            }
            else {
               resultArray[1]++;
            }
        }

        return resultArray;
    }

//    הפונקציה הראשונה היא:

//    פונקציה זו מקבלת מערך של מחרוזות בשם names, ואמורה להחזיר את האורך הממוצע של המחרוזות
//    (בדיוק של שתי ספרות אחרי הנקודה).
//
//    הפונקציה השנייה היא:

    public static double getAvgSize(String [] names){
        int sum = 0;
        double average = 0;

        for (int i = 0; i < names.length; i++) {
            sum+=names[i].length();
        }

        average = (double) sum/names.length;
        return average;
    }

   public static String myReplace(String name,String toReplace,String newStr){
       for (int i = 0; i < toReplace.length(); i++) {
           String letter = toReplace.charAt(i)+"";
           name = name.replace(letter,newStr);
       }
       return name;
   }


    public static String encodeSoundex(String name){
        char firstLetter = name.charAt(0);
        name = name.toUpperCase();
        String tempName = name.substring(1);
        String letterToRemove = "AEIOUWHY";
        tempName = myReplace(tempName,letterToRemove,"");
        String lettersToOne = "BFPV";
        tempName = myReplace(tempName,lettersToOne,"1");
        String lettersToTwo = "CGJKQSXZ";
        tempName = myReplace(tempName,lettersToTwo,"2");
        tempName = myReplace(tempName,"DT","3");
        tempName = tempName.replace("L","4");
        tempName = myReplace(tempName,"MN","5");
        tempName = tempName.replace("R","6");

        //19921144333517
        String str =" ";
        for (int i = 0; i < tempName.length()-1; i++) {
            if (tempName.charAt(i)==tempName.charAt(i+1)){
               if (str.charAt(str.length()-1)!=tempName.charAt(i+1)){
                   str+=tempName.charAt(i+1);
               }
            }else {
                if (str.charAt(str.length()-1)!=tempName.charAt(i)){
                    str+=tempName.charAt(i);
                }
            }
        }
        if (tempName.charAt(tempName.length()-1)!=str.charAt(str.length()-1)){
            str+=tempName.charAt(tempName.length()-1);
        }
        str = firstLetter+str;
       if (str.length()<4){
           for (int i = 0; i < 4-str.length(); i++) {
                str+="0";
           }
       }
        return str;
    }

    public static int findMax(int [] array){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max>array[i]){
                max= array[i];
            }
        }
        return max;
    }

//    public static int check(int [] array, int number){
//        int max = findMax(array);
//        int secondMax = findSecondMax(array);
//        if (max==number){
//            return secondMax;
//        }else {
//            return max;
//        }
//    }


}