package current.pages;

import java.util.Date;
import org.apache.tapestry.annotations.ComponentClass;

/**
 * Start page of application fridge.
 * 
 */
@ComponentClass
public class Start
{
	public Date getCurrentTime() 
	{ 
		return new Date(); 
	}
}