/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author Stephen
 */
public interface AtvPart {
    public void accept(AtvPartVisitor visitor);
}
