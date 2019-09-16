/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author Stephen
 */
public class TurnOnAllLightsCommand implements Command {
    private Mediator med;
    
    public TurnOnAllLightsCommand(Mediator med){
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOnAllLights();
    }  
}
