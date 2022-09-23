public class Vowels {

    public static int getCount(String str) {
        int contador = 0;
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                contador++;
            }
        }
        return contador;
    }

}