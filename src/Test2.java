import java.util.Random;

public class Test2 {






    public static void main(String[] args) {

    }



    public static boolean isBalance(int [] array){
        boolean isBalance = false;
        if (array.length%2 == 0){
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0 , j = array.length/2; i < array.length/2; i++ ,j++) {
                sum1 = sum1 + array[i]; // sum1+=array[i]
                sum2 = sum2 + array[j];
            }
            if (sum1==sum2){
               int firstHalf = array[(array.length/2)-1];
               int lastHalf = array[array.length/2];
               if (firstHalf==lastHalf){
                   isBalance = true;
               }
            }
        }
        return isBalance;
    }

public static int [] createRandomBalancedArray(int size){
int [] array = new int[size];
        if (size%2!=0){
            return array;
        }else {
            Random random = new Random();
           do {
               for (int i = 0; i < size; i++) {
                 array[i] = random.nextInt(1,100);
               }
           }while (!isBalance(array));
        }
        return array;
}


// יש לכתוב פונקציה שמקבלת מערך של מספרים ומחזירה אחד אם זה מערך עולה
    // מחזירה 2 אם זה מערך יורד
    //אחרת 0

   public static int function(int [] array){
        final int IS_UP = 1;
        final int IS_DOWN = 2;
        final int NOT_DOWN_NO_UP = 0;
        int countUp = 1;
        int countDown = 1;
       for (int i = 0; i < array.length-1; i++) {
           if (array[i]<array[i+1]){
               countUp++;
           } else if (array[i]>array[i+1]) {
               countDown++;
           }
       }
       if (countUp == array.length){
           return IS_UP;
       } else if (countDown== array.length) {
           return IS_DOWN;
       }
       return NOT_DOWN_NO_UP;

   }


}
