package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (outsourcedPartRepository.count() == 0) {
            OutsourcedPart strings = new OutsourcedPart();
            strings.setCompanyName("Guitar Shop");
            strings.setName("Guitar Strings");
            strings.setInv(40);
            strings.setPrice(10.0);
            strings.setId(100L);

            OutsourcedPart headstock = new OutsourcedPart();
            headstock.setCompanyName("Guitar Shop");
            headstock.setName("Headstock");
            headstock.setInv(15);
            headstock.setPrice(40.0);
            headstock.setId(101L);

            OutsourcedPart body = new OutsourcedPart();
            body.setCompanyName("Guitar Shop");
            body.setName("body");
            body.setInv(30);
            body.setPrice(60.0);
            body.setId(102L);

            OutsourcedPart tuningPegs = new OutsourcedPart();
            tuningPegs.setCompanyName("Guitar Shop");
            tuningPegs.setName("Tuning Pegs");
            tuningPegs.setInv(50);
            tuningPegs.setPrice(40.0);
            tuningPegs.setId(103L);

            OutsourcedPart guitarKnobs = new OutsourcedPart();
            guitarKnobs.setCompanyName("Guitar Shop");
            guitarKnobs.setName("Guitar Knobs");
            guitarKnobs.setInv(50);
            guitarKnobs.setPrice(30.0);
            guitarKnobs.setId(104L);


            outsourcedPartRepository.save(strings);
            outsourcedPartRepository.save(headstock);
            outsourcedPartRepository.save(body);
            outsourcedPartRepository.save(tuningPegs);
            outsourcedPartRepository.save(guitarKnobs);
        }
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());


        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        if (productRepository.count() == 0) {
            Product acoustic = new Product("Acoustic", 150.0, 15);
            Product nylonAcoustic = new Product("Nylon String Acoustic", 175.0, 15);
            Product flyingVElectric = new Product("Flying V Electric", 375.0, 15);
            Product gibsonElectric = new Product("Gibson Electric", 575.0, 15);
            Product stratocasterElectric = new Product("Stratocaster Electric", 475.0, 15);
            productRepository.save(acoustic);
            productRepository.save(nylonAcoustic);
            productRepository.save(flyingVElectric);
            productRepository.save(gibsonElectric);
            productRepository.save(stratocasterElectric);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
