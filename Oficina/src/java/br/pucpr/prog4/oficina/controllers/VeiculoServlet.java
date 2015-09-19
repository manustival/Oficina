package br.pucpr.prog4.oficina.controllers;

import br.pucpr.prog4.oficinal.models.Veiculo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author emanoelle.stival
 */
public class VeiculoServlet extends HttpServlet {

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/jsp/cadastroVeiculo.jsp");
        rd.forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca(request.getParameter("placa"));
        veiculo.setTipo(request.getParameter("tipo"));
        
        
    }

    

}
