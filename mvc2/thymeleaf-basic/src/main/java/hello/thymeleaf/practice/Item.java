package hello.thymeleaf.practice;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {

    private String itemName;

    private int price;

}
