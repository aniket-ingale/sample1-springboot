package sample1springboot;

import com.anix.ShippingAddress;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello(){
        String returnVal = "";
        ShippingAddress address = new ShippingAddress();
        address.setPostOfficeBox("123456");
        address.setExtendedAddress("1234 Main Street");
        address.setStreetAddress("456 Main Street");
        address.setLocality("Brampton");
        address.setRegion("Peel");
        address.setPostalCode("A1B 2C3");
        address.setCountryName("Canada");
        returnVal = address.toString();

        return returnVal;
    }
}
