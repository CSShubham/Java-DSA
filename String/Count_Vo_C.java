package String;

public class Count_Vo_C {
    public static void main(String[] args) {
        String str3 = "SHubham Raj";
        int vowels = 0, consonants = 0;

        for (int i = 0; i < str3.length(); i++) {

            if ("AEIOUaeiou".contains(String.valueOf(str3.charAt(i)))) {
                vowels++;
            } else if ((str3.charAt(i) >= 'a' && str3.charAt(i) <= 'z')|| (str3.charAt(i) >= 'A' && str3.charAt(i) <= 'Z')) {
                consonants++;
            }
        }
        System.out.println("no. of vowels: "+vowels+"\nNo. of Consonants: "+consonants);
    }

}
