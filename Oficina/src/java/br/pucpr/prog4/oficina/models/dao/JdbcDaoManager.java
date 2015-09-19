package br.pucpr.prog4.oficina.models.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JdbcDaoManager implements IDaoManager 
{
    private Connection conexão;
    private JdbcVeiculoDAO veiculoDAO;
    
    
    public JdbcDaoManager()
    {
        veiculoDAO = new JdbcVeiculoDAO();
    }
    
    
    //@Override
    public void iniciar() throws DaoException
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url;
            url = "jdbc:mysql://localhost:3306/loja1";
            conexão = DriverManager.getConnection(url, "root", "root");
            conexão.setAutoCommit(false);
            
            
        }
        catch( Exception ex )
        {
            throw new DaoException("Ocorreu um erro ao conectar ao banco de dados:" + 
                    ex.getMessage());
        }
    }

    //@Override
    public void encerrar() 
    {
        try {
            if(!conexão.isClosed())
                conexão.close();
        } catch (SQLException ex) {
            throw new DaoException("Ocorreu um erro ao confirmar a transação" + ex.getMessage());
        }
    }

    //@Override
    public void confirmarTransação() {
        try{
            conexão.commit();
        } catch (SQLException ex){
            throw new DaoException("Ocorreu um erro ao confirmar a transação" + ex.getMessage());
        }
        
    }

    //@Override
    public void abortarTransação() {
        try{
            conexão.rollback();
        } catch (SQLException ex){
            throw new DaoException("Ocorreu um erro ao confirmar a transação" + ex.getMessage());
        }
        
    }

    @Override
    public VeiculoDAO getVeiculoDAO() {
        return veiculoDAO;
    }

    
    
}
