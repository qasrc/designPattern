package strategy1;

/**
 * @author zhan
 * Created on 2018/01/12  9:09
 */
public class PriceCalculateFactory {

    public static PriceCalculate getPriceCalculte(String type) {
        PriceCalculate priceCalculate;
        switch (type) {
            case "stand":
                priceCalculate = new StandPrice();
                break;
            case "fifty":
                priceCalculate = new FiftyPrice();
                break;
            case "eight":
                priceCalculate = new EightPrice();
                break;
            case "minus":
                priceCalculate = new PriceMinus(200.00, 100.00);
                break;
            default:
                priceCalculate = new StandPrice();
                break;
        }
        return priceCalculate;
    }
}
