package edu.educacionit.services;

import java.io.File;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;

import edu.educacionit.model.Ticket;
import edu.educacionit.repository.GrabadorMulta;

/**
 * @author fmediotte
 *
 */
public class GrabadorMultaJson implements GrabadorMulta {

	@Override
	public void grabar(Ticket t) {
		System.out.println("Grabando ticket en formato JSON");
		
		try {
			String nomArch = String.join("", "/tickets/", t.getIdTicket(), ".json");
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
