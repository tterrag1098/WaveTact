package com.techcavern.wavetact.commands;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.MessageEvent;
import com.techcavern.wavetact.utils.*;
public class CheckPermLevel extends ListenerAdapter {
	        public void onMessage(MessageEvent event) {
	                if (event.getMessage().equalsIgnoreCase(GeneralRegistry.getCommandChar()+"cperm")){
	                	event.respond(event.getUser().toString());	        }
	}
}

