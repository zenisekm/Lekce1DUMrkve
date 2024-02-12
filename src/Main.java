import com.engeto.ja.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee employee1 =
                new Employee("Franta Vopršálek",
                        LocalDate.of(1987,1,13),
                        9,90,
                        "Brno", "9H97903", 5,
                        844.785.444.777);






        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.setName("Franta Vopršálek");
        System.out.println(employee1.getName());




    }
}

