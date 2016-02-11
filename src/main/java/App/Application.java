package App;

import ca.uhn.fhir.context.FhirContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by kraigt on 2/11/2016.
 */
@SpringBootApplication
public class Application {
    FhirContext ctx = FhirContext.forDstu2();
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
