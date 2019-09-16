/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

import java.util.List;

/**
 *
 * @author Stephen
 */
public class PrintFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append(header);
        builder.append("\n");
        
        for(Detail detail : details){
            builder.append(detail.getLabel());
            builder.append(":");
            builder.append(detail.getValue());
            builder.append("\n");
        }
        return builder.toString();
    } 
}
