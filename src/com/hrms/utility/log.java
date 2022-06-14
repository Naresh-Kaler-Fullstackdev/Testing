//13-April-2022

package com.hrms.utility;

import org.apache.log4j.Logger;
import org.openqa.selenium.devtools.idealized.log.Log;

public class log
{
	//Initialize log4j logs
	private static Logger log = Logger.getLogger(Log.class.getName());
	//Need to create these methods so that they can be called
	public static void info(String message)
	{
		log.info(message);
	}
}