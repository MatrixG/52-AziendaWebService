package it.alfasoft.alex.serverWebService;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import it.alfasoft.alex.model.BustaPaga;
import it.alfasoft.service.BustaPagaService;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class Resource {

	BustaPagaService service = new BustaPagaService();

	public Resource() {

	}

	@Path("/listaBuste")
	@GET
	public List<BustaPaga> getBuste() {
		return new ArrayList<>(service.getBustePaga());
	}

}
