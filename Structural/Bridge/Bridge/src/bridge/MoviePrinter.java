/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Stephen
 */
public class MoviePrinter extends Printer {

    private Movie movie;
    
    public MoviePrinter(Movie movie){
        this.movie = movie;
    }
    
    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();
        
        details.add(new Detail("Title", movie.getTitle()));
        details.add(new Detail("Year", movie.getYear()));
        details.add(new Detail("Runtime", movie.getRuntime()));
        
        return details;
    }

    @Override
    protected String getHeader() {
        return movie.getClassification();
    }
}
