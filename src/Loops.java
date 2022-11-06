    public class Loops {

        public static void main(String[] args) {

            int x = 99;
            while (x>0) {
                System.out.println(x + " bottles of beer on the wall, " + x + " bottles of beer.");
                x = x - 1;
                System.out.println("Take one down, pass it around. " + x + " bottles of beer on the wall");
                System.out.println();
            }
        }
    }
