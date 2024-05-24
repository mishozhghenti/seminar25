package org.example;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Random;

@WebServlet("/Quote3")
public class Quote3 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        PrintWriter out = resp.getWriter();
        DecimalFormat df = new DecimalFormat("#.00");

        Double random = 100 + (900) * new Random().nextDouble();
        Double high = random + 10.24;
        Double low = random - 7.12;

        out.append("Price: " + df.format(random) + "\n");
        out.append("<br>");
        out.append("High: " + df.format(high) + "\n");
        out.append("<br>");
        out.append("Low: " + df.format(low));
    }
}