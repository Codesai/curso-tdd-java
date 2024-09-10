package problematic_discount;

public class Discount {
    private final MarketingCampaign marketingCampaign;

    public Discount() {
        marketingCampaign = new MarketingCampaign();
    }

    public Money discountFor(Money netPrice) {
        if (marketingCampaign.isCrazySalesDay()) {
            return netPrice.reduceBy(15);
        }
        if (netPrice.moreThan(Money.oneThousand())) {
            return netPrice.reduceBy(10);
        }

        if (netPrice.moreThan(Money.oneHundred()) && marketingCampaign.isActive()) {
            return netPrice.reduceBy(5);
        }
        return netPrice;
    }
}
