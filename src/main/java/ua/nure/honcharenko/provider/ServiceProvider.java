package ua.nure.honcharenko.provider;

import ua.nure.honcharenko.service.FacultyWebService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class ServiceProvider {

    private static ServiceProvider serviceProvider;

    public static ServiceProvider getInstance() {
        if( serviceProvider == null) {
            serviceProvider = new ServiceProvider();
        }
        return serviceProvider;
    }

    public FacultyWebService getFacultyWebService()  {
        try {
            URL url = new URL("http://localhost:9000/faculty?wsdl");
            QName qname = new QName("http://nure.ua/honcharenkoilchishen/service",
                    "Faculties");

            Service service = Service.create(url, qname);

            return service.getPort(new QName("http://nure.ua/honcharenkoilchishen/service",
                    "FacultyPort"), FacultyWebService.class);
        } catch (Exception e){}
        return null;
    }
}
