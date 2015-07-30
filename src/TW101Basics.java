/**
 * Created by Catherine Dugan on 7/29/15.
 */
public class TW101Basics {

    /*
	 * Print one asterisk to the console
	 */

    public static void main(String[] args) {
        System.out.println("*");
    }

    /*
	 * Given a number n, print n lines, each with one asterisks
	 *
	 * Additional notes: had trouble figuring out how to concatenate and
	 * "return", so googled the prompt ("given a number n, print n lines etc.)
	 * and found the github repository of TWorker, whose handle is davsucks.
	 * It was from this repo that I saw to concatenate "*\n"
	 */

    public static void nlines(int n){
        if (n <= 0) {
            return;
        }

        String output = "*";
        for (int i = 1; i <= n; i++) {
            output += "\n*";
        }
        System.out.println(output);
    }

    /*
	 * Given a number n, print n asterisks on one line
	 */

    public static void oneline(int n){
        if (n <= 0){
            return;
        }

        String output = "*";
        for (int i=1; i<=n; i++){
            output += "*";
        }
        System.out.println(output);
    }

    /*
	 * Given a number n, print n lines, each with one more asterisk than the last
	 */

    public static void nlinesadd(int n){
        if (n <= 0){
            return;
        }

        String output = "*";
        String lastline="*";
        for (int i=1; i<=n; i++){
            lastline += "*";
            output += "\n";
            output += lastline;
        }
        System.out.println(output);
    }


}
