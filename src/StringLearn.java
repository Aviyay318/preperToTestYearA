public class StringLearn {

    public static void main(String[] args) {
        String str1 = "abcba";
        String str2="Race. ,car";
        str2 = str2.toLowerCase(); //"race. ,car"
       String onlyLetters="";
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i)>='a' && str2.charAt(i)<='z'){
                onlyLetters+=str2.charAt(i);
            }
        }


    }
public static String onlyLettersStr(String str){
    str = str.toLowerCase(); //"race. ,car"
    String onlyLetters="";
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i)>='a' && str.charAt(i)<='z'){
            onlyLetters+=str.charAt(i);
        }
    }
    return onlyLetters;
}

    public static boolean isPolindrom1b(String str){
        boolean isPolindrom = false;
        int counter = 0;
        for (int i = 0, j=str.length()-1; i < str.length()/2 ; i++,j--) {
            if (str.charAt(i) == str.charAt(j)){
               counter++;
            }
        }
        if (counter==str.length()/2){
            isPolindrom = true;
        }
        return isPolindrom;
    }

    public static boolean isPolindrom1(String str){
        str = onlyLettersStr(str);
        boolean isPolindrom = true;
        for (int i = 0, j=str.length()-1; i < str.length()/2 ; i++,j--) {
            if (str.charAt(i) != str.charAt(j)){
                isPolindrom  = false;
                break;
            }
        }
        return isPolindrom;
    }

    public static boolean isPolindrom2(String str){
        str = onlyLettersStr(str);
        String reversStr ="";
        boolean isPolindrom = false;
        for (int i = str.length()-1 ; i>=0 ;i--){
            reversStr+=str.charAt(i);
        }
        if (str.equals(reversStr)){
            isPolindrom = true;
        }
        return isPolindrom;
    }


      //"I want it , I got it " => iwg
     //split => [I, want ,it , I ,got, it]
    //str = > Iwg
    public static String getFirstLettersInStr(String str){
        String [] strArray = str.split(" ");
        String firstLetters=""; //"Iw"
        for (int i = 0; i < strArray.length; i++) {
            String strUpperCase = strArray[i].charAt(0)+"".toUpperCase();
            String strLowerCase = strArray[i].charAt(0)+"".toLowerCase();
            if (!firstLetters.contains(strLowerCase) && !firstLetters.contains(strUpperCase)){
                firstLetters+=strArray[i].charAt(0);
            }
        }
        return firstLetters;
    }
}
