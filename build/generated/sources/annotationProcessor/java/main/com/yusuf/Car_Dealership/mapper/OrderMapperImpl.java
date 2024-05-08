package com.yusuf.Car_Dealership.mapper;

import com.yusuf.Car_Dealership.dto.request.OrderRequestDto;
import com.yusuf.Car_Dealership.entity.Order;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-08T23:16:58+0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.7.jar, environment: Java 21.0.2 (Eclipse Adoptium)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order fromOrderRequestToOrder(OrderRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Order.OrderBuilder<?, ?> order = Order.builder();

        order.carCode( dto.getCarCode() );
        order.carType( dto.getCarType() );
        order.transactedAmount( dto.getTransactedAmount() );

        return order.build();
    }
}
