public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 2_000;
        int freeMiles = service.calculate(price);
        System.out.println(freeMiles);
    }
}
