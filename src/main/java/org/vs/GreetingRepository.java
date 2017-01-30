package org.vs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class GreetingRepository {

    Logger LOG = LoggerFactory.getLogger(GreetingRepository.class);
            
    private HashMap<String, String> map = new HashMap<>();

    public GreetingRepository() {
        map.put("Vishal", "Vishal Sinha");
        map.put("Nishant", "Nishant Varshney");
        map.put("Rajat", "Rajat Sharma");
        map.put("World", "Worrrrrld");
    }

    @Cacheable("names")
    public String getFullName(String firstName) {
        LOG.info("got request for:" + firstName);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String fullName = map.get(firstName);
        LOG.info("returning full name:" + fullName + " for name:" + firstName);

        return fullName;
    }
    
}
