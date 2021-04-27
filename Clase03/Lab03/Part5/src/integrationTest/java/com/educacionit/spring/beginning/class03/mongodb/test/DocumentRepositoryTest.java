

package com.educacionit.spring.beginning.class03.mongodb.test;



import com.educacionit.spring.beginning.class03.mongodb.entities.Document;
import com.educacionit.spring.beginning.class03.mongodb.repositories.IDocumentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertNotNull;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RunWith (SpringJUnit4ClassRunner.class)
@SpringBootTest (webEnvironment = SpringBootTest.WebEnvironment.NONE , classes = MongodbConfiguration.class)
public class DocumentRepositoryTest {



    @Autowired
    private IDocumentRepository repository = null;



    private final Logger logger = LoggerFactory.getLogger (DocumentRepositoryTest.class);



    @Test
    public void testCreate () {


        Document d = new Document();
        d.setName("Raul Peña");
        d.setAddress ("Argentina");
        d.setNumber (123456789);

        this.repository.save (d);
        logger.debug (d.toString ());
        assertNotNull ("Document is null !!!", d.getId ());
    }
}