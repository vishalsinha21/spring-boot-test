package org.vs;

import io.spring.guides.gs_producing_web_service.Country;
import io.spring.guides.gs_producing_web_service.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class CountryRepository {
    private static final List<Country> countries = new ArrayList<Country>();

    @PostConstruct
    public void initData() {
        Country spain = getCountry("Spain", "Madrid", Currency.EUR, 46704314);
        Country poland = getCountry("Poland", "Warsaw", Currency.PLN, 38186860);
        Country uk = getCountry("United Kingdom", "London", Currency.GBP, 63705000);

        countries.add(spain);
        countries.add(poland);
        countries.add(uk);
    }

    public Country findCountry(String name) {
        Assert.notNull(name);
        return countries.stream()
                .filter(c -> name.equals(c.getName()))
                .findFirst()
                .orElse(null);
    }

    private Country getCountry(String name, String capital, Currency currency, int population) {
        Country country = new Country();
        country.setName(name);
        country.setCapital(capital);
        country.setCurrency(currency);
        country.setPopulation(population);
        return country;
    }
}
