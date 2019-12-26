package addl.lion.training.service.soap;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import addl.lion.training.soap.wsdl.GetVersionRequest;
import addl.lion.training.soap.wsdl.GetVersionResponse;
import addl.lion.training.soap.wsdl.ObjectFactory;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class WSFindingService {
	
	private static final String URL_SERVICE = "http://developer.ebay.com/webservices/finding/latest/FindingService.wsdl";

	@Autowired
	private WebServiceTemplate webServiceTemplate;
	
	public String getVersion() {
		log.info("Calling version");
		GetVersionRequest req = new GetVersionRequest();
		JAXBElement<GetVersionRequest> oreq = new ObjectFactory().createGetVersionRequest(req);
		
		
		GetVersionResponse response = (GetVersionResponse) webServiceTemplate.marshalSendAndReceive(WSFindingService.URL_SERVICE, oreq);
		String version = response.getVersion();
		System.out.println("Response: " + version);
		return version;
	}

}
