package packA;

public enum MemberTypeWithDiscount {
    NONE(0.0, 0.0), SILVER(0.5, 0.5), GOLD(1.0, 2.0), PREMIUM(3.0, 4.5);
    private MemberTypeWithDiscount(Double productDiscountRate , Double serviceDiscountRate){
        this.productDiscountRate = productDiscountRate;
        this.serviceDiscountRate = serviceDiscountRate;
    }
    private double productDiscountRate;
    private double serviceDiscountRate;
    public double getpro() {
        return productDiscountRate;
    }
    public double getser() {
        return serviceDiscountRate;
    }
}
