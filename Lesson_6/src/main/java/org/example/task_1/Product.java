package org.example.task_1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Product extends Warehouse{
    private Integer id;
    private String productName;
    private Integer quantity;
    private Double price;
}
