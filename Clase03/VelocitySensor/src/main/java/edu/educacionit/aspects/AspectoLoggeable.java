package edu.educacionit.aspects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

/**
 * @author fmediotte
 */
@Component
@Aspect
public class AspectoLoggeable {

	@Before("@annotation(com.educacionit.annotations.Loggeable)")
	public void antesDeEjecutar(JoinPoint joinPoint) throws IOException {
		System.out.println("********************************");
		System.out.println("Justo antes de invocar al método");
		System.out.println(joinPoint.getSignature().getName());
		//String strParam = "";
		StringBuilder strParam = new StringBuilder();
		for(Object o : joinPoint.getArgs()) {
			String strJson = new Gson().toJson(o);
			System.out.println(strJson);
			//strParam += strJson.concat(strJson);
			strParam
					.append(strJson)
					.append(System.lineSeparator());
		}
		FileUtils.writeStringToFile(
				new File("./tickets/unico.txt"),
				strParam.toString(), 
				"UTF-8",
				true);
		
		System.out.println("********************************");


	}
}
