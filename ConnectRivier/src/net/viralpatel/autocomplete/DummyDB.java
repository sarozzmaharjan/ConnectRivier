package net.viralpatel.autocomplete;
 
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.connectrivier.db.dao.ReferenceDao;
import com.connectrivier.db.dao.ReferenceDaoImpl;
 
public class DummyDB {
    private int totalCountries;
    private String data = "David Gilmour, Jack Johnson, John Smith, Mark White, Nibha Shrestha, Saru Maharjan, Saroj Maharjan, San Singh, Roger Waters ";
    private List<String> countries;
    public DummyDB() {
    	//getListofFirstNames();
        countries = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(data, ",");
         
        while(st.hasMoreTokens()) {
            countries.add(st.nextToken().trim());
        }
        totalCountries = countries.size();
    }
     
    public List<String> getData(String query) {
    	//getListofFirstNames();
        String country = null;
        query = query.toLowerCase();
        List<String> matched = new ArrayList<String>();
        for(int i=0; i<totalCountries; i++) {
            country = countries.get(i).toLowerCase();
            if(country.startsWith(query)) {
                matched.add(countries.get(i));
            }
        }
        return matched;
    }
    

}