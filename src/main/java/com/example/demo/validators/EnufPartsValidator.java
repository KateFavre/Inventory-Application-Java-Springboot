package com.example.demo.validators;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 *
 *
 *
 */
public class EnufPartsValidator implements ConstraintValidator<ValidEnufParts, Product> {
    @Autowired
    private ApplicationContext context;
    public static ApplicationContext myContext;

    @Override
    public void initialize(ValidEnufParts constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Product product, ConstraintValidatorContext constraintValidatorContext) {
        if (context == null) return true;
        if (myContext == null) myContext = context;
        ProductService repo = myContext.getBean(ProductServiceImpl.class);
        if (product.getId() != 0) {
            Product myProduct = repo.findById((int) product.getId());
            for (Part p : myProduct.getParts()) {
                if (p.getInv() < (product.getInv() - myProduct.getInv())) {
                    constraintValidatorContext.disableDefaultConstraintViolation();
                    constraintValidatorContext.buildConstraintViolationWithTemplate("Not enough part inventory for " + product.getName()).addConstraintViolation();
                    return false;
                }

                int r1 = p.getInv() - p.getMinInv(); /*max num of products that can be made without going below min*/
                int r2 =  product.getInv() - myProduct.getInv(); /*new product inventory*/
                if (r2 > r1){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
