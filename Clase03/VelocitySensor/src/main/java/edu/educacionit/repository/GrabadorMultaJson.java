package edu.educacionit.repository;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;

import edu.educacionit.model.Ticket;

/**
 * @author fmediotte
 *
 */
@Repository("GrabadorJson")
public class GrabadorMultaJson implements GrabadorMulta {

	@Value("${pathTickets}")
	private String pathTickets;
	
	@Override
	public void grabar(Ticket t) {
		System.out.println("Grabando ticket en formato JSON");
		
		try {
			String nomArch = String.join("", pathTickets, t.getIdTicket(), ".json");
			File arch = new File(nomArch);
			Gson gson = new Gson();
			String strJson = gson.toJson(t);
			System.out.println("data: " + strJson);
			FileUtils.writeStringToFile(arch, strJson, "UTF-8");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
}
