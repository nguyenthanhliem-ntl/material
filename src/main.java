
import java.time.LocalDate;
import java.util.Arrays;

public class main {

    private static CrispyFlour botNgo;
    private static CrispyFlour botGao;

    public static void main(String[] args) {
        Material[] materials = getMaterials();
        manager long1 = new manager(materials);
        long1.setMaterials(materials);
//        Arrays.sort(materials);
        System.out.println(long1.getMaterials());
        System.out.print(long1.getAllAmount());
    }

    private static Material[] getMaterials() {
        botNgo = new CrispyFlour("lo0", "lo", 1, LocalDate.of(2020, 6, 14), 5);
        botGao = new CrispyFlour("lo1", "lo", 1, LocalDate.of(2020, 6, 14), 5);
        CrispyFlour a3 = new CrispyFlour("lo2", "lo", 1, LocalDate.of(2020, 6, 14), 5);
        CrispyFlour a4 = new CrispyFlour("lo3", "lo", 1, LocalDate.of(2020, 6, 14), 5);
        CrispyFlour a5 = new CrispyFlour("lo4", "lo", 1, LocalDate.of(2020, 6, 14), 5);

        Meat s1 = new Meat("ds1","k1",12,LocalDate.of(2020,4,14),5);
        Meat s2 = new Meat("ds2","kq",12,LocalDate.of(2020,4,14),5);
        Meat s3 = new Meat("ds3","kw",12,LocalDate.of(2020,4,14),5);
        Meat s4 = new Meat("ds4","ke",12,LocalDate.of(2020,4,14),5);
        Meat s5 = new Meat("ds5","kr",12,LocalDate.of(2020,4,14),5);
        Material[] materials = {botNgo, botGao,a3,a4,a5,s1,s2,s3,s4,s5};
        return materials;

    }
}