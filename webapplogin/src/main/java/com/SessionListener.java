
package com;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent se)  { 
        System.out.println("session created...");
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
        HttpSession session=se.getSession();
        Object o1=session.getAttribute("uname");
        Object o2=session.getAttribute("upass");
        if(o1!=null&&o2!=null) {
        	String uname=(String)o1;
        	String upass=(String)o2;
        	DbCon.getInstance().reSetFlag(uname, upass);
        }
    	System.out.println("session destroyed...");
    	
    }
}