public class Main {
       static int a;
    public static void main(String[] args) {

     //   int a;

        String dog;
        Dog dog1;
        System.out.println(a);



        String cat = "Katty";
        String cat1 = new String("Katty");
        String cat2 = "Katty";
        System.out.println(cat==cat1);//false
        System.out.println(cat==cat2);//true

        System.out.println(cat.concat(" ").concat(cat2));

        // 0 1 2 3 4
        // D a n i l
        String danil = "Danil";
        danil = "Evgeny";
        System.out.println(danil.charAt(0));
    //    System.out.println(danil.charAt(-1));

        System.out.println(danil.charAt(4));

        int lastIndex = danil.length()-1;
        System.out.println(danil.charAt(lastIndex));

        // toUpperCase()
        String evgeny = "Evgeny";
        String evgenyUpper = evgeny.toUpperCase();
        System.out.println(evgenyUpper);

        //toLowerCase()
        System.out.println(evgenyUpper.toLowerCase());

        //String valueOf()
        int number = 20;
        String twenty = String.valueOf(number);
        System.out.println(twenty);

        //substring() - используется для получения части строки
        //0 1 2 3 4 5 6 7 8
        //A l e n u s h k a
        String alenushka = "Alenushka";
        System.out.println(alenushka.substring(5));
        System.out.println(alenushka);
        System.out.println(alenushka.substring(1,4));
      //  System.out.println(alenushka.substring(4,1));

        //trim()
        String  untidy = new String( "     How are you ?             ");
        System.out.println("String before trim: "+untidy);
        System.out.println("String after trim:"+untidy.trim());

        // 1.Написать метод, возвращающий первые два символа строки  в верхнем регистре
        // ( Hello -> He)
        //


        // 2.Написать метод, переставляющий первую букву в конец строки.
        // abcd -> bcda

        // 3. Написать метод, удаляющий символ из строки на определенной позиции и
        // возвращающий получившуюся строку
        // public static String  removeChar ( String s, int pos)
        // John -> Jon
        System.out.println(twoCapitalLetters("Hello"));

        String strNumber = "1234";
        int num = Integer.parseInt(strNumber);
        System.out.println(num+1);
    }

    // 1.Написать метод, возвращающий первые два символа строки  в верхнем регистре
    // ( H e l l o -> He)
    //   0 1 2 3 4
    public static  String twoCapitalLetters(String word){
        String subWord = word.substring(0,2); //he
        String subWordToUpper =subWord.toUpperCase();//HE
        return subWordToUpper;
       // return word.substring(0,2).toUpperCase();
    }
}
