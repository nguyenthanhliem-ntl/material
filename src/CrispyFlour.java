import java.time.LocalDate;

public  class CrispyFlour extends Material implements Comparable<CrispyFlour>  {
    private int quantity;

    public CrispyFlour(String id, String name, int cost, LocalDate manufacturingDate, int quantity) {
        super(id, name, cost, manufacturingDate);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpiryDate(){
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public double getAmount() {
        return quantity * this.getCost();
    }

    @Override
    public String toString() {
        return getName()+getCost();
    }

    @Override
    public double getRealMoney() {
        LocalDate now = LocalDate.now();
        LocalDate ex = this.getExpiryDate();
        if (now.isAfter(ex)) return 0;
        else
        if (now.isBefore(ex)&&
                (now.isAfter(ex.minusMonths(2))
                        ||
                        now.isEqual(ex.minusMonths(2))))
            return getAmount()*0.6;
        else
        if(now.isBefore(ex)&&
                (now.isAfter(ex.minusMonths(4))
                        ||
                        now.isEqual(ex.minusMonths(4))))
            return getAmount()*0.8;
        else return getAmount()*0.95;
    }

    @Override
    public int compareTo(CrispyFlour o) {
        if (this.getCost() >o.getCost())
            return 1;
        else if(this.getCost() == o.getCost())
            return 0;
        else  return -1;
    }
}
