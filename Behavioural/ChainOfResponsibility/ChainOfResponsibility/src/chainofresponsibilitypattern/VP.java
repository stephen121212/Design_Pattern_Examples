/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibilitypattern;

/**
 *
 * @author Stephen
 */
class VP extends Handler{
        public void handleRequest(Request request){
        if(request.getRequestType() == RequestType.PURCHASE){
            if(request.getAmount()<1500)
            {
                System.out.println("VPs can approve purchases below 1500");
            }
        else{
            successor.handleRequest(request);
                }
            }
        }
}
