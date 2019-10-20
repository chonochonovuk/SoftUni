public class Test {
    public static void main(String[] args) {

        String name = "Sofia";
        double consunant = 0;
        double vowel = 0;

        for (char c: name.toCharArray()
        ) {
            if ("aeiouAEIOU".indexOf(c) >= 0){
                vowel += c*5;
            }else {
                consunant += c/5;
            }
        }

        System.out.println(vowel);
        System.out.println(consunant);


        double maths = vowel + consunant;

        System.out.printf("%.0f%n", maths);;
    }
}
