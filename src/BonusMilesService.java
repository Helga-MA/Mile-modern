public class BonusMilesService {
    public int calculate(int price) {
        int mile = 20;
        int freeMiles = price / mile;
        return freeMiles;
    }

}
