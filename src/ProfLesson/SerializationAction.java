package ProfLesson;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class SerializationAction {
    public static <T> void writeToXML(T obj){
        try {

            File file = new File( obj.getClass().getName() +".xml" );
            JAXBContext jaxbContext = JAXBContext.newInstance(obj.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(obj, file);
            jaxbMarshaller.marshal(obj, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }



    }

    public static <T> T readFromXML(Class<T> tClass){
        T obj = null;
        try {
            File file = new File(tClass.getName() + ".xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(tClass);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            obj = (T) jaxbUnmarshaller.unmarshal(file);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
