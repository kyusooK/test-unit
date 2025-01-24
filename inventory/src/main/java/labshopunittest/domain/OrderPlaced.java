package labshopunittest.domain;

import java.util.*;
import labshopunittest.domain.*;
import labshopunittest.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;
    private String productName;
}
