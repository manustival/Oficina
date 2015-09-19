package br.pucpr.prog4.oficina.models.dao;

import br.pucpr.prog4.oficinal.models.Veiculo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JdbcVeiculoDAO implements VeiculoDAO 
{
    private Connection conexão;
   
    public void setConexão(Connection conexão)
    {
        this.conexão = conexão;
    }
    
    

    @Override
    public Veiculo inserir(Veiculo veiculo) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
    

    
    
    
}
