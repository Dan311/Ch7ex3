package dan;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RandomQuote extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String quotes[] = { "I like eggs.", "Play in the sunshine.", "Start where you are." };

		Random rand = new Random();
		int r = rand.nextInt(quotes.length);
		PrintWriter out = response.getWriter();
		out.println(r);
		out.println(quotes[r]);
		out.close();
	}
}
