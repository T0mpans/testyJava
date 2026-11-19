public class Szyfr {
    public static String szyfrujCezarem(String slowoDozaszyfrowanie, int klucz){
        klucz = klucz %26;
        String zaszyfrowaneSlowo = "";
        for (int i = 0; i < slowoDozaszyfrowanie.length(); i++) {
            char litera = slowoDozaszyfrowanie.charAt(i);
            if (litera == ' '){
                zaszyfrowaneSlowo = zaszyfrowaneSlowo + litera;
            }else{
                int kod = (int)litera +klucz;
                if (kod>(int)'z'){
                    kod = kod - 26;
                }
                if (kod < (int)'a'){
                    kod = kod+26;
                }
                zaszyfrowaneSlowo = zaszyfrowaneSlowo+(char)kod;
            }

        }
        return  zaszyfrowaneSlowo;
    }
}
