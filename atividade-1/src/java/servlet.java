/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(urlPatterns = {"/servlet"})
public class servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>SEPT</title>");
            out.println("</head>");
            out.println("<body>");
            out.println(" <h1 style=\"color:blue; font-family: arial, verdana, sans-serif; text-align: center;\">SEPT - SETOR DE EDICAÇÃO PROFISSIONAL</h1>");
            out.println(" <h5 style=\"color:BLACK; font-family: arial, sans-serif; text-align: center;\">R. Dr. Alcides Vieira Arcoverde, 1225 - Jardim das Américas, Curitiba - PR, 81520-260</h5>");
            out.println(" <div style=\"display:flex; align-items: center;justify-content:center;\">");
            out.println("   <table style=\"border: 1px solid black;\">");
            out.println(" <tr style=>");
            out.println(" <th style=\"border-bottom: 1px solid black; border-right: 1px solid black;\">CURSO</th>");
            out.println(" <th style=\"border-bottom: 1px solid black;\">PÁGINA</th>");
            out.println("</tr>");
            out.println(" <tr>");
            out.println("<td style=\"border-bottom: 1px solid black; border-right: 1px solid black;\">TPG - Petróleo e Gás</td>");
            out.println("  <td style=\"border-bottom: 1px solid black;\"><a href=\"http://www.sept.ufpr.br/portal/petroleogas/sobre-o-curso/\">http://www.sept.ufpr.br/portal/petroleogas/sobre-o-curso/</a></td>");
            out.println("  </tr>");
            out.println(" <tr>");
            out.println("  <td style=\"border-bottom: 1px solid black; border-right: 1px solid black;\">\n"
                    + "                        TGP - Gestão Pública\n"
                    + "                    </td>");
            out.println("  <td style=\"border-bottom: 1px solid black;\"><a href=\"http://www.sept.ufpr.br/portal/gestaopublica/\">http://www.sept.ufpr.br/portal/gestaopublica/</a></td>");
            out.println("<tr>\n"
                    + "                    <td style=\"border-bottom: 1px solid black; border-right: 1px solid black;\">\n"
                    + "                        TADS - Análise e Desenvolvimento de Sistemas</td>\n"
                    + "                    <td style=\"border-bottom: 1px solid black;\"><a href=\"http://www.sept.ufpr.br/portal/analisesistemas/sobre-o-curso/\">http://www.sept.ufpr.br/portal/analisesistemas/sobre-o-curso/</a></td>\n"
                    + "                </tr>");
            out.println("<tr>\n"
                    + "                    <td style=\"border-bottom: 1px solid black; border-right: 1px solid black;\">\n"
                    + "                        TGQ - Gestão da Qualidade</td>\n"
                    + "                    <td style=\"border-bottom: 1px solid black;\"><a href=\"http://www.sept.ufpr.br/portal/gestaoqualidade/\">http://www.sept.ufpr.br/portal/gestaoqualidade/</a></td>\n"
                    + "                </tr>");
            out.println("<tr>\n"
                    + "                    <td style=\"border-bottom: 1px solid black; border-right: 1px solid black;\">TACS - Agente Comunitário de Saúde</td>\n"
                    + "                    <td style=\"border-bottom: 1px solid black;\"><a href=\"http://www.sept.ufpr.br/portal/agentesaude/sobre-o-curso/\">http://www.sept.ufpr.br/portal/agentesaude/sobre-o-curso/</a></td>\n"
                    + "                </tr>");
            out.println(" <tr>\n"
                    + "                    <td style=\"border-bottom: 1px solid black; border-right: 1px solid black;\">TACS - TCI - Comunicação Institucional</td>\n"
                    + "                    <td style=\"border-bottom: 1px solid black;\"><a href=\"http://www.sept.ufpr.br/portal/comunicacaoinstitucional/sobre-o-curso/\">http://www.sept.ufpr.br/portal/comunicacaoinstitucional/sobre-o-curso/</a></td>\n"
                    + "                </tr>");
            out.println("<tr>\n"
                    + "                    <td style=\"border-bottom: 1px solid black; border-right: 1px solid black;\">TACS - TL - Luteria</td>\n"
                    + "                    <td style=\"border-bottom: 1px solid black;\"><a href=\"http://www.sept.ufpr.br/portal/luteria/sobre-o-curso/\">http://www.sept.ufpr.br/portal/luteria/sobre-o-curso/</a></td>\n"
                    + "                </tr>");
            out.println("<tr>\n"
                    + "                    <td style=\"border-bottom: 1px solid black; border-right: 1px solid black;\">TACS - TNI - Negocios Imobiliários</td>\n"
                    + "                    <td style=\"border-bottom: 1px solid black;\"><a href=\"http://www.sept.ufpr.br/portal/negociosimobiliarios/sobre-o-curso/\">http://www.sept.ufpr.br/portal/negociosimobiliarios/sobre-o-curso/</a></td>\n"
                    + "                </tr>");
            out.println("   <tr>\n"
                    + "                    <td style=\"border-bottom: 1px solid black; border-right: 1px solid black;\">TACS - TPC - Produção Cênica</td>\n"
                    + "                    <td style=\"border-bottom: 1px solid black;\"><a href=\"http://www.sept.ufpr.br/portal/producaocenica/sobre-o-curso/\">http://www.sept.ufpr.br/portal/producaocenica/sobre-o-curso/</a></td>\n"
                    + "                </tr>");
            out.println("<tr>\n"
                    + "                    <td style=\"border-bottom: 1px solid black; border-right: 1px solid black;\">TACS - TS - Secretariado</td>\n"
                    + "                    <td style=\"border-bottom: 1px solid black;\"><a href=\"http://www.sept.ufpr.br/portal/secretariado/sobre-o-curso/\">http://www.sept.ufpr.br/portal/secretariado/sobre-o-curso/</a></td>\n"
                    + "                </tr>");
            out.println("      </table>");
            out.println("    </div>");
            out.println(" <h3 style=\"color:BLACK; font-family: arial, sans-serif; text-align: center;\"><a href=\"http://localhost:8080/atividade-1/meu-tads.jsp\">MEU TADS</a> </h3>");
            out.println("");
            out.println("");
            out.println("");
            out.println("");
            out.println("");
            out.println("");
            out.println("");

            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}