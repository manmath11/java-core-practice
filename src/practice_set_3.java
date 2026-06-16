public class practice_set_3 {
    public static void main(String[] args) {
        // problem
        String name = "manmath";
        name = name.toLowerCase();
        System.out.println(name);

        //problem 2
        String text = "to lower Case";
        text = text.replace(" ", "_");
        System.out.println(text);

        //problem 3
        String letter = "Dear <|name|> , thanks a lot ";
        letter = letter.replace("<|name|>","manmath");
        System.out.println(letter);

        // problem 4
        String myString = "this String contains  double and tripple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //problem 5
        String myletter = "Dear manmath ,\nnice to meet you.\nthanks";
        System.out.println(myletter);


    }
}
