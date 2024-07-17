public class SimpleStartup {

    private int[] locationCells;
    private int numOfhits = 0;

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourself(int guess) {
        String result = "miss";

        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfhits++;
                break;
            }
        }

        if (numOfhits == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);
        return  result;
    }
}
