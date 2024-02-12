import com.engeto.ja.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;

import static java.math.BigDecimal.valueOf;

public class Main {
    public static void main(String[] args) {
        Employee employee1 =
                new Employee("Franta Vopršálek",
                        LocalDate.of(1987,1,13),
                        9,
                        90,
                        "Brno",
                        "9H97903",
                        5,
                        "844.785.444.777");



        Employee employee2 =
                new Employee ("Marta Karafa",
                        LocalDate.of(1966,2,27),
                        5,
                        50,
                        "Kroměříž",
                        "8B76823",
                        7,
                        "541.655.1.198");


        Employee employee3 =
                new Employee ("Josef Vydra",
                        LocalDate.of(1990,4,9),
                        15,
                        150,
                        "Praha",
                        "4A89999",
                        9,
                        "123.354.987.624");

        Employee employee4 =
                new Employee("Pavel Pancíř",
                        LocalDate.of(1986,9,14),
                        2,20,
                        "Jihlava",
                        "3B36565",
                        6,
                        "354.654.652.145");




        employee1.setName("Franta Vopršálek");
        System.out.println(employee1.getName());





    }
}

