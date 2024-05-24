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

@WebServlet("/Quote5")
public class Quote5 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();
        String symbol = req.getParameter("symbol");

        DecimalFormat df = new DecimalFormat("#.00");

        Double random = 100 + (900) * new Random().nextDouble();
        Double high = random + 10.24;
        Double low = random - 7.12;

        out.append("{");
        out.append("\"price\":" + df.format(random) +"," );
        out.append("\"high\":" + df.format(high) +"," );
        out.append("\"low\":" + df.format(low));
        out.append("}");
    }
}