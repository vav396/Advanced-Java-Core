package Certain_types_of_objects;

import java.math.BigDecimal;

public record Product(String name,
                      Category category,
                      BigDecimal price,
                      Integer stock ) { }
