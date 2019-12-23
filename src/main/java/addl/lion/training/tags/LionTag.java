package addl.lion.training.tags;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class LionTag extends SimpleTagSupport {
	
	@Override
	public void doTag() throws JspException, IOException {
		 /*
         * This is just to display a message, when we will use our custom tag. This
         * message would be displayed
         */
        JspWriter out = this.getJspContext().getOut();
        out.println("Current Date :: " + LocalDate.now());
        out.println("<br>");
        out.println("Current Time :: " + LocalTime.now());
        out.println("<br>");
        out.println("Print Months");
        for (Month month: Month.values()) {
            out.println(month.name());
            out.println("<br>");
        }
	}

}
