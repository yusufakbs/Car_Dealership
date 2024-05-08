package com.yusuf.Car_Dealership.mapper;

import com.yusuf.Car_Dealership.dto.request.OrderRequestDto;
import com.yusuf.Car_Dealership.entity.Address;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-08T23:16:58+0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.7.jar, environment: Java 21.0.2 (Eclipse Adoptium)"
)
@Component
public class AddressMapperImpl implements AddressMapper {

    @Override
    public Address fromOrderRequestToAddress(OrderRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Address.AddressBuilder<?, ?> address = Address.builder();

        address.street( dto.getStreet() );
        address.city( dto.getCity() );
        address.apartmentNo( dto.getApartmentNo() );
        address.postalCode( dto.getPostalCode() );

        return address.build();
    }
}
