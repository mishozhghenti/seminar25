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

@WebServlet("/Quote1")
public class Quote1 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Quote1(){
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String symbol = req.getParameter("symbol");
        switch (symbol.toLowerCase()) {
            case "googl":
                out.append("" + 200);
                break;
            case "meta":
                out.append("" + 300);
                break;
            default:
                DecimalFormat df = new DecimalFormat("#.00");
                out.append("" + df.format(100 + (900) * new Random().nextDouble()));
        }
    }
}
