package com.serdardemirci.hrms.adapter.concretes;

import com.serdardemirci.hrms.adapter.abstracts.ValidatePersonService;
import com.serdardemirci.hrms.entities.concretes.Person;
import com.serdardemirci.hrms.mernisService.KAWKPSPublicSoap;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class ValidatePersonManagerAdapter implements ValidatePersonService {


    private KAWKPSPublicSoap kawkpsPublicSoap = new KAWKPSPublicSoap();

    @Override
    public boolean validate(Person person) {

        try {
            return this.kawkpsPublicSoap.TCKimlikNoDogrula(
                    Long.parseLong(person.getNationalIdentity()),
                    person.getFirstName().toUpperCase(new Locale("tr", "TR")),
                    person.getLastName().toUpperCase(new Locale("tr", "TR")),
                    person.getDateOfBirth().getYear());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
