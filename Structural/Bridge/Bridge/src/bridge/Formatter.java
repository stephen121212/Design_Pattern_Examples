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
public interface Formatter {
    String format(String header, List<Detail> details);
}
