public class string_methods_14 {
    public static void main (String args[]){
        String name = "Manmath";
        System.out.println(name);
        int main = name.length();
        System.out.println(main);


        String lstring = name.toLowerCase();
        System.out.println(lstring);
        // to print string in small letter
        String ustring = name.toUpperCase();
        System.out.println(ustring);
       // to print string in capital letter

        String nonTrimmedString = "      manmath    ";
        System.out.println(nonTrimmedString);
        // space same rakhta hai

         String trimmedString = "  manmath  ";
        System.out.println(trimmedString);
        //space nikal deta hai

        System.out.println(name.substring(3));
        System.out.println(name.substring(1,4));
        System.out.println(name.replace('m','a'));
        System.out.println(name.replace("t","p"));
        System.out.println(name.startsWith("man"));
        System.out.println(name.endsWith("th"));

        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("a"));
        // first index shows

        String modifiedName = "mannmathh";
        System.out.println(modifiedName.indexOf("ath"));
        //frm which no.string starts
        System.out.println(modifiedName.indexOf("at",3));
        System.out.println(modifiedName.lastIndexOf("ma",2));
        System.out.println(modifiedName.equals("manmath"));
        // name eqaul hai ya nahi
        System.out.println(modifiedName.equalsIgnoreCase("mAnth"));

        System.out.println("I am ecape sequence \" double quote");

    }
}
