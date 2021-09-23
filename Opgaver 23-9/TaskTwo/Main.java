class Main {
    public static boolean happy = true;

    public static void main(String[] args) {
        if (iAmHappy()) {
            System.out.println("I clap my hands");
        } else {
            System.out.println("I don't clap my hands");
        }
    }
    public static boolean iAmHappy() {
        if (happy==true){
        return true;   
} else {
    return false;
}
}
//2c
public static String upperCase(String String) {

return String.toUpperCase();
}

//2d
public static boolean firstLetterUpper(String String) {
    return Character.isUpperCase(String.charAt(0));
}

}