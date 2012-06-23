package net2Bit;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.event.*;
import org.zkoss.zul.*;



public class LoginViewCtrl extends SelectorComposer<Window> {
    
    @Wire
    private Textbox nameTxb, passwordTxb;
     
    @Wire
    private Label mesgLbl;
    
    @Listen("onClick=#confirmBtn")
    public void confirm() {
        doLogin();
    }  
    
    @Override
    public void doAfterCompose(Window comp) throws Exception {
        super.doAfterCompose(comp);
     
        //to be implemented, let’s check for a login
    }
    
    public void doLogin()
    {
    	String username = nameTxb.getValue();
    	mesgLbl.setValue("Username digitato: "+username);
    }
  
    
}