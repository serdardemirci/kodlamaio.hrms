package com.serdardemirci.hrms.adapter.concretes;

import com.serdardemirci.hrms.adapter.abstracts.ValidatePersonService;
import com.serdardemirci.hrms.entities.concretes.Individual;
import com.serdardemirci.hrms.mernisService.KAWKPSPublicSoap;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service("mernis")
public class ValidatePersonManagerAdapter implements ValidatePersonService {


    private KAWKPSPublicSoap kawkpsPublicSoap = new KAWKPSPublicSoap();

    @Override
    public boolean validate(Individual individual) {

        try {
            return this.kawkpsPublicSoap.TCKimlikNoDogrula(
                    Long.parseLong(individual.getNationalIdentity()),
                    individual.getFirstName().toUpperCase(new Locale("tr", "TR")),
                    individual.getLastName().toUpperCase(new Locale("tr", "TR")),
                    individual.getDateOfBirth().getYear());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
