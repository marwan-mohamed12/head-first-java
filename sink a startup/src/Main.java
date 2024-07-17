public class Main {
    public static void main(String[] args) {
//        SimpleStartup startup = new SimpleStartup();
//
//        int[] locations = {2,3,4};
//        startup.setLocationCells(locations);
//
//        int userGuess = 2;
//        String result = startup.checkYourself(userGuess);
//
//        String testResult = "failed";
//        if (result.equals("hit")) {
//            testResult = "passed";
//        }
//
//        System.out.println(testResult);

        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleStartup theStartup = new SimpleStartup();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        theStartup.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive) {

            int guess = helper.getUserInput("Enter a number");
            String result = theStartup.checkYourself(guess);

            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }

        }


    }
}