import java.time.LocalDate;

public class Meat extends Material {
    private double weight;


    public Meat(String id, String name, int cost, LocalDate manufacturingDate) {
        super(id, name, cost, manufacturingDate);
    }

    public Meat(String id, String name, int cost, LocalDate manufacturingDate, double weight) {
        super(id, name, cost, manufacturingDate);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public LocalDate getExpiryDate(){
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public double getAmount() {
        return weight*this.getCost();
    }

    @Override
    public LocalDate getManufacturingDate() {
        return this.getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        LocalDate now = LocalDate.now();
        LocalDate ex = this.getExpiryDate();
        if(now.isAfter(ex) && (now.isAfter(ex.minusDays(3))
                ||
                now.isEqual(ex.minusDays(3)))) {
            return getAmount() * 0.5;
        }else
        if ( now.isBefore(ex) && (now.isAfter(ex.minusDays(5))
                || now.isEqual(ex.minusDays(5))))
        return getAmount()*0.7;
       else
        return getAmount()*0.9;

}}

