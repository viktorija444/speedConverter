public class TeenNumberChecker {

    public static boolean hasTeen(int teen1, int teen2, int teen3) {

        if (13 >= teen1 && teen1 <= 19 || 13 >= teen2 && teen2 <= 19) {
            return true;
        } else if (teen3 <= 12 && teen3 >= 20) {
            return false;
        }
        return false;
    }
}